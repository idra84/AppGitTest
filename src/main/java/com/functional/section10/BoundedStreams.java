package com.functional.section10;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BoundedStreams {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        Stream<Integer> integerStream = list.stream();
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"one");
        map.put(2,"two");
        map.put(3,"three");
        map.put(4,"for");

        Stream<Map.Entry<Integer,String>> entries = map.entrySet().stream();

        Stream<Integer> keys = map.keySet().stream();

        //2.
        Stream<String> streamString = Stream.of("Hey","OHH","Lets Go");

        Integer[] integers = {3,4,5,8,9,7};
        Stream<Integer> stram = Arrays.stream(integers);

        int[] integers2 = {9,8,7,9};
        IntStream intStream = Arrays.stream(integers2);



    }
}
