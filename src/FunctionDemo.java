public class FunctionDemo {
    public static void main(String[] args) {
        float myScore = 61;
        System.out.println("我的成绩是否及格：" + scoreAssess(myScore));
    }

    /**
     * 判断成绩是否及格
     * @param score 成绩
     * @return boolean
     */
    public static boolean scoreAssess(float score) {
        return score >= 60;
    }
}
