package day1230;

public class CharTest {
    public static void main(String[] args) {
        // 문자형 : 문자 1글자를 저장하는 데이터 타입
        char ch1;
        ch1 = 'a';
        System.out.printf("%c\n",ch1);
        System.out.printf("%d\n", (int)ch1);
        // 래퍼 클래스
        // char 2byte
        System.out.println(Character.BYTES+"Byte");
        char ch2 = '가';
        System.out.println(ch2);
        System.out.printf("%d\n", (int)'0');
        System.out.printf("%d\n", (int)'A');
        System.out.printf("%d\n", (int)'a');

        // 문자열 타입 클래스
        String str = "문자열 변수";
    }
}
