package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzcu;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.f0;
import com.google.android.gms.measurement.internal.m;
import com.google.android.gms.measurement.internal.r;
import com.google.android.gms.measurement.internal.w;
import com.google.android.gms.measurement.internal.z;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzgb;
import com.google.android.gms.measurement.internal.zzjd;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mu1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public mu1(w wVar, AtomicReference atomicReference, String str, String str2) {
        this.a = 12;
        this.b = atomicReference;
        this.c = str;
        this.d = str2;
        Objects.requireNonNull(wVar);
        this.e = wVar;
    }

    private final void a() {
        zzgb zzgbVar;
        z zVar = (z) this.b;
        AtomicReference atomicReference = (AtomicReference) this.c;
        wj3 wj3Var = (wj3) this.d;
        ki3 ki3Var = (ki3) this.e;
        synchronized (atomicReference) {
            try {
                zzgbVar = zVar.d;
            } catch (RemoteException e) {
                m mVar = zVar.a.f;
                r.h(mVar);
                mVar.f.b(e, "[sgtm] Failed to get upload batches; remote exception");
                atomicReference.notifyAll();
            }
            if (zzgbVar != null) {
                zzgbVar.zzB(wj3Var, ki3Var, new eh3(zVar, atomicReference));
                zVar.n();
            } else {
                m mVar2 = zVar.a.f;
                r.h(mVar2);
                mVar2.f.a("[sgtm] Failed to get upload batches; not connected to service");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:92:0x036d  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1666
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mu1.run():void");
    }

    public /* synthetic */ mu1(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public /* synthetic */ mu1(Object obj, Object obj2, String str, Object obj3, int i) {
        this.a = i;
        this.b = obj2;
        this.c = str;
        this.d = obj3;
        this.e = obj;
    }

    public mu1(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcu zzcuVar, zzbg zzbgVar, String str) {
        this.a = 10;
        this.b = zzcuVar;
        this.d = zzbgVar;
        this.c = str;
        this.e = appMeasurementDynamiteService;
    }

    public /* synthetic */ mu1(zzjd zzjdVar, Bundle bundle, String str, wj3 wj3Var) {
        this.a = 11;
        this.b = zzjdVar;
        this.d = bundle;
        this.c = str;
        this.e = wj3Var;
    }

    public mu1(f0 f0Var, String str, String str2, Bundle bundle) {
        this.a = 17;
        this.c = str;
        this.b = str2;
        this.d = bundle;
        this.e = f0Var;
    }
}
