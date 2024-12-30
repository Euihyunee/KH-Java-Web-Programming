package day1230;

public class ConstantTest {
    // 상수는 대문자로 표기하는게 일반적인 관례
    // 언제 사용? 공유의 목적으로 사용
    static final int NUM = 100;
    static final double PI = 3.14;
    public static void main(String[] args) {
        // num = 10; 전역변수는 대입불가
        System.out.println(NUM);
        System.out.println(PI);
    }
}
