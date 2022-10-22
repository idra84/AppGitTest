package com.functional.section10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Laziness {

    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();

        books.add(new Book("The Alchemist","Paulo Coelho","Adventure",4.487778));
        books.add(new Book("The notebook","Nicholas saprks","Romance",4.10));
        books.add(new Book("Horror cocktail","Rober bolch","Horror",2.67));
        books.add(new Book("house of levels","Mark z Daniel","Horror",4.1022));

        Stream<Book> stream = books.stream()
                .filter((book)->book.getGenre().equalsIgnoreCase("Horror"))
                .peek(book -> System.out.println("Filter Book "+book))
                .filter((book)->book.getRating() >3);

        System.out.println("Filtering Done!!");
                collect(stream);
    }

    private static void collect(Stream<Book> stream) {
        List<Book> poopular = stream.collect(Collectors.toList());
        System.out.println("Collection Done!");
        poopular.forEach(System.out::println);
    }
}
