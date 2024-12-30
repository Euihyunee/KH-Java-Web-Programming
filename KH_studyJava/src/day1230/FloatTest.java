package day1230;

public class FloatTest {
    public static void main(String[] args) {
        // 실수형
        // 종류 : float(4byte), double(8byte)®
        float num1 = 3.14f;
        // 실수상수는 어미에 f, F를 붙여서 표현
        // 데이터 손실이 발생할 수 있다.
        double num2 = 3.14; // 실수의 기본형
        // byte a = 128;

        System.out.println(num1);
        System.out.println(Float.BYTES + " byte");
        System.out.println(num2);
        System.out.println(Double.BYTES + " byte");

        // int == float 메모리 사이즈는 같다.
        // 부동소수점 표현식

    }



}
