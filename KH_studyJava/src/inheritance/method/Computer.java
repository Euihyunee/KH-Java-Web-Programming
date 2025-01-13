package inheritance.method;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Computer extends Calculator{
    /*
    부모의 메서드와 동일 시그니처(리턴타입, 메서드이름, 파라미터)를 가져야 한다.
    private < pakage < protected < public
    자식의 접근 제어자는 부모의 범위 이상이어야 한다.
    새로운 예외(Exception)을 throws를 할 수 없음.
     */
    @Override
    double areaCircle(double r) throws IOException {
        InputStream isr = new BufferedInputStream(System.in);
        BufferedInputStream bis = new BufferedInputStream(isr);
        int num = bis.read();
        return Math.PI * r * r;
    }
}
