package method;

public class Calc {

    // 메서드 오버로드
    // 동일한 메서드 이름을 허용하는 문법
    //, 단 매개변수의 타입 또는 순서나 개수 구분이 되야합니다.

    void print(){
        System.out.println("안녕하세요");
    }

    void print(String name) {
        System.out.println(name + "님 안녕하세요");
    }
}
