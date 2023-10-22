import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入考试得分: ");
        int score = sc.nextInt();
        System.out.println("考试" + (score >= 60 ? "合格" : "不合格"));
        System.out.print("请输入体重: ");
        float weight = sc.nextFloat();
        System.out.println("你的体重是" + weight);
    }
}
