package com.functional.section2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class MainFunction {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Kit");
        list.add("Kat");
        list.add("Sara");

        Function<String, Integer> functionL = e ->e.length();
        List<Integer> newList = map(list, functionL);
        System.out.println(newList);
    }
    private static <T,R> List<R> map(List<T> list, Function<T, R> functionL) {

        List<R> newList = new ArrayList<>();
        for (T e: list){
            newList.add(functionL.apply(e));
        }
        return newList;
    }
}
