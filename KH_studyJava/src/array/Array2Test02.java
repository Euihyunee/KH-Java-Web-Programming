package array;

public class Array2Test02 {
    public static void main(String[] args) {
        // 1. 2차원배열변수 선언;
        // 2차원배열 : 구성요소 -> 1차원배열 : 1차원 배열의 집합

        int[][] arr = new int[2][];
        int[][] arr2 = new int[2][3];
        int[][] arr3 = new int[][]{{1, 2, 3}, {4, 5, 6}};
        int[][] arr4={{1, 2, 3}, {4, 5, 6}};
        int[][] arr5 = {{1, 2}, {3,4, 5}, {6,7,8,9}};

        // 2차원 배열이 제공해주는 1차원 배열변수 이름 arr3[0], arr3[1]
        System.out.println("이차원배열의 길이: " + arr3.length);
        // arr3[0]={1,2,3};
        // arr3[0][0], arr[0][1], arr[0][2];
        // arr3[1]={4,5,6};
        System.out.println("arr3[0] length: " + arr3[0].length);
        System.out.println("arr3[1] length: " + arr3[1].length);

        for(int i=0;i<arr3.length;i++){
            for(int j=0;j<arr3[i].length;j++){
                System.out.println(arr3[i][j] + " ");
            }
            System.out.println();
        }

    }
}
