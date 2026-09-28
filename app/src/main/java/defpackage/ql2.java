package defpackage;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.zzbtt;
import com.google.android.gms.internal.ads.zzbvs;
import com.google.android.gms.internal.ads.zzdvl;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ql2 {
    public final gu2 a;
    public final ol2 b;

    public ql2(gu2 gu2Var, ol2 ol2Var) {
        this.a = gu2Var;
        this.b = ol2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0048 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v13, types: [com.google.android.gms.internal.ads.zzbtt] */
    /* JADX WARN: Type inference failed for: r5v14, types: [com.google.android.gms.internal.ads.zzbtw] */
    /* JADX WARN: Type inference failed for: r5v15, types: [com.google.android.gms.internal.ads.zzbuu] */
    /* JADX WARN: Type inference failed for: r5v16, types: [com.google.android.gms.internal.ads.zzbtw] */
    /* JADX WARN: Type inference failed for: r5v17, types: [com.google.android.gms.internal.ads.zzbuu] */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v5, types: [com.google.android.gms.internal.ads.zzbtt] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.ads.zzfki a(java.lang.String r6, org.json.JSONObject r7) {
        /*
            r5 = this;
            ol2 r0 = r5.b
            java.lang.String r1 = "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter"
            com.google.android.gms.internal.ads.zzfki r2 = new com.google.android.gms.internal.ads.zzfki     // Catch: java.lang.Throwable -> L19
            java.lang.String r3 = "com.google.ads.mediation.admob.AdMobAdapter"
            boolean r3 = r3.equals(r6)     // Catch: java.lang.Throwable -> L19
            if (r3 == 0) goto L1b
            com.google.android.gms.internal.ads.zzbuu r5 = new com.google.android.gms.internal.ads.zzbuu     // Catch: java.lang.Throwable -> L19
            com.google.ads.mediation.admob.AdMobAdapter r7 = new com.google.ads.mediation.admob.AdMobAdapter     // Catch: java.lang.Throwable -> L19
            r7.<init>()     // Catch: java.lang.Throwable -> L19
            r5.<init>(r7)     // Catch: java.lang.Throwable -> L19
            goto L74
        L19:
            r5 = move-exception
            goto L86
        L1b:
            java.lang.String r3 = "com.google.ads.mediation.admob.AdMobCustomTabsAdapter"
            boolean r3 = r3.equals(r6)     // Catch: java.lang.Throwable -> L19
            if (r3 == 0) goto L2e
            com.google.android.gms.internal.ads.zzbuu r5 = new com.google.android.gms.internal.ads.zzbuu     // Catch: java.lang.Throwable -> L19
            com.google.android.gms.internal.ads.zzbwl r7 = new com.google.android.gms.internal.ads.zzbwl     // Catch: java.lang.Throwable -> L19
            r7.<init>()     // Catch: java.lang.Throwable -> L19
            r5.<init>(r7)     // Catch: java.lang.Throwable -> L19
            goto L74
        L2e:
            gu2 r5 = r5.a     // Catch: java.lang.Throwable -> L19
            java.util.concurrent.atomic.AtomicReference r5 = r5.c     // Catch: java.lang.Throwable -> L19
            java.lang.Object r5 = r5.get()     // Catch: java.lang.Throwable -> L19
            com.google.android.gms.internal.ads.zzbtt r5 = (com.google.android.gms.internal.ads.zzbtt) r5     // Catch: java.lang.Throwable -> L19
            if (r5 == 0) goto L7b
            boolean r3 = r1.equals(r6)     // Catch: java.lang.Throwable -> L19
            java.lang.String r4 = "com.google.ads.mediation.customevent.CustomEventAdapter"
            if (r3 != 0) goto L48
            boolean r3 = r4.equals(r6)     // Catch: java.lang.Throwable -> L19
            if (r3 == 0) goto L70
        L48:
            java.lang.String r3 = "class_name"
            java.lang.String r7 = r7.getString(r3)     // Catch: java.lang.Throwable -> L19 org.json.JSONException -> L59
            boolean r3 = r5.zzc(r7)     // Catch: java.lang.Throwable -> L19 org.json.JSONException -> L59
            if (r3 == 0) goto L5b
            com.google.android.gms.internal.ads.zzbtw r5 = r5.zzb(r1)     // Catch: java.lang.Throwable -> L19 org.json.JSONException -> L59
            goto L74
        L59:
            r7 = move-exception
            goto L6b
        L5b:
            boolean r1 = r5.zzd(r7)     // Catch: java.lang.Throwable -> L19 org.json.JSONException -> L59
            if (r1 == 0) goto L66
            com.google.android.gms.internal.ads.zzbtw r5 = r5.zzb(r7)     // Catch: java.lang.Throwable -> L19 org.json.JSONException -> L59
            goto L74
        L66:
            com.google.android.gms.internal.ads.zzbtw r5 = r5.zzb(r4)     // Catch: java.lang.Throwable -> L19 org.json.JSONException -> L59
            goto L74
        L6b:
            java.lang.String r1 = "Invalid custom event."
            com.google.android.gms.ads.internal.util.client.zzo.zzg(r1, r7)     // Catch: java.lang.Throwable -> L19
        L70:
            com.google.android.gms.internal.ads.zzbtw r5 = r5.zzb(r6)     // Catch: java.lang.Throwable -> L19
        L74:
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L19
            r0.a(r6, r2)
            return r2
        L7b:
            java.lang.String r5 = "Unexpected call to adapter creator."
            com.google.android.gms.ads.internal.util.client.zzo.zzi(r5)     // Catch: java.lang.Throwable -> L19
            android.os.RemoteException r5 = new android.os.RemoteException     // Catch: java.lang.Throwable -> L19
            r5.<init>()     // Catch: java.lang.Throwable -> L19
            throw r5     // Catch: java.lang.Throwable -> L19
        L86:
            l32 r7 = defpackage.p32.Na
            com.google.android.gms.internal.ads.zzbhc r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r7 = r1.a(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L9c
            r7 = 0
            r0.a(r6, r7)
        L9c:
            com.google.android.gms.internal.ads.zzfjr r6 = new com.google.android.gms.internal.ads.zzfjr
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ql2.a(java.lang.String, org.json.JSONObject):com.google.android.gms.internal.ads.zzfki");
    }

    public final zzbvs b(String str) throws RemoteException {
        zzbtt zzbttVar = (zzbtt) this.a.c.get();
        if (zzbttVar == null) {
            zzo.zzi("Unexpected call to adapter creator.");
            fj3.b();
            return null;
        }
        zzbvs zzbvsVarZze = zzbttVar.zze(str);
        ol2 ol2Var = this.b;
        synchronized (ol2Var) {
            if (ol2Var.a.containsKey(str)) {
                return zzbvsVarZze;
            }
            try {
                ol2Var.a.put(str, new zzdvl(str, zzbvsVarZze.zzf(), zzbvsVarZze.zzg(), true));
                return zzbvsVarZze;
            } catch (Throwable unused) {
                return zzbvsVarZze;
            }
        }
    }
}
