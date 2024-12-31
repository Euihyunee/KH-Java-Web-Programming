package day1231.arithmetic;

public class ArithmeticTest {
    public static void main(String[] args) {
        // 산술연산자(+,-,*,/,%,++,--)
        int num1 = 10, num2 = 20;
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 / num2);
        System.out.println(num1 % num2);
        // 정수/정수는 결과가 정수로 나온다. 소수점 안나옴.
        System.out.println((double)num1 /num2);
        System.out.println(num1/(double)num2);
        System.out.println((double)(num1/num2));
        System.out.println(num1/num2*1.0);

        System.out.println(num1%num2); // 100%200 나머지를 결과로 제공
        // ++, -- 단항 연산자
        System.out.println(++num1);
        System.out.println(num1++);
        System.out.println(num1);
        int a = 10;
        System.out.println(++a + 10);
        a = 10;
        System.out.println(a++ + 10);

    }
}
