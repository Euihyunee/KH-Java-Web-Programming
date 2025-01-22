package test;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog(); // 업캐스팅
        Animal cat = new Cat(); // 업캐스팅

        dog.makeSound(); // "개가 짖습니다" 출력
        cat.makeSound(); // "고양이가 야옹합니다" 출력
    }
}
