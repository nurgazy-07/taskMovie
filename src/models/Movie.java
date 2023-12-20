package models;

import models.enums.Genre;

import java.util.Comparator;
import java.util.List;

public class Movie {
    private long id;
    private String name;
    private int year;
    private Genre genre;
    private List<Producer> producers;
    private List<Actors> actors;

//    public Movie() {
//    }

    public Movie(long id, String name, int year, Genre genre, List<Producer> producers, List<Actors> actors) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.genre = genre;
        this.producers = producers;
        this.actors = actors;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public List<Producer> getProducers() {
        return producers;
    }

    public void setProducers(List<Producer> producers) {
        this.producers = producers;
    }

    public List<Actors> getActors() {
        return actors;
    }

    public void setActors(List<Actors> actors) {
        this.actors = actors;
    }
    public static Comparator<Movie> sortByYear = Comparator.comparing(Movie::getYear);
    public static Comparator<Movie> getSortByYear = Comparator.comparing(Movie::getYear).reversed();

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", genre=" + genre +
                ", producers=" + producers +
                ", actors=" + actors +
                '}';
    }
}
