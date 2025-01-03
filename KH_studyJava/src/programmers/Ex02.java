package programmers;

public class Ex02 {
    public static void main(String[] args) {

        Solution solution = new Solution();
        int[] array = solution.solution(10, 3);
        for(int i : array) {
            System.out.println(i);
        }
    }
}
class Solution {
    public int[] solution(int n, int k) {
        int[] answer = {};

        for(int i = 1; i <= n; i++) {
            if (i % k == 0) {
                int[] temp = new int[answer.length + 1];
                for(int j=0; j<answer.length; j++) {
                    temp[j] = answer[j];
                }

                temp[temp.length - 1] = i;
                answer = temp;
            }
        }
        return answer;
    }
}
