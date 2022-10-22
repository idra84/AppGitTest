package com.functional.section2;

import java.util.function.Supplier;

public class MainSupplierPractice {

    public static void main(String[] args) {
        Supplier<String> stringSupplier = ()-> new String("replazo");
        System.out.println(stringSupplier.get());

        Supplier<Double> randomnumber = () ->Math.random();
        System.out.println(randomnumber.get());

    }
}
