package com.functional.section3;

import javax.swing.text.html.Option;
import java.util.Optional;

public class OtionalCreation {

    public static void main(String[] args) {

        String val = "A String";
        Optional<String> optional = Optional.of(val);
        //optional is immutalbe
        // cost for performance
        //empty
        Optional<Integer> empty = Optional.empty();

        //nullabel
        Optional<String> nullable = Optional.ofNullable(val);
        Optional<String> emptyOptional = Optional.ofNullable(null);

        Integer a = 10;

        Optional<Integer> optionalInteger = Optional.of(a);

        Integer interVAl = optionalInteger.get();
        System.out.println(interVAl);

        Optional<Integer> emptyOptional2 = Optional.empty();
        //vpn el metodo ger podemos optener una excepcio pues no estamos seguros de la exitencia
        // del valor que retorna el get usar is present antes

        Integer val2 = emptyOptional2.isPresent() ? emptyOptional2.get(): 0;

        /*
        * map
        * filter
        * flatmap*/

        Optional<String> optionalValueof = Optional.of("value");

        //map
        String orElse = optionalValueof.map(value->"replave").orElse("Empty");
        System.out.println(orElse);

        //filter
        Optional<String> filter = optionalValueof.filter(value ->value.equalsIgnoreCase("Value"));
        System.out.println(filter.get());

        //flatmap
        Optional<String> flatMap = optionalValueof.flatMap(value -> Optional.of("Replaced by FlatMap"));
        System.out.println(flatMap.get());

        //more methods
        //if present
        Optional<String> optional1 = Optional.of("value");
        optional1.ifPresent( valor -> System.out.println("this is a "+valor));

        //ifpresent or else
       // optional1.ifPresent(56);



    }
}
