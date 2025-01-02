package control;

public class SwitchCaseTest03 {
    public static void main(String[] args) {
        String str = "매니져";
        switch (str) {
            case "매니져" :
                System.out.println("삭제기능 사용가능"); break;
            case "맴버" :
                System.out.println("제한게시글 사용가능");break;
            case "일반" :
                System.out.println("자유게시글 등록가능");break;
            default:
                System.out.println("댓글 사용 가능");break;
        }
    }
}
