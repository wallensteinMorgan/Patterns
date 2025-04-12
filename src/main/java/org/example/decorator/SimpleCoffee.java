package org.example.decorator;

public class SimpleCoffee implements Coffee {
    @Override
    public String type() {
        return "Simple Coffee";
    }

    @Override
    public double cost() {
        return 100;
    }
}