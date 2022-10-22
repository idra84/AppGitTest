package com.functional.section9;

public class IteratorPattern {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList(new Object[]{1,2,9,77,66});
        myArrayList.forEach(System.out::println);
    }
}
