package com.hlongc.polymorphism;

public class Dog extends Animal {
    private int speed = 20;
    @Override
    public void walk() {
        System.out.println("狗行走用四肢");
    }
}
