package inheritance.People;

public class Child extends Parent{
    @Override
    void display(){
        System.out.println("자식 클래스의 display() 메소드");
    }
    @Override
    void introduce(String name) {
        System.out.println(name + "입니다.");
    }
}
