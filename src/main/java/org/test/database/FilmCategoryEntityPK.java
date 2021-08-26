package org.test.database;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class FilmCategoryEntityPK implements Serializable {
    private int filmId;
    private int categoryId;

    @Column(name = "film_id")
    @Id
    public int getFilmId() {
        return filmId;
    }

    public void setFilmId(int filmId) {
        this.filmId = filmId;
    }

    @Column(name = "category_id")
    @Id
    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FilmCategoryEntityPK that = (FilmCategoryEntityPK) o;
        return filmId == that.filmId && categoryId == that.categoryId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(filmId, categoryId);
    }
}
