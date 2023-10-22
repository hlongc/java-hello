public class ForLoopDemo {
    /**
     * 寻找包含7或者7的倍数
     * @param start 开始区间
     * @param end 结束区间
     */
    public static void findSeven(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (i % 7 == 0) {
                System.out.println(i);
                continue;
            }
            if (Integer.toString(i).contains("7")) {
                System.out.println(i);
            }
        }

    }
    public static void main(String[] args) {
        findSeven(10, 100);
    }
}
