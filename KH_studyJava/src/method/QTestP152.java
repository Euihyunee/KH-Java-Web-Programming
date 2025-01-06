package method;

public class QTestP152 {
    public static void main(String[] args) {
        Man man = new Man(40, "James", true, 3);

        man.print();

        System.out.println("------------------------");

        Shop shop = new Shop(201803120001L,
                "abc123","홍길순",
                "PD0345-12",
                "서울시 영등포구 여의도동 20번지");
        shop.print();
    }

}
