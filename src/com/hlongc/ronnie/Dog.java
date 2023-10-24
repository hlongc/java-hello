package com.hlongc.ronnie;

public class Dog {
    public Dog() {
        System.out.println("构造方法");
    }

    public void log() {
        {
            System.out.println("log中的代码块");
        }
        System.out.println("随便打印点");
        {
            System.out.println("log中的代码块2");
        }
    }

    {
        System.out.println("构造代码块");
    }

    static {
        System.out.println("我是静态代码块");
    }
}
