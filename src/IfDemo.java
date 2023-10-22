public class IfDemo {
    public static void main(String[] args) {
        int temperature = 19;
        if (temperature > 20) {
            System.out.println("今天天气好，去爬山");
        } else {
            System.out.println("今天在家里睡觉吧");
        }
        System.out.println(temperature > 10 ? "大于10" : "小于等于10");
    }
}
