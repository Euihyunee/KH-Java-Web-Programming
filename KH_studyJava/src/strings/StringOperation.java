package strings;

// TODO 문자열 조작
public class StringOperation {
    public static void main(String[] args) {
        String str1 = "안녕하세요";

        System.out.println("concat() : " + str1.concat( " 반갑습니다."));
        System.out.println(str1); // 문자열을 바꾸진 않음
        str1 = str1.concat(" 반갑습니다");
        System.out.println(str1);

        System.out.println("replace(기존문자열, 바꿀문자열)는 해당 문자열를 원하는 것으로 변경 ");
        System.out.println(str1.replace("반갑습니다", "정의현입니다."));

        String str = "> pwd\n" +
                "/Users/eui/Desktop/project/blog";
        for (String st : str.split("/")) {
            System.out.println(st);
        }
    }
}
