package inheritance.method;

import java.io.IOException;

public class ComputerTest {
    public static void main(String[] args) throws IOException {
        Computer computer = new Computer();
        System.out.println("원의 넓이: " + computer.areaCircle(3));


        // 다형성: 자식 객체로 인스턴스화하고 부모타입 객체변수 접근
        Calculator calculator = new Computer();
        System.out.println(calculator.num);
        Object obj = new Object();

    }
}
