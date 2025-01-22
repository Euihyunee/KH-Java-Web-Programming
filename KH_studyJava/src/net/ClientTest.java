package net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientTest {
    public static void main(String[] args) {

        Socket socket = new Socket();
        try {
            socket.connect(new InetSocketAddress("localhost" , 12345));
            System.out.println("연결 성공");
            OutputStream outputStream = socket.getOutputStream();
            byte[] buffer = "정의현".getBytes("UTF-8");
            outputStream.write(buffer);
            outputStream.flush();
            System.out.println("메시지 전송 완료");

            // 서버에서 메시지 수진
            InputStream inputStream = socket.getInputStream();
            byte[] buffer2 = new byte[1024];
            int readCount = inputStream.read(buffer2);
            System.out.println("[받은메시지]: "+ readCount);
            inputStream.close();
            outputStream.close();
        } catch (IOException e) {
            System.out.println("연결 실패 -> 주소 확인");
        }finally { // 무조건 실행하는 구간
            System.out.println("연결 종료");
            try {
                socket.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
