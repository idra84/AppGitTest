package com.functional.section9;

public class Stock {

    private String symol;
    private double price;
    private double units;

    public Stock(String symol, double price, double units) {
        this.symol = symol;
        this.price = price;
        this.units = units;
    }

    public String getSymol() {
        return symol;
    }

    public void setSymol(String symol) {
        this.symol = symol;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getUnits() {
        return units;
    }

    public void setUnits(double units) {
        this.units = units;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "symol='" + symol + '\'' +
                ", price=" + price +
                ", units=" + units +
                '}';
    }
}
