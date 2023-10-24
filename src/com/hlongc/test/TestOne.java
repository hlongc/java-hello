package com.hlongc.test;
// import语句需要再包声明语句之下，类声明语句之上
import com.hlongc.ronnie.Animal;

public class TestOne {
    public static void main(String[] args) {
        // 如果多个包存在同名的类，可以通过使用类的全路径来显示声明使用哪个包下的类
//        com.hlongc.test.Animal cat = new com.hlongc.test.Animal(40, 7);
//        cat.showInfo();
        System.out.println(Animal.getCount());
        Animal dog = new Animal(90, 50);
        System.out.println(Animal.getCount());
        Animal cat = new Animal(90, 50);
        System.out.println(Animal.getCount());
    }
}
