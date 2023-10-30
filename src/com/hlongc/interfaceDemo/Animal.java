package com.hlongc.interfaceDemo;

public interface Animal {
    // 抽象方法
    // 默认添加 public abstract
    void walk();

    // 静态属性
    // 默认添加 public static final
    int lifetime = 80;

    // 默认方法
    // 子类可以进行重写，也可以直接调用
    default void speak() {
        System.out.println("默认方法：吃饭");
    }

    // 静态方法
    // 只能通过接口名调用
    static void hello() {
        System.out.println("我们都是动物");
    }
}
