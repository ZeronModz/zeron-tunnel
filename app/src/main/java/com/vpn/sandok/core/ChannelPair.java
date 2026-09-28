package com.vpn.sandok.core;

import com.vpn.sandok.core.Channel;
import java.util.Objects;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class ChannelPair implements ChannelListener {
    private static final String CONNECT_OK = "HTTP/1.0 200 Connection Established\r\nProxy-agent: KissProxy\r\n\r\n";
    private static final String CRLF = "\r\n";
    public static final String TAG = "ChannelPair";
    private Channel requestChannel;
    private Channel responseChannel;

    private void connRequest(SelectionKey selectionKey) {
        if (selectionKey != null) {
            try {
                if (selectionKey.isAcceptable()) {
                    SocketChannel socketChannelAccept = ((ServerSocketChannel) selectionKey.channel()).accept();
                    Objects.toString(socketChannelAccept.socket().getInetAddress());
                    Channel channel = new Channel(true);
                    this.requestChannel = channel;
                    channel.setListener(this);
                    this.requestChannel.setSocket(socketChannelAccept);
                    socketChannelAccept.configureBlocking(false);
                    this.requestChannel.setSelectionKey(socketChannelAccept.register(ProxyServer.getInstance().getSeletor(), 1, this));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private boolean connResponse(Channel channel) {
        try {
            String method = channel.getMethod();
            Channel channel2 = this.responseChannel;
            if (channel2 == null) {
                SocketChannel socketChannelConnect = "CONNECT".equals(method) ? connect(channel.getHost(), channel.getPort()) : connect(channel.getHost(), channel.getPort());
                if (socketChannelConnect == null) {
                    return false;
                }
                Channel channel3 = new Channel(false);
                this.responseChannel = channel3;
                channel3.setListener(this);
                this.responseChannel.setSocket(socketChannelConnect);
                this.responseChannel.setSelectionKey(socketChannelConnect.register(ProxyServer.getInstance().getSeletor(), 1, this));
            } else {
                channel2.getName();
                this.responseChannel.reset();
            }
            StringBuffer stringBuffer = new StringBuffer();
            if ("CONNECT".equals(method)) {
                stringBuffer.append(CONNECT_OK);
                this.responseChannel.setStatus(Channel.Status.CONTENT);
                this.requestChannel.write(ByteBuffer.wrap(stringBuffer.toString().getBytes()));
            } else {
                stringBuffer.append(method + " ");
                String url = channel.getUrl();
                if (!url.startsWith("/")) {
                    url = url.substring(url.indexOf(47, 8));
                }
                stringBuffer.append(url);
                stringBuffer.append(" ");
                stringBuffer.append(channel.getProtocol());
                stringBuffer.append(CRLF);
                Map<String, String> headers = channel.getHeaders();
                for (String str : headers.keySet()) {
                    stringBuffer.append(str);
                    stringBuffer.append(": ");
                    stringBuffer.append(headers.get(str));
                    stringBuffer.append(CRLF);
                }
                stringBuffer.append(CRLF);
                this.responseChannel.write(ByteBuffer.wrap(stringBuffer.toString().getBytes()));
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private SocketChannel connect(String str, int i) {
        try {
            SocketChannel socketChannelOpen = SocketChannel.open();
            socketChannelOpen.configureBlocking(false);
            if (socketChannelOpen.connect(new InetSocketAddress(InetAddress.getByName(str), i))) {
                return null;
            }
            for (int i2 = 0; i2 < 200; i2++) {
                Thread.sleep(50L);
                if (socketChannelOpen.finishConnect()) {
                    return socketChannelOpen;
                }
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public void close() {
        toString();
        Channel channel = this.requestChannel;
        if (channel != null) {
            channel.close();
        }
        Channel channel2 = this.responseChannel;
        if (channel2 != null) {
            channel2.close();
        }
    }

    public void handleKey(SelectionKey selectionKey) {
        if (selectionKey == null) {
            return;
        }
        if (!selectionKey.isValid()) {
            close();
            return;
        }
        if (selectionKey.isAcceptable()) {
            connRequest(selectionKey);
            return;
        }
        Channel channel = this.requestChannel;
        if (channel != null && selectionKey.equals(channel.getSelectionKey())) {
            this.requestChannel.read();
            return;
        }
        Channel channel2 = this.responseChannel;
        if (channel2 == null || !selectionKey.equals(channel2.getSelectionKey())) {
            return;
        }
        this.responseChannel.read();
        this.requestChannel.reset();
    }

    @Override // com.vpn.sandok.core.ChannelListener
    public void onClose(Channel channel) {
        Objects.toString(channel);
        close();
    }

    @Override // com.vpn.sandok.core.ChannelListener
    public void onContent(Channel channel) {
        if (channel.isRequest() && this.responseChannel != null) {
            this.responseChannel.write(channel.getSocketBuffer());
        } else {
            if (channel.isRequest() || this.requestChannel == null) {
                return;
            }
            this.requestChannel.write(channel.getSocketBuffer());
        }
    }

    @Override // com.vpn.sandok.core.ChannelListener
    public void onHeaders(Channel channel) {
        if (channel.isRequest()) {
            if (connResponse(channel)) {
                return;
            }
            close();
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(channel.getStatusLine());
        stringBuffer.append(CRLF);
        for (Map.Entry<String, String> entry : channel.getHeaders().entrySet()) {
            stringBuffer.append(entry.getKey());
            stringBuffer.append(": ");
            stringBuffer.append(entry.getValue());
            stringBuffer.append(CRLF);
        }
        stringBuffer.append(CRLF);
        this.requestChannel.write(ByteBuffer.wrap(stringBuffer.toString().getBytes()));
    }

    @Override // com.vpn.sandok.core.ChannelListener
    public void onStatusLine(Channel channel) {
        channel.getStatusLine();
    }
}
