public class ConstDemo {
    public static void main(String[] args) {
        // 常量使用final修饰符声明
        final int TANK_VOLUME = 50;
        float price = 9.5F;
        float total;
        total = TANK_VOLUME * price;
        System.out.println(total);
    }
}
