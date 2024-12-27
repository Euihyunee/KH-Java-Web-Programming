package day1227.datatype;

public class ByteTest {
    public static void main(String[] args) {
        System.out.print("byte의 최소값 : ");
        System.out.println(Byte.MIN_VALUE);
        System.out.print("byte의 최대값 : ");
        System.out.println(Byte.MAX_VALUE);
        byte num = 1;
        num = (byte) (Byte.MAX_VALUE + num);
        System.out.println("byte 강제 128 : " + num);
        System.out.println("byte의 사이즈 : " + Byte.SIZE+ "bit");
        System.out.println("byte의 byte  : " + Byte.BYTES + "byte");

    }
}
