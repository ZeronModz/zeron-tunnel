package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Bundle;
import android.os.Looper;
import android.util.Range;
import android.util.Rational;
import androidx.camera.core.ExposureState;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.ads.zzaef;
import com.google.android.gms.internal.ads.zzaev;
import com.google.android.gms.internal.ads.zzafb;
import com.google.android.gms.internal.ads.zzafh;
import com.google.android.gms.internal.ads.zzbgi;
import com.google.android.gms.internal.ads.zzbju;
import com.google.android.gms.internal.ads.zzer;
import com.google.android.gms.internal.common.zzg;
import java.util.DesugarCollections;
import java.io.IOException;
import java.nio.ByteOrder;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class x40 implements ExposureState, zzaef {
    public int a;
    public Object b;
    public Object c;

    public x40() {
        this.b = DesugarCollections.synchronizedMap(new ArrayMap());
        this.a = 0;
    }

    public static x40 b(String str, boolean z) {
        return new x40(str, 1, Boolean.valueOf(z));
    }

    public static x40 d(long j, String str) {
        return new x40(str, 2, Long.valueOf(j));
    }

    public void a(int i) {
        synchronized (this.b) {
            this.a = i;
        }
    }

    public synchronized void c() {
        ((zzbgi) this.c).c.execute(new vn1(this, 14));
    }

    public void e(String str, zj0 zj0Var) {
        Map map = (Map) this.b;
        if (map.containsKey(str)) {
            u7.r(vh.t(new StringBuilder(String.valueOf(str).length() + 59), "LifecycleCallback with tag ", str, " already added to this fragment."));
            return;
        }
        map.put(str, zj0Var);
        if (this.a > 0) {
            new zzg(Looper.getMainLooper()).post(new wq(this, zj0Var, str, 4, false));
        }
    }

    public long f(zzaev zzaevVar) throws IOException {
        int iZzg;
        zzafb zzafbVar = (zzafb) this.c;
        zzafh zzafhVar = (zzafh) this.b;
        while (zzaevVar.zzm() < zzaevVar.zzo() - 6) {
            int i = this.a;
            long jZzm = zzaevVar.zzm();
            zzer zzerVar = new zzer(17);
            int i2 = 0;
            zzaevVar.zzi(zzerVar.a, 0, 2);
            if (zzerVar.r(0, ByteOrder.BIG_ENDIAN) != i) {
                zzaevVar.zzl();
                zzaevVar.zzk((int) (jZzm - zzaevVar.zzn()));
            } else {
                byte[] bArr = zzerVar.a;
                while (i2 < 15 && (iZzg = zzaevVar.zzg(bArr, 2 + i2, 15 - i2)) != -1) {
                    i2 += iZzg;
                }
                zzerVar.C(i2 + 2);
                zzaevVar.zzl();
                zzaevVar.zzk((int) (jZzm - zzaevVar.zzn()));
                if (k02.H(zzerVar, zzafhVar, i, zzafbVar)) {
                    break;
                }
            }
            zzaevVar.zzk(1);
        }
        if (zzaevVar.zzm() < zzaevVar.zzo() - 6) {
            return zzafbVar.a;
        }
        zzaevVar.zzk((int) (zzaevVar.zzo() - zzaevVar.zzm()));
        return zzafhVar.j;
    }

    public Object g() {
        String str = (String) this.c;
        Object obj = this.b;
        zzbju zzbjuVar = (zzbju) y42.a.get();
        if (zzbjuVar != null) {
            int i = this.a - 1;
            return i != 0 ? i != 1 ? i != 2 ? zzbjuVar.zzd(str, (String) obj) : zzbjuVar.zzc(str, ((Double) obj).doubleValue()) : zzbjuVar.zzb(str, ((Long) obj).longValue()) : zzbjuVar.zza(str, ((Boolean) obj).booleanValue());
        }
        if (y42.a() != null) {
            y42.a().zza();
        }
        return obj;
    }

    @Override // androidx.camera.core.ExposureState
    public int getExposureCompensationIndex() {
        int i;
        synchronized (this.b) {
            i = this.a;
        }
        return i;
    }

    @Override // androidx.camera.core.ExposureState
    public Range getExposureCompensationRange() {
        return (Range) ((rj) this.c).a(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
    }

    @Override // androidx.camera.core.ExposureState
    public Rational getExposureCompensationStep() {
        return !isExposureCompensationSupported() ? Rational.ZERO : (Rational) ((rj) this.c).a(CameraCharacteristics.CONTROL_AE_COMPENSATION_STEP);
    }

    public void h(Bundle bundle) {
        this.a = 1;
        this.c = bundle;
        for (Map.Entry entry : ((Map) this.b).entrySet()) {
            ((zj0) entry.getValue()).b(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x008e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x000c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void i(int r9, int r10, android.content.Intent r11) {
        /*
            r8 = this;
            java.lang.Object r8 = r8.b
            java.util.Map r8 = (java.util.Map) r8
            java.util.Collection r8 = r8.values()
            java.util.Iterator r8 = r8.iterator()
        Lc:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L97
            java.lang.Object r0 = r8.next()
            zj0 r0 = (defpackage.zj0) r0
            au1 r0 = (defpackage.au1) r0
            java.util.concurrent.atomic.AtomicReference r1 = r0.c
            java.util.concurrent.atomic.AtomicReference r2 = r0.c
            java.lang.Object r1 = r1.get()
            vt1 r1 = (defpackage.vt1) r1
            r3 = 1
            r4 = 3
            r5 = 0
            if (r9 == r3) goto L59
            r3 = 2
            if (r9 == r3) goto L2d
            goto L8c
        L2d:
            com.google.android.gms.common.GoogleApiAvailability r3 = r0.e
            android.app.Activity r6 = r0.a()
            int r7 = com.google.android.gms.common.a.a
            int r3 = r3.b(r6, r7)
            if (r3 != 0) goto L4c
            r2.set(r5)
            gs1 r0 = (defpackage.gs1) r0
            com.google.android.gms.common.api.internal.b r0 = r0.g
            com.google.android.gms.internal.base.zau r0 = r0.n
            android.os.Message r1 = r0.obtainMessage(r4)
            r0.sendMessage(r1)
            goto Lc
        L4c:
            if (r1 == 0) goto Lc
            com.google.android.gms.common.ConnectionResult r2 = r1.b
            int r2 = r2.b
            r4 = 18
            if (r2 != r4) goto L8c
            if (r3 != r4) goto L8c
            goto Lc
        L59:
            r3 = -1
            if (r10 != r3) goto L6d
            r2.set(r5)
            gs1 r0 = (defpackage.gs1) r0
            com.google.android.gms.common.api.internal.b r0 = r0.g
            com.google.android.gms.internal.base.zau r0 = r0.n
            android.os.Message r1 = r0.obtainMessage(r4)
            r0.sendMessage(r1)
            goto Lc
        L6d:
            if (r10 != 0) goto L8c
            if (r1 == 0) goto Lc
            r2 = 13
            if (r11 == 0) goto L7b
            java.lang.String r3 = "<<ResolutionFailureErrorDetail>>"
            int r2 = r11.getIntExtra(r3, r2)
        L7b:
            com.google.android.gms.common.ConnectionResult r3 = new com.google.android.gms.common.ConnectionResult
            com.google.android.gms.common.ConnectionResult r4 = r1.b
            java.lang.String r4 = r4.toString()
            r3.<init>(r2, r5, r4)
            int r1 = r1.a
            r0.d(r3, r1)
            goto Lc
        L8c:
            if (r1 == 0) goto Lc
            com.google.android.gms.common.ConnectionResult r2 = r1.b
            int r1 = r1.a
            r0.d(r2, r1)
            goto Lc
        L97:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x40.i(int, int, android.content.Intent):void");
    }

    @Override // androidx.camera.core.ExposureState
    public boolean isExposureCompensationSupported() {
        Range range = (Range) ((rj) this.c).a(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
        return (range == null || ((Integer) range.getLower()).intValue() == 0 || ((Integer) range.getUpper()).intValue() == 0) ? false : true;
    }

    public void j(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : ((Map) this.b).entrySet()) {
            Bundle bundle2 = new Bundle();
            vt1 vt1Var = (vt1) ((au1) ((zj0) entry.getValue())).c.get();
            if (vt1Var != null) {
                ConnectionResult connectionResult = vt1Var.b;
                bundle2.putBoolean("resolving_error", true);
                bundle2.putInt("failed_client_id", vt1Var.a);
                bundle2.putInt("failed_status", connectionResult.b);
                bundle2.putParcelable("failed_resolution", connectionResult.c);
            }
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public ow1 zza(zzaev zzaevVar, long j) throws IOException {
        long jZzn = zzaevVar.zzn();
        long jF = f(zzaevVar);
        long jZzm = zzaevVar.zzm();
        zzaevVar.zzk(Math.max(6, ((zzafh) this.b).c));
        long jF2 = f(zzaevVar);
        return (jF > j || jF2 <= j) ? jF2 <= j ? new ow1(-2, jF2, zzaevVar.zzm()) : new ow1(-1, jF, jZzn) : new ow1(0, -9223372036854775807L, jZzm);
    }

    public x40(String str, int i, Object obj) {
        this.c = str;
        this.b = obj;
        this.a = i;
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public void zzb() {
    }

    public x40(rj rjVar) {
        this.b = new Object();
        this.c = rjVar;
        this.a = 0;
    }
}
