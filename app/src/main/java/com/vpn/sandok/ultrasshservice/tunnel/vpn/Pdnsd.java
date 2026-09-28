package com.vpn.sandok.ultrasshservice.tunnel.vpn;

import android.content.Context;
import dev.zeron.tunnel.R;
import com.vpn.sandok.ultrasshservice.util.FileUtils;
import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class Pdnsd extends Thread {
    private static final String PDNSD_BIN = "libpdnsd";
    private static final String PDNSD_SERVER = "server {\n label= \"%1$s\";\n ip = %2$s;\n port = %3$d;\n uptest = none;\n }\n";
    private static final String PDNSD_SERVER_TEST = "server {\n label= \"%1$s\";\n ip = %2$s;\n port = %3$d;\n reject = ::/0;\n reject_policy = negate;\n reject_recursively = on;\n timeout = 5;\n }\n";
    private static final String TAG = "PdnsdThread";
    private File filePdnsd;
    private Context mContext;
    private String[] mDnsHosts;
    private int mDnsPort;
    private OnPdnsdListener mListener;
    private String mPdnsdHost;
    private int mPdnsdPort;
    private Process mProcess;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public interface OnPdnsdListener {
        void onStart();

        void onStop();
    }

    public Pdnsd(Context context, String[] strArr, int i, String str, int i2) {
        this.mContext = context;
        this.mDnsHosts = strArr;
        this.mDnsPort = i;
        this.mPdnsdHost = str;
        this.mPdnsdPort = i2;
    }

    private File makePdnsdConf(File file, String[] strArr, int i, String str, int i2) throws IOException {
        String fromRaw = FileUtils.readFromRaw(this.mContext, R.raw.pdnsd_local);
        StringBuilder sb = new StringBuilder();
        int i3 = 0;
        while (i3 < strArr.length) {
            String str2 = strArr[i3];
            StringBuilder sb2 = new StringBuilder("server");
            i3++;
            sb2.append(Integer.toString(i3));
            sb.append(String.format(PDNSD_SERVER, sb2.toString(), str2, Integer.valueOf(i)));
        }
        String str3 = String.format(fromRaw, sb.toString(), file.getCanonicalPath(), str, Integer.valueOf(i2));
        File file2 = new File(file, "pdnsd.conf");
        if (file2.exists()) {
            file2.delete();
        }
        FileUtils.saveTextFile(file2, str3);
        File file3 = new File(file, "pdnsd.cache");
        if (!file3.exists()) {
            try {
                file3.createNewFile();
            } catch (Exception unused) {
            }
        }
        return file2;
    }

    @Override // java.lang.Thread
    public synchronized void interrupt() {
        super.interrupt();
        Process process = this.mProcess;
        if (process != null) {
            process.destroy();
        }
        try {
            File file = this.filePdnsd;
            if (file != null) {
                VpnUtils.killProcess(file);
            }
        } catch (Exception unused) {
        }
        this.mProcess = null;
        this.filePdnsd = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r7 = this;
            java.lang.String r0 = "libpdnsd"
            com.vpn.sandok.ultrasshservice.tunnel.vpn.Pdnsd$OnPdnsdListener r1 = r7.mListener
            if (r1 == 0) goto L9
            r1.onStart()
        L9:
            android.content.Context r1 = r7.mContext     // Catch: java.lang.Exception -> L86 java.io.IOException -> L89
            java.io.File r2 = new java.io.File     // Catch: java.lang.Exception -> L86 java.io.IOException -> L89
            android.content.Context r3 = r7.mContext     // Catch: java.lang.Exception -> L86 java.io.IOException -> L89
            java.io.File r3 = r3.getFilesDir()     // Catch: java.lang.Exception -> L86 java.io.IOException -> L89
            r2.<init>(r3, r0)     // Catch: java.lang.Exception -> L86 java.io.IOException -> L89
            java.io.File r0 = com.vpn.sandok.ultrasshservice.util.CustomNativeLoader.loadNativeBinary(r1, r0, r2)     // Catch: java.lang.Exception -> L86 java.io.IOException -> L89
            r7.filePdnsd = r0     // Catch: java.lang.Exception -> L86 java.io.IOException -> L89
            if (r0 == 0) goto L8c
            android.content.Context r0 = r7.mContext     // Catch: java.lang.Exception -> L86 java.io.IOException -> L89
            java.io.File r2 = r0.getFilesDir()     // Catch: java.lang.Exception -> L86 java.io.IOException -> L89
            java.lang.String[] r3 = r7.mDnsHosts     // Catch: java.lang.Exception -> L86 java.io.IOException -> L89
            int r4 = r7.mDnsPort     // Catch: java.lang.Exception -> L86 java.io.IOException -> L89
            java.lang.String r5 = r7.mPdnsdHost     // Catch: java.lang.Exception -> L86 java.io.IOException -> L89
            int r6 = r7.mPdnsdPort     // Catch: java.lang.Exception -> L86 java.io.IOException -> L89
            r1 = r7
            java.io.File r7 = r1.makePdnsdConf(r2, r3, r4, r5, r6)     // Catch: java.lang.Exception -> L80 java.io.IOException -> L83
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L80 java.io.IOException -> L83
            r0.<init>()     // Catch: java.lang.Exception -> L80 java.io.IOException -> L83
            java.io.File r2 = r1.filePdnsd     // Catch: java.lang.Exception -> L80 java.io.IOException -> L83
            java.lang.String r2 = r2.getCanonicalPath()     // Catch: java.lang.Exception -> L80 java.io.IOException -> L83
            r0.append(r2)     // Catch: java.lang.Exception -> L80 java.io.IOException -> L83
            java.lang.String r2 = " -v9 -c "
            r0.append(r2)     // Catch: java.lang.Exception -> L80 java.io.IOException -> L83
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Exception -> L80 java.io.IOException -> L83
            r0.append(r7)     // Catch: java.lang.Exception -> L80 java.io.IOException -> L83
            java.lang.String r7 = r0.toString()     // Catch: java.lang.Exception -> L80 java.io.IOException -> L83
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Exception -> L80 java.io.IOException -> L83
            java.lang.Process r7 = r0.exec(r7)     // Catch: java.lang.Exception -> L80 java.io.IOException -> L83
            r1.mProcess = r7     // Catch: java.lang.Exception -> L80 java.io.IOException -> L83
            com.vpn.sandok.ultrasshservice.tunnel.vpn.Pdnsd$1 r7 = new com.vpn.sandok.ultrasshservice.tunnel.vpn.Pdnsd$1     // Catch: java.lang.Exception -> L80 java.io.IOException -> L83
            r7.<init>()     // Catch: java.lang.Exception -> L80 java.io.IOException -> L83
            com.vpn.sandok.ultrasshservice.util.StreamGobbler r0 = new com.vpn.sandok.ultrasshservice.util.StreamGobbler     // Catch: java.lang.Exception -> L80 java.io.IOException -> L83
            java.lang.Process r2 = r1.mProcess     // Catch: java.lang.Exception -> L80 java.io.IOException -> L83
            java.io.InputStream r2 = r2.getInputStream()     // Catch: java.lang.Exception -> L80 java.io.IOException -> L83
            r0.<init>(r2, r7)     // Catch: java.lang.Exception -> L80 java.io.IOException -> L83
            com.vpn.sandok.ultrasshservice.util.StreamGobbler r2 = new com.vpn.sandok.ultrasshservice.util.StreamGobbler     // Catch: java.lang.Exception -> L80 java.io.IOException -> L83
            java.lang.Process r3 = r1.mProcess     // Catch: java.lang.Exception -> L80 java.io.IOException -> L83
            java.io.InputStream r3 = r3.getErrorStream()     // Catch: java.lang.Exception -> L80 java.io.IOException -> L83
            r2.<init>(r3, r7)     // Catch: java.lang.Exception -> L80 java.io.IOException -> L83
            r0.start()     // Catch: java.lang.Exception -> L80 java.io.IOException -> L83
            r2.start()     // Catch: java.lang.Exception -> L80 java.io.IOException -> L83
            java.lang.Process r7 = r1.mProcess     // Catch: java.lang.Exception -> L80 java.io.IOException -> L83
            r7.waitFor()     // Catch: java.lang.Exception -> L80 java.io.IOException -> L83
            goto Lac
        L80:
            r0 = move-exception
        L81:
            r7 = r0
            goto L95
        L83:
            r0 = move-exception
        L84:
            r7 = r0
            goto La7
        L86:
            r0 = move-exception
            r1 = r7
            goto L81
        L89:
            r0 = move-exception
            r1 = r7
            goto L84
        L8c:
            r1 = r7
            java.io.IOException r7 = new java.io.IOException     // Catch: java.lang.Exception -> L80 java.io.IOException -> L83
            java.lang.String r0 = "Bin Pdnsd não encontrada"
            r7.<init>(r0)     // Catch: java.lang.Exception -> L80 java.io.IOException -> L83
            throw r7     // Catch: java.lang.Exception -> L80 java.io.IOException -> L83
        L95:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Pdnsd Error: "
            r0.<init>(r2)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            com.vpn.sandok.ultrasshservice.logger.SkStatus.logDebug(r7)
            goto Lac
        La7:
            java.lang.String r0 = "Pdnsd Error"
            com.vpn.sandok.ultrasshservice.logger.SkStatus.logException(r0, r7)
        Lac:
            r7 = 0
            r1.mProcess = r7
            com.vpn.sandok.ultrasshservice.tunnel.vpn.Pdnsd$OnPdnsdListener r7 = r1.mListener
            if (r7 == 0) goto Lb6
            r7.onStop()
        Lb6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vpn.sandok.ultrasshservice.tunnel.vpn.Pdnsd.run():void");
    }

    public void setOnPdnsdListener(OnPdnsdListener onPdnsdListener) {
        this.mListener = onPdnsdListener;
    }
}
