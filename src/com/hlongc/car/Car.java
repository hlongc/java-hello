package com.hlongc.car;

public class Car {
    final float weight = 3.2f; // final成员可以在创建时直接初始化
    final int seat;
    final int year;

    {
        // 也可以在构造函数代码块中赋值
        this.year = 2023;
    }

    public Car() {
        // 也可以在构造函数中赋值
        this.seat = 4;
    }

    // final修饰的方法无法被重写
    final public void show() {
        System.out.println("我是基类的show");
    }
}
