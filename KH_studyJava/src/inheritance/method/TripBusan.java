package inheritance.method;

public class TripBusan extends Trip{
    @Override
    void go() {
        System.out.println("부산 여행 가자");
    }

    public TripBusan() {
        System.out.println("부산 생성자");
    }
}
