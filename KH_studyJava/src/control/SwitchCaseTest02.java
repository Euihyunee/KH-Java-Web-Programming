package control;

public class SwitchCaseTest02 {
    public static void main(String[] args) {
        int num = 1;
        switch (num) { // 실수형 결과가 switch 에서 사용불가
            case 1 :
                System.out.println("삭제기능 사용가능");
            case 2:
                System.out.println("제한게시글 사용가능");
            case 3 :
                System.out.println("자유게시글 등록가능");
            default:
                System.out.println("댓글 사용 가능");
        }
    }
}
