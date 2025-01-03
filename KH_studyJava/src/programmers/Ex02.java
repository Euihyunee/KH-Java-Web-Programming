package programmers;

import java.util.Arrays;

public class Ex02 {
    public static void main(String[] args) {

        Solution solution = new Solution();
        int[] array = solution.solution(10, 3);
        for(int i : array) {
            System.out.print(i + " ");
        }
    }
}
class Solution {
    public int[] solution(int n, int k) {
        int[] answer = {};

        for(int i = 1; i <= n; i++) {
            if (i % k == 0) {

                // TODO 1번째 방법
                int[] temp = Arrays.copyOf(answer, answer.length + 1);
                // TODO 2번째 방법
//                int[] temp = new int[answer.length + 1];
//                System.arraycopy(answer, 0, temp, 0, answer.length);
                // TODO 3번째 방법 answer -> temp 수동 복사
//                 int[] temp = new int[answer.length + 1];
//                 for(int j=0; j<answer.length; j++) {
//                    temp[j] = answer[j];
//                }

                temp[temp.length - 1] = i;
                answer = temp;
            }
        }
        return answer;
    }
}
