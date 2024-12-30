package day1230;

public class FloatTest02 {
    public static void main(String[] args) {
        //실수형은 기본형이 double일까요?
        float result = 0; // 0.0f
        // 반복문
        result += 0.1f;
        // 반복문
//        for(int i=0 ;i<10;i++){
//            // 실행하는 구간
//        }
        for(int i=0; i<=100; i++){
            result += 0.1f;
        }
        System.out.printf("%.6f", result);

    }
}
