package com.v2ray.ang.util;

import android.os.Build;
import com.google.android.gms.ads.RequestConfiguration;
import com.trilead.ssh2.sftp.AttribFlags;
import defpackage.tn;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class ClientSocketHandler extends Thread {
    public static final Pattern c = Pattern.compile("CONNECT (.+):(.+) HTTP/(1\\.[01])", 2);
    public final Socket a;
    public boolean b = false;

    public ClientSocketHandler(Socket socket) {
        this.a = socket;
    }

    public static void c(Socket socket, Socket socket2) {
        int i;
        try {
            InputStream inputStream = socket.getInputStream();
            try {
                OutputStream outputStream = socket2.getOutputStream();
                try {
                    byte[] bArr = new byte[AttribFlags.SSH_FILEXFER_ATTR_MIME_TYPE];
                    do {
                        i = inputStream.read(bArr);
                        if (i > 0) {
                            outputStream.write(bArr, 0, i);
                            if (inputStream.available() < 1) {
                                outputStream.flush();
                            }
                        }
                    } while (i >= 0);
                } finally {
                    if (!socket2.isOutputShutdown()) {
                        socket2.shutdownOutput();
                    }
                }
            } finally {
                if (!socket.isInputShutdown()) {
                    socket.shutdownInput();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public final void a(String str) {
        Socket socket = this.a;
        try {
            InputStream inputStream = socket.getInputStream();
            OutputStream outputStream = socket.getOutputStream();
            System.out.println(str);
            try {
                String str2 = str.split(" ")[1];
                System.out.println(str2);
                if (!str2.matches("(http://)?.+\\.\\w+(/.+)*/?")) {
                    inputStream.close();
                    outputStream.close();
                    socket.close();
                    return;
                }
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(socket.getOutputStream(), StandardCharsets.ISO_8859_1);
                String str3 = str2.matches("http://.+\\.\\w+(/.+)*/?") ? str2.split("/")[2] : str2.split("/")[0];
                try {
                    Socket socket2 = new Socket(str3, 80);
                    System.out.println(socket2);
                    try {
                        tn tnVar = new tn(this, socket2, 0);
                        tnVar.start();
                        System.out.println(str2.replaceAll("http://.+\\.\\w+/", "/"));
                        socket2.getOutputStream().write(("GET " + str2.replaceAll("http://.+\\.\\w+/", "/") + " HTTP/1.1\r\n").getBytes());
                        try {
                            if (this.b) {
                                int i = socket.getInputStream().read();
                                if (i != -1) {
                                    if (i != 10) {
                                        socket2.getOutputStream().write(i);
                                    }
                                    c(socket, socket2);
                                } else {
                                    if (!socket2.isOutputShutdown()) {
                                        socket2.shutdownOutput();
                                    }
                                    if (!socket.isInputShutdown()) {
                                        socket.shutdownInput();
                                    }
                                }
                            } else {
                                c(socket, socket2);
                            }
                            try {
                                tnVar.join();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        } finally {
                        }
                    } finally {
                        socket2.close();
                    }
                } catch (IOException e2) {
                    e = e2;
                    e.printStackTrace();
                    outputStreamWriter.write("HTTP/" + str3 + " 502 Bad Gateway\r\n");
                    outputStreamWriter.write("Proxy-agent: Simple/0.1\r\n");
                    outputStreamWriter.write("\r\n");
                    outputStreamWriter.flush();
                } catch (NumberFormatException e3) {
                    e = e3;
                    e.printStackTrace();
                    outputStreamWriter.write("HTTP/" + str3 + " 502 Bad Gateway\r\n");
                    outputStreamWriter.write("Proxy-agent: Simple/0.1\r\n");
                    outputStreamWriter.write("\r\n");
                    outputStreamWriter.flush();
                }
            } catch (ArrayIndexOutOfBoundsException e4) {
                e4.printStackTrace();
                socket.close();
            }
        } catch (IOException e5) {
            e5.printStackTrace();
        }
    }

    public final void b(String str) throws IOException {
        Socket socket;
        Matcher matcher = c.matcher(str);
        if (matcher.matches()) {
            do {
                socket = this.a;
            } while (!RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED.equals(d(socket)));
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(socket.getOutputStream(), StandardCharsets.ISO_8859_1);
            try {
                Socket socket2 = new Socket(matcher.group(1), Integer.parseInt(matcher.group(2)));
                System.out.println(socket2);
                try {
                    outputStreamWriter.write("HTTP/" + matcher.group(3) + " 200 Connection established\r\n");
                    outputStreamWriter.write("\r\n");
                    outputStreamWriter.flush();
                    tn tnVar = new tn(this, socket2, 1);
                    tnVar.start();
                    try {
                        if (this.b) {
                            int i = socket.getInputStream().read();
                            if (i != -1) {
                                if (i != 10) {
                                    socket2.getOutputStream().write(i);
                                }
                                c(socket, socket2);
                            } else {
                                if (!socket2.isOutputShutdown()) {
                                    socket2.shutdownOutput();
                                }
                                if (!socket.isInputShutdown()) {
                                    socket.shutdownInput();
                                }
                            }
                        } else {
                            c(socket, socket2);
                        }
                        try {
                            tnVar.join();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } finally {
                    }
                } finally {
                    socket2.close();
                }
            } catch (IOException | NumberFormatException e2) {
                e2.printStackTrace();
                outputStreamWriter.write("HTTP/" + matcher.group(3) + " 502 Bad Gateway\r\n");
                outputStreamWriter.write("Proxy-agent: Simple/0.1\r\n");
                outputStreamWriter.write("\r\n");
                outputStreamWriter.flush();
            }
        }
    }

    public final String d(Socket socket) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int i = socket.getInputStream().read();
            if (i == -1) {
                break;
            }
            if (!this.b || i != 10) {
                this.b = false;
                if (i != 10) {
                    if (i == 13) {
                        this.b = true;
                        break;
                    }
                    byteArrayOutputStream.write(i);
                } else {
                    break;
                }
            } else {
                this.b = false;
            }
        }
        if (Build.VERSION.SDK_INT >= 33) {
            return byteArrayOutputStream.toString(StandardCharsets.ISO_8859_1);
        }
        return null;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Socket socket = this.a;
        try {
            try {
                try {
                    String strD = d(socket);
                    System.out.println(strD);
                    if (strD.startsWith("CONNECT ")) {
                        b(strD);
                    } else {
                        a(strD);
                    }
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                    socket.close();
                }
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        } catch (Throwable th) {
            try {
                socket.close();
            } catch (IOException e3) {
                e3.printStackTrace();
            }
            throw th;
        }
    }
}
