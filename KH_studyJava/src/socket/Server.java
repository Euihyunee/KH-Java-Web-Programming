package socket;

import java.io.IOException;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        // 서버의 IP
        // TCP/IP 소켓을 사용하여 클라이언트에서 서버로 연결처리하는 프로그램을 아래처럼 구현해놓았습니다.
        // 그러나 서버와 소켓이 연결이 되지 않습니다. 문제점을 코드에서 찾아 원인을 파악하고 (30점)
        // 해결 방법을 코드 작성(30점)해서 제출하세요.

        // port 할당방법
        /*
        ServerSocket serverSocket = new ServerSocket();
        serverSocket.bind(new InetSocketAddress("localhost", 12345);
        IP 할당 가능
         */
        try (ServerSocket serverSocket = new ServerSocket(12345);){
            while(true){
                Socket client = serverSocket.accept();
                InetSocketAddress ia = (InetSocketAddress) client.getRemoteSocketAddress();
                System.out.println("address: " + ia.getAddress());
                System.out.println("HostName: " + ia.getHostName());
                client.close();
            }

        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
