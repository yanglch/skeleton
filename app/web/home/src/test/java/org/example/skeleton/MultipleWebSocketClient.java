package org.example.skeleton;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

public class MultipleWebSocketClient implements Runnable {

    private Selector selector;

    private InetSocketAddress inetSocketAddress;

    private int count;

    public MultipleWebSocketClient(InetSocketAddress inetSocketAddress, int count) throws IOException {
        this.inetSocketAddress = inetSocketAddress;
        this.count = count;
        this.init();
    }

    private void init() throws IOException {
        selector = Selector.open();



        for (int i = 0; i < count; i++) {
            SocketChannel channel = SocketChannel.open();
            channel.connect(inetSocketAddress);
            channel.configureBlocking(false);
            channel.register(selector, SelectionKey.OP_READ);
        }
    }

    @Override
    public void run() {
        try {
            while (true) {
                if (selector.select() != 0) {
                    Set<SelectionKey> keys = selector.selectedKeys();
                    System.out.println("keys.length is " + keys.size());
                    Iterator<SelectionKey> iterator = keys.iterator();
                    while (iterator.hasNext()) {
                        SelectionKey key = iterator.next();
                        iterator.remove();
                        //如果该key所在的channel或者selector关闭了，这里就会返回true
                        if (key.isAcceptable()) {
                            accept(key);
                        } else if (key.isWritable()) {
                            //write(key);
                        } else if (key.isReadable()) {
                            read(key);
                        }
                    }
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void accept(SelectionKey key) throws IOException {
        ServerSocketChannel serverSocketChannel = (ServerSocketChannel) key.channel();
        SocketChannel socketChannel = serverSocketChannel.accept();
        Selector selector = key.selector();
        socketChannel.configureBlocking(false);
        socketChannel.register(selector, SelectionKey.OP_READ);
        System.out.println("connect successfully");
    }


    private ByteBuffer read = ByteBuffer.allocate(1024);

    private void read(SelectionKey key) throws IOException {
        read.clear();

        SocketChannel channel = (SocketChannel) key.channel();
        channel.configureBlocking(false);
        int num;
        if ((num = channel.read(read)) == -1) {
            System.out.println("未读到信息");
        } else {
            Selector selector = key.selector();
            channel.register(selector, SelectionKey.OP_WRITE);
            System.err.println(new String(read.array(), 0, num));
        }
    }
}
