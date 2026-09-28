package net.sourceforge.jsocks.server;

import defpackage.rz0;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.DatagramPacket;
import java.net.Socket;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public interface ServerAuthenticator {
    boolean checkRequest(DatagramPacket datagramPacket, boolean z);

    boolean checkRequest(rz0 rz0Var);

    void endSession();

    InputStream getInputStream();

    OutputStream getOutputStream();

    ServerAuthenticator startSession(Socket socket) throws IOException;
}
