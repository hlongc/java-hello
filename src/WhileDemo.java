public class WhileDemo {
    /**
     * 测试汽车能跑几圈
     * @param total 初始电量
     * @param duration 每一圈消耗的电量
     * @return 能跑的圈数
     */
    public static int run(int total, int duration) {
        int circle = 0;
        while (total >= duration) {
            total -= duration;
            circle++;
        }

        return circle;
    }
    public static void main(String[] args) {
        System.out.println("一共能绕: " + run(65, 10) + "圈");
    }
}
