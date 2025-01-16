package abstracts;

// abstract 키워드가 명시된 클래스를 추상 클래스: 미완성된 클래스
// 추상 클래스는 일반클래스 멤버들 + 추상메서드(필수는 아님)
public abstract class Animal {
    String name;
    int age;

    void showInfo(){
        System.out.println("이름: "+ name + ", 나이: " + age);
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // 추상메서드는 아래를 허용한다.
    // 추상 메서드는 {}없이 헤더만 선언된 메서드 : 미완성 메서드
    public abstract void move();
    public abstract void sound();
}
