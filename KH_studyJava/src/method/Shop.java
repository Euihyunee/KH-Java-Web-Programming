package method;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
public class Shop {
    long orderNum;
    String orderId;
    LocalDateTime orderTime = LocalDateTime.now();
    String orderName;
    String orderProductNum;
    String orderAddress;

    public Shop(long orderNum, String orderId, String orderName, String orderProductNum, String orderAddress) {
        this.orderNum = orderNum;
        this.orderId = orderId;
        this.orderName = orderName;
        this.orderProductNum = orderProductNum;
        this.orderAddress = orderAddress;
    }
    void print(){
        System.out.println("주문번호 : " + orderNum);
        System.out.println("주문자 아이디 : " + orderId);
        System.out.println("주문 날짜 : " + orderTime);
        System.out.println("주문자 이름 : " + orderName);
        System.out.println("주문 상품 번호 : " + orderProductNum);
        System.out.println("배송 주소 : " + orderAddress);
    }
}
