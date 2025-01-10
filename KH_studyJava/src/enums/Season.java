package enums;

// Enum에서 제공하는 name, ordinal
// 추가 필드
public enum Season {
    SPRING("봄", "spring"),
    SUMMER("여름", "summer"),
    FALL("가을", "fall"),
    WINTER("겨울", "winter");

    // 추가 필드, 메서드를 사용가능
    private final String koreanName;
    private final String lowerName;
    // 추가 메서드
    Season(String koreanName, String lowerName) {
        this.koreanName = koreanName;
        this.lowerName = lowerName;
    }
    // 생성자
    public String getKoreanName() {
        return koreanName;
    }
    public String getLowerName() {
        return lowerName;
    }

}
