package net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest02 {
    public static void main(String[] args) {
        String searchName = "www.naver.com";
        try {
            InetAddress[] ias = InetAddress.getAllByName(searchName);
            for(InetAddress ia : ias) {
                System.out.println(ia);
            }
        } catch (UnknownHostException e) {
            // DNS
            System.out.println(searchName + " not found");
        }
    }
}
