package loops;

public class WhileTest03 {
    public static void main(String[] args) {
        // 1~10 숫자 중에 홀수만 출력하세요

        int num = 1;
        while (num <= 10) {
            if(num % 2 != 0) {
                System.out.println("홀수 : "+num);
            }
            num++;
        }
    }
}
