package inheritance;

// Employee는 Person이다.
public class Employee extends Person{
    private long employeeNo;
    private String comName;

    public Employee(String name) {
        super(name);
    }
}
