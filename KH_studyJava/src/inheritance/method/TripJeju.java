package inheritance.method;

public class TripJeju extends Trip{
    @Override
    void go() {
        System.out.println("제주 여행 가자");
    }

    public TripJeju() {
        System.out.println("제주 생성자");
    }
}
