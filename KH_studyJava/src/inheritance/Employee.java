package inheritance;

// Employee는 Person이다.
public class Employee extends Person{
    private long employeeNo;
    private String comName;

    @Override
    public void print(){
        System.out.println("Employee No: " + employeeNo);
        System.out.println("Employee Name: " + comName);
        super.print();
    }
}
