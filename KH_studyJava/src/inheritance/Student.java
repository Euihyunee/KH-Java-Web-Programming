package inheritance;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
// IS-A 관계
// Student는 Person이다.
public class Student extends Person {
    private long stdNo;
    private String school;

    public Student() {
        super("이름란");
    }
    public Student(String name) {
        super(name);
    }

    void display(){
        System.out.println(stdNo);
        System.out.println(school);
        System.out.println(super.getName());
        System.out.println(super.getAge());
    }
}
