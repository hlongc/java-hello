package com.hlongc.interfaceDemo;

public class Human extends Homo implements Animal, Mammal {
    @Override
    public void walk() {
        System.out.println("人类用双腿行走");
    }

    @Override
    public void feed() {
        System.out.println("哺育后代");
    }
}
