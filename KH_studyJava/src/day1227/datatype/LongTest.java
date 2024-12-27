package day1227.datatype;

import java.text.DecimalFormat;

public class LongTest {
    public static void main(String[] args) {
        /**
         * long -> 관리하는 클래스를 만들었어요
         * java.lang.Long num;
         */
        DecimalFormat formater = new DecimalFormat("###,###");

        System.out.print("long의 최소값 : ");
        System.out.println(formater.format(Long.MIN_VALUE));
        System.out.print("long의 최대값 : ");
        System.out.println(formater.format(Long.MAX_VALUE));
        System.out.println("long의 사이즈 : " + Long.SIZE + "bit");
        System.out.println("long의 byte : " + Long.BYTES + "byte");
    }
}
