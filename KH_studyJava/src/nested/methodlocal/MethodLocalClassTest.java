package nested.methodlocal;

import java.util.ArrayList;
import java.util.List;

public class MethodLocalClassTest {

    public static void main(String[] args) {
        MethodLocalClassTest obj = new MethodLocalClassTest();
        List<Integer> numberList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        obj.filterEvenNumber(numberList);
    }

    public void filterEvenNumber(List<Integer> numberList) {

        // 메서드 내에서 중첩 클래스 정의
        class EvenNumberChecker{
            // 짝수 확인 메서드
            public boolean isEven(int number) {
                return number % 2 ==0;
            }
        } // EvenNumberChecker
        EvenNumberChecker checker = new EvenNumberChecker();
        // 결과 집합
        List<Integer> evenList = new ArrayList<Integer>();
        for (int evenNum : numberList) {
            boolean result = checker.isEven(evenNum);
            // result가 짝수이면 evenList에 추가
            if (result) {
                evenList.add(evenNum);
            }
        }
        // 결과 출력
        System.out.println("필터링 결과: " + evenList);


    }// method filterEvenNumber
}
