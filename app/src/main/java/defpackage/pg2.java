package defpackage;

import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.g3;
import com.google.android.gms.internal.ads.q3;
import com.google.android.gms.internal.ads.y3;
import com.google.android.gms.internal.ads.z;
import com.google.android.gms.internal.ads.zzbfl;
import com.google.android.gms.internal.ads.zzdgu;
import com.google.android.gms.internal.ads.zzefc;
import com.google.android.gms.internal.ads.zzefr;
import com.google.android.gms.internal.ads.zzekl;
import com.google.android.gms.internal.ads.zzfjc;
import com.google.android.gms.internal.ads.zzfnb;
import com.google.android.gms.internal.ads.zzfnm;
import com.google.android.gms.internal.ads.zzfno;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.Collections;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class pg2 {
    public final y3 a;
    public final cu2 b;
    public final xu2 c;
    public final ne2 d;
    public final hq2 e;
    public final zzdgu f;
    public zzfjc g;
    public final zzefr h;
    public final q3 i;
    public final ta2 j;
    public final zzefc k;
    public final zzekl l;

    public pg2(y3 y3Var, cu2 cu2Var, xu2 xu2Var, ne2 ne2Var, hq2 hq2Var, zzdgu zzdguVar, zzfjc zzfjcVar, zzefr zzefrVar, q3 q3Var, ta2 ta2Var, zzefc zzefcVar, zzekl zzeklVar) {
        this.a = y3Var;
        this.b = cu2Var;
        this.c = xu2Var;
        this.d = ne2Var;
        this.e = hq2Var;
        this.f = zzdguVar;
        this.g = zzfjcVar;
        this.h = zzefrVar;
        this.i = q3Var;
        this.j = ta2Var;
        this.k = zzefcVar;
        this.l = zzeklVar;
    }

    public final zzfnb a(ListenableFuture listenableFuture) {
        if (this.g != null) {
            xu2 xu2Var = this.c;
            zzfno zzfnoVar = zzfno.SERVER_TRANSACTION;
            Objects.requireNonNull(xu2Var);
            return new fq0(xu2Var, zzfnoVar, null, zzfnm.d, Collections.EMPTY_LIST, z.j(this.g)).k();
        }
        zzbfl zzbflVarZzj = zzt.zzj();
        zzbflVarZzj.getClass();
        if (((Boolean) zzbd.zzc().a(p32.g5)).booleanValue()) {
            synchronized (zzbflVarZzj.c) {
                try {
                    zzbflVarZzj.e();
                    ScheduledFuture scheduledFuture = zzbflVarZzj.a;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    zzbflVarZzj.a = g3.d.schedule(zzbflVarZzj.b, ((Long) zzbd.zzc().a(p32.h5)).longValue(), TimeUnit.MILLISECONDS);
                } finally {
                }
            }
        }
        return this.c.a(listenableFuture, zzfno.SERVER_TRANSACTION).f(new t62(this.k, 4)).k();
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x020d A[Catch: all -> 0x0101, TryCatch #1 {all -> 0x0101, blocks: (B:31:0x009e, B:33:0x00bb, B:35:0x00c3, B:37:0x00d0, B:39:0x00ea, B:43:0x011a, B:46:0x0125, B:48:0x012d, B:50:0x0133, B:54:0x013c, B:63:0x0174, B:57:0x0150, B:62:0x015f, B:65:0x0179, B:42:0x0104, B:66:0x018d, B:73:0x01ac, B:76:0x01b4, B:80:0x01d6, B:82:0x01ec, B:86:0x020d, B:88:0x0222, B:91:0x0236, B:93:0x023c, B:94:0x0249, B:96:0x024c, B:99:0x0255, B:98:0x0252, B:87:0x0217, B:83:0x01fe, B:79:0x01c2, B:70:0x019b, B:71:0x01a0), top: B:135:0x009e, inners: #3, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0217 A[Catch: all -> 0x0101, TryCatch #1 {all -> 0x0101, blocks: (B:31:0x009e, B:33:0x00bb, B:35:0x00c3, B:37:0x00d0, B:39:0x00ea, B:43:0x011a, B:46:0x0125, B:48:0x012d, B:50:0x0133, B:54:0x013c, B:63:0x0174, B:57:0x0150, B:62:0x015f, B:65:0x0179, B:42:0x0104, B:66:0x018d, B:73:0x01ac, B:76:0x01b4, B:80:0x01d6, B:82:0x01ec, B:86:0x020d, B:88:0x0222, B:91:0x0236, B:93:0x023c, B:94:0x0249, B:96:0x024c, B:99:0x0255, B:98:0x0252, B:87:0x0217, B:83:0x01fe, B:79:0x01c2, B:70:0x019b, B:71:0x01a0), top: B:135:0x009e, inners: #3, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0234 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0252 A[Catch: all -> 0x0101, TryCatch #1 {all -> 0x0101, blocks: (B:31:0x009e, B:33:0x00bb, B:35:0x00c3, B:37:0x00d0, B:39:0x00ea, B:43:0x011a, B:46:0x0125, B:48:0x012d, B:50:0x0133, B:54:0x013c, B:63:0x0174, B:57:0x0150, B:62:0x015f, B:65:0x0179, B:42:0x0104, B:66:0x018d, B:73:0x01ac, B:76:0x01b4, B:80:0x01d6, B:82:0x01ec, B:86:0x020d, B:88:0x0222, B:91:0x0236, B:93:0x023c, B:94:0x0249, B:96:0x024c, B:99:0x0255, B:98:0x0252, B:87:0x0217, B:83:0x01fe, B:79:0x01c2, B:70:0x019b, B:71:0x01a0), top: B:135:0x009e, inners: #3, #6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.ads.zzfnb b() {
        /*
            Method dump skipped, instruction units count: 770
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pg2.b():com.google.android.gms.internal.ads.zzfnb");
    }

    public final zzfnb c(ListenableFuture listenableFuture) {
        fq0 fq0VarF = this.c.a(listenableFuture, zzfno.RENDERER).d(new ca2(this, 5)).f(this.e);
        if (!((Boolean) zzbd.zzc().a(p32.B6)).booleanValue()) {
            fq0VarF = fq0VarF.j(((Integer) zzbd.zzc().a(p32.C6)).intValue());
        }
        return fq0VarF.k();
    }
}
