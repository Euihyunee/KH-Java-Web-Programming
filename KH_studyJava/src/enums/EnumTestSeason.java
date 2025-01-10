package enums;

public class EnumTestSeason {
    public static void main(String[] args) {
        Season season = Season.SPRING;
        System.out.println(season);
        System.out.println(season.name());
        System.out.println(season.ordinal());
        System.out.println(season.getKoreanName());
        System.out.println(season.getLowerName());
    }
}
