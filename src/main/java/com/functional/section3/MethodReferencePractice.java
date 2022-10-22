package com.functional.section3;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferencePractice {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(34);
        list.add(67);
        list.add(8);
        list.add(23);
        list.add(67);
        list.add(89);
        list.add(90);

        Consumer<Integer> consumer = e -> System.out.println(e);
        Consumer<Integer> consumer2 = System.out :: print;
        consumer.accept(56);

        Supplier<String> stringSupplier = ()-> new String("A String");
        System.out.println(stringSupplier.get());

        //Supplier<Double> randomSupplier = ()->Math.random();
        Supplier<Double> randomSupplier = Math:: random;
        System.out.println(randomSupplier.get());

        printElements(list, consumer);

        //constructor reference
        //con lambda
        //Function<Runnable, Thread> threadGenerator = r -> new Thread(r);
        // con referencia a constructor
        Function<Runnable, Thread> runnableThreadFunction = Thread::new;

        Runnable task1 = () -> System.out.println("Task 1 executed");
        Runnable task2 = () -> System.out.println("Task 2 executed");

        Thread thread1 = runnableThreadFunction.apply(task1);
        Thread thread2 = runnableThreadFunction.apply(task2);

        thread1.start();
        thread2.start();





    }

    private static <T> void printElements(List<T> list, Consumer<T> consumer) {
        for (T t: list){
            consumer.accept(t);
        }
    }
}
