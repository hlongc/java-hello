package com.hlongc.classical;

public class Computer {
    private String color;
    private int price;
    private int size;
    private String system;

    public int weight = 2;

    public Computer(String color) {
        System.out.println("我是Computer基类的无参构造方法，如果我存在，子类会自动调用我");
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public void getComputerInfo() {
        System.out.println("电脑颜色：" + this.color);
        System.out.println("电脑价格：" + this.price);
        System.out.println("电脑系统：" + this.system);
        System.out.println("电脑尺寸：" + this.size);
    }

    public void getWeightInfo() {
        System.out.println("父类的getWeightInfo：" + this.weight);
    }
}
