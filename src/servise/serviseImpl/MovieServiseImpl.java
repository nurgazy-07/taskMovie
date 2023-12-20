package servise.serviseImpl;

import models.Actors;
import models.Databases;
import models.Movie;
import models.Producer;
import models.enums.Genre;
import models.enums.Role;
import servise.MovieServise;

import java.time.Year;
import java.util.List;

public class MovieServiseImpl implements MovieServise {
    public final Databases databases;

    public MovieServiseImpl(Databases databases) {
        this.databases = databases;
    }

    @Override
    public List<Movie> getAllMovies(List<Movie> movies) {
        for (Movie movie : movies) {
            System.out.println(movie);
        }
        return movies;
    }

    @Override
    public void findMovieByNameOrPartName(String name) {
        for (Movie movie : databases.movies) {
            if(movie.getName().equals(name)){
                System.out.println(movie);
            }
        }
    }

    @Override
    public void findMovieByActorName(String actorName) {
        for (Movie movie : databases.movies) {
            for (Actors actor : movie.getActors()) {
               if(actor.getFullNameActors().equals(actorName)) {
                   System.out.println(movie);
               }
            }
        }
    }

    @Override
    public void findMovieByYear(int year) {
        for (Movie movie : databases.movies) {
            if(movie.getYear() == year){
                System.out.println(movie);
            }
        }
    }

    @Override
    public void findMovieByProducer(String producerName) {
        for (Movie movie : databases.movies) {
            for (Producer producer : movie.getProducers()) {
                if(producer.getFirstName().equals(producerName)){
                    System.out.println(movie);
                }
            }
        }
    }

    @Override
    public void findMovieByGenre(Genre genre) {
        for (Movie movie : databases.movies) {
            if(movie.getGenre().equals(genre)){
                System.out.println(movie);
            }
        }
    }

    @Override
    public void findMovieByRole(Role role) {
        for (Movie movie : databases.movies) {
            for (Actors actor : movie.getActors()) {
               if( actor.getRole().equals(role)){
                   System.out.println(movie);
               }
            }
        }
    }
}
