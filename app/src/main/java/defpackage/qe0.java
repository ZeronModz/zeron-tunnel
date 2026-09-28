package defpackage;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class qe0 extends FilterInputStream {
    public final /* synthetic */ int a;
    public final HttpURLConnection b;

    /* JADX WARN: Illegal instructions before constructor call */
    public qe0(HttpURLConnection httpURLConnection, int i) {
        InputStream errorStream;
        InputStream errorStream2;
        this.a = i;
        switch (i) {
            case 1:
                try {
                    errorStream2 = httpURLConnection.getInputStream();
                } catch (IOException unused) {
                    errorStream2 = httpURLConnection.getErrorStream();
                }
                super(errorStream2);
                this.b = httpURLConnection;
                break;
            default:
                try {
                    errorStream = httpURLConnection.getInputStream();
                } catch (IOException unused2) {
                    errorStream = httpURLConnection.getErrorStream();
                }
                super(errorStream);
                this.b = httpURLConnection;
                break;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.a) {
            case 0:
                super.close();
                this.b.disconnect();
                break;
            default:
                super.close();
                this.b.disconnect();
                break;
        }
    }
}
