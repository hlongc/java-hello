package com.hlongc.polymorphism;

public class Animal {
    private String kind;
    protected String name;
    protected int speed = 5;

    protected void walk() {
        System.out.println("动物行走");
    }
}
