public class DoWhileDemo {
    /**
     * 寻找水仙花数
     * @param start 开始区间
     * @param end 结束区间
     */
    public static void findDaffodilNumber(int start, int end) {
        do {
            int a = start / 100; // 百位数
            int b = start / 10 % 10; // 十位数
            int c = start % 10; // 个位数
            if ((int)Math.pow(a, 3) + (int)Math.pow(b, 3) + (int)Math.pow(c, 3) == start) {
                System.out.println("水仙花数: " + start);
            }
            start++;
        } while (start <= end);
    }
    public static void main(String[] args) {
        findDaffodilNumber(100, 999);
    }
}
