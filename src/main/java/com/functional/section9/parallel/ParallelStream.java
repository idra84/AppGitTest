package com.functional.section9.parallel;

import java.util.ArrayList;
import java.util.List;

public class ParallelStream {

    public static void main(String[] args) {
        long startTime;
        long endTime;

        List<Employee> list = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            list.add(new Employee("john",2000));
            list.add(new Employee("Rohn",3000));
            list.add(new Employee("Tom",15000));
            list.add(new Employee("bheem",8000));
            list.add(new Employee("shiva",200));
            list.add(new Employee("krishna",50000));

        }

        startTime = System.currentTimeMillis();
        System.out.println("seqyentially : "+list.stream()
                .filter(e->e.getSalary() > 1000).count());
        
        endTime = System.currentTimeMillis();

        System.out.println("time taken with sequencial: " + (endTime-startTime));

        startTime = System.currentTimeMillis();
        System.out.println("parallel : "+list.parallelStream()
                .filter(e->e.getSalary() > 1000).count());
        endTime = System.currentTimeMillis();

        System.out.println("time taken with parallel: " + (endTime-startTime));

        
    }
}
