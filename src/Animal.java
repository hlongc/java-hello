public class Animal {
    String color;
    float weight;
    String name;

    public void run() {
        System.out.println("奔跑吧" + color);
    }

    public Animal() {
        System.out.println("这里是无参的构造方法");
    }

    public Animal(String color, float weight) {
        // 可以在构造方法里面调用其他构造方法，但是只能在第一行调用
        this();
        System.out.println("双参的构造方法");
        this.color = color;
        this.weight = weight;
    }

    public Animal(String name, float weight, String color) {
        System.out.println("三参的构造方法");
        this.name = name;
        this.weight = weight;
        this.color = color;
    }

    public void walk() {
        System.out.println(this.name + " " + this.weight + " " + this.color);
    }
}
