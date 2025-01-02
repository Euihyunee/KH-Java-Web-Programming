package loops;

import java.util.Scanner;

public class DoWhileTest01 {
    public static void main(String[] args) {
        // do {// 여기} while(조건식);
        // 일단 {}실행한 후 조건식이 true이면 {}실행, false {} 빠져나감
        // 조건에 상관없이 무조건 최초 1번은 실행됨
        // 변수에 뭐가 들어올지 모를 때 사용한다.

        Scanner scanner = new Scanner(System.in);

        int num;
        do {
            System.out.println("1. 게임시작 2. 종료");
            System.out.print("선택 > ");
            num = scanner.nextInt();


        } while (num!=1 && num!=2);

        scanner.close();

        switch (num) {
            case 1 :
                System.out.println("게임을 시작합니다!"); break;
            case 2 :
                System.out.println("게임을 종료합니다!");
                 break;
        }
    }
}
