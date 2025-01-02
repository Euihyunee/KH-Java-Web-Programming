package control;

public class SwitchCaseTest01 {
    public static void main(String[] args) {
        int num = 1;

        // switch 에 전달된 값 int 형이면 case 값(동일 타입으로)
        switch (num) {
            case 1: // switch 에 전달된 값이 1이면 여기 위치에서 시작
                System.out.println("1입니다");
            case 2 : // switch 에 전달된 값이 2이면 여기위치에서 시작
                System.out.println("2입니다");
            default: // switch 에 전달된 값이 case 에 적용된 값에 없을 경우
                System.out.println("1,2 도 아닌 나머지");
        }
    }
}
