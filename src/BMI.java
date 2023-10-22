public class BMI {
    public static String calculateBMI(float bmi) {
        String res;
        if (bmi < 18.5) {
            res = "偏瘦";
        } else if (bmi >= 18.5 && bmi <= 25) {
            res = "正常体重";
        } else if (bmi > 25 && bmi <= 28) {
            res = "有点胖";
        } else if (bmi > 28 && bmi <= 32) {
            res = "肥胖";
        } else {
            res = "严重肥胖";
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(calculateBMI(20f));
        System.out.println(calculateBMI(26.3f));
    }
}
