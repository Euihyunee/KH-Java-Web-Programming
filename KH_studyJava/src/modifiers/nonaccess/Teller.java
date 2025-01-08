package modifiers.nonaccess;

public class Teller {

    public static int genNum = 1;
    String tellerName;
    int tellNo;

    public Teller() {
    }

    public Teller(String tellerName, int tellNo) {
        this.tellerName = tellerName;
        this.tellNo = tellNo;

    }

    void call() {
        System.out.println(genNum
                + "번 고객님 "
                + tellNo
                + "번 창구로 오세요!");
        genNum++;
    }

    // 입금 처리
    void deposit() {
        System.out.println("입금");
    }

    // 출금 처리
    void withdraw() {
        System.out.println("출금");
    }
}
