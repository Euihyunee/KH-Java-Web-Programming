package inheritance;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person {
    private String name;
    private int age;

    public Person(String name){
        this.name = name;
    }
}
