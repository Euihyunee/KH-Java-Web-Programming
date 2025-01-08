package strings;

public class StringTest02 {
    public static void main(String[] args) {
        // 문자열 메서드

        String str1 = "HELLO";
        String str2 = "hello";
        System.out.println(str1.equals(str2));
        // 대소문자에 상관없이 처리
        System.out.println(str1.equalsIgnoreCase(str2));
    }
}
