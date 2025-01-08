package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class NewTime02 {
    public static void main(String[] args) {

        LocalDateTime today = LocalDateTime.now(ZoneId.of("Asia/Seoul"));
        System.out.println(today);
        System.out.println(today.toLocalDate());
        System.out.println(today.toLocalTime());

        LocalDateTime resultDay = today.plusDays(10000);
        System.out.println(resultDay.toLocalDate());

        LocalDate birth = LocalDate.of(1990, 1, 1);
        System.out.println(birth);
    }

}
