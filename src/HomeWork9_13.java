public class HomeWork9_13 {
    public static void main(String[] args) {
        compareStr();
        startAndEnd();
        replacePhoneNum();
        words();
    }
    public static void words() {
        String poemArr[] = {
                "青青园中葵, 朝露待日晞。",
                "阳春布德泽，万物生光辉。",
                "常恐秋节至，焜黄华叶衰。",
                "百川东到海，何时复西归？",
                "少壮不努力，老大徒伤悲。"
        };
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < poemArr.length; i++) {
            str.append(poemArr[i] + "\n");
        }
        System.out.println(str);
    }
    public static void replacePhoneNum() {
        StringBuilder str = new StringBuilder("13512345566");
        System.out.println("替换之前：" + str);
        str.replace(3, 7, "****");
        System.out.println("替换之后：" + str);
    }
    public static void startAndEnd() {
        String str1 = "hlongc";
        String str2 = "hulongchao";
        System.out.println(str1.startsWith("hlong"));
        System.out.println(str2.endsWith("chao"));
    }
    public static void compareStr() {
        // 比较username和nickname
        String username = new String("xiaomu");
        String nickname = new String("xiaomu");
        System.out.println("username == nickname => " + (username == nickname));
        System.out.println("username.equals(nickname) => " + username.equals(nickname));

        // 比较password和rePassword
        String password = "abc123";
        String rePassword = "abc123";
        System.out.println("password == rePassword => " + (password == rePassword));
        System.out.println("password.equals(rePassword) => " + password.equals(rePassword));
    }
}
