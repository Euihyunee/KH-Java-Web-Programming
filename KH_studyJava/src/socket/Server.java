package socket;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Server {
    public static void main(String[] args) {
        // 서버의 IP
        // TCP/IP 소켓을 사용하여 클라이언트에서 서버로 연결처리하는 프로그램을 아래처럼 구현해놓았습니다.
        // 그러나 서버와 소켓이 연결이 되지 않습니다. 문제점을 코드에서 찾아 원인을 파악하고 (30점)
        // 해결 방법을 코드 작성(30점)해서 제출하세요.
        try {
            InetAddress ia = InetAddress.getLocalHost();
            System.out.println(ia.getHostName());

        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
    }
}
