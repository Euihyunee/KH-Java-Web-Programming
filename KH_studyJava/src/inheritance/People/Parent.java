package inheritance.People;

public class Parent {
    String name;

    void display(){
        System.out.println("부모 클래스의 display() 메소드");
    }
    void introduce(String name){
        System.out.println("부모입니다.");
    }
}
