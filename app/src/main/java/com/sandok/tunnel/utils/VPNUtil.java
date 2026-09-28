package com.sandok.tunnel.utils;

import com.google.android.gms.ads.RequestConfiguration;
import com.sandok.tunnel.service.OpenVPNService;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.Socket;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class VPNUtil {
    private static VPNProtectListener Listener;
    private static OpenVPNService mService;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public interface VPNProtectListener {
        boolean protectSocket(Socket socket);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005c, code lost:
    
        r2 = r2 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int findProcessId(java.lang.String r7) throws java.io.IOException {
        /*
            java.lang.String r0 = "ps -A"
            java.lang.String r1 = "toolbox ps"
            java.lang.String r2 = "ps -ef"
            java.lang.String[] r0 = new java.lang.String[]{r2, r0, r1}
            r1 = 0
            r2 = r1
        Lc:
            r3 = 3
            if (r2 >= r3) goto L5f
            java.lang.Runtime r3 = java.lang.Runtime.getRuntime()
            r4 = r0[r2]
            java.lang.Process r3 = r3.exec(r4)
            java.io.BufferedReader r4 = new java.io.BufferedReader
            java.io.InputStreamReader r5 = new java.io.InputStreamReader
            java.io.InputStream r6 = r3.getInputStream()
            r5.<init>(r6)
            r4.<init>(r5)
        L27:
            java.lang.String r5 = r4.readLine()
            if (r5 == 0) goto L5c
            java.lang.String r6 = "PID"
            boolean r6 = r5.contains(r6)
            if (r6 != 0) goto L27
            boolean r6 = r5.contains(r7)
            if (r6 == 0) goto L27
            java.lang.String r7 = "\\s+"
            java.lang.String[] r7 = r5.split(r7)
            r0 = 1
            r0 = r7[r0]     // Catch: java.lang.Throwable -> L4c java.lang.NumberFormatException -> L4e
            int r7 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L4c java.lang.NumberFormatException -> L4e
            r3.destroy()     // Catch: java.lang.Exception -> L4b
        L4b:
            return r7
        L4c:
            r7 = move-exception
            goto L58
        L4e:
            r7 = r7[r1]     // Catch: java.lang.Throwable -> L4c
            int r7 = java.lang.Integer.parseInt(r7)     // Catch: java.lang.Throwable -> L4c
            r3.destroy()     // Catch: java.lang.Exception -> L57
        L57:
            return r7
        L58:
            r3.destroy()     // Catch: java.lang.Exception -> L5b
        L5b:
            throw r7
        L5c:
            int r2 = r2 + 1
            goto Lc
        L5f:
            r7 = -1
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sandok.tunnel.utils.VPNUtil.findProcessId(java.lang.String):int");
    }

    public static OpenVPNService getService() {
        return mService;
    }

    public static boolean isProtected(Socket socket) {
        VPNProtectListener vPNProtectListener = Listener;
        if (vPNProtectListener != null) {
            return vPNProtectListener.protectSocket(socket);
        }
        return false;
    }

    public static int killProcess(File file, String str) throws Exception {
        int i = 0;
        do {
            int iFindProcessId = findProcessId(file.getName());
            if (iFindProcessId == -1) {
                return iFindProcessId;
            }
            i++;
            String strValueOf = String.valueOf(iFindProcessId);
            String[] strArr = {RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "busybox ", "toolbox "};
            for (int i2 = 0; i2 < 3; i2++) {
                try {
                    Runtime.getRuntime().exec(strArr[i2] + "killall " + str + " " + file.getName());
                } catch (IOException unused) {
                }
                try {
                    Runtime.getRuntime().exec(strArr[i2] + "killall " + str + " " + file.getCanonicalPath());
                } catch (IOException unused2) {
                }
            }
            killProcess(strValueOf, str);
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException unused3) {
            }
        } while (i <= 4);
        throw new Exception("Cannot kill: " + file.getAbsolutePath());
    }

    public static boolean saveTextFile(File file, String str) {
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fileWriter = new FileWriter(file, false);
            fileWriter.write(str);
            fileWriter.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void setVPNProtectListener(VPNProtectListener vPNProtectListener) {
        Listener = vPNProtectListener;
    }

    public static void setVPNService(OpenVPNService openVPNService) {
        mService = openVPNService;
    }

    public static void killProcess(File file) throws Exception {
        killProcess(file, "-9");
    }

    public static void killProcess(String str, String str2) throws Exception {
        String[] strArr = {RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "toolbox ", "busybox "};
        for (int i = 0; i < 3; i++) {
            try {
                Runtime.getRuntime().exec(strArr[i] + "kill " + str2 + " " + str);
            } catch (IOException unused) {
            }
        }
    }
}
