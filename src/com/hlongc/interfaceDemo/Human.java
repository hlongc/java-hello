package com.hlongc.interfaceDemo;

public class Human implements Animal {
    @Override
    public void walk() {
        System.out.println("人类用双腿行走");
    }
}
