package com.functional.section2;

@FunctionalInterface
public interface FunctionalGenerics<T,R> {

    R execute (T t);
}
