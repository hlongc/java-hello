public class HomeWork7_14 {
    public static void topic1() {
        float[] list1 = {120, 95.5f, 88, 125.9f, 69, 76.7f};
        for (float cur : list1) {
            System.out.print(cur + "\t");
        }
        System.out.println("===================");
        float[] list2 = new float[6];
        list2[0] = 120;
        list2[1] = 95.5f;
        list2[2] = 88;
        list2[3] = 125.9f;
        list2[4] = 69;
        list2[5] = 76.7f;
        for (float cur: list2) {
            System.out.print(cur + "\t");
        }
    }
    public static void topic2() {
        int[] arr = {16, 125, 13, 246, 55, 18, 26, 160, 99, 120, 188};
        for (int cur : arr) {
            if (cur > 100) {
                System.out.println(cur);
            }
        }
    }

    public static void topic3() {
        int[] arr = {16, 125, 13, 246, 55, 18, 26, 160, 99, 120, 188};
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                System.out.println("arr[" + i + "]: " + arr[i]);
            }
        }
    }

    public static void main(String[] args) {
//        topic1();
        topic2();
    }
}
