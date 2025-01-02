package control;

import java.util.Scanner;

public class SwitchCaseUtilizatioon {
    public static void main(String[] args) {
        System.out.print("점수를 입력해주세요(0~100)");
        System.out.print("입력 > ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        num = num /10;

        switch (num) {
            case 9 :
                System.out.println("A"); break;
            case 8 :
                System.out.println("B");break;
            case 7 :
                System.out.println("C");break;
            case 6 :
                System.out.println("D");break;
            default:
                System.out.println("F");break;
        }
    }
}
