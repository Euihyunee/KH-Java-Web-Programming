package loops;

public class ForTest04 {
    public static void main(String[] args) {

        // 홀수의 합은?
        int num = 0;
        for (int i = 1; i < 10; i++) {
            if (i % 2 == 0) {
                continue; // 짝수이면 증감문으로 이동
            }
            // 홀수만 아래문장이 실행됩니다.
            num += i;
        }
        System.out.println(num);
    }
}
