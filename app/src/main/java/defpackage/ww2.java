package defpackage;

import com.google.android.gms.internal.ads.h5;
import com.google.android.gms.internal.ads.zzfxu;
import com.google.android.gms.internal.ads.zzfxx;
import com.google.android.gms.internal.ads.zzgru;
import java.net.HttpURLConnection;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ww2 extends zzfxx {
    public zzgru a;
    public zzgru b;
    public e43 c;
    public HttpURLConnection d;

    public final HttpURLConnection a(e43 e43Var) {
        this.a = new ot2(4);
        this.b = new ot2(5);
        this.c = e43Var;
        ((Integer) this.b.mo10zza()).getClass();
        zzfxu zzfxuVar = h5.a;
        e43 e43Var2 = this.c;
        e43Var2.getClass();
        HttpURLConnection httpURLConnection = (HttpURLConnection) e43Var2.zza();
        this.d = httpURLConnection;
        return httpURLConnection;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        HttpURLConnection httpURLConnection = this.d;
        zzfxu zzfxuVar = h5.a;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }
}
