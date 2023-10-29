package com.hlongc.classical;

public class MacComputer extends Computer {
    public int weight = 3;

    public void getWeightInfo() {
        System.out.println("电脑的重量：" + this.weight);
        System.out.println("父类电脑的重量：" + super.weight);
    }
}
