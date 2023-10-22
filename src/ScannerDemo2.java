import java.util.Scanner;

public class ScannerDemo2 {
    public static void main(String[] args) {
        int chanceCount = 5; // 一共五次考试机会
        int score1 = 0; // 笔试成绩
        int score2 = 0; // 机试成绩
        Scanner sc = new Scanner(System.in);
        int times = 1;
        while (times <= chanceCount) {
            System.out.println("第" + times + "次考试");
            times++;
            System.out.print("请输入笔试成绩: ");
            score1 = sc.nextInt();
            if (score1 < 60) {
                if (times > chanceCount) {
                    System.out.println("五次考试机会已用完，很遗憾，您考试未通过，下次努力");
                    break;
                } else {
                    System.out.println("笔试成绩不通过，请继续下一次考试");
                    continue;
                }
            }
            System.out.print("请输入机试成绩: ");
            score2 = sc.nextInt();
            if (score2 < 60) {
                if (times > chanceCount) {
                    System.out.println("五次考试机会已用完，很遗憾，您考试未通过，下次努力");
                } else {
                    System.out.println("机试成绩不通过，请继续下一次考试");
                }
            } else {
                System.out.println("恭喜，考试合格");
                break;
            }
        }
    }
}
