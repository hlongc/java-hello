package com.hlongc.polymorphism;

public class Test {
    public static void main(String[] args) {
        // 父类引用指向子类的实例，向上转型
        Animal people = new Human();
        Animal dog = new Dog();
        Animal animal = new Animal();

        // 多态的方式调用成员方法时，编译看父类是否有该方法，允许时是允许子类的方法，即编译看左，运行看右
        people.walk();
        dog.walk();
        animal.walk();
        // 在多态中，访问成员变量时，编译和运行都是看左侧
        System.out.println(people.speed);
        System.out.println(dog.speed);
        System.out.println(animal.speed);
    }
}
