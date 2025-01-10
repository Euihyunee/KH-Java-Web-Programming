package input;

import java.util.Scanner;

class Person{
    String name;
    String phone;
}


public class ScannerTest03 {
    public static void main(String[] args) {
        Person p = new Person();

        Scanner sc = new Scanner(System.in);
        System.out.print("이름 입력: ");
        // 뒤에 오는 엔터까지 버퍼에서 데이터를 읽음
        // nextLine()을 대신하는 방법은 BufferedLeader
        p.name = sc.nextLine();
        System.out.print("전화번호 입력: ");
        p.phone = sc.nextLine();
        sc.close();
        System.out.println("--print--");
        System.out.println("이름 : " + p.name);
        System.out.println("전화번호 : " + p.phone);
    }
}
