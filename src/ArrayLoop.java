public class ArrayLoop {
    public  static void sum() {
        int[] list = new int[]{0, 1, 2, 3, 4, 5};
        int total = 0;
        for (int cur: list) {
            total += cur;
        }
        System.out.println("数组之和为：" + total);

        for (int num: list) {
            System.out.println("foreach遍历数组：" + num);
        }
    }
    public static void main(String[] args) {
//        bubbleSort();
        calculateScore();
    }

    /**
     * 冒泡排序
     */
    public static void bubbleSort() {
        int[] list = {125, 96, 180, 88, 55};
        int length = list.length;
        int tmp = 0;

        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - 1 - i; j++) {
                if (list[j] > list[j + 1]) {
                    tmp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = tmp;
                }
            }
            System.out.println("第" + (i + 1) + "轮排序结果：");
            for (int cur : list) {
                System.out.print(cur + "\t");
            }
            System.out.println();
        }
    }

    public static void calculateScore() {
        float[][] scoreList = {{100,99,98.5f},{80, 95,92},{100,95.5f,95},{88, 92, 91},{91, 90.5f, 88.5f}};
        // 人数
        int personNum = scoreList.length;
        // 学科数
        int subjectNum = scoreList[0].length;
        float personScore;
        // 保存每一科的总分
        float[] average = new float[3];
        for (float[] person : scoreList) {
            personScore = 0;
            for (int i = 0; i < person.length; i++) {
                // 每一科的得分求和
                average[i] += person[i];
                personScore += person[i];
            }
            System.out.println("个人平均分：" + personScore / subjectNum);
        }
        float chineseAverageScore = average[0] / personNum;
        float mathAverageScore = average[1] / personNum;
        float englishAverageScore = average[2] / personNum;

        System.out.println("语文平均分为: " + chineseAverageScore);
        System.out.println("数学平均分为: " + mathAverageScore);
        System.out.println("英语平均分为: " + englishAverageScore);
    }
}
