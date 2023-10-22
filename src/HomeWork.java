public class HomeWork {
    public static void main(String[] args) {
        float price1 = 29.5f;
        int price2 = 55;
        float price3 = 35.8f;
        float sum = price1 + price2 + price3;
        System.out.println("总价为：" + sum * 45); // 5413.5

        int a = 100;
        int b = 200;
        b += a++;
        System.out.println("b: " + b); // b: 300
        System.out.println("a: " + a); // a: 101
        b += --a;
        System.out.println("b: " + b); // b: 400
        System.out.println("a: " + a); // a: 100
    }
}
