package com.functional.section2;

import java.util.function.BinaryOperator;

public class BinaryOperatorPractice {
    public static void main(String[] args) {
        //
        BinaryOperator<String> operator = (a,b)-> a+ "." +b;
        //input and output parameters tiene que ser del mismo tipo
        System.out.println(operator.apply("basic","com"));


    }
}
