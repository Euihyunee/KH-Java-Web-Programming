package day1230;

public class StringTest {
    public static void main(String[] args) {
        // 문자열은 기본형은 아니지만 마치 기본형처럼 사용합니다.

        String str = new String("문자열을 쓰시면 됩니다.");
        String str2 = "문자열을 쓰시면 됩니다.";
        System.out.println(str == str2);
        System.out.println(str.equals(str2));
    }
}
