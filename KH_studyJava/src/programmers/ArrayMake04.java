package programmers;

import java.util.ArrayList;

public class ArrayMake04 {
    public static void main(String[] args) {
        int[] arr = {1,4,2,5,3};
        Solution4 solution = new Solution4();
        int[] stk = solution.solution(arr);
        for (int i = 0; i < stk.length; i++) {
            System.out.print(stk[i]);
        }
    }
}
class Solution4 {
    public int[] solution(int[] arr) {

        ArrayList<Integer> list = new ArrayList<>();

        int i = 0;
        while(i<arr.length){
            if (list.isEmpty()) {
                list.add(arr[i++]);
            }else{
                int last = list.get(list.size()-1);
                if (last < arr[i]) {
                    list.add(arr[i++]);
                } else if (last >= arr[i]) {
                    list.remove(list.size()-1);
                }
            }
        }
        int stk[] = new int[list.size()];
        for(int k=0;k<list.size();k++){
            stk[k] = list.get(k);
        }
        return stk;
    }
}
