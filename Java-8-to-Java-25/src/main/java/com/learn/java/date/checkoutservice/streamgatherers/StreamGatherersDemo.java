package com.learn.java.date.checkoutservice.streamgatherers;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import com.learn.java.date.checkoutservice.streamgatherers.domain.Movie;
import com.learn.java.date.checkoutservice.streamgatherers.domain.MovieGenre;

public class StreamGatherersDemo {



    public static void main(String[] args) {
        System.out.println("=== MovieDemo: Exploring Gatherer Functions ===\n");

        
        
        List<Movie> movies = createSampleMovies();

        System.out.println("Sample Movies:");
        movies.forEach(System.out::println);
        System.out.println();

        // Demonstrate all Gatherer functions
        demonstrateWindowFixed(movies);
        demonstrateWindowSliding(movies);
        demonstrateFold(movies);
        demonstrateScan(movies);

        // sequentials vs mapconcurrent
        demonstrateSequentialMap(movies);
        demonstrateMapConcurrent(movies);


        //composite gatherers

        //simple custom gatherers
        demonstrateSimpleCustomGatherer(movies);

        //Advanced custom gatherers
        demonstrateTraditionalGrouping(movies);
    }


    private static void demonstrateWindowFixed(List<Movie> movies) {
        System.out.println("=== windowFixed(3) - Fixed-size windows ===");

    }


    private static void demonstrateWindowSliding(List<Movie> movies) {
        System.out.println("=== windowSliding(2) - Sliding windows ===");


    }


    private static void demonstrateFold(List<Movie> movies) {
        System.out.println("=== fold() - Folding operations ===");


        System.out.println();
    }

    private static void demonstrateScan(List<Movie> movies) {
        System.out.println("=== scan() - Scanning operations ===");


        System.out.println();
    }

    private static void demonstrateMapConcurrent(List<Movie> movies) {
        System.out.println("=== mapConcurrent(2) - Concurrent processing ===");

        long startTime = System.currentTimeMillis();


        long endTime = System.currentTimeMillis();
        System.out.println("Concurrent processing time: " + (endTime - startTime) + "ms");
        System.out.println();
    }


    private static void demonstrateSequentialMap(List<Movie> movies) {
        System.out.println("=== Sequential map() - Traditional processing ===");

        long startTime = System.currentTimeMillis();

        // Process movies sequentially to simulate expensive operations
        movies.stream()
                .map(movie -> {
                    // Simulate some processing time (same as concurrent version)
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }

                    // Return a processed result (same format as concurrent version)
                    return Map.entry(
                            movie.title(),
                            "Processed: " + movie.genre() + " (" + movie.duration() + "min, " + movie.rating() + "★)"
                    );
                })
                .forEach(result ->
                        System.out.println(result.getKey() + " -> " + result.getValue()));

        long endTime = System.currentTimeMillis();
        System.out.println("Sequential processing time: " + (endTime - startTime) + "ms");
        System.out.println();
    }


    private static void demonstrateCompositeGatherers(List<Movie> movies) {
        System.out.println("=== Composite Gatherers - Chaining operations ===");
        System.out.println();

    }

   
    private static void demonstrateSimpleCustomGatherer(List<Movie> movies) {
        System.out.println("=== Simple Custom Gatherer.of() - Filter & Transform ===");

        System.out.println();


    }

  
    private static void demonstrateTraditionalGrouping(List<Movie> movies) {
        System.out.println("=== Traditional Stream Grouping (without Gatherer) ===");

        // Group movies by decade using traditional collectors
        Map<String, List<Movie>> moviesByDecade = movies.stream()
                .collect(java.util.stream.Collectors.groupingBy(
                        movie -> {
                            int decade = (movie.getReleaseYear() / 10) * 10;
                            return decade + "s";
                        }
                ));
        System.out.println("Movies grouped by decade:" + moviesByDecade);

        System.out.println("Movies grouped by decade:");
        moviesByDecade.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey()) // Sort decades for consistent output
                .forEach(entry -> {
                    System.out.println("Decade: " + entry.getKey());
                    entry.getValue().forEach(movie ->
                            System.out.println("  - " + movie.title() + " (" + movie.getReleaseYear() + ")"));
                    System.out.println();
                });
    }



    private static void demonstrateCustomGathererImpl(List<Movie> movies) {
        System.out.println("=== Custom Gatherer Implementation ===");


    }


    private static List<Movie> createSampleMovies() {
        return List.of(
                new Movie("The Godfather", MovieGenre.DRAMA, LocalDate.of(1972, 3, 24), 9.2, 175),
                new Movie("The Shawshank Redemption", MovieGenre.DRAMA, LocalDate.of(1994, 9, 23), 9.3, 142),
                new Movie("Pulp Fiction", MovieGenre.DRAMA, LocalDate.of(1994, 10, 14), 8.9, 154),
                new Movie("The Dark Knight", MovieGenre.ACTION, LocalDate.of(2008, 7, 18), 9.0, 152),
                new Movie("Schindler's List", MovieGenre.DRAMA, LocalDate.of(1993, 12, 15), 9.0, 195),
                new Movie("Forrest Gump", MovieGenre.DRAMA, LocalDate.of(1994, 7, 6), 8.8, 142),
                new Movie("Inception", MovieGenre.SCIENCE_FICTION, LocalDate.of(2010, 7, 16), 8.8, 148),
                new Movie("The Matrix", MovieGenre.SCIENCE_FICTION, LocalDate.of(1999, 3, 31), 8.7, 136),
                new Movie("Goodfellas", MovieGenre.DRAMA, LocalDate.of(1990, 9, 19), 8.7, 146),
                new Movie("Star Wars: A New Hope", MovieGenre.SCIENCE_FICTION, LocalDate.of(1977, 5, 25), 8.6, 121),
                new Movie("Casablanca", MovieGenre.ROMANCE, LocalDate.of(1942, 11, 26), 8.5, 102),
                new Movie("Citizen Kane", MovieGenre.DRAMA, LocalDate.of(1941, 5, 1), 8.3, 119)
        );
    }
}
