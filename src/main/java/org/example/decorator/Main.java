package org.example.decorator;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.type() + " Cost: " + coffee.cost() + " rub");

        coffee = new MilkDecorator(coffee);  // Süd əlavə edilir
        System.out.println(coffee.type() + " Cost: " + coffee.cost() + " rub");

        coffee = new SugarDecorator(coffee);  // Şəkər əlavə edilir
        System.out.println(coffee.type() + " Cost: " + coffee.cost() + " rub");
    }
}
