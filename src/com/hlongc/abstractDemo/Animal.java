package com.hlongc.abstractDemo;

/**
 * 抽象方法必须在抽象类中
 * 抽象类中不一定有抽象方法
 * 抽象类主要是用于约束行为
 * */
public abstract class Animal {
    public abstract void walk();

    public void run() {
        System.out.println("running...");
    }
}
