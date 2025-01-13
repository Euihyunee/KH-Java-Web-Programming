package inheritance;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
// IS-A 관계
// Student는 Person이다.
public class Student extends Person {
    private long studentNo;
    private String school;

    @Override
    public void print(){
        System.out.println("Student No: " + studentNo);
        System.out.println("School: " + school);
        super.print();
    }
}
