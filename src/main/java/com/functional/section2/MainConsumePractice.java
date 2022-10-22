package com.functional.section2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;


public class MainConsumePractice {

    public static void main(String[] args) {
        List<Integer> lis = new ArrayList<>();
        lis.add(12);
        lis.add(23);
        lis.add(74);
        lis.add(55);

        Consumer<Integer> conuConsumer = e-> System.out.println(e);

        conuConsumer.accept(56);

        printElements(lis, conuConsumer);
    }

    private static<T> void printElements(List<T> lis, Consumer<T> conuConsumer) {
        for (T t: lis){
            conuConsumer.accept(t);
        }
    }
}
