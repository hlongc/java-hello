import java.util.Scanner;

public class HomeWork6_13 {
    public static void turnNumber() {
        int num = 5678;
        int a = num / 1000; // 千位
        int b = num % 1000 / 100; // 百位
        int c = num % 100 / 10; // 十位
        int d = num % 10; // 个位

        int result = d * 1000 + c * 100 + b * 10 + a;
        System.out.println("5678翻转以后是：" + result);
    }
    public static void findRoseNumber() {
        for (int i = 1000; i <= 9999; i++) {
            int a = i / 1000; // 千位
            int b = i % 1000 / 100; // 百位
            int c = i % 100 / 10; // 十位
            int d = i % 10; // 个位
            if ((int)Math.pow(a, 4) + (int)Math.pow(b, 4) + (int)Math.pow(c, 4) + (int)Math.pow(d, 4) == i) {
                System.out.println(i);
            }
        }
    }
    public static void calculatePrice() {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入钢笔的价格（元）：");
        int penPrice = sc.nextInt();
        System.out.print("请输入水杯的价格（元）：");
        int cupPrice = sc.nextInt();
        float total = (float) penPrice + (float) cupPrice;
        System.out.println("一共需要支付 " + total + " 元");
    }
    public static void guessAge() {
        Scanner sc = new Scanner(System.in);
        int times = 1;
        int max = 3;
        while (times <= max) {
            System.out.print("请输入年龄：");
            int age = sc.nextInt();
            if (age == 18) {
                System.out.println("恭喜你，猜对了");
                break;
            } else if (times == 3) {
                System.out.println("很遗憾" + max + "次机会用完了，你都没猜对");
                break;
            } else {
                System.out.println("没猜对，再来一次吧");
                times++;
            }
        }
    }
    public static void printNumber() {
        for (int i = 1; i <= 10; i++) {
            for (int asciiValue = 65; asciiValue <= 70; asciiValue++) {
                char character = (char) asciiValue;
                if (character == 'E') continue;
                System.out.print(Integer.toString(i) + character + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        turnNumber();
        findRoseNumber();
        calculatePrice();
        guessAge();
        printNumber();
    }
}
