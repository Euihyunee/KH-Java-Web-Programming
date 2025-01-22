package net;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketTest {
    public static void main(String[] args)  {
        try {
            ServerSocket ss = new ServerSocket(12345);
//            ss.bind(new InetSocketAddress("localhost",12345));
            System.out.println("접속 대기중");
            Socket client = ss.accept();
            System.out.println("클라이언트 연결 성공");
            InputStream is = client.getInputStream();
            byte[] buffer = new byte[1024];
            int readCount = is.read(buffer);
            String message = new String(buffer, 0, readCount, "UTF-8");
            System.out.println("[받은 메시지]: " + message);

        } catch (IOException e) {
            System.out.println("연결 실패");
        }
    }
}
