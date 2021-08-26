package org.test.database;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "film_category", schema = "public", catalog = "pagila")
@IdClass(FilmCategoryEntityPK.class)
public class FilmCategoryEntity {
    private int filmId;
    private int categoryId;
    private java.time.Instant lastUpdate;

    @Id
    @Column(name = "film_id")
    public int getFilmId() {
        return filmId;
    }

    public void setFilmId(int filmId) {
        this.filmId = filmId;
    }

    @Id
    @Column(name = "category_id")
    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
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
        FilmCategoryEntity that = (FilmCategoryEntity) o;
        return filmId == that.filmId && categoryId == that.categoryId && Objects.equals(lastUpdate, that.lastUpdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filmId, categoryId, lastUpdate);
    }
}
