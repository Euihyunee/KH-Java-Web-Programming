package method;


public class Person {

    String name;
    int birth;
    String email;
    double height;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirth() {
        return birth;
    }

    public void setBirth(int birth) {
        this.birth = birth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    void display(){
        System.out.println("이름 : " + name);
        System.out.println("생일 : " + birth);
        System.out.println("이메일 : " + email);
        System.out.println("몸무게 : " + height);
    }
    Person(){}
}
