package org.example.decorator;

public class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String type() {
        return coffee.type() + " + Sugar";
    }

    @Override
    public double cost() {
        return coffee.cost() + 20;
    }
}
