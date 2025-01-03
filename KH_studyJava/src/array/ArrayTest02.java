package array;

public class ArrayTest02 {
    public static void main(String[] args) {
        // 실수형 변수 여러개.... 배열
        // 1. 실수형 배열변수
        double[] ar;
        double ar2[], ar3;
        ar3 = 10.0;
        double[] ar4, ar5;
        double[] arr=new double[10];
        // arr[0], arr[1], arr[2], arr[3]

        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr["+i+"] = "+arr[i]);
        }
    }
}
