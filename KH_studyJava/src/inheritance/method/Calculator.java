package inheritance.method;

import java.io.IOException;

public class Calculator {

    int num = 3;

    double areaCircle(double r) throws IOException {
        System.out.println("Calculator areaCircle() 실행");
        return 3.14 * r * r;
    }
}
