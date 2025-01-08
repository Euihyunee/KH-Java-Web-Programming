package modifiers.nonaccess;

public class BankTest {
    public static void main(String[] args) {

        Teller teller1 = new Teller("정의현", 1);
        teller1.call();
        Teller teller2 = new Teller("정의현", 2);
        Teller teller3 = new Teller("정의현", 3);

        teller1.call();
        teller2.call();
        teller3.call();
        teller1.call();
        teller2.call();

    }
}
