public class CarCalculator {
    /** 裸车价格 */
    double originPrice;
    /** 几座 */
    int seatNum;
    /** 排量 */
    double displacement;
    public CarCalculator(double price, int num, double displacement) {
        this.originPrice = price;
        this.seatNum = num;
        this.displacement = displacement;
    }
    /**
     * 计算购置税
     * */
    public double getPurchaseTax() {
        System.out.println("裸车价格：" + this.originPrice);
        int tax = (int)(this.originPrice / (1 + 0.13) * 0.1);
        System.out.println("购置税：" + tax);
        System.out.println("上牌费：" + 500);
        return tax + 500;
    }
    /**
     * 车船使用费
     * */
    public double usageTax() {
        double tax;
        if (this.displacement < 1) {
            tax = 300;
        } else if (this.displacement >= 1.0 && this.displacement <= 1.6) {
            tax = 420;
        } else if (this.displacement > 1.6 && this.displacement <= 2.0) {
            tax = 480;
        } else if (this.displacement > 2.0 && this.displacement <= 2.5) {
            tax = 900;
        } else if (this.displacement > 2.5 && this.displacement <= 3.0) {
            tax = 1920;
        } else if (this.displacement >= 3.0 && this.displacement <= 4.0) {
            tax = 3480;
        } else {
            tax = 5280;
        }
        System.out.println("车船使用费：" + tax);
        return tax;
    }
    /** 强制保险费 */
    public int getInsuranceTax() {
        int tax = this.seatNum >= 6 ? 1100 : 950;
        System.out.println("交通事故责任强制保险费：" + tax);
        return tax;
    }

    public void getTotalFee() {
        System.out.println("总费用为：" + (this.getPurchaseTax() + this.usageTax() + this.getInsuranceTax() + this.originPrice));
    }
}
