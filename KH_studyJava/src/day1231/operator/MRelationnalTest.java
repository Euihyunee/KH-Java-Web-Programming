package operator;

public class MRelationnalTest {
    public static void main(String[] args) {
        // 관계 연산자
        int num1 = 10, num2 = 20;
        System.out.println("num1 == num2 : " + (num1 == num2));
        System.out.println("num1 != num2 : " + (num1 != num2));
        System.out.println("num1 > num2 : " + (num1 > num2));
        System.out.println("num1 < num2 : " + (num1 < num2));
        System.out.println("num1 >= num2 : " + (num1 >= num2));
        System.out.println("num1 <= num2 : " + (num1 <= num2));

        String str1 = "hello";
        String str2 = "hello";
        String str3 = new String("hello");

        System.out.println("str1 == str2 : " + (str1 == str2));
        System.out.println("str1 == str3 : " + (str1 == str3));
        System.out.println("str1.equals(str2) : " +str1.equals(str2));
        System.out.println("str1.equals(str3) : " + str1.equals(str3));
        System.out.println("num1 != num2 : " + (num1 != num2));


    }
}
