import models.Actors;
import models.Databases;
import models.Movie;
import models.Producer;
import models.enums.Genre;
import models.enums.Role;
import servise.serviseImpl.MovieServiseImpl;

import javax.annotation.processing.SupportedSourceVersion;
import java.io.PrintStream;
import java.time.Year;
import java.util.*;


import static models.Movie.getSortByYear;

public class Main {
    public static void main(String[] args) {
        Databases databases = new Databases();
        MovieServiseImpl movieServise = new MovieServiseImpl(databases);

        List<Actors> actors1 = Arrays.asList(new Actors(1, "Jimm Kerri", Role.GLAVNYI_GEROY));
        List<Actors> actors2 = Arrays.asList(new Actors(2, "Paspartu", Role.POMOSHNIK));
        List<Actors> actors3 = Arrays.asList(new Actors(3, "Chorniy Adam", Role.ANTI_GEROY));
        List<Actors> actors4 = Arrays.asList(new Actors(4, "Joker", Role.ZLODEY));
        List<Actors> actors5 = Arrays.asList(new Actors(5, "Jekki Chan", Role.NASTAVNIK));


        List<Producer> producer1 = Arrays.asList(new Producer(1, "Nurgazy", "Temiraliev"));
        List<Producer> producer2 = Arrays.asList(new Producer(2, "Nurbolot", "Temiraliev"));
        List<Producer> producer3 = Arrays.asList(new Producer(3, "Nurtilek", "Suiunbekov"));
        List<Producer> producer4 = Arrays.asList(new Producer(4, "Nurtilek", "Temiraliev"));
        List<Producer> producer5 = Arrays.asList(new Producer(5, "Nursultan", "Toygonbaev"));


        Movie movie1 = new Movie(1, "Mask", 2000, Genre.KOMEDIA, producer1, actors1);
        Movie movie2 = new Movie(2, "A0 Dnay", 2004, Genre.DETECTIV, producer2, actors2);
        Movie movie3 = new Movie(3, "Liga", 2015, Genre.FANTASTIC, producer3, actors3);
        Movie movie4 = new Movie(4, "Batman", 2020, Genre.BOIEVIK, producer4, actors4);
        Movie movie5 = new Movie(5, "Nastavnik", 2009, Genre.DRAMMA, producer5, actors5);
        List<Movie> movieList = new ArrayList<>(List.of(
                movie1, movie2, movie3, movie4, movie5
        ));
        databases.movies.addAll(movieList);
        while (true) {
            System.out.println("""
                    1 -> Get All movie
                    2 -> Find Movie by name
                    3 -> Find Movie by akter name
                    4 -> Find Movie by year
                    5 -> Find Movie by producer
                    6 -> Find Movie by genre
                    7 -> Find Movie by role
                    8 -> Sort by name
                    9 -> Sort by year
                    10 -> Sort Producer
                    choose command: 
                    """);
            switch (new Scanner(System.in).nextLine()) {
                case "1" -> {
                    movieServise.getAllMovies(databases.movies);
                }
                case "2" -> {
                    System.out.println("Введите имя Фильма: ");
                    movieServise.findMovieByNameOrPartName(new Scanner(System.in).nextLine());
                }
                case "3" -> {
                    System.out.println("Введите имя актера: ");
                    movieServise.findMovieByActorName(new Scanner(System.in).nextLine());
                }
                case "4" -> {
                    System.out.println("Введите год фильма: ");
                    movieServise.findMovieByYear(new Scanner(System.in).nextInt());
                }
                case "5" -> {
                    System.out.println("Введите имя продюсера: ");
                    movieServise.findMovieByProducer(new Scanner(System.in).nextLine());
                }
                case "6" -> {
                    System.out.println("Введен жанр кино: ");
                    movieServise.findMovieByGenre(Genre.DRAMMA);
                }
                case "7" -> {
                    System.out.println("Введен роль фильма: ");
                    movieServise.findMovieByRole(Role.NASTAVNIK);
                }
                case "8" -> {
                    System.out.println("Сортировка по имени:");
                    System.out.println("Выберите A или Z ");
                    String s = new Scanner(System.in).nextLine();
                    if (s.equals("A") || s.equals("a")) {
                        movieList.sort(Comparator.comparing(Movie::getName));
                        System.out.println(movieList);
                    } else if (s.equals("Z") || s.equals("z")) {
                        movieList.sort(Comparator.comparing(Movie::getName).reversed());
                        System.out.println(movieList);
                    }
                }
                case "9" -> {
                    System.out.println("Сортировка по году: ");
                    System.out.println("""
                            Выберите тип сортировки: (+) -> по выростанию, (-) -> по убыванию.
                            """);
                    String a = new Scanner(System.in).nextLine();
                    if (a.equals("+")) {
                        movieList.sort(Movie.sortByYear);
                        System.out.println(movieList);
                    } else if (a.equals("-")) {
                        movieList.sort(Movie.getSortByYear);
                        System.out.println(movieList);
                    }

                }
                case "10" ->{
                    System.out.println("Сортировка Продюсеров: ");
                    for (Movie movie : movieList) {
                        movie.getProducers().sort(Comparator.comparing(Producer::getFirstName));
                        System.out.println(movie);

                    }



                }
            }

        }

    }
}




