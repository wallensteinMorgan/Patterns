package org.example.decorator;

public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String type() {
        return coffee.type() + " + Milk";
    }

    @Override
    public double cost() {
        return coffee.cost() + 50;
    }
}
