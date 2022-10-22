package com.functional.section9.decorator;

import java.util.function.Function;

public class BurgerShop {
    Function<Burger, Burger> decorator;

    public BurgerShop (Function<Burger, Burger> decorator){
        this.decorator = decorator;

    }

    public Burger use(Burger baseBurguer){
        System.out.println("Base Burger: "+baseBurguer);
        return decorator.apply(baseBurguer);
    }

}
