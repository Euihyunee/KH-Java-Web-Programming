package day1230;

public class CastingTest {
    public static void main(String[] args) {

        byte num1 = 10;
        int num2 = num1;

        System.out.println(num2);
        // byte result = (byte)(numm+10); 에러남
        int result = num1 +10; // int = byte + int 에서 작은쪽에서 큰 곳으로 가기에 자동 형변환이 일어남
        System.out.println(result);
        byte num3=(byte)128; // 강제적으로 형변환
        System.out.println(num3);

        float num4 =10000000000000l;

        // TODO byte < short < int < long < float < double

        int number = (int)3.14;
        // 강제 캐스팅 가능. 단 데이터의 손실이 발생할 수 있다.
        // 소숫점 아래 데이터의 손실이 발생하더라도 강제캐스팅하는 경우 할 수는 있다.
        System.out.println(number);


    }
}
