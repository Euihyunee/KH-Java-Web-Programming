package abstracts;

public class Cat extends Animal{

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void move() {
        System.out.println("꽁꽁 얼어붙은 고양이가 한강 위를 걷습니다.");
    }

    @Override
    public void sound() {
        System.out.println("냐옹");
    }
}
