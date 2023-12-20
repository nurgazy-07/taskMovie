package servise;

import models.Movie;
import models.enums.Genre;
import models.enums.Role;

import java.time.Year;
import java.util.List;

public interface MovieServise {
    List<Movie> getAllMovies(List<Movie> movies);
    void findMovieByNameOrPartName(String name);
    void findMovieByActorName(String actorName);
    void findMovieByYear(int year);
    void findMovieByProducer(String producerName);
    void findMovieByGenre(Genre genre);
    void findMovieByRole(Role role);
}
