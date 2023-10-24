package com.hlongc.ronnie;

public class Animal {
    private double height;
    private double weight;

    public Animal() {
    }

    public Animal(double height, double weight) {
        this.height = height;
        this.weight = weight;
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
