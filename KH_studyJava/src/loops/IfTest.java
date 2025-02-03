package loops;

public class IfTest {

    // 정수 number와 n,m 이 주어집니다
    // number 가 n의 배수이면서 m의 배수이면 1을 아니라면 0을 return 하도록 메서드 작성
    public static int solution(int number, int n, int m) {
        //return (number % n == 0 && number % m == 0)? 1:0;
         return (number % n != 0 || number % m != 0)? 0:1;
    }
    public static void main(String[] args) {

        int n = 10;
        int m = 11;
        int number = 1100;

        IfTest solution = new IfTest();


        System.out.println(solution.solution(number, n, m));
    }

}
