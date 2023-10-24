public class StringBuilderDemo {
    public static void main(String[] args) {
        fn1();
        fn2();
    }
    public static void fn1() {
        // 经常变化的字符串可以使用StringBuilder，性能更好
        StringBuilder str1 = new StringBuilder();
        long m1 = Runtime.getRuntime().freeMemory(); // 现在的内存
        long t1 = System.currentTimeMillis(); // 现在的时间戳
        for (int i = 0; i < 5000; i++) {
            str1.append(i);
        }
        long m2 = Runtime.getRuntime().freeMemory(); // 现在的内存
        long t2 = System.currentTimeMillis(); // 现在的时间戳
        System.out.println("消耗的内存空间：" + (m1 - m2));
        System.out.println("消耗的时间：" + (t2 - t1));

        String str2 = "";
        long m3 = Runtime.getRuntime().freeMemory(); // 现在的内存
        long t3 = System.currentTimeMillis(); // 现在的时间戳
        for (int i = 0; i < 5000; i++) {
            str2 += i;
        }
        long m4 = Runtime.getRuntime().freeMemory(); // 现在的内存
        long t4 = System.currentTimeMillis(); // 现在的时间戳
        System.out.println("消耗的内存空间：" + (m3 - m4));
        System.out.println("消耗的时间：" + (t4 - t3));
    }
    public static void fn2() {
        StringBuilder str = new StringBuilder("川K888");
        System.out.println("初始字符串：" + str);
        str.replace(1, 2, "A");
        System.out.println("替换以后的字符串：" + str);
        str.insert(5, "89");
        System.out.println("在末尾插入89以后：" + str);
        str.delete(5, 6);
        System.out.println("删除索引为5的字符以后：" + str);
        str.reverse();
        System.out.println("字符串反转以后：" + str);
    }
}
