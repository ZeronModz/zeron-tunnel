package net.openvpn.openvpn;

import android.util.Base64;
import java.io.UnsupportedEncodingException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import org.apache.http.conn.ssl.BrowserCompatHostnameVerifier;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class HttpsClient {

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public static class AdaptiveHostnameVerifier implements HostnameVerifier {
        public final BrowserCompatHostnameVerifier a = new BrowserCompatHostnameVerifier();

        @Override // javax.net.ssl.HostnameVerifier
        public final boolean verify(String str, SSLSession sSLSession) {
            return this.a.verify(str, sSLSession);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public static class AuthContext {

        /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
        public static class CR {

            /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
            public static class ParseError extends Exception {
                public ParseError() {
                    super("AuthContext.CR.ParseError");
                }
            }

            public CR(String str) throws ParseError {
                String[] strArrSplit = str.split(":", 5);
                if (strArrSplit.length != 5) {
                    throw new ParseError();
                }
                if (!strArrSplit[0].equals("CRV1")) {
                    throw new ParseError();
                }
                for (String str2 : strArrSplit[1].split(",")) {
                    str2.equals("E");
                    str2.equals("R");
                }
                String str3 = strArrSplit[2];
                try {
                    new String(Base64.decode(strArrSplit[3], 0), "UTF-8");
                    String str4 = strArrSplit[4];
                } catch (UnsupportedEncodingException unused) {
                    throw new ParseError();
                }
            }
        }

        public AuthContext(String str, String str2, String str3) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public static class CancelDetect {
        public final I a;

        /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
        public interface I {
            int cancel_generation();
        }

        public CancelDetect(I i) {
            this.a = i;
            i.cancel_generation();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public interface Interact {
        void challenge_response_dialog(AuthContext authContext, String str);

        void error_dialog(int i, int i2, Object obj);
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public static class PresettableHostnameVerifier implements HostnameVerifier {
        public final BrowserCompatHostnameVerifier a = new BrowserCompatHostnameVerifier();

        @Override // javax.net.ssl.HostnameVerifier
        public final boolean verify(String str, SSLSession sSLSession) {
            return this.a.verify((String) null, sSLSession);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public static abstract class Task implements Runnable {

        /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
        public static class ErrorDialogException extends Exception {
            private int msg_resid;
            private Object obj;
            private int title_resid;

            public ErrorDialogException(int i, int i2, Object obj) {
                super("ErrorDialogException");
                this.title_resid = i;
                this.msg_resid = i2;
                this.obj = obj;
            }

            public void dispatch(Interact interact) {
                interact.error_dialog(this.title_resid, this.msg_resid, this.obj);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
        public static class SilentException extends ErrorDialogException {
            public SilentException() {
                super(0, 0, null);
            }
        }
    }
}
