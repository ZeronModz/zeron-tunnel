package defpackage;

import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.measurement.internal.m;
import com.google.android.gms.measurement.internal.r;
import com.google.android.gms.measurement.internal.z;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzgb;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class fh3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wj3 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ z d;
    public final /* synthetic */ AbstractSafeParcelable e;

    public fh3(z zVar, wj3 wj3Var, boolean z, zw1 zw1Var) {
        this.a = 2;
        this.b = wj3Var;
        this.c = z;
        this.e = zw1Var;
        Objects.requireNonNull(zVar);
        this.d = zVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i = this.a;
        AbstractSafeParcelable abstractSafeParcelable = this.e;
        boolean z = this.c;
        wj3 wj3Var = this.b;
        z zVar = this.d;
        switch (i) {
            case 0:
                zzgb zzgbVar = zVar.d;
                if (zzgbVar != null) {
                    zVar.s(zzgbVar, z ? null : (dj3) abstractSafeParcelable, wj3Var);
                    zVar.n();
                } else {
                    m mVar = zVar.a.f;
                    r.h(mVar);
                    mVar.f.a("Discarding data. Failed to set user property");
                }
                break;
            case 1:
                zzgb zzgbVar2 = zVar.d;
                if (zzgbVar2 != null) {
                    zVar.s(zzgbVar2, z ? null : (zzbg) abstractSafeParcelable, wj3Var);
                    zVar.n();
                } else {
                    m mVar2 = zVar.a.f;
                    r.h(mVar2);
                    mVar2.f.a("Discarding data. Failed to send event to service");
                }
                break;
            default:
                zzgb zzgbVar3 = zVar.d;
                if (zzgbVar3 != null) {
                    zVar.s(zzgbVar3, z ? null : (zw1) abstractSafeParcelable, wj3Var);
                    zVar.n();
                } else {
                    m mVar3 = zVar.a.f;
                    r.h(mVar3);
                    mVar3.f.a("Discarding data. Failed to send conditional user property to service");
                }
                break;
        }
    }

    public /* synthetic */ fh3(z zVar, wj3 wj3Var, boolean z, AbstractSafeParcelable abstractSafeParcelable, int i) {
        this.a = i;
        this.b = wj3Var;
        this.c = z;
        this.e = abstractSafeParcelable;
        this.d = zVar;
    }
}
