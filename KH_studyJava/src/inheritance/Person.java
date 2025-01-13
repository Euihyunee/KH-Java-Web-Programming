package inheritance;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person {
    private String name;
    private int birth;
    private String phone;
    private String address;

    public void print(){
        System.out.println("Name: " + name);
        System.out.println("Birth: " + birth);
        System.out.println("Phone: " + phone);
        System.out.println("Address: " + address);
    }
}
