package modifiers.nonaccess;

public class Math {
    public static double pi = 3.14;
    public static void display() {
        System.out.println("static 메서드");
    }
    // static 필드는 누가 초기화하나요?

    public Math() {
        pi = 3.15;
    }
}
