package com.vpn.sandok.core;

import android.text.TextUtils;
import defpackage.hz;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class Channel {
    private static final int BUFFER_SIZE = 8192;
    public static final String TAG = "Channel";
    private String channelName;
    private int contentLen;
    private String host;
    private long lastActive;
    private ChannelListener listener;
    private String method;
    private int port;
    private int readOffset;
    private boolean request;
    private SelectionKey selectionKey;
    private RequestLine sl;
    private SocketChannel socket;
    private ByteBuffer socketBuffer;
    private Status status;
    private int statusCode;
    private String statusLine;
    private String url;
    private static Pattern HTTPS_PATTERN = Pattern.compile("(.*):([\\d]+)");
    private static Pattern HTTP_PATTERN = Pattern.compile("(https?)://([^:/]+)(:[\\d]+])?/.*");
    private static int INDEX = 0;
    static int index = 0;
    private char[] readBuf = new char[1024];
    private Map<String, String> headers = new HashMap();

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public enum Status {
        STATUS_LINE,
        HEADERS,
        CONTENT
    }

    public Channel(boolean z) {
        this.request = z;
        StringBuilder sb = new StringBuilder("channel");
        int i = INDEX;
        INDEX = i + 1;
        sb.append(i);
        this.channelName = sb.toString();
        this.readOffset = 0;
        reset();
    }

    private void addHeader(String str) {
        int iIndexOf;
        if (!TextUtils.isEmpty(str) && (iIndexOf = str.indexOf(":")) > 0 && iIndexOf < str.length()) {
            String strSubstring = str.substring(0, iIndexOf);
            String strTrim = str.substring(iIndexOf + 1).trim();
            if (TextUtils.isEmpty(strSubstring) || TextUtils.isEmpty(strTrim)) {
                return;
            }
            this.headers.put(strSubstring, strTrim);
        }
    }

    private String readLine() {
        byte b;
        if (this.socketBuffer.remaining() <= 0) {
            return null;
        }
        while (this.socketBuffer.remaining() > 0 && (b = this.socketBuffer.get()) != -1 && b != 10) {
            if (b != 13) {
                int i = this.readOffset;
                char[] cArr = this.readBuf;
                if (i == cArr.length) {
                    char[] cArr2 = new char[cArr.length * 2];
                    this.readBuf = cArr2;
                    System.arraycopy(cArr, 0, cArr2, 0, i);
                }
                char[] cArr3 = this.readBuf;
                int i2 = this.readOffset;
                this.readOffset = i2 + 1;
                cArr3[i2] = (char) b;
            }
        }
        String strCopyValueOf = String.copyValueOf(this.readBuf, 0, this.readOffset);
        this.readOffset = 0;
        return strCopyValueOf;
    }

    private void setStatusLine(String str) {
        this.statusLine = str;
        if (!this.request) {
            this.statusCode = new ResponseLine(str).getStatusCode();
            return;
        }
        RequestLine requestLine = new RequestLine(str);
        this.sl = requestLine;
        this.method = requestLine.getMethod();
    }

    public void close() {
        try {
            index++;
            this.selectionKey.cancel();
            this.socket.close();
        } catch (Exception unused) {
        }
    }

    public int getContentLen() {
        return this.contentLen;
    }

    public String getHeader(String str) {
        if (this.headers == null || TextUtils.isEmpty(str)) {
            return null;
        }
        return this.headers.get(str);
    }

    public Map<String, String> getHeaders() {
        return this.headers;
    }

    public String getHost() {
        if (!this.request) {
            return null;
        }
        String url = getUrl();
        if ("CONNECT".equals(this.method)) {
            Matcher matcher = HTTPS_PATTERN.matcher(url);
            if (matcher.matches()) {
                this.host = matcher.group(1);
                this.port = Integer.parseInt(matcher.group(2));
            }
        } else {
            Matcher matcher2 = HTTP_PATTERN.matcher(url);
            if (matcher2.matches()) {
                this.host = matcher2.group(2);
                if (matcher2.group(3) != null) {
                    Integer.parseInt(matcher2.group(3).substring(1));
                } else if ("https".equals(matcher2.group(1))) {
                    this.port = 443;
                } else {
                    this.port = 80;
                }
            }
        }
        return this.host;
    }

    public long getLastActive() {
        return this.lastActive;
    }

    public ChannelListener getListener() {
        return this.listener;
    }

    public String getMethod() {
        return this.method;
    }

    public String getName() {
        return this.channelName;
    }

    public int getPort() {
        if (this.port == 0) {
            getHost();
        }
        return this.port;
    }

    public String getProtocol() {
        RequestLine requestLine = this.sl;
        if (requestLine == null) {
            return null;
        }
        return requestLine.getVersion();
    }

    public boolean getRequest() {
        return this.request;
    }

    public SelectionKey getSelectionKey() {
        return this.selectionKey;
    }

    public SocketChannel getSocket() {
        return this.socket;
    }

    public ByteBuffer getSocketBuffer() {
        ByteBuffer byteBuffer = this.socketBuffer;
        if (byteBuffer != null) {
            return byteBuffer;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8192);
        this.socketBuffer = byteBufferAllocate;
        return byteBufferAllocate;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public String getStatusLine() {
        return this.statusLine;
    }

    public Status getStep() {
        return this.status;
    }

    public String getUrl() {
        String uri = this.sl.getUri();
        if (uri != null && !uri.startsWith("/")) {
            this.url = uri;
            return uri;
        }
        String strT = hz.t(getHeaders().get("Host"), uri);
        this.url = strT;
        return strT;
    }

    public boolean isRequest() {
        return this.request;
    }

    public void read() {
        int i;
        ChannelListener channelListener;
        getSocketBuffer();
        this.socketBuffer.clear();
        try {
            i = this.socket.read(this.socketBuffer);
        } catch (IOException unused) {
            i = 0;
        }
        this.socketBuffer.flip();
        int iLimit = this.socketBuffer.limit() - this.socketBuffer.position();
        if (i == -1) {
            ChannelListener channelListener2 = this.listener;
            if (channelListener2 != null) {
                channelListener2.onClose(this);
                return;
            }
            return;
        }
        if (iLimit == 0) {
            return;
        }
        if (this.status == Status.CONTENT) {
            ChannelListener channelListener3 = this.listener;
            if (channelListener3 != null) {
                channelListener3.onContent(this);
                return;
            }
            return;
        }
        String line = readLine();
        while (true) {
            if (line == null) {
                break;
            }
            Status status = this.status;
            if (status == Status.STATUS_LINE) {
                setStatusLine(line);
                this.status = Status.HEADERS;
                ChannelListener channelListener4 = this.listener;
                if (channelListener4 != null) {
                    channelListener4.onStatusLine(this);
                }
            } else if (status != Status.HEADERS) {
                continue;
            } else if (TextUtils.isEmpty(line)) {
                this.status = Status.CONTENT;
                ChannelListener channelListener5 = this.listener;
                if (channelListener5 != null) {
                    channelListener5.onHeaders(this);
                }
            } else {
                addHeader(line);
            }
            line = readLine();
        }
        if (this.status != Status.CONTENT || (channelListener = this.listener) == null) {
            return;
        }
        channelListener.onContent(this);
    }

    public void reset() {
        this.lastActive = System.currentTimeMillis();
        if ("CONNECT".equals(this.method)) {
            this.status = Status.CONTENT;
        } else {
            this.status = Status.STATUS_LINE;
        }
        this.headers.clear();
    }

    public void setContentLen(int i) {
        this.contentLen = i;
    }

    public void setLastActive(long j) {
        this.lastActive = j;
    }

    public void setListener(ChannelListener channelListener) {
        this.listener = channelListener;
    }

    public void setPort(int i) {
        this.port = i;
    }

    public void setSelectionKey(SelectionKey selectionKey) {
        this.selectionKey = selectionKey;
    }

    public void setSocket(SocketChannel socketChannel) {
        this.socket = socketChannel;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public int write(ByteBuffer byteBuffer) {
        try {
            return this.socket.write(byteBuffer);
        } catch (IOException unused) {
            return 0;
        }
    }
}
