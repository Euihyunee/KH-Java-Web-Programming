package constructor;

public class Member {
    // 생성자
    // 객체가 생성될 때 객체를 초기화할 때 사용
    // 특징
    /* 1. 생정자의 이름은 클래스의 이름과 동일
    *   2. 메서드와 비슷한 구조 : 매개변수 + 바디, 생성자 오버로딩을 지원한다
    * 3. 리턴형이 존재하지 않아요
    * 4. 클래스에는 무조건 생성자가 하나이상 존재해야 한다.
    * 5. 기본 생성자는 생략할 수 있어요: 코드상 생성자가 안 보이면 기본 생성자가 생략되어 존재함.
    * 6. 기본 생성자는 어떠한 생성자를 명시하면 존재하지 않는 걸로
     */
    long id;
    String name;
    int age;
    char gender;

    void print() {
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("성별 : " + gender);
    }
    public Member() {}

    public Member(long id, String name, int age, char gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}
