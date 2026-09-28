package defpackage;

import android.os.RemoteException;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.a;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ef3 extends zzw {
    public final int c;

    public ef3(byte[] bArr) {
        yg0.e(bArr.length == 25);
        this.c = Arrays.hashCode(bArr);
    }

    public static byte[] d(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            u7.g(e);
            return null;
        }
    }

    public abstract byte[] c();

    public final boolean equals(Object obj) {
        IObjectWrapper iObjectWrapperZzd;
        if (!(obj instanceof zzx)) {
            return false;
        }
        try {
            zzx zzxVar = (zzx) obj;
            if (zzxVar.zze() == this.c && (iObjectWrapperZzd = zzxVar.zzd()) != null) {
                return Arrays.equals(c(), (byte[]) a.d(iObjectWrapperZzd));
            }
        } catch (RemoteException unused) {
        }
        return false;
    }

    public final int hashCode() {
        return this.c;
    }

    @Override // com.google.android.gms.common.internal.zzx
    public final IObjectWrapper zzd() {
        return new a(c());
    }

    @Override // com.google.android.gms.common.internal.zzx
    public final int zze() {
        return this.c;
    }
}
