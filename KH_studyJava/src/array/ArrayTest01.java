package array;

public class ArrayTest01 {
    public static void main(String[] args) {

        // 배열: 동일한 데이터타입의 집합구조, 메모리상에서 순차적으로 할당된다.
        int n1,n2,n3;
        // int num[3];
        // 1. 배열변수 선언= 2. new 메모리공간 할당
        int[] arrayNum = new int[3];
        // int타입 배열변수 : 지역변수
        // new 키워드로 heap메모리 공간에 할당 4byte자리 몇개
        // 배열은 할당된 메모리공간에 접근하기 위한 변수 이름을 자동으로 만들어줌
        // 배열변수이름[인덱스번호] -> 인덱스 번호는 0번부터 1씩 증가합니다.
        System.out.println(arrayNum); // 메모리 주소값
        System.out.println(arrayNum[0]);  // *(arr+0)==arr[0]
        System.out.println(arrayNum[1]);
        System.out.println(arrayNum[2]);
        // 배열의 길이: 배열변수.length
        System.out.println("배열의 개수 : " + arrayNum.length);


    }
}
