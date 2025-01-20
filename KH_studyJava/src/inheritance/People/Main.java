package inheritance.People;

public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();

        parent.display();
        // 부모 클래스의 display() 메소드
        parent.introduce("아무개");
        // 부모입니다.

        child.display();
        // 자식 클래스의 display() 메소드
        child.introduce("아무개");
        // 아무개입니다.
    }
}
