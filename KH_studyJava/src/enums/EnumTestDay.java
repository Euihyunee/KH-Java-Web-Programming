package enums;

public class EnumTestDay {

    public static void main(String[] args) {
        Day day = Day.MONDAY;
        Day today = Day.today();
        System.out.println(day);
        System.out.println(today);
        System.out.println(today.getKoreanName());

        for(Day d : Day.values()){
            System.out.print(d + ", ");
        }
        System.out.println();
        Day mDay = Day.valueOf("MONDAY");
        System.out.println("월요일 날짜 순서(0부터) : " + mDay.ordinal());

    }
}
