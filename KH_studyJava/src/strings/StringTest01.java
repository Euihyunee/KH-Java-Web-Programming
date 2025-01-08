package strings;

public class StringTest01 {
    public static void main(String[] args) {

        // 1. String 객체 생성
        String str = new String("hello"); // 인스턴스화
        String str1 = "hello";
        String str2 = "hello"; // 리터럴 방식
        String str3 = new String("hello"); // 인스턴스화
        System.out.println(str2);
        System.out.println(str.hashCode());
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str3.hashCode());

        System.out.println("====================");
        System.out.println(System.identityHashCode(str));
        System.out.println(System.identityHashCode(str3));
        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));
        System.out.println("str == str2 : " + (str == str2));
        System.out.println("str.equals(str2) : " + str.equals(str2));

    }
}
