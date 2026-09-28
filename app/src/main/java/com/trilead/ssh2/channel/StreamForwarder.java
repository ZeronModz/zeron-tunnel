package com.trilead.ssh2.channel;

import com.trilead.ssh2.sftp.AttribFlags;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class StreamForwarder extends Thread {
    byte[] buffer = new byte[AttribFlags.SSH_FILEXFER_ATTR_LINK_COUNT];
    Channel c;
    InputStream is;
    String mode;
    OutputStream os;
    Socket s;
    StreamForwarder sibling;

    public StreamForwarder(Channel channel, StreamForwarder streamForwarder, Socket socket, InputStream inputStream, OutputStream outputStream, String str) throws IOException {
        this.is = inputStream;
        this.os = outputStream;
        this.mode = str;
        this.c = channel;
        this.sibling = streamForwarder;
        this.s = socket;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Socket socket;
        StreamForwarder streamForwarder;
        boolean zIsAlive;
        OutputStream outputStream;
        while (true) {
            try {
                try {
                    try {
                        int i = this.is.read(this.buffer);
                        outputStream = this.os;
                        if (i <= 0) {
                            try {
                                break;
                            } catch (IOException unused) {
                            }
                        } else {
                            outputStream.write(this.buffer, 0, i);
                            this.os.flush();
                        }
                    } catch (IOException unused2) {
                        return;
                    }
                } finally {
                    if (streamForwarder != null) {
                        while (true) {
                            if (!zIsAlive) {
                                try {
                                    break;
                                } catch (IOException unused3) {
                                }
                            }
                        }
                    }
                }
            } catch (IOException e) {
                try {
                    Channel channel = this.c;
                    channel.cm.closeChannel(channel, "Closed due to exception in StreamForwarder (" + this.mode + "): " + e.getMessage(), true);
                } catch (IOException unused4) {
                }
                try {
                    this.os.close();
                } catch (IOException unused5) {
                }
                try {
                    this.is.close();
                } catch (IOException unused6) {
                }
                if (this.sibling == null) {
                    return;
                }
                while (this.sibling.isAlive()) {
                    try {
                        this.sibling.join();
                    } catch (InterruptedException unused7) {
                    }
                }
                try {
                    Channel channel2 = this.c;
                    channel2.cm.closeChannel(channel2, "StreamForwarder (" + this.mode + ") is cleaning up the connection", true);
                } catch (IOException unused8) {
                }
                socket = this.s;
                if (socket == null) {
                    return;
                }
            }
        }
        outputStream.close();
        try {
            this.is.close();
        } catch (IOException unused9) {
        }
        if (this.sibling != null) {
            while (this.sibling.isAlive()) {
                try {
                    this.sibling.join();
                } catch (InterruptedException unused10) {
                }
            }
            try {
                Channel channel3 = this.c;
                channel3.cm.closeChannel(channel3, "StreamForwarder (" + this.mode + ") is cleaning up the connection", true);
            } catch (IOException unused11) {
            }
            socket = this.s;
            if (socket == null) {
                return;
            }
            socket.close();
        }
    }
}
