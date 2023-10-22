public class SwitchDemo {
    public static void main(String[] args) {
        System.out.println("猜猜城市的别名：" + getTip("成都"));
    }
    public static String getTip(String address) {
        String res;
        switch (address) {
            case "成都":
                res = "天府之国";
                break;
            case "内江":
                res = "甜城";
                break;
            case "重庆":
                res = "山城棒棒军";
                break;
            default:
                res = "哈哈";
        }
        return  res;
    }
}
