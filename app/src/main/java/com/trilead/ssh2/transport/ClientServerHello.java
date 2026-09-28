package com.trilead.ssh2.transport;

import defpackage.p60;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class ClientServerHello {
    String client_line = "SSH-2.0-TrileadSSH2Java_213";
    String server_line;
    String server_versioncomment;

    public ClientServerHello(InputStream inputStream, OutputStream outputStream) throws IOException {
        outputStream.write((this.client_line + "\r\n").getBytes("ISO-8859-1"));
        outputStream.flush();
        byte[] bArr = new byte[512];
        for (int i = 0; i < 50; i++) {
            String str = new String(bArr, 0, readLineRN(inputStream, bArr), "ISO-8859-1");
            this.server_line = str;
            if (str.startsWith("SSH-")) {
                break;
            }
        }
        if (!this.server_line.startsWith("SSH-")) {
            p60.f("Malformed server identification string. There was no line starting with 'SSH-' amongst the first 50 lines.");
            throw null;
        }
        boolean zStartsWith = this.server_line.startsWith("SSH-1.99-");
        String str2 = this.server_line;
        if (zStartsWith) {
            this.server_versioncomment = str2.substring(9);
        } else {
            if (!str2.startsWith("SSH-2.0-")) {
                p60.f("Server uses incompatible protocol, it is not SSH-2 compatible.");
                throw null;
            }
            this.server_versioncomment = this.server_line.substring(8);
        }
    }

    public static final int readLineRN(InputStream inputStream, byte[] bArr) throws IOException {
        int i = 0;
        boolean z = false;
        int i2 = 0;
        while (true) {
            int i3 = inputStream.read();
            if (i3 == -1) {
                p60.f("Premature connection close");
                return 0;
            }
            int i4 = i + 1;
            bArr[i] = (byte) i3;
            if (i3 == 13) {
                i = i4;
                z = true;
            } else {
                if (i3 == 10) {
                    return i2;
                }
                if (z) {
                    p60.f("Malformed line sent by the server, the line does not end correctly.");
                    return 0;
                }
                i2++;
                if (i4 >= bArr.length) {
                    p60.f("The server sent a too long line: ".concat(new String(bArr, "ISO-8859-1")));
                    return 0;
                }
                i = i4;
            }
        }
    }

    public byte[] getClientString() {
        try {
            return this.client_line.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException unused) {
            return this.client_line.getBytes();
        }
    }

    public byte[] getServerString() {
        try {
            return this.server_line.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException unused) {
            return this.server_line.getBytes();
        }
    }
}
