package defpackage;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.g0;
import com.google.android.gms.measurement.internal.zzjd;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class cf3 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wj3 b;
    public final /* synthetic */ Bundle c;
    public final /* synthetic */ zzjd d;

    public /* synthetic */ cf3(zzjd zzjdVar, wj3 wj3Var, Bundle bundle, int i) {
        this.a = i;
        this.b = wj3Var;
        this.c = bundle;
        this.d = zzjdVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        int i = this.a;
        Bundle bundle = this.c;
        wj3 wj3Var = this.b;
        zzjd zzjdVar = this.d;
        switch (i) {
            case 0:
                g0 g0Var = zzjdVar.a;
                g0Var.w();
                return g0Var.Y(bundle, wj3Var);
            default:
                g0 g0Var2 = zzjdVar.a;
                g0Var2.w();
                return g0Var2.Y(bundle, wj3Var);
        }
    }
}
