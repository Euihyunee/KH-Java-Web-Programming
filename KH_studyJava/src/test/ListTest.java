package test;

import java.util.Arrays;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1,2,3);
        int[] intArr =
                intList.stream().mapToInt(Integer::intValue).toArray();
        for(int i : intArr) {
            System.out.println(i);
        }
    }
}
