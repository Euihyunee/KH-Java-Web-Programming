package inheritance;

public class Child extends Parent{
    String name = "자식";

    void disp() {
        System.out.println("Child name = " + this.name);
        System.out.println("Parent name = " + super.name);
    }
}
