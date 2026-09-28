package net.openvpn.openvpn;

import android.content.Context;
import defpackage.vh;
import java.util.Objects;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.X509Certificate;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class TrustMan implements X509TrustManager {
    public final KeyStore a;
    public final X509TrustManager b;
    public final X509TrustManager c;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public interface Callback {
        void onTrustFail(TrustContext trustContext);

        void onTrustSucceed(boolean z);
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public static class Error extends Exception {
        public Error(String str) {
            super(vh.l("TrustMan: ", str));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public static class TrustContext {
        public String a;
        public X509Certificate[] b;
        public CertificateException c;

        public final String toString() {
            return "TrustContext chain=" + this.b + " authType=" + this.a + " excep=" + this.c;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public static class TrustFail extends CertificateException {
        public TrustFail(CertificateException certificateException) {
            super(certificateException);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.security.KeyStore] */
    public TrustMan(Context context) throws Error {
        StringBuilder sb = new StringBuilder();
        sb.append(context.getFilesDir());
        File file = new File(vh.s(sb, File.separator, "trusted-certs.keystore"));
        KeyStore keyStore = 0;
        String.format("reload certs: gen=%d/%d", keyStore, keyStore);
        try {
            try {
                keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
                try {
                    try {
                        keyStore.load(null, null);
                        keyStore.load(new FileInputStream(file), new char[]{'O', 'p', 'e', 'n', 'V', 'P', 'N'});
                    } catch (Exception unused) {
                        Objects.toString(file);
                    }
                } catch (FileNotFoundException unused2) {
                    Objects.toString(file);
                }
            } catch (KeyStoreException unused3) {
                keyStore = 0;
            }
        } catch (KeyStoreException unused4) {
        }
        if (keyStore == 0) {
            throw new Error("could not load appKeyStore");
        }
        X509TrustManager x509TrustManagerB = b(null);
        if (x509TrustManagerB == null) {
            throw new Error("could not load defaultTrustManager");
        }
        X509TrustManager x509TrustManagerB2 = b(keyStore);
        if (x509TrustManagerB2 == null) {
            throw new Error("could not load appTrustManager");
        }
        this.a = keyStore;
        this.c = x509TrustManagerB;
        this.b = x509TrustManagerB2;
    }

    public static X509TrustManager b(KeyStore keyStore) {
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("X509");
            trustManagerFactory.init(keyStore);
            for (TrustManager trustManager : trustManagerFactory.getTrustManagers()) {
                if (trustManager instanceof X509TrustManager) {
                    return (X509TrustManager) trustManager;
                }
            }
            return null;
        } catch (Exception unused) {
            Objects.toString(keyStore);
            return null;
        }
    }

    public final void a(X509Certificate[] x509CertificateArr, String str, boolean z) throws TrustFail {
        X509TrustManager x509TrustManager = this.b;
        try {
            if (z) {
                x509TrustManager.checkServerTrusted(x509CertificateArr, str);
            } else {
                x509TrustManager.checkClientTrusted(x509CertificateArr, str);
            }
        } catch (CertificateException e) {
            e = e;
            while (!(e instanceof CertificateExpiredException)) {
                e = e.getCause();
                if (e == null) {
                    try {
                        if (this.a.getCertificateAlias(x509CertificateArr[0]) != null) {
                            return;
                        }
                    } catch (KeyStoreException unused) {
                    }
                    X509TrustManager x509TrustManager2 = this.c;
                    try {
                        if (z) {
                            x509TrustManager2.checkServerTrusted(x509CertificateArr, str);
                        } else {
                            x509TrustManager2.checkClientTrusted(x509CertificateArr, str);
                        }
                        return;
                    } catch (CertificateException e2) {
                        TrustContext trustContext = new TrustContext();
                        trustContext.b = x509CertificateArr;
                        trustContext.a = str;
                        trustContext.c = e2;
                        throw new TrustFail(e2);
                    }
                }
            }
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws TrustFail {
        a(x509CertificateArr, str, false);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws TrustFail {
        a(x509CertificateArr, str, true);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        return this.c.getAcceptedIssuers();
    }
}
