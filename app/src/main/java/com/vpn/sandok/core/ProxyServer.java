package com.vpn.sandok.core;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class ProxyServer {
    private static final int DEFAULT_PORT = 8080;
    private static final int MAX_PORT = 50146;
    public static final String TAG = "ProxyServer";
    private static volatile ProxyServer instance;
    private int port = DEFAULT_PORT;
    private boolean running = false;
    private Selector selector;
    private ServerSocketChannel server;

    private ProxyServer() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doProxy() {
        Selector selector;
        while (this.server != null && (selector = this.selector) != null) {
            try {
                selector.select();
            } catch (Exception unused) {
            }
            if (!this.selector.isOpen()) {
                return;
            }
            for (SelectionKey selectionKey : this.selector.selectedKeys()) {
                Object objAttachment = selectionKey.attachment();
                try {
                    (objAttachment instanceof ChannelPair ? (ChannelPair) objAttachment : new ChannelPair()).handleKey(selectionKey);
                } catch (Exception unused2) {
                }
            }
        }
    }

    public static ProxyServer getInstance() {
        synchronized (ProxyServer.class) {
            try {
                if (instance == null) {
                    instance = new ProxyServer();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return instance;
    }

    public int getPort() {
        return this.port;
    }

    public Selector getSeletor() {
        return this.selector;
    }

    public boolean isRunning() {
        return this.running;
    }

    public synchronized boolean start() {
        if (this.running) {
            return false;
        }
        try {
            this.selector = Selector.open();
            try {
                ServerSocketChannel serverSocketChannelOpen = ServerSocketChannel.open();
                this.server = serverSocketChannelOpen;
                serverSocketChannelOpen.configureBlocking(false);
                while (this.port < MAX_PORT) {
                    try {
                        this.server.socket().bind(new InetSocketAddress(this.port));
                        break;
                    } catch (IOException unused) {
                        this.port++;
                    }
                }
                if (this.port >= MAX_PORT) {
                    return false;
                }
                try {
                    this.server.register(this.selector, 16);
                    this.running = true;
                    Thread thread = new Thread(new Runnable() { // from class: com.vpn.sandok.core.ProxyServer.1
                        @Override // java.lang.Runnable
                        public void run() {
                            ProxyServer.this.doProxy();
                            ProxyServer.this.running = false;
                        }
                    });
                    thread.setDaemon(false);
                    thread.setName(TAG);
                    thread.start();
                    return true;
                } catch (ClosedChannelException unused2) {
                    return false;
                }
            } catch (Exception unused3) {
                return false;
            }
        } catch (Exception unused4) {
            return false;
        }
    }

    public synchronized boolean stop() {
        if (!this.running) {
            return false;
        }
        this.running = false;
        try {
            this.selector.wakeup();
            this.selector.close();
            this.selector = null;
        } catch (Exception unused) {
        }
        try {
            this.server.close();
            this.server = null;
        } catch (IOException unused2) {
        }
        return true;
    }
}
