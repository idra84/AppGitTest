package com.functional.section10;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Calculation {

    public static void main(String[] args) {
        //IntStream
        //DoubleStream
        //LongStream


        //sum
        int sum = IntStream.of(1,2,3).sum();
        System.out.println(sum);

        //max

        OptionalInt maxOptional = IntStream.of(1,2,3).max();
        System.out.println(maxOptional.getAsInt());

        //min()
        OptionalDouble optionalDouble = IntStream.of(1,2,3).average();
        System.out.println(optionalDouble.getAsDouble());

    }
}
