package com.functional.section2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class MainPracticePredicate {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Basic");
        list.add("");
        list.add("Strong");
        list.add("");

        Predicate<String> predicate = s -> !s.isEmpty();
        List<String> newStringList = filterList(list, predicate);

        Predicate<String> stringPredicate = s ->s.contains("Basic");


    }

    /*
    private static List<String> filterList( List<String> list,
                                            Predicate<String> predicate){
        List<String> newList = new ArrayList<>();
        for (String string: list
             ) {
            if(predicate.test(string)){
                newList.add(string);
            }
        }


        return newList;
    }
    */

    private static <T> List<T> filterList( List<T> list, Predicate<T> predicate){
        List<T> newList = new ArrayList<>();
        for (T string: list
        ) {
            if(predicate.test(string)){
                newList.add(string);
            }
        }
        return newList;
    }
}
