//package org.example.skeleton;
//
//
//import java.net.InetSocketAddress;
//import java.net.URI;
//import java.net.http.HttpClient;
//import java.net.http.HttpRequest;
//import java.net.http.HttpResponse;
//import java.net.http.WebSocket;
//import java.nio.ByteBuffer;
//import java.nio.channels.SocketChannel;
//import java.util.concurrent.CompletableFuture;
//import java.util.concurrent.CompletionStage;
//import java.util.concurrent.TimeUnit;
//
//public class Test {
//
//    public static void main(String[] args) throws Exception {
////        MultipleWebSocketClient client = new MultipleWebSocketClient(new InetSocketAddress("localhost/web_socket", 8080), 10);
//
//        CompletableFuture<WebSocket> webSocketCompletableFuture = HttpClient.newBuilder().build().newWebSocketBuilder().buildAsync(URI.create("ws://127.0.0.1:8080/web_socket/1"), new WebSocket.Listener() {
//            @Override
//            public CompletionStage<?> onText(WebSocket webSocket, CharSequence data, boolean last) {
//                System.err.println(data);
//                webSocket.request(1);
//                return null;
//            }
//        });
//
//        WebSocket socket = webSocketCompletableFuture.get();
//        socket.sendText("123", true);
//
//        TimeUnit.HOURS.sleep(1);
////
////        HttpClient httpClient = HttpClient.newHttpClient();
////        HttpRequest request = HttpRequest.newBuilder().uri(URI.create("ws://127.0.0.1:8080/web_socket/1")).build();
////        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
//
////        System.err.println();
////
////        SocketChannel socketChannel = SocketChannel.open();
////        socketChannel.configureBlocking(false);
////        InetSocketAddress inetSocketAddress = new InetSocketAddress("127.0.0.1", 8080);
////
////        boolean connect = socketChannel.connect(inetSocketAddress);
////        System.err.println(connect);
////
////        WebSocketClient client = new WebSocketClient(URI.create("ws://127.0.0.1:8080/web_socket/1")) {
////            @Override
////            public void onOpen(ServerHandshake serverHandshake) {
////
////            }
////
////            @Override
////            public void onMessage(String s) {
////
////            }
////
////            @Override
////            public void onClose(int i, String s, boolean b) {
////
////            }
////
////            @Override
////            public void onError(Exception e) {
////
////            }
////        };
////        boolean b = client.connectBlocking();
////
////        client.send("1111111111111");
////        System.err.println(client);
//
//    }
//
//
//}
