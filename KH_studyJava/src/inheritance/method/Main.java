package inheritance.method;

class Superclass {
    int superField;

    void superMethod() {
        System.out.println("Superclas method");
    }
}
class Subclass extends Superclass {
    int subField;

    void subMethod() {
        System.out.println("Subclass method");
    }
}

public class Main {
    public static void main(String[] args) {
        // 다형성 적용
        // 업캐스팅
        Superclass obj = new Subclass();
        obj.superField = 10; // 상위 클래스의 필드 사용
        obj.superMethod(); // 상위 클래스의 메서드 호출
        // obj.subField = 10; // 컴파일 에러 : 상위 타입으로 접근 불가
        // obj.subMethod();   // 컴파일 에러 : 상위 타입으로 접근 불가

    }
}
