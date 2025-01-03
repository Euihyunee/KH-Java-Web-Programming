package array;

public class ArrayTest03 {
    public static void main(String[] args) {
        String[] strs = new String[3];
        // 참조형 변수 default value는 null : 아직 참조하지 않아요...
        System.out.println(strs[0]);
        int[] arr = null;
        System.out.println(arr);
        // int[] arr2=new int[3] {1,2,3}; // 오류
        int[] arr2 = new int[]{1, 2, 3};
        int[] arr3 = {10,20,30}; // 선언과 동시 초기화만 가능
        // 배열도 할당과 동시 초기화리스트로 쵝화 가능
        // int n = 10;

        int[] arr4;
        arr4 = new int[]{10,20,30};
        // arr4 = {1,2,3};
    }
}
