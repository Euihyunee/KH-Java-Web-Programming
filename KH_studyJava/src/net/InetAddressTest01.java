package net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest01 {
    public static void main(String[] args) throws UnknownHostException {
        // DNS: naver.com(도메인 주소) ==
        InetAddress ia = InetAddress.getLocalHost();

        String hostIp = ia.getHostAddress();
        System.out.println("내 컴퓨터 IP:" + hostIp);
        String hostName = ia.getHostName();
        System.out.println("내 컴퓨터 이름: " + hostName);
        // 내부에서 내 컴퓨터에 접속할 때 : 127.0.0.1 == localhost
        // 내 컴퓨터 내부에서 서버 프로그램, 클라이언트 프로그램
    }
}
