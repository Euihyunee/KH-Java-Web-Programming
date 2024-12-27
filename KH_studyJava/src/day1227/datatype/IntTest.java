package day1227.datatype;

import java.text.DecimalFormat;

public class IntTest {
    public static void main(String[] args) {
        DecimalFormat formater = new DecimalFormat("###,###");
        System.out.print("int의 최소값 : ");
        System.out.println(formater.format(Integer.MIN_VALUE));
        System.out.print("int의 최대값 : ");
        System.out.println(formater.format(Integer.MAX_VALUE));
        System.out.println("int의 사이즈 : " + Integer.SIZE + "bit");
        System.out.println("int의 byte : " + Integer.BYTES + "byte");
    }
}
