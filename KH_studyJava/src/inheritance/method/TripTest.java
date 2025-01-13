package inheritance.method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TripTest {
    public static void main(String[] args) {
        System.out.println("여행 상품을 선택하세요");
        System.out.println("1. 독도, 2. 제주, 3. 부산");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = 0;
        try {
            num = Integer.parseInt(br.readLine());
        }catch (NumberFormatException e){
            System.out.println("번호를 눌러주세요.");
            return;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            br.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Trip trip = null;
        switch (num) {
            case 1 :
                trip = new TripDokdo();
                break;
            case 2 :
                trip = new TripJeju();
                break;
            case 3:
                trip = new TripBusan();
                break;
        }
        try {
            trip.go();
        }catch (NullPointerException e){
            System.out.println("여행을 가고 싶지 않군요!");
        }


    }
}
