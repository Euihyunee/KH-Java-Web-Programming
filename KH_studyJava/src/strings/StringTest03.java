package strings;

public class StringTest03 {
    public static void main(String[] args) {

        // 문자열 변환하는 메서드
        String str1 = new String("Hello");
        // 소문자로 변환해준다.
        System.out.println(str1);
        System.out.println(str1.toLowerCase());
        str1 = str1.toLowerCase();
        System.out.println(str1);

        // 대문자 변환
        System.out.println(str1.toUpperCase());
        str1 = str1.toUpperCase();
        System.out.println(str1);

        // 앞뒤 공백 제거(중간은 제거x)
        String str = "        안녕하세요!!  반갑습니다.         ";
        System.out.println(str);
        System.out.println(str.trim());
        str = str.trim().toLowerCase();
        System.out.println(str);
    }
}
