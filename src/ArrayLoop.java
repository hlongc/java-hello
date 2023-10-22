public class ArrayLoop {
    public static void main(String[] args) {
        int[] list = new int[]{0, 1, 2, 3, 4, 5};
        int total = 0;
        for (int i = 0; i < list.length; i++) {
            total += list[i];
        }
        System.out.println("数组之和为：" + total);

        for (int num: list) {
            System.out.println("foreach遍历数组：" + num);
        }
    }
}
