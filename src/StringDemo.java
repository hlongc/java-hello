public class StringDemo {
    public static void main(String[] args) {
        // 方式一
        String str1 = new String("奥沙利文");
        System.out.println("str1：" + str1);

        // 方式二
        String str2 = "塞尔比";
        System.out.println("str2：" + str2);

        // 方式三
        char[] ch = {'r', 'o', 'n', 'n', 'i', 'e'};
        String str3 = new String(ch);
        System.out.println("str3：" + str3);

        // 方式四
        String str4 = new String(ch, 4, 2);
        System.out.println("str4：" + str4);

        // 使用new String创建的字符串，分配在堆内存中，栈内存保存堆内存的地址
        String str5 = new String("test");
        String str6 = new String("test");

        System.out.println("str5和str6是否相等：" + (str5 == str6));

        String str7 = "ronnie";
        String str8 = "Ronnie";
        System.out.println("str6和str7是否相等：" + (str7 == str8));

        if (str5.equals(str6)) {
            System.out.println("str5和str6的字符串内容相同");
        }
        if (str7.equalsIgnoreCase(str8)) {
            System.out.println("st7和str8忽略大小写时，内容相同");
        }
    }
}
