package socket;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {

        // new Socket({IP}, {Port});

        try (Socket socket = new Socket()){
            System.out.println("서버에 요청");
            socket.connect(new InetSocketAddress("127.0.0.1", 12345));
            System.out.println("연결 성공");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
