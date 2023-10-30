package com.hlongc.polymorphism;

public class Human extends Animal {
    private int speed = 10;
    @Override
    public void walk() {
        System.out.println("人类行走用双脚");
    }
}
