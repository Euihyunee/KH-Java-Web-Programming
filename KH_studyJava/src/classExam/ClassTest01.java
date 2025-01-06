package classExam;

import java.util.ArrayList;

public class ClassTest01 {
    public static void main(String[] args) {
        // 데이터타입 변수이름;
        int a;
        int[] arr = new int[10];
        // 배열이 동일데이터의 집합이라고하면
        // 동일 데이터뿐만 아니라 다른 타입도 집합처리 가능
        Exam ex1 = new Exam();
        Exam ex2 = new Exam();

        // 정적 할당 리스트
        Exam[] exArr = new Exam[20];
        // 동적 할당 리스트
        ArrayList<Exam> exams = new ArrayList<>();

        Point point; // 지역변수 선언 -> stack에 할당

        point = new Point(); // 메서드 선언하면 내부 필드를 heap 영역에 할당

        point.x = 10;
        point.y = 20;
        System.out.println(point.x + " : " + point.y);

    }
}
