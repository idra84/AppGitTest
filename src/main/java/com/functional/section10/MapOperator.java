package com.functional.section10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapOperator {
    public static void main(String[] args) {
        List<Integer> collect = Stream.of(1,2,3,4,5,6,7,8,9,10).map(e->e * 25).collect(Collectors.toList());

        collect.forEach(System.out::println);

        List<Book> books = new ArrayList<>();

        books.add(new Book("The Alchemist","Paulo Coelho","Adventure",4.487778));
        books.add(new Book("The notebook","Nicholas saprks","Romance",4.10));
        books.add(new Book("Horror cocktail","Rober bolch","Horror",2.67));
        books.add(new Book("house of levels","Mark z Daniel","Horror",4.1022));

 books.stream()
                .filter((book)->book.getGenre().equalsIgnoreCase("Horror"))
                .filter((book)->book.getRating()>3)
                .map(book->book.getName())
 .forEach(System.out::println);

    Integer suma = Stream.of(1,2,3,4,5,6,7,8,9,10).reduce(0,(x,y)->x+y);
        System.out.println("la suma de los datros es: "+suma);


    }
}
