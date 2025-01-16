package abstracts;

public class AbstractTest {
    public static void main(String[] args) {
        Animal animal = new Cat("고영희", 2);

        animal.move();
        animal.sound();
        animal.showInfo();
    }
}
