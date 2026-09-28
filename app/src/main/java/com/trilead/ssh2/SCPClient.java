package com.trilead.ssh2;

import com.trilead.ssh2.sftp.AttribFlags;
import defpackage.hz;
import defpackage.p60;
import defpackage.u7;
import defpackage.vh;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class SCPClient {
    Connection conn;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public class LenNamePair {
        String filename;
        long length;

        public LenNamePair() {
        }
    }

    public SCPClient(Connection connection) {
        if (connection != null) {
            this.conn = connection;
        } else {
            u7.r("Cannot accept null argument!");
            throw null;
        }
    }

    private void get(String[] strArr, OutputStream[] outputStreamArr) throws IOException {
        if (strArr == null || outputStreamArr == null) {
            u7.r("Null argument.");
            return;
        }
        if (strArr.length != outputStreamArr.length) {
            u7.r("Length of arguments does not match.");
            return;
        }
        if (strArr.length == 0) {
            return;
        }
        String strM = "scp -f";
        for (String str : strArr) {
            if (str == null) {
                u7.r("Cannot accept null filename.");
                return;
            }
            String strTrim = str.trim();
            if (strTrim.length() == 0) {
                u7.r("Cannot accept empty filename.");
                return;
            }
            strM = vh.m(strM, " ", strTrim);
        }
        Session sessionOpenSession = null;
        try {
            try {
                sessionOpenSession = this.conn.openSession();
                sessionOpenSession.execCommand(strM);
                receiveFiles(sessionOpenSession, outputStreamArr);
                sessionOpenSession.close();
            } catch (IOException e) {
                throw ((IOException) new IOException("Error during SCP transfer.").initCause(e));
            }
        } catch (Throwable th) {
            if (sessionOpenSession != null) {
                sessionOpenSession.close();
            }
            throw th;
        }
    }

    private LenNamePair parseCLine(String str) throws IOException {
        if (str.length() < 8) {
            p60.f("Malformed C line sent by remote SCP binary, line too short.");
            return null;
        }
        if (str.charAt(4) != ' ' || str.charAt(5) == ' ') {
            p60.f("Malformed C line sent by remote SCP binary.");
            return null;
        }
        int iIndexOf = str.indexOf(32, 5);
        if (iIndexOf == -1) {
            p60.f("Malformed C line sent by remote SCP binary.");
            return null;
        }
        String strSubstring = str.substring(5, iIndexOf);
        String strSubstring2 = str.substring(iIndexOf + 1);
        if (strSubstring.length() <= 0 || strSubstring2.length() <= 0) {
            p60.f("Malformed C line sent by remote SCP binary.");
            return null;
        }
        if (strSubstring2.length() + strSubstring.length() + 6 != str.length()) {
            p60.f("Malformed C line sent by remote SCP binary.");
            return null;
        }
        try {
            long j = Long.parseLong(strSubstring);
            if (j < 0) {
                p60.f("Malformed C line sent by remote SCP binary, illegal file length.");
                return null;
            }
            LenNamePair lenNamePair = new LenNamePair();
            lenNamePair.length = j;
            lenNamePair.filename = strSubstring2;
            return lenNamePair;
        } catch (NumberFormatException unused) {
            p60.f("Malformed C line sent by remote SCP binary, cannot parse file length.");
            return null;
        }
    }

    private void readResponse(InputStream inputStream) throws IOException {
        int i = inputStream.read();
        if (i == 0) {
            return;
        }
        if (i == 1) {
            p60.f(vh.m("Remote scp terminated with error (", receiveLine(inputStream), ")."));
        } else {
            p60.f(hz.o(i, "Remote scp terminated with error code "));
        }
    }

    private void receiveFiles(Session session, String[] strArr, String str) throws Throwable {
        int i;
        String strReceiveLine;
        byte[] bArr = new byte[AttribFlags.SSH_FILEXFER_ATTR_LINK_COUNT];
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(session.getStdin(), 512);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(session.getStdout(), 40000);
        bufferedOutputStream.write(0);
        bufferedOutputStream.flush();
        for (int i2 = 0; i2 < strArr.length; i2++) {
            do {
                i = bufferedInputStream.read();
                if (i < 0) {
                    p60.f("Remote scp terminated unexpectedly.");
                    return;
                }
                strReceiveLine = receiveLine(bufferedInputStream);
            } while (i == 84);
            if (i == 1 || i == 2) {
                p60.f(vh.l("Remote SCP error: ", strReceiveLine));
                return;
            }
            if (i != 67) {
                throw new IOException("Remote SCP error: " + ((char) i) + strReceiveLine);
            }
            LenNamePair cLine = parseCLine(strReceiveLine);
            bufferedOutputStream.write(0);
            bufferedOutputStream.flush();
            StringBuilder sbY = hz.y(str);
            sbY.append(File.separatorChar);
            sbY.append(cLine.filename);
            File file = new File(sbY.toString());
            FileOutputStream fileOutputStream = null;
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                try {
                    long j = cLine.length;
                    while (j > 0) {
                        int i3 = bufferedInputStream.read(bArr, 0, j > 8192 ? 8192 : (int) j);
                        if (i3 < 0) {
                            throw new IOException("Remote scp terminated connection unexpectedly");
                        }
                        fileOutputStream2.write(bArr, 0, i3);
                        j -= (long) i3;
                    }
                    fileOutputStream2.close();
                    readResponse(bufferedInputStream);
                    bufferedOutputStream.write(0);
                    bufferedOutputStream.flush();
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    private String receiveLine(InputStream inputStream) throws IOException {
        StringBuffer stringBuffer = new StringBuffer(30);
        while (stringBuffer.length() <= 8192) {
            int i = inputStream.read();
            if (i < 0) {
                p60.f("Remote scp terminated unexpectedly.");
                return null;
            }
            if (i == 10) {
                return stringBuffer.toString();
            }
            stringBuffer.append((char) i);
        }
        p60.f("Remote scp sent a too long line");
        return null;
    }

    private void sendBytes(Session session, byte[] bArr, String str, String str2) throws IOException {
        OutputStream stdin = session.getStdin();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(session.getStdout(), 512);
        readResponse(bufferedInputStream);
        StringBuilder sbX = vh.x("C", str2, " ");
        sbX.append(bArr.length);
        sbX.append(" ");
        sbX.append(str);
        sbX.append("\n");
        stdin.write(sbX.toString().getBytes("ISO-8859-1"));
        stdin.flush();
        readResponse(bufferedInputStream);
        stdin.write(bArr, 0, bArr.length);
        stdin.write(0);
        stdin.flush();
        readResponse(bufferedInputStream);
        stdin.write("E\n".getBytes("ISO-8859-1"));
        stdin.flush();
    }

    private void sendFiles(Session session, String[] strArr, String[] strArr2, String str) throws Throwable {
        String name;
        byte[] bArr = new byte[AttribFlags.SSH_FILEXFER_ATTR_LINK_COUNT];
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(session.getStdin(), 40000);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(session.getStdout(), 512);
        readResponse(bufferedInputStream);
        for (int i = 0; i < strArr.length; i++) {
            File file = new File(strArr[i]);
            long length = file.length();
            if (strArr2 == null || strArr2.length <= i || (name = strArr2[i]) == null) {
                name = file.getName();
            }
            bufferedOutputStream.write(("C" + str + " " + length + " " + name + "\n").getBytes("ISO-8859-1"));
            bufferedOutputStream.flush();
            readResponse(bufferedInputStream);
            FileInputStream fileInputStream = null;
            try {
                FileInputStream fileInputStream2 = new FileInputStream(file);
                while (length > 0) {
                    int i2 = length > 8192 ? AttribFlags.SSH_FILEXFER_ATTR_LINK_COUNT : (int) length;
                    try {
                        if (fileInputStream2.read(bArr, 0, i2) != i2) {
                            throw new IOException("Cannot read enough from local file " + strArr[i]);
                        }
                        bufferedOutputStream.write(bArr, 0, i2);
                        length -= (long) i2;
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream = fileInputStream2;
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        throw th;
                    }
                }
                fileInputStream2.close();
                bufferedOutputStream.write(0);
                bufferedOutputStream.flush();
                readResponse(bufferedInputStream);
            } catch (Throwable th2) {
                th = th2;
            }
        }
        bufferedOutputStream.write("E\n".getBytes("ISO-8859-1"));
        bufferedOutputStream.flush();
    }

    public void put(String[] strArr, String[] strArr2, String str, String str2) throws IOException {
        if (strArr == null || str == null || str2 == null) {
            u7.r("Null argument.");
            return;
        }
        if (str2.length() != 4) {
            u7.r("Invalid mode.");
            return;
        }
        for (int i = 0; i < str2.length(); i++) {
            if (!Character.isDigit(str2.charAt(i))) {
                u7.r("Invalid mode.");
                return;
            }
        }
        if (strArr.length == 0) {
            return;
        }
        String strTrim = str.trim();
        if (strTrim.length() <= 0) {
            strTrim = ".";
        }
        String strConcat = "scp -t -d ".concat(strTrim);
        for (String str3 : strArr) {
            if (str3 == null) {
                u7.r("Cannot accept null filename.");
                return;
            }
        }
        Session sessionOpenSession = null;
        try {
            try {
                sessionOpenSession = this.conn.openSession();
                sessionOpenSession.execCommand(strConcat);
                sendFiles(sessionOpenSession, strArr, strArr2, str2);
                sessionOpenSession.close();
            } catch (IOException e) {
                throw ((IOException) new IOException("Error during SCP transfer.").initCause(e));
            }
        } catch (Throwable th) {
            if (sessionOpenSession != null) {
                sessionOpenSession.close();
            }
            throw th;
        }
    }

    public void get(String str, OutputStream outputStream) throws IOException {
        get(new String[]{str}, new OutputStream[]{outputStream});
    }

    public void get(String str, String str2) throws IOException {
        get(new String[]{str}, str2);
    }

    public void get(String[] strArr, String str) throws IOException {
        if (strArr != null && str != null) {
            if (strArr.length == 0) {
                return;
            }
            String strM = "scp -f";
            for (String str2 : strArr) {
                if (str2 != null) {
                    String strTrim = str2.trim();
                    if (strTrim.length() != 0) {
                        strM = vh.m(strM, " ", strTrim);
                    } else {
                        u7.r("Cannot accept empty filename.");
                        return;
                    }
                } else {
                    u7.r("Cannot accept null filename.");
                    return;
                }
            }
            Session sessionOpenSession = null;
            try {
                try {
                    sessionOpenSession = this.conn.openSession();
                    sessionOpenSession.execCommand(strM);
                    receiveFiles(sessionOpenSession, strArr, str);
                    sessionOpenSession.close();
                    return;
                } catch (IOException e) {
                    throw ((IOException) new IOException("Error during SCP transfer.").initCause(e));
                }
            } catch (Throwable th) {
                if (sessionOpenSession != null) {
                    sessionOpenSession.close();
                }
                throw th;
            }
        }
        u7.r("Null argument.");
    }

    public void put(String[] strArr, String str) throws IOException {
        put(strArr, str, "0600");
    }

    public void put(String str, String str2, String str3) throws IOException {
        put(new String[]{str}, str2, str3);
    }

    public void put(String str, String str2, String str3, String str4) throws IOException {
        put(new String[]{str}, new String[]{str2}, str3, str4);
    }

    public void put(byte[] bArr, String str, String str2) throws IOException {
        put(bArr, str, str2, "0600");
    }

    public void put(byte[] bArr, String str, String str2, String str3) throws IOException {
        if (str != null && str2 != null && str3 != null) {
            if (str3.length() == 4) {
                for (int i = 0; i < str3.length(); i++) {
                    if (!Character.isDigit(str3.charAt(i))) {
                        u7.r("Invalid mode.");
                        return;
                    }
                }
                String strTrim = str2.trim();
                if (strTrim.length() <= 0) {
                    strTrim = ".";
                }
                String strConcat = "scp -t -d ".concat(strTrim);
                Session sessionOpenSession = null;
                try {
                    try {
                        sessionOpenSession = this.conn.openSession();
                        sessionOpenSession.execCommand(strConcat);
                        sendBytes(sessionOpenSession, bArr, str, str3);
                        sessionOpenSession.close();
                        return;
                    } catch (IOException e) {
                        throw ((IOException) new IOException("Error during SCP transfer.").initCause(e));
                    }
                } catch (Throwable th) {
                    if (sessionOpenSession != null) {
                        sessionOpenSession.close();
                    }
                    throw th;
                }
            }
            u7.r("Invalid mode.");
            return;
        }
        u7.r("Null argument.");
    }

    public void put(String[] strArr, String str, String str2) throws IOException {
        put(strArr, (String[]) null, str, str2);
    }

    public void put(String str, String str2) throws IOException {
        put(new String[]{str}, str2, "0600");
    }

    private void receiveFiles(Session session, OutputStream[] outputStreamArr) throws IOException {
        int i;
        String strReceiveLine;
        byte[] bArr = new byte[AttribFlags.SSH_FILEXFER_ATTR_LINK_COUNT];
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(session.getStdin(), 512);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(session.getStdout(), 40000);
        bufferedOutputStream.write(0);
        bufferedOutputStream.flush();
        for (OutputStream outputStream : outputStreamArr) {
            do {
                i = bufferedInputStream.read();
                if (i >= 0) {
                    strReceiveLine = receiveLine(bufferedInputStream);
                } else {
                    p60.f("Remote scp terminated unexpectedly.");
                    return;
                }
            } while (i == 84);
            if (i == 1 || i == 2) {
                p60.f(vh.l("Remote SCP error: ", strReceiveLine));
                return;
            }
            if (i != 67) {
                throw new IOException("Remote SCP error: " + ((char) i) + strReceiveLine);
            }
            LenNamePair cLine = parseCLine(strReceiveLine);
            bufferedOutputStream.write(0);
            bufferedOutputStream.flush();
            long j = cLine.length;
            while (j > 0) {
                int i2 = bufferedInputStream.read(bArr, 0, j > 8192 ? 8192 : (int) j);
                if (i2 >= 0) {
                    outputStream.write(bArr, 0, i2);
                    j -= (long) i2;
                } else {
                    p60.f("Remote scp terminated connection unexpectedly");
                    return;
                }
            }
            readResponse(bufferedInputStream);
            bufferedOutputStream.write(0);
            bufferedOutputStream.flush();
        }
    }
}
