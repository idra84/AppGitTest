package com.functional.section2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class UnaryOperatorPractice {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        // el tipo de retorno debe ser igual al tipo de entrada
        // es la restriccion de esta funcion

        UnaryOperator<Integer> unaryOperator = i -> i *10;

        List<Integer> newList = mapper(list, unaryOperator);
        System.out.println(newList);

    }

    private static <T> List<T>mapper(List<T> list, UnaryOperator<T> unaryOperator) {
        List<T> newList = new ArrayList<>();
        for (T t : list){
            T ele = unaryOperator.apply(t);
            newList.add(ele);
        }
        return newList;
    }
}
