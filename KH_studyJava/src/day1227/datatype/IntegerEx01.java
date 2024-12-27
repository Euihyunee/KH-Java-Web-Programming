package day1227.datatype;

public class IntegerEx01 {
    /* TODO
        이름을 만드는 방법
        숫자(0~9), 문자(a-z, A-Z, $, _) 단. $는 사용에 유의
        시작글자는 문자로 시작해야한다.
        합성어를 표현할때
        data_type 또는 dataType
        정수형에는 byte(1byte, 8bit), short(2byte), int(4byte), long(8byte) 가 있다.
     */
    public static void main(String[] args) {
        byte bNum = 10;
        short sNum = 10;
        int iNum = 10;
        long lNum = 10;
        System.out.println(bNum);
        System.out.println(sNum);
        System.out.println(iNum);
        System.out.println(lNum);

        System.out.println("==");
        System.out.println(bNum + sNum);
        System.out.println(sNum + iNum);
        System.out.println(iNum + lNum);
    }
}
