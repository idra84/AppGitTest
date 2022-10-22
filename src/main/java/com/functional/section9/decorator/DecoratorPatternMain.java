package com.functional.section9.decorator;

public class DecoratorPatternMain {

    public static void main(String[] args) {
        Burger myOrder = new BurgerShop(burger -> burger.addVegis()).use(new Burger());
        System.out.println(myOrder);
    }
}
