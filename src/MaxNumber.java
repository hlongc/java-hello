public class MaxNumber {
    /**
     * 寻找数组最大值
     * @param list 输入数组
     * @return 最大值
     */
    public static int findMaxValue(int[] list) {
        int max = -1;
        for (int c: list) {
            max = Math.max(c, max);
        }
        return  max;
    }

    public static void main(String[] args) {
        System.out.println("数组的最大值是" + (findMaxValue(new int[]{5, 1, 9, 2, 1})));
    }
}
