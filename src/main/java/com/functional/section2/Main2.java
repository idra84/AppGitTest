package com.functional.section2;

public class Main2 {

    public static void main(String[] args){
        FunctionalGenerics <String, String> finctional = s -> s.substring(1,5);
        System.out.println(finctional.execute("ejemplo de ejecucion con genericos"));

        FunctionalGenerics<String, Integer> functionalGenerics = s-> s.length();
        System.out.println(functionalGenerics.execute("tamastring"));
    }

}
