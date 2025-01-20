package sort;

public class BubleSortTest {
    public static void main(String[] args) {
        // 배열에 요소들을 오름차순으로 정렬하세요

        int[] numbers = {65, 34, 25, 12, 22, 11, 90};
        System.out.println("정렬전");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        bubbleSort(numbers);

        System.out.println("정렬후");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
    private static void bubbleSort(int[] numbers){
        for(int i = 0; i<numbers.length; i++){
            for(int j = i; j<numbers.length; j++){
                if(numbers[i] > numbers[j]){
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
    }
}
