package org.test.database;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "film_actor", schema = "public", catalog = "pagila")
@IdClass(FilmActorEntityPK.class)
public class FilmActorEntity {
    private int actorId;
    private int filmId;
    private java.time.Instant lastUpdate;

    @Id
    @Column(name = "actor_id")
    public int getActorId() {
        return actorId;
    }

    public void setActorId(int actorId) {
        this.actorId = actorId;
    }

    @Id
    @Column(name = "film_id")
    public int getFilmId() {
        return filmId;
    }

    public void setFilmId(int filmId) {
        this.filmId = filmId;
    }

    @Basic
    @Column(name = "last_update")
    public java.time.Instant getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(java.time.Instant lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FilmActorEntity that = (FilmActorEntity) o;
        return actorId == that.actorId && filmId == that.filmId && Objects.equals(lastUpdate, that.lastUpdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(actorId, filmId, lastUpdate);
    }
}
