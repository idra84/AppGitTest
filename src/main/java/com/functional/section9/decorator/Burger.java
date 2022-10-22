package com.functional.section9.decorator;

public class Burger {

    private String burgerType;

    public Burger() {
        this.burgerType = "";
    }

    private Burger(String burgerType) {
        this.burgerType = burgerType;
    }

    public Burger addVegis(){
        System.out.println("adding vegies to the burger");
        return new Burger(this.burgerType += "Vegie");
    }

    public Burger addCheese(){
        System.out.println("Adding cheese to the burger");
        return new Burger(this.burgerType +=" cheese");
    }

    @Override
    public String toString() {
        return "Burger{" +
                "burgerType='" + burgerType + '\'' +
                '}';
    }
}
