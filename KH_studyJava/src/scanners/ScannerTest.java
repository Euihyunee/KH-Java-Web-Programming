package scanners;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("아래 예제는 지문에 따라 정확하게 입력하도록 약속");
        System.out.println("숫자만 입력");
        int data = sc.nextInt();
        System.out.println(data);
        // ex) 1234 무조건 숫자로만 이루어져야 문제없이 처리가능
        // ex) 1a1, abc 숫자가 아닌 문자

        System.out.println("문자열을 입력하세요");
        // 문자열 입력 처리가 화이트스페이스 단위
        String str = sc.next();
        System.out.println(str);

        System.out.println("문자열 입력하세요");
        // 문자열 입력 처리가 엔터가 입력되기 전까지
        // 선행에서 다른 입력처리 명령어가 있다면 위에 입력이 들어오는 문제가 있음
        String str2 = sc.nextLine();
        System.out.println(str2);
    }
}
