package sets;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class LottoGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("금액을 입력하세요: ");
        int money = scanner.nextInt();

        int line = money / 1000;
        char prefix = 'A';


        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("yyyy/MM/dd (E) HH:mm:ss");

        DayOfWeek dof = now.getDayOfWeek();
        System.out.println("오늘: " + dof.getValue() );
        int day = DayOfWeek.SATURDAY.getValue() - now.getDayOfWeek().getValue();
        System.out.println("토요일까지 " + day + "일 남음");
        LocalDateTime saturday = now.plusDays(day);
        System.out.println(saturday);

        System.out.printf("발행일: %s\n" , formatter.format(now));
        formatter = DateTimeFormatter
                .ofPattern("yyyy/MM/dd (E) TR:");
        System.out.printf("추첨일: %s\n" , formatter.format(saturday));
        System.out.printf("-----------------------------------\n");

        for (int i = 0; i < line; i++) {
            Set<Integer> lotto = new TreeSet<>();
            while (lotto.size() < 6) {
                lotto.add((int) (Math.random() * 45) + 1);
            }

            List<Integer> sortedLotto = new ArrayList<>(lotto);
            Collections.sort(sortedLotto);

            System.out.printf("%c 자 동 ", prefix);
            for (int number : sortedLotto) {
                System.out.printf("%02d ", number);
            }
            System.out.println();

            prefix++;
        }
        System.out.println("=========================");
        System.out.printf("금액               %5d원\n", money);

        scanner.close();
    }
}
