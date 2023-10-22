public class AssignDemo {
    public static void main(String[] args) {
        int a = 30;
        int b = 20;
        // a += b,会让运算结果强制向a进行转换
        a += b;
        System.out.println("a: " + a);

        byte c = 20;
//        c = c + 30; // c + int类型超过了byte类型，所以报错
        c += 30;
        System.out.println("c:" + c);
    }
}
