public class AnimalTest {
    public static void main(String[] args) {
        Animal dog = new Animal("黑色", 135.2f);
        dog.run();

        Animal cat = new Animal("猫咪", 8.8f, "蓝猫");
        cat.walk();
    }
}
