package time;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;

public class NewTime {
    // newTime, java 8버전에서 적용됨
    // local 시간을 출력해줌
    LocalDateTime date1;
    // 사용자가 zone을 지정해서 사용
    ZonedDateTime date2;
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        System.out.print(year+"년");
        int month = calendar.get(Calendar.MONTH) + 1;
        System.out.print(month+"월");
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(day+"일");

        Date date = new Date();
        System.out.println(date);
        date.setTime(date.getTime()+1000*60*60*24); // 하루 더하기
        System.out.println(date);
    }
}
