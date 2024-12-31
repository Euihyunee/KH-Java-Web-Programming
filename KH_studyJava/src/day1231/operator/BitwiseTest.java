package day1231.operator;

public class BitwiseTest {
    public static void main(String[] args) {
        // 비트연산자
        byte a=60; // 0011 1100
        byte b=13; // 0000 1101
        // & binary And Operator
        // 0000 1100
        byte result = (byte) (a&b);
        System.out.println("a&b : " + (a & b));
        System.out.println("result : "+result);

        // 0011 1101 -> 61
        result = (byte) (a|b);
        System.out.println("result : " + result);

        // 0011 0001 (xor)
        result = (byte) (a^b);
        System.out.println("result : " + result);

        // 1100 1110 (~반전)
        // 0011 0001 + 1
        // 0011 0010 -> 50
        result = (byte) ~result;
        System.out.println("~result : " + result);

        // 0010 1000 -> 40
        byte num = 40;
        // 0101 0000 -> 80
        System.out.println("num << 1 : " + (num << 1));
        // 0000 0101 -> 5
        System.out.println("num >> 3 : " + (num >> 3));
        // 0000 0010 -> 손실 발생 2
        System.out.println("num >> 4 : " + (num >> 4));

        // 0011 1100
        byte num1 = 60;
        System.out.println("num1 << 2 : " + (num1 << 2));
        System.out.println("num1 << 2 : " + (byte)(num1 << 2));

        // >>> (zero fill right shift)
        // 0011 1100
        byte num3 = 60;
        // 0000 1111
        System.out.println("a >>> 2 : " + (byte)(a >>> 2));
    }
}
