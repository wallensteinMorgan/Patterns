package org.example.builder;

public class Main {
    public static void main(String[] args) {
        House house = House.builder().wall("Walls are supplied")
                .roof("Roof supplied")
                .window("Windows supplied")
                .build();
        System.out.println(house);
    }
}
