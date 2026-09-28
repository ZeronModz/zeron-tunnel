package defpackage;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.util.Pair;
import com.google.android.gms.internal.measurement.zzco;
import com.google.android.gms.measurement.internal.zzjp;
import com.google.android.gms.measurement.internal.zzjq;
import com.google.android.gms.measurement.internal.zzlk;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class kh2 implements zzlk {
    public final /* synthetic */ ss2 a;

    public kh2(ss2 ss2Var) {
        this.a = ss2Var;
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void zza(String str, String str2, Bundle bundle) {
        ss2 ss2Var = this.a;
        ss2Var.c(new nq2(ss2Var, null, str, str2, bundle, true));
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void zzb(String str, String str2, Bundle bundle, long j) {
        Long lValueOf = Long.valueOf(j);
        ss2 ss2Var = this.a;
        ss2Var.c(new nq2(ss2Var, lValueOf, str, str2, bundle, false));
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final Map zzd(String str, String str2, boolean z) {
        return this.a.a(str, str2, z);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void zze(zzjp zzjpVar) {
        ss2 ss2Var = this.a;
        xq2 xq2Var = new xq2(zzjpVar);
        if (ss2Var.f != null) {
            try {
                ss2Var.f.setEventInterceptor(xq2Var);
                return;
            } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
            }
        }
        ss2Var.c(new li2(ss2Var, xq2Var, 3));
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void zzf(zzjq zzjqVar) {
        this.a.f(zzjqVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void zzg(zzjq zzjqVar) {
        Pair pair;
        ss2 ss2Var = this.a;
        yg0.m(zzjqVar);
        ArrayList arrayList = ss2Var.c;
        synchronized (arrayList) {
            int i = 0;
            while (true) {
                try {
                    if (i >= arrayList.size()) {
                        pair = null;
                        break;
                    } else {
                        if (zzjqVar.equals(((Pair) arrayList.get(i)).first)) {
                            pair = (Pair) arrayList.get(i);
                            break;
                        }
                        i++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (pair == null) {
                return;
            }
            arrayList.remove(pair);
            ar2 ar2Var = (ar2) pair.second;
            if (ss2Var.f != null) {
                try {
                    ss2Var.f.unregisterOnMeasurementEventListener(ar2Var);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                }
            }
            ss2Var.c(new aq2(ss2Var, ar2Var, 1));
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final String zzh() {
        zzco zzcoVar = new zzco();
        ss2 ss2Var = this.a;
        ss2Var.c(new sl2(ss2Var, zzcoVar, 3));
        return (String) zzco.c(String.class, zzcoVar.b(500L));
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final String zzi() {
        zzco zzcoVar = new zzco();
        ss2 ss2Var = this.a;
        ss2Var.c(new sl2(ss2Var, zzcoVar, 4));
        return (String) zzco.c(String.class, zzcoVar.b(500L));
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final String zzj() {
        zzco zzcoVar = new zzco();
        ss2 ss2Var = this.a;
        ss2Var.c(new sl2(ss2Var, zzcoVar, 1));
        return (String) zzco.c(String.class, zzcoVar.b(50L));
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final String zzk() {
        zzco zzcoVar = new zzco();
        ss2 ss2Var = this.a;
        ss2Var.c(new sl2(ss2Var, zzcoVar, 0));
        return (String) zzco.c(String.class, zzcoVar.b(500L));
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final long zzl() {
        zzco zzcoVar = new zzco();
        ss2 ss2Var = this.a;
        ss2Var.c(new sl2(ss2Var, zzcoVar, 2));
        Long l = (Long) zzco.c(Long.class, zzcoVar.b(500L));
        if (l != null) {
            return l.longValue();
        }
        long jNextLong = new Random(System.nanoTime() ^ System.currentTimeMillis()).nextLong();
        int i = ss2Var.d + 1;
        ss2Var.d = i;
        return jNextLong + ((long) i);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void zzm(String str) {
        ss2 ss2Var = this.a;
        ss2Var.c(new rk2(ss2Var, str, 0));
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void zzn(String str) {
        ss2 ss2Var = this.a;
        ss2Var.c(new rk2(ss2Var, str, 1));
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void zzo(Bundle bundle) {
        ss2 ss2Var = this.a;
        ss2Var.c(new li2(ss2Var, bundle));
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void zzp(String str, String str2, Bundle bundle) {
        ss2 ss2Var = this.a;
        ss2Var.c(new hi2(ss2Var, str, str2, bundle));
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final List zzq(String str, String str2) {
        return this.a.g(str, str2);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final int zzr(String str) {
        return this.a.b(str);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final Object zzx(int i) {
        zzco zzcoVar = new zzco();
        ss2 ss2Var = this.a;
        ss2Var.c(new vo2(ss2Var, zzcoVar, i));
        return zzco.c(Object.class, zzcoVar.b(15000L));
    }
}
