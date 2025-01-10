package scanners;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerTest02 {
    public static void main(String[] args) {

        // InputStream inputStream = System.in
        // Scanner scanner = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자 입력: ");

        try {
            // 숫자 입력 안할시 InputMismatchException 발생
            int num = scanner.nextInt();
            System.out.println("입력받은 데이터(num+100) : " +
                    (num+100));
        } catch (InputMismatchException e) {
            System.out.println("숫자 입력 데이터 타입 불일치!");
            return; // main 메서드 종료
        }
        scanner.close();

    }
}
