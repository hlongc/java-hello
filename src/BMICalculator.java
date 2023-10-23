public class BMICalculator {
    double bmi;
    double height;
    double weight;
    public BMICalculator(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    public void calculateBmi() {
        this.bmi = this.weight / Math.pow(this.height, 2);
    }

    public void getResult() {
        this.calculateBmi();
        System.out.println("bmi: " + this.bmi);
        if (this.bmi < 18.5) {
            System.out.println("偏瘦");
        } else if (this.bmi >= 18.5 && this.bmi <= 25) {
            System.out.println("正常体重");
        } else if (this.bmi > 25 && this.bmi <= 28) {
            System.out.println("有点胖");
        } else if (this.bmi > 28 && this.bmi <= 32) {
            System.out.println("肥胖");
        } else {
            System.out.println("严重肥胖");
        }
    }
}
