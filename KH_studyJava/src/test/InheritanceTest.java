package test;


// 부모 클래스
class Animal {
    String name;

    // 생성자
    public Animal(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println("동물 울음소리");
    }
    public void eatTime(){
        System.out.println("동물 밥시간");
    }
}

// 자식 클래스
class Dog extends Animal{

    // 생성자
    public Dog(String name){
        // super로 부모 클래스의 생성자 이용
        super(name);
    }
    @Override
    public void makeSound(){
        System.out.println(name + " 울음소리");
    }
    public void fetch(){
        System.out.println(name + "의 개인기");
    }
}

// 첫 번째 인터페이스
interface Flyable{
    void fly();
}
// 두 번째 인터페이스
interface Swimmable{
    void swim();
}
// 두 인터페이스를 구현하는 클래스
class FlyingFish implements Flyable, Swimmable{
    @Override
    public void fly() {
        System.out.println("날치가 날아갑니다.");
    }
    @Override
    public void swim() {
        System.out.println("날치가 헤엄칩니다.");
    }
}
public class InheritanceTest {
    public static void main(String[] args) {

        Dog myDog = new Dog("강아지");
        myDog.makeSound();
        // 동물 울음소리
        // 강아지 울음소리
        myDog.fetch();
        // 출력: 강아지의 개인기

        myDog.eatTime();

        Animal dog = new Dog("자식");
        dog.makeSound();

        FlyingFish myFlyingFish = new FlyingFish();
        myFlyingFish.fly();
        myFlyingFish.swim();
    }

}
