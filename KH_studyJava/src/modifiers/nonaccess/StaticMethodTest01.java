package modifiers.nonaccess;

public class StaticMethodTest01 {

    int no=2;
    static String com = "kh";

    void display() {
        System.out.println(no); // 인스턴스 변수 접근 가능
        System.out.println(com); // static 변수 사용 가능
        System.out.println("멤버 메서드입니다. 사용시 " +
                "객체 생성후 객체변수로 접근 가능 ");
    }
    static void print() {
        // static 메서드에서 인스턴스 변수를 사용하기 위해선 객체를 생성하여 사용가능합니다.
        StaticMethodTest01 staticMethodTest01 = new StaticMethodTest01();
        System.out.println(staticMethodTest01.no);
        System.out.println(com + " static 필드 가능");
        System.out.println("static 메서드 사용 시 객체생성할 필요 없이" +
                " 사용가능 -> 클래스이름.메서드()");
    }

    public static void main(String[] args) {
        StaticMethodTest01 staticMethodTest01 = new StaticMethodTest01();
        staticMethodTest01.display();
        print();
    }
}
