package com.hlongc.classical;

public class MacComputer extends Computer {
    public int weight = 3;

    public MacComputer(int weight) {
        // 此处会自动调用父类的无参构造方法，如果要显示调用父类的构造方法，必须在构造方法第一行调用
        // 如果父类只有带参数的构造方法，那么子类必须显示调用父类的带参构造方法
        super("green");
        System.out.println("我是MacComputer的构造方法");
        this.weight = weight;
    }

    @Override
    public void getWeightInfo() {
        System.out.println("电脑的重量：" + this.weight);
        System.out.println("父类电脑的重量：" + super.weight);
    }
}
