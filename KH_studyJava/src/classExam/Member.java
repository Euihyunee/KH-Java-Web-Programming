package classExam;

public class Member {

    // 멤버 필드
    long no;
    String email;
    String phone;
    String name;

    // 메서드
    void display(){

    }
    // 생성자
    public Member() {
    }

    public Member(long no,
                  String email,
                  String phone,
                  String name) {
        this.no = no;
        this.email = email;
        this.phone = phone;
        this.name = name;
    }
    // 내부 클래스
    class Inner{
        // 클래스 구성요소는 동일하게 정의 가능
        int no;
    }
}
