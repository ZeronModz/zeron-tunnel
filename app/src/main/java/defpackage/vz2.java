package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.View;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.f6;
import com.google.android.gms.internal.ads.h4;
import com.google.android.gms.internal.ads.k5;
import com.google.android.gms.internal.ads.z;
import com.google.android.gms.internal.ads.zzatp;
import com.google.android.gms.internal.ads.zzatt;
import com.google.android.gms.internal.ads.zzgjf;
import com.google.android.gms.internal.ads.zzgmg;
import com.google.android.gms.internal.ads.zzgmu;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Optional;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class vz2 implements zzgjf {
    public final zzgmu a;
    public final zzgmg b;
    public final ExecutorService c;
    public final i03 d;
    public final f6 e;
    public final Object f = new Object();
    public final String g;
    public final long h;
    public final long i;
    public uz2 j;

    public vz2(zzgmu zzgmuVar, zzgmg zzgmgVar, i03 i03Var, f6 f6Var, k5 k5Var, ExecutorService executorService) {
        this.a = zzgmuVar;
        this.b = zzgmgVar;
        this.c = executorService;
        this.d = i03Var;
        this.e = f6Var;
        this.g = k5Var.zzb();
        this.h = k5Var.F();
        this.i = k5Var.zzj();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.util.HashMap r13) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vz2.a(java.util.HashMap):void");
    }

    public final String b(HashMap map) {
        String strG;
        f6 f6Var = this.e;
        try {
            f6Var.a(20110).a();
            synchronized (this.f) {
                try {
                    uz2 uz2Var = this.j;
                    if (uz2Var == null) {
                        f6Var.b(20109);
                        strG = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                    } else {
                        byte[] bArr = (byte[]) uz2Var.a.zzd(uz2Var.b, Optional.of(map));
                        m23 m23Var = n23.e;
                        if (m23Var.b != null) {
                            m23Var = new m23(m23Var.a, (Character) null);
                        }
                        strG = m23Var.g(bArr.length, bArr);
                    }
                } finally {
                }
            }
            return strG;
        } finally {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgjf
    public final String zza() {
        synchronized (this.f) {
            try {
                uz2 uz2Var = this.j;
                if (uz2Var == null) {
                    return "3.825731049.-1";
                }
                return uz2Var.d;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgjf
    public final ListenableFuture zzb() {
        q33 q33VarQ = q33.q(this.b.zzb());
        ox1 ox1Var = ox1.B;
        ExecutorService executorService = this.c;
        return z.Z(z.N(q33VarQ, Throwable.class, ox1Var, executorService), new h4(this, 4), executorService);
    }

    @Override // com.google.android.gms.internal.ads.zzgjf
    public final ListenableFuture zzc(Context context) {
        return z.y(new mx0(this, 13, context, false), this.c);
    }

    @Override // com.google.android.gms.internal.ads.zzgjf
    public final ListenableFuture zzd(Context context, String str, View view, Activity activity) {
        return z.y(new ik2(this, context, view, activity, 4), this.c);
    }

    @Override // com.google.android.gms.internal.ads.zzgjf
    public final ListenableFuture zze(Context context, String str, View view, Activity activity) {
        return z.y(new ik2(this, context, str, view, 5), this.c);
    }

    @Override // com.google.android.gms.internal.ads.zzgjf
    public final void zzf(InputEvent inputEvent) {
        try {
            synchronized (this.f) {
                try {
                    uz2 uz2Var = this.j;
                    if (uz2Var != null) {
                        HashMap map = new HashMap();
                        map.put("evt", inputEvent);
                        uz2Var.a.zzd(uz2Var.c, Optional.of(map));
                    } else {
                        this.e.b(20105);
                    }
                } finally {
                }
            }
        } catch (zzatp | zzatt e) {
            this.e.d(20104, e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgjf
    public final int zzg() {
        return 4;
    }
}
