package com.functional.section8;

public class Currying {

    public static void main(String[] args) {
        //sin aplicar Currying
        Function<Integer,Function<Integer,Integer>> function = u->v-> u+v;
//        Function<Integer, Integer> function2 = function.apply(1);
//        Integer sum = function2.apply(2);
//        System.out.println(sum);

        //aplicando currying
        Integer sum = function.apply(1).apply(2);
        System.out.println(sum);
    }
}
