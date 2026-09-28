package net.sourceforge.jsocks.server;

import defpackage.rz0;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PushbackInputStream;
import java.net.DatagramPacket;
import java.net.Socket;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class ServerAuthenticatorNone implements ServerAuthenticator {
    public final InputStream a;
    public final OutputStream b;

    public ServerAuthenticatorNone() {
        this.a = null;
        this.b = null;
    }

    @Override // net.sourceforge.jsocks.server.ServerAuthenticator
    public final boolean checkRequest(DatagramPacket datagramPacket, boolean z) {
        return true;
    }

    @Override // net.sourceforge.jsocks.server.ServerAuthenticator
    public final InputStream getInputStream() {
        return this.a;
    }

    @Override // net.sourceforge.jsocks.server.ServerAuthenticator
    public final OutputStream getOutputStream() {
        return this.b;
    }

    @Override // net.sourceforge.jsocks.server.ServerAuthenticator
    public final ServerAuthenticator startSession(Socket socket) throws IOException {
        PushbackInputStream pushbackInputStream = new PushbackInputStream(socket.getInputStream());
        OutputStream outputStream = socket.getOutputStream();
        if (pushbackInputStream.read() != 5) {
            return null;
        }
        int i = pushbackInputStream.read();
        boolean z = false;
        if (i > 0) {
            byte[] bArr = new byte[i];
            byte[] bArr2 = {5, -1};
            for (int i2 = 0; i2 < i; i2 += pushbackInputStream.read(bArr, i2, i - i2)) {
            }
            int i3 = 0;
            while (true) {
                if (i3 >= i) {
                    break;
                }
                if (bArr[i3] == 0) {
                    bArr2[1] = 0;
                    z = true;
                    break;
                }
                i3++;
            }
            outputStream.write(bArr2);
        }
        if (z) {
            return new ServerAuthenticatorNone(pushbackInputStream, outputStream);
        }
        return null;
    }

    @Override // net.sourceforge.jsocks.server.ServerAuthenticator
    public final boolean checkRequest(rz0 rz0Var) {
        return true;
    }

    public ServerAuthenticatorNone(InputStream inputStream, OutputStream outputStream) {
        this.a = inputStream;
        this.b = outputStream;
    }

    @Override // net.sourceforge.jsocks.server.ServerAuthenticator
    public final void endSession() {
    }
}
