package com.sandok.tunnel.thread;

import com.sandok.tunnel.service.OpenVPNService;
import com.sandok.tunnel.utils.VPNUtil;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class ProxyThread extends Thread {
    public static int status;
    boolean LoopingThread = true;
    boolean autoReplace;
    String buffReq;
    String buffRes;
    boolean clientToServer;
    Socket incoming;
    Socket outgoing;

    public ProxyThread(Socket socket, Socket socket2, boolean z, String str, String str2, boolean z2) {
        this.incoming = socket;
        this.outgoing = socket2;
        this.clientToServer = z;
        this.buffReq = str;
        this.buffRes = str2;
        this.autoReplace = z2;
    }

    private void Log(String str) {
        if (VPNUtil.getService() != null) {
            OpenVPNService.log_message(str);
        }
    }

    public static void connect(Socket socket, Socket socket2, String str, String str2, boolean z) {
        new ProxyThread(socket, socket2, true, str, str2, z).start();
        new ProxyThread(socket2, socket, false, str, str2, z).start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        byte[] bArr = this.clientToServer ? new byte[Integer.parseInt(this.buffReq)] : new byte[Integer.parseInt(this.buffRes)];
        try {
            InputStream inputStream = this.incoming.getInputStream();
            OutputStream outputStream = this.outgoing.getOutputStream();
            while (true) {
                int i = inputStream.read(bArr);
                if (i == -1) {
                    return;
                }
                try {
                    try {
                        String str = new String(bArr, 0, i);
                        if (this.clientToServer) {
                            outputStream.write(bArr, 0, i);
                            outputStream.flush();
                        } else {
                            String[] strArrSplit = str.split("\r\n");
                            if (strArrSplit[0].startsWith("HTTP/")) {
                                String str2 = strArrSplit[0];
                                int i2 = Integer.parseInt(str2.substring(9, 12));
                                String strSubstring = str2.substring(13);
                                Log("<b>Status: " + String.valueOf(i2) + " (" + strSubstring + ")</b>");
                                if (i2 == 200) {
                                    Log("Successful - The action requested by the client was successful.");
                                    outputStream.write(bArr, 0, i);
                                    outputStream.flush();
                                } else {
                                    outputStream.write("HTTP/1.0 200 Connection Established\r\n\r\n".getBytes());
                                    outputStream.flush();
                                }
                            } else {
                                outputStream.write(bArr, 0, i);
                                outputStream.flush();
                            }
                        }
                    } catch (IOException unused) {
                    }
                } catch (Exception unused2) {
                    Socket socket = this.incoming;
                    if (socket != null) {
                        socket.close();
                    }
                    Socket socket2 = this.outgoing;
                    if (socket2 != null) {
                        socket2.close();
                        return;
                    }
                    return;
                } catch (Throwable unused3) {
                    Socket socket3 = this.incoming;
                    if (socket3 != null) {
                        socket3.close();
                    }
                    Socket socket4 = this.outgoing;
                    if (socket4 != null) {
                        socket4.close();
                    }
                }
            }
        } catch (IOException | Exception unused4) {
        }
    }
}
