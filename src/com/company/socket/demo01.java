package com.company.socket;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author zsw
 * @date 2021/1/4 11:33
 */
public class demo01 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress[] inetAddresses = InetAddress.getAllByName("192.168.51.34");
        for (int i = 0; i < inetAddresses.length; i++) {
            System.out.println(inetAddresses[i]);
        }
        InetAddress byName = InetAddress.getByName("192.168.51.34");
        System.out.println(byName.getAddress());
        System.out.println(byName.getCanonicalHostName());
        System.out.println(byName.getHostAddress());
        System.out.println(byName.getHostName());


    }
}
