package com.example.ioc.v1;

public class Main {
    public static void main(String[] args) {
        int size = 20;
        Car car = new Car(size);
        car.run();
    }
}
