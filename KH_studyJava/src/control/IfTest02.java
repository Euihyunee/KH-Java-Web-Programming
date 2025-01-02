package control;

public class IfTest02 {
    public static void main(String[] args) {
        if (true) {
            System.out.println("무조건 실행합니다.");
        }

        // 죽은 코드다. 이런 코드 작성하지 말 것
        boolean result = true;
        if (result) {
            System.out.println("절대로 실행되지 않아요.");
        }
        int num = 10;
        if (num % 2 == 0) System.out.println("짝수");
        else System.out.println("홀수");

    }
}
