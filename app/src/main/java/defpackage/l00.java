package defpackage;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Binder;
import android.text.TextUtils;
import androidx.camera.camera2.internal.compat.params.a;
import androidx.camera.core.DynamicRange;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzcen;
import com.google.android.gms.internal.ads.zzdco;
import com.google.android.gms.internal.ads.zzekj;
import com.google.android.gms.internal.ads.zzekk;
import com.google.android.gms.internal.ads.zzepi;
import com.google.android.gms.internal.ads.zzfoe;
import com.google.android.gms.internal.ads.zzgzl;
import java.util.Objects;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class l00 implements zzdco, zzgzl {
    public boolean a;
    public Object b;
    public final Object c;

    public l00(rj rjVar) {
        this.b = rjVar;
        this.c = a.a(rjVar);
        int[] iArr = (int[]) rjVar.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        boolean z = false;
        if (iArr != null) {
            int length = iArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (iArr[i] == 18) {
                    z = true;
                    break;
                }
                i++;
            }
        }
        this.a = z;
    }

    public static boolean a(DynamicRange dynamicRange, DynamicRange dynamicRange2) {
        boolean zB = dynamicRange2.b();
        int i = dynamicRange2.a;
        jx0.g("Fully specified range is not actually fully specified.", zB);
        int i2 = dynamicRange.a;
        if (i2 == 2 && i == 1) {
            return false;
        }
        if (i2 != 2 && i2 != 0 && i2 != i) {
            return false;
        }
        int i3 = dynamicRange.b;
        return i3 == 0 || i3 == dynamicRange2.b;
    }

    public static boolean b(DynamicRange dynamicRange, DynamicRange dynamicRange2, HashSet hashSet) {
        if (hashSet.contains(dynamicRange2)) {
            return a(dynamicRange, dynamicRange2);
        }
        dynamicRange.toString();
        Objects.toString(dynamicRange2);
        km0.a("DynamicRangeResolver");
        return false;
    }

    public static DynamicRange c(DynamicRange dynamicRange, LinkedHashSet linkedHashSet, HashSet hashSet) {
        if (dynamicRange.a == 1) {
            return null;
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            DynamicRange dynamicRange2 = (DynamicRange) it.next();
            jx0.f(dynamicRange2, "Fully specified DynamicRange cannot be null.");
            int i = dynamicRange2.a;
            jx0.g("Fully specified DynamicRange must have fully defined encoding.", dynamicRange2.b());
            if (i != 1 && b(dynamicRange, dynamicRange2, hashSet)) {
                return dynamicRange2;
            }
        }
        return null;
    }

    public static void d(HashSet hashSet, DynamicRange dynamicRange, a aVar) {
        jx0.g("Cannot update already-empty constraints.", !hashSet.isEmpty());
        Set dynamicRangeCaptureRequestConstraints = aVar.getDynamicRangeCaptureRequestConstraints(dynamicRange);
        if (dynamicRangeCaptureRequestConstraints.isEmpty()) {
            return;
        }
        HashSet hashSet2 = new HashSet(hashSet);
        hashSet.retainAll(dynamicRangeCaptureRequestConstraints);
        if (hashSet.isEmpty()) {
            p60.j("Constraints of dynamic range cannot be combined with existing constraints.\nDynamic range:\n  ", dynamicRange, "\nConstraints:\n  ", TextUtils.join("\n  ", dynamicRangeCaptureRequestConstraints), "\nExisting constraints:\n  ", TextUtils.join("\n  ", hashSet2));
        }
    }

    public /* synthetic */ void e() {
        synchronized (this.c) {
            try {
                t12 t12Var = (t12) this.b;
                if (t12Var == null) {
                    return;
                }
                t12Var.disconnect();
                this.b = null;
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void f(zze zzeVar) {
        int i = 1;
        if (true == ((Boolean) zzbd.zzc().a(p32.y6)).booleanValue()) {
            i = 3;
        }
        ((zzcen) this.c).b(new zzekk(i, zzeVar));
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public void zza(Throwable th) {
        zzfoe zzfoeVar = (zzfoe) this.c;
        if (zzfoeVar.zzb()) {
            bv2 bv2Var = (bv2) this.b;
            zzfoeVar.zzj(th);
            zzfoeVar.zzd(false);
            bv2Var.a(zzfoeVar);
            if (this.a) {
                bv2Var.h();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdco
    public synchronized void zzb(int i) {
        if (this.a) {
            return;
        }
        this.a = true;
        f(new zze(i, zzepi.a(i, ((zzekj) this.b).a), AdError.UNDEFINED_DOMAIN, null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzdco
    public synchronized void zzc(int i, String str) {
        try {
            if (this.a) {
                return;
            }
            this.a = true;
            if (str == null) {
                str = zzepi.a(i, ((zzekj) this.b).a);
            }
            f(new zze(i, str, AdError.UNDEFINED_DOMAIN, null, null));
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdco
    public synchronized void zzd(zze zzeVar) {
        if (this.a) {
            return;
        }
        this.a = true;
        f(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdco
    public synchronized void zza() {
        ((zzcen) this.c).a(null);
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    /* JADX INFO: renamed from: zzb */
    public void mo5zzb(Object obj) {
        zzfoe zzfoeVar = (zzfoe) this.c;
        zzfoeVar.zzd(true);
        bv2 bv2Var = (bv2) this.b;
        bv2Var.a(zzfoeVar);
        if (this.a) {
            bv2Var.h();
        }
    }

    public l00(bv2 bv2Var, zzfoe zzfoeVar, boolean z) {
        this.b = bv2Var;
        this.c = zzfoeVar;
        this.a = z;
    }

    public l00(zzepi zzepiVar, zzekj zzekjVar, zzcen zzcenVar) {
        this.b = zzekjVar;
        this.c = zzcenVar;
        this.a = false;
    }

    public l00(Context context) {
        this.c = new Object();
    }
}
