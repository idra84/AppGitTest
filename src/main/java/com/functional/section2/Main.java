package com.functional.section2;

public class Main {

    public static void main(String[] args){
//        Name name = ()-> System.out.println("ivan");
//        name.myName();

        MathOperation mathOperation = (a,b)-> System.out.println(a+b);
        mathOperation.operation(10,12);

        MathOperation mathOperation1 = (a,b)-> System.out.println(a*b);
        mathOperation1.operation(10, 90);

        //funcion que retorna el largo de un string
        //la palabra retunr se elimina porque el compilaodor
        //la identifica en tiempo de ejecucion
        LengthOfString lengthOfString = (s) -> s.length();
        int length = lengthOfString.length("parametroimplementacion");
        System.out.println(length);

        //multi line function

        LengthOfString lengthOfString1 = str -> {
            int l = str.length();System.out.println("The length of is "+l);
            return l;
        };
        int leng = lengthOfString.length("parametroimplementacion");
        System.out.println(length);


    }
}
