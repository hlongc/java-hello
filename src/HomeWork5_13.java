public class HomeWork5_13 {
    public static float repayment(float money, int times) {
        float ratio;
        // 不同的期数，费率不同
        switch (times) {
            case 3:
                ratio = 0.025f;
                break;
            case 6:
                ratio = 0.045f;
                break;
            default:
                ratio = 0.088f;
        }
        // 总共的手续费
        float serviceCharge = money * ratio;
        // 每期需要还的钱,本金+手续费 / 期数
        return (money + serviceCharge) / 3;
    }
    public static void main(String[] args) {
        float money = 52.10f;
        System.out.println("52.10元分3期还，每期需要还：" + repayment(money, 3));
        System.out.println("52.10元分6期还，每期需要还：" + repayment(money, 6));
        System.out.println("52.10元分12期还，每期需要还：" + repayment(money, 12));
    }
}
