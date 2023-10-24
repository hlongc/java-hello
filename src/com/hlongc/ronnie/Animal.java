package com.hlongc.ronnie;

public class Animal {
    private double height;
    private double weight;

    private static int count = 0; // 记录类被实例化多少次

    public Animal() {
        Animal.count++;
    }

    public Animal(double height, double weight) {
        this.height = height;
        this.weight = weight;
        Animal.count++;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Animal.count = count;
    }

    public void setHeight(double h) {
        this.height = h;
    }

    public double getHeight() {
        return height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void showInfo() {
        System.out.println("身高：" + this.height);
        System.out.println("体重：" + this.weight);
    }
}
