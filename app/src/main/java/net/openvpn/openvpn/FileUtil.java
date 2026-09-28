package net.openvpn.openvpn;

import com.sandok.tunnel.service.OpenVPNService;
import com.trilead.ssh2.sftp.AttribFlags;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class FileUtil {

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public static class FileTooLarge extends IOException {
        public FileTooLarge(String str, long j) {
            super("file %s too large" + new Object[]{str, Long.valueOf(j)});
        }
    }

    public static String a(InputStream inputStream, String str) throws IOException {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            StringBuilder sb = new StringBuilder();
            char[] cArr = new char[AttribFlags.SSH_FILEXFER_ATTR_MIME_TYPE];
            while (true) {
                int i = bufferedReader.read(cArr, 0, AttribFlags.SSH_FILEXFER_ATTR_MIME_TYPE);
                if (i <= 0) {
                    return sb.toString();
                }
                sb.append(cArr, 0, i);
            }
        } finally {
            inputStream.close();
        }
    }

    public static void b(OpenVPNService openVPNService, String str, String str2) {
        FileOutputStream fileOutputStreamOpenFileOutput = openVPNService.openFileOutput(str, 0);
        try {
            fileOutputStreamOpenFileOutput.write(str2.getBytes());
        } finally {
            fileOutputStreamOpenFileOutput.close();
        }
    }
}
