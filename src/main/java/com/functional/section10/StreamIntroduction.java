package com.functional.section10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamIntroduction {

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        List<Book> popularHorrorBooks = new ArrayList<>();

        books.add(new Book("The Alchemist","Paulo Coelho","Adventure",4.487778));
        books.add(new Book("The notebook","Nicholas saprks","Romance",4.10));
        books.add(new Book("Horror cocktail","Rober bolch","Horror",2.67));
        books.add(new Book("house of levels","Mark z Daniel","Horror",4.1022));

//        for (Book book: books){
//            if(book.getGenre().equalsIgnoreCase("Horror") &&
//                    book.getRating() >3){
//                popularHorrosBooks.add(book);
//            }
//        }

        //java 8
//        List<Book> collect = books.stream().filter(
//                (book)->book.getGenre().equals("Horror"))
//                .filter((book)->book.getRating() > 3)
//                .collect(Collectors.toList());

        popularHorrorBooks = books.stream()
                .filter((book)->book.getGenre().equalsIgnoreCase("Horror"))
                .filter((book)->book.getRating()>3)
                .collect(Collectors.toList());

        popularHorrorBooks.forEach(System.out::println);
    }
}
