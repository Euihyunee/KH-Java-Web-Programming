package inheritance.method;

public class TripDokdo extends Trip{
    @Override
    void go() {
        System.out.println("독도 여행 가자");
    }

    public TripDokdo() {
        System.out.println("독도 생성자");
    }
}
