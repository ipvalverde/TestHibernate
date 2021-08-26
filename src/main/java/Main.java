import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.test.database.ActorEntity;

import java.sql.Date;
import java.time.Instant;
import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Test!");

        // A SessionFactory is set up once for an application!
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure() // configures settings from hibernate.cfg.xml
                .build();
        try {
            SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();

            saveEntities(sessionFactory);

            readEntities(sessionFactory);
        }
        catch (Exception e) {
            // The registry would be destroyed by the SessionFactory, but we had trouble building the SessionFactory
            // so destroy it manually.
            StandardServiceRegistryBuilder.destroy( registry );
            throw e;
        }
    }

    private static void saveEntities(SessionFactory sessionFactory) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        var actor = new ActorEntity();
        actor.setFirstName("John");
        actor.setLastName("Doo");
        actor.setLastUpdate(Instant.now());

        session.save(actor);
        session.getTransaction().commit();
        session.close();
    }

    private static void readEntities(SessionFactory sessionFactory) {
        var session = sessionFactory.openSession();
        session.beginTransaction();

        var result = session.createQuery( "from ActorEntity " ).list();
        for ( var actor : (List<ActorEntity>) result ) {
            System.out.println( "Actor (" + actor.getActorId() + ") : " + actor.getFirstName() + " " + actor.getLastName() );
        }
        session.getTransaction().commit();
        session.close();
    }
}
