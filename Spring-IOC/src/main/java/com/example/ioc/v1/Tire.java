package com.example.ioc.v1;

public class Tire {
    private int size;

    public Tire(int size) {
        this.size = size;
        System.out.println("tire init.... , size:" + size);
    }
}
