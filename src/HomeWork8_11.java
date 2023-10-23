public class HomeWork8_11 {
    public static void main(String[] args) {
        BMICalculator bmi = new BMICalculator(1.69, 68.5);
        bmi.getResult();

        Children xiaoming = new Children();
        xiaoming.age = 6;

        Children xiaoli = xiaoming;
        xiaoli.age = 11;

        System.out.println("小明年龄：" + xiaoming.age);
        System.out.println("小李年龄：" + xiaoli.age);
        System.out.println(xiaoming);
        System.out.println(xiaoli);
    }
}
