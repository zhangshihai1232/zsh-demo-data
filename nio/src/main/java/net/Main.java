package net;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Arrays;

/**
 * Created by zsh on 2016/9/27.
 */
public class Main {

    public static void main(String[] args) throws IOException {
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        ServerSocket socket = serverSocketChannel.socket();
        socket.bind(new InetSocketAddress(9999));
        ByteBuffer buf = ByteBuffer.allocate(48);
        buf.clear();
        while(true){
            SocketChannel socketChannel =
                    serverSocketChannel.accept();
            socketChannel.read(buf);
            System.out.println(buf);
            System.out.println(socketChannel);
            //do something with socketChannel...
        }
    }
}
