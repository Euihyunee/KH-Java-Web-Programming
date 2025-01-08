package time;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class NewTime03 {
    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);
        ZonedDateTime japan = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(japan);
        ZonedDateTime newYork = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println(newYork);
        ZonedDateTime paris = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
        System.out.println(paris);
        ZonedDateTime utc = ZonedDateTime.now(ZoneId.of("UTC"));
        System.out.println(utc);

        // 지정된 날짜를 이용하여 객체로 이용하능
        String str = "19770109";
        // 문자열을 구성하는 문자가 모두 숫자로 이루어진 경우 숫자로 변경 가능
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd");
        LocalDate strToDate = LocalDate.parse(str, dtf);

        System.out.println(strToDate);
    }
}
