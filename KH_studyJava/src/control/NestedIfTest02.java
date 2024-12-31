package control;

import java.util.Scanner;

public class NestedIfTest02 {
    public static void main(String[] args) {
        System.out.print("점수를 입력해주세요(0~100):");
        System.out.print("입력 > ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();



        if (number>=0 && number <=100) {
            if (number >= 90) {
                System.out.println("점수A");
            } else if (number >= 80) {
                System.out.println("점수B");
            } else if (number >= 70) {
                System.out.println("점수C");
            } else if (number >= 60) {
                System.out.println("점수D");
            }else System.out.println("점수F");
        }else System.out.println("0부터 100사이 입력해주세요!");
    }
}
