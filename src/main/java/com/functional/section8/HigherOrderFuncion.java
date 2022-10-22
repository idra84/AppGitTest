package com.functional.section8;

public class HigherOrderFuncion {

    public static void main(String[] args) {
        IFactory<Integer> integerIFactory = createTiFactory(()->Math.random()*100, r-> r.intValue());
        Integer product = integerIFactory.create();
    }

    public static <T, R> IFactory<R> createTiFactory(IProducer<T> iProducer, IConfigurator<T, R> iConfigurator){
        return () ->{
            T product = iProducer.produce();
            return iConfigurator.configure(product);
        };
    }
}
