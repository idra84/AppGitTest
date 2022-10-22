package com.functional.section8;

public class Chaining {

    public static void main(String[] args) {
        Consumer<String> consumer = s-> System.out.println(s);
        Consumer<String> consumer2 = s-> System.out.println(s);

        //consumer.accept("hello");
        //consumer2.accept("hello");
        Consumer<String> consumer3 = s->{
          consumer.accept(s);
          consumer2.accept(s);
        };

        consumer3.accept("Hello");

        Consumer<String> c4 = consumer.thenAccept(consumer2);
        c4.accept("BasicsStrong");
    }
}
