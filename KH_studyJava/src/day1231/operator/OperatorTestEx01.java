package day1231.operator;

public class OperatorTestEx01 {
    public static void main(String[] args) {
        // 삼항 연산자(조건 연산자)
        // 조건?true 일때 값 : false 일때 값
        System.out.println(true ? 10 : 5);
        System.out.println(false ? 10 : 5);

        int num = 101;
        System.out.println(num % 2 == 1 ? "홀수" : "짝수");

        // String str = num%2==0?"짝수":10;
        String str = num % 2 == 0 ? "짝수" : "홀수";
        System.out.println(str);
    }
}
