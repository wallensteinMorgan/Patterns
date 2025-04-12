package org.example.decorator;

public class CoffeeDecorator implements Coffee {
        protected Coffee coffee;

        public CoffeeDecorator(Coffee coffee) {
            this.coffee = coffee;
        }

        @Override
        public String type() {
            return coffee.type();
        }
        @Override
        public double cost() {
            return coffee.cost();
        }
}
