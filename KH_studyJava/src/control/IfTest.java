package control;

import java.util.Scanner;

// 제어문
public class IfTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        if (number < 0) {
            System.out.println("0보다 작습니다.");
        } else if (number == 0) {
            System.out.println("0입니다.");
        }else System.out.println("0보다 큽니다.");
    }
}
