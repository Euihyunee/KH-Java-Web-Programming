package method;

public class PersonTest {
    public static void main(String[] args) {

        Person p1 = new Person();
        p1.display();
        System.out.println();
        p1.setName("조인성");
        p1.setEmail("dafa@gmail.com");
        p1.setBirth(19981112);
        p1.setHeight(58);
        p1.display();
    }
}
