package defpackage;

import android.content.pm.ApkChecksum;
import android.media.AudioFocusRequest;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.internal.utils.RingBuffer;
import com.google.android.gms.internal.ads.zzicf;
import com.google.android.gms.internal.ads.zzicg;
import com.google.android.gms.internal.measurement.zzmr;
import java.security.GeneralSecurityException;
import java.security.cert.PKIXRevocationChecker;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zg1 implements RingBuffer.OnRemoveCallback {
    public static /* bridge */ /* synthetic */ ApkChecksum b(Object obj) {
        return (ApkChecksum) obj;
    }

    public static /* bridge */ /* synthetic */ AudioFocusRequest c(Object obj) {
        return (AudioFocusRequest) obj;
    }

    public static /* bridge */ /* synthetic */ PKIXRevocationChecker f(Object obj) {
        return (PKIXRevocationChecker) obj;
    }

    public static /* synthetic */ void h() {
        throw new IllegalStateException();
    }

    public static /* synthetic */ void i(int i, int i2) {
        StringBuilder sb = new StringBuilder(i);
        sb.append((Object) "serialized size must be non-negative, was ");
        sb.append(i2);
        throw new IllegalStateException(sb.toString());
    }

    public static /* synthetic */ void j(int i, int i2, int i3) {
        StringBuilder sb = new StringBuilder(i);
        sb.append((Object) "Length too large: ");
        sb.append(i2);
        sb.append(i3);
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void k(int i, int i2, Object obj) {
        StringBuilder sb = new StringBuilder(i);
        sb.append((Object) "Source subfield ");
        sb.append(i2);
        sb.append((Object) " is present but null: ");
        sb.append(obj);
        throw new IllegalStateException(sb.toString());
    }

    public static /* synthetic */ void l(Object obj) {
        throw new IllegalStateException(obj.toString());
    }

    public static /* synthetic */ void m(String str) throws GeneralSecurityException {
        throw new GeneralSecurityException(str);
    }

    public static /* synthetic */ void n(String str, Object obj, Object obj2) {
        throw new IllegalArgumentException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void o(StringBuilder sb, Object obj, Object obj2) {
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void q() throws zzicf {
        throw new zzicf("Protocol message tag had invalid wire type.");
    }

    public static /* synthetic */ void r(String str) throws zzicg {
        throw new zzicg(str);
    }

    public static /* synthetic */ void s(String str) throws zzmr {
        throw new zzmr(str);
    }

    @Override // androidx.camera.core.internal.utils.RingBuffer.OnRemoveCallback
    public void onRemove(Object obj) {
        ((ImageProxy) obj).close();
    }
}
