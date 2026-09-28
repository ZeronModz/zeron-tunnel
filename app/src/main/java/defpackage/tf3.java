package defpackage;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzcu;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.w;
import com.google.android.gms.measurement.internal.z;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class tf3 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public tf3(w wVar, AtomicReference atomicReference, String str, String str2, boolean z) {
        this.e = atomicReference;
        this.b = str;
        this.c = str2;
        this.d = z;
        Objects.requireNonNull(wVar);
        this.f = wVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0143 A[Catch: RuntimeException -> 0x00d6, TryCatch #0 {RuntimeException -> 0x00d6, blocks: (B:19:0x0068, B:50:0x00f6, B:52:0x0101, B:55:0x010e, B:57:0x0114, B:59:0x012e, B:62:0x013b, B:65:0x0143, B:68:0x015a, B:70:0x0169, B:69:0x0161, B:71:0x017c, B:73:0x0182, B:75:0x0188, B:77:0x018e, B:79:0x0196, B:81:0x019e, B:83:0x01a6, B:85:0x01ac, B:86:0x01be, B:23:0x0089, B:25:0x008f, B:27:0x0097, B:29:0x009d, B:31:0x00a3, B:33:0x00a9, B:35:0x00b1, B:37:0x00b9, B:39:0x00c1, B:41:0x00c9, B:44:0x00d9, B:46:0x00e7), top: B:94:0x0068 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 566
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tf3.run():void");
    }

    public tf3(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcu zzcuVar, String str, String str2, boolean z) {
        this.e = zzcuVar;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.f = appMeasurementDynamiteService;
    }

    public tf3(r50 r50Var, boolean z, Uri uri, String str, String str2) {
        this.d = z;
        this.e = uri;
        this.b = str;
        this.c = str2;
        this.f = r50Var;
    }

    public tf3(z zVar, wj3 wj3Var, boolean z, m12 m12Var, Bundle bundle) {
        this.e = wj3Var;
        this.d = z;
        this.b = m12Var;
        this.c = bundle;
        Objects.requireNonNull(zVar);
        this.f = zVar;
    }
}
