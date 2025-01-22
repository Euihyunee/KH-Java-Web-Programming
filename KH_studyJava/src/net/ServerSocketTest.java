package net;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;

public class ServerSocketTest {
    public static void main(String[] args)  {
        ServerSocket ss = null;
        try {
            ss = new ServerSocket();
            ss.bind(new InetSocketAddress
                    ("localhost",12345));
            ss.accept();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
