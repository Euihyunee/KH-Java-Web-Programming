package strings;

// TODO 문자열 추출 subString
public class StringExtraction {
    public static void main(String[] args) {
        String str = "01234567589";

        System.out.println(str.substring(1));
        System.out.println(str.substring(2));
        System.out.println(str.substring(1,5));
        System.out.println(str.subSequence(1,5));

        String[] strArr = str.split("5");
        for (String st : strArr) {
            System.out.println(st);
        }
        // 문자열 위치값을 이용해서 하나만 추출
        char ch = str.charAt(0); // index에 해당하는 한 글자를 추출해서 char value로 리턴
        System.out.println(ch);

        System.out.println("String 문자열에서 일치하는 값의 앞글자 기준 인덱스 제공 .indexOf()");
        String str11 = "안녕하세요. 반가워요!! 문자열 관련 메서드 처리";
        System.out.println(str11.indexOf("!"));
        System.out.println(str11.substring(str11.indexOf("!")));
        System.out.println(str11.indexOf("정의현")); // 없으면 -1 리턴
        System.out.println("lastIndexOf()는 일치하는 문자 중 젤 마지막 인덱스를 제공한다. ");
        System.out.println("lastIndexOf() : " + str11.lastIndexOf("!"));
        System.out.println("indexOf() : " + str11.indexOf("!"));

        System.out.println("contains()는 문자열이 존재하면 true, false");
        System.out.println("contains() : " + str11.contains("!"));
        System.out.println("contains() : " + str11.contains("정의현"));
    }
}
