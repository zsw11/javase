package com.company.socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @author zsw
 * @date 2021/1/4 13:15
 */
public class sendDemo {
    public static void main(String[] args) throws IOException {
        // 创建一个 Socket 对象
        DatagramSocket datagramSocket = new DatagramSocket();
        byte[] bytes = "hello byte!~".getBytes();
        int length = bytes.length;
        InetAddress inetAddress = InetAddress.getByName("127.0.0.1");
        int port = 9527;
        DatagramPacket datagramPacket = new DatagramPacket(bytes, length, inetAddress, port);
        datagramSocket.send(datagramPacket);
        datagramSocket.close();


    }
}
