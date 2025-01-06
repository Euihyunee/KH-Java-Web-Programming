package method;

public class CalculatorTest {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        int a = 10, b = 20;
        System.out.println(calculator.add(a,b));
        System.out.println(calculator.subtract(a,b));
        System.out.println(calculator.multiply(a,b));
        System.out.println(calculator.divide(a,b));
        System.out.println(calculator.mod(a,b));

    }
}
