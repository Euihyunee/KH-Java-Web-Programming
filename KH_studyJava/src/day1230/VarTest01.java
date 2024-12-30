package day1230;

public class VarTest01 {
    public static void main(String[] args) {
        // 변수 선언 : 메모리공간을 확보하고, 해당메모리에 이름을 붙이는 작업
        // dataType 변수이름;

        byte num;
        // = 대입 연산자 : 오른쪽 값을 왼쪽메모리공간에 넣어라
        // 공간 = 값
        num  = 127; // 0111 1111
        num = ++num; // 1증가 연산자 : 1000 0000
        System.out.println(num);

        // local variable : 지역변수는 사용하려면 초
        short num1 = 0; // 선언과 동시에 초기화
        // num1 = 32768;
        // 그냥수 : 상수 - 기본형(int, 4byte)
        System.out.println(num1);

        // 1. 변수를 선언후 사용
        // 2. 지역변수는 초기화되지 않으면 사용불가

        int num2 = 2100000000;
        System.out.println(num2);

        // long 형 상수표현은 숫자이며 l,L 추가해야 가능
        long num3 = 9000000000000000000L;
        System.out.println(num3);
    }
}
