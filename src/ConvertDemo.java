public class ConvertDemo {
    public static void main(String[] args) {
        int num_1 = 26;
        int num_2 = 260;
        // byte类型的范围是-128~127
        byte b_1 = (byte) num_1;
        byte b_2 = (byte) num_2; // 超过byte类型范围，会丢失
        System.out.println(b_1);
        System.out.println(b_2);

        int i_1 = 100;
        int i_2 = 110;
        int i_3 = 115;
        int sum = i_1 + i_2 + i_3;
        int avg = sum / 3;
        System.out.println("avg" + avg);

        float avg_f = (float) sum / 3;
        System.out.println("强制转换sum为浮点数，计算的平均值:" + avg_f);
    }
}
