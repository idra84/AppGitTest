package com.functional.section2;

import java.util.function.BiFunction;

public class BiFunctionPractice {
    public static void main(String[] args) {
        // si necesitamos una funcoin con dos parametros de entrada y uno de salida usamoas
        //Bifunction
        BiFunction<String, String, String> biFunction = (a,b)->a +b;
        System.out.println(biFunction.apply("basic","strong"));

        BiFunction<String, String, Integer> biFunction2 = (a,b)->(a+b).length();
        System.out.println(biFunction2.apply("basic","strong"));
    }
}
