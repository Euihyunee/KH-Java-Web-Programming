package modifiers.nonaccess;

public class StaticVarTest01 {
    public static void main(String[] args) {
//        Math math = new Math();
//        System.out.println(math.PI);
        // static 변수의 사용방법
        // 객체를 만들 필요없이 클래스.변수로 접근
        // static 예약어 타입 앞에 명시해야 한다.
        System.out.println(Math.pi);
        double a = java.lang.Math.PI;
        System.out.println(a);
        Math.display();
        Math math = new Math();
        System.out.println(math.pi);
    }
}
