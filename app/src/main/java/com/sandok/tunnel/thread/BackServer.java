package com.sandok.tunnel.thread;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class BackServer extends Thread {
    private Socket client;
    private boolean isAlive = true;
    private ServerSocket ss;

    public void Stop() throws Exception {
        ServerSocket serverSocket = this.ss;
        if (serverSocket != null) {
            serverSocket.close();
        }
        Socket socket = this.client;
        if (socket != null) {
            socket.close();
        }
        this.isAlive = false;
        interrupt();
    }

    public SocketAddress getLocalSocketAddr() {
        return this.ss.getLocalSocketAddress();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        try {
            ServerSocket serverSocket = new ServerSocket();
            this.ss = serverSocket;
            serverSocket.setReuseAddress(true);
            this.ss.bind(new InetSocketAddress(0));
            log("[Back Server]", "Started on port " + this.ss.getLocalPort());
            while (this.isAlive) {
                try {
                    try {
                        this.client = this.ss.accept();
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.client.getInputStream()));
                        while (bufferedReader.readLine() != null) {
                            OutputStream outputStream = this.client.getOutputStream();
                            outputStream.write("HTTP/1.1 200 CONNECTED\r\n\r\n".getBytes());
                            outputStream.flush();
                            if (!this.client.isClosed()) {
                                this.client.close();
                            }
                        }
                    } catch (Exception unused) {
                    }
                } catch (Exception unused2) {
                    OutputStream outputStream2 = this.client.getOutputStream();
                    outputStream2.write("HTTP/1.1 200 CONNECTED\r\n\r\n".getBytes());
                    outputStream2.flush();
                    if (!this.client.isClosed()) {
                        this.client.close();
                    }
                }
            }
        } catch (Exception e) {
            log("[Back Server]", e.getMessage());
        }
        super.run();
    }

    private void log(String str, String str2) {
    }
}
