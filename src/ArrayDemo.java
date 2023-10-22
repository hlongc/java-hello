public class ArrayDemo {
    public static void main(String[] args) {
        // 直接声明并创建内存和赋值
        float[] scoreList = {96.5f, 18.2f, 98f};
        for (int i = 0; i < scoreList.length; i++) {
            System.out.println("第" + (i + 1) + "个元素的值是：" + scoreList[i]);
        }

        // 分步操作
        float[] carList;
        carList = new float[2];
        carList[0] = 1.0f;
        carList[1] = 2.0f;

        carList = new float[]{ 1.0f, 2.0f };
    }
}
