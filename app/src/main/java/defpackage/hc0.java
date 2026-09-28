package defpackage;

import android.util.Base64;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.nonagon.signalgeneration.zzaa;
import com.google.android.gms.internal.ads.zzdzf;
import com.google.android.gms.internal.ads.zzesz;
import com.google.android.gms.internal.ads.zzezg;
import com.google.android.gms.internal.ads.zzhbp;
import com.google.android.gms.internal.ads.zzhkg;
import com.google.android.gms.internal.ads.zzhlm;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class hc0 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hc0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    private final Object a() {
        List listAsList;
        byte[] byteArray;
        i73 i73Var;
        zzhbp zzhbpVarV;
        g43 g43VarE;
        ByteArrayOutputStream byteArrayOutputStream;
        hr2 hr2Var = (hr2) this.b;
        String strEncodeToString = null;
        if (((Boolean) zzbd.zzc().a(p32.W7)).booleanValue()) {
            cu2 cu2Var = hr2Var.b;
            if (hr2Var.c != 2) {
                String strZzc = zzaa.zzc(cu2Var.d);
                if (((Boolean) zzbd.zzc().a(p32.Y7)).booleanValue()) {
                    listAsList = Arrays.asList(((String) zzbd.zzc().a(p32.Z7)).split(","));
                } else {
                    listAsList = Arrays.asList(((String) zzbd.zzc().a(p32.X7)).split(","));
                }
                if (listAsList.contains(zzaa.zzb(strZzc))) {
                    try {
                        i73Var = i73.b;
                    } catch (GeneralSecurityException e) {
                        zze.zza("Failed to generate key".concat(e.toString()));
                        zzt.zzh().f("CryptoUtils.generateKey", e);
                        byteArray = new byte[0];
                    }
                    try {
                        try {
                            synchronized (i73Var) {
                                HashMap map = i73Var.a;
                                if (!map.containsKey("AES128_GCM")) {
                                    throw new GeneralSecurityException("Name AES128_GCM does not exist");
                                }
                                zzhbpVarV = (zzhbp) map.get("AES128_GCM");
                                strEncodeToString = Base64.encodeToString(byteArray, 11);
                            }
                            g43VarE.b().zzaO(byteArrayOutputStream);
                            byteArrayOutputStream.close();
                            byteArray = byteArrayOutputStream.toByteArray();
                            strEncodeToString = Base64.encodeToString(byteArray, 11);
                        } catch (Throwable th) {
                            byteArrayOutputStream.close();
                            throw th;
                        }
                        byteArrayOutputStream = new ByteArrayOutputStream();
                    } catch (IOException unused) {
                        throw new GeneralSecurityException("Serialize keyset failed");
                    }
                    if (zzhbpVarV == null) {
                        try {
                            zzhbpVarV = yg0.V(((t73) zzhkg.b.h(null)).b.a());
                        } catch (GeneralSecurityException e2) {
                            throw new zzhlm("Parsing parameters failed in getProto(). You probably want to call some Tink register function for ".concat("null"), e2);
                        }
                    }
                    g43VarE = g43.e(zzhbpVarV);
                }
            }
        }
        return new zzesz(strEncodeToString);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object b() {
        /*
            r11 = this;
            java.lang.Object r11 = r11.b
            pr2 r11 = (defpackage.pr2) r11
            java.lang.Object r11 = r11.c
            gn2 r11 = (defpackage.gn2) r11
            com.google.android.gms.internal.ads.zzeyn r0 = new com.google.android.gms.internal.ads.zzeyn
            monitor-enter(r11)
            l32 r1 = defpackage.p32.qa     // Catch: java.lang.Throwable -> L44
            com.google.android.gms.internal.ads.zzbhc r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch: java.lang.Throwable -> L44
            java.lang.Object r1 = r2.a(r1)     // Catch: java.lang.Throwable -> L44
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L44
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L44
            if (r1 == 0) goto L54
            boolean r1 = r11.g()     // Catch: java.lang.Throwable -> L44
            if (r1 != 0) goto L24
            goto L54
        L24:
            long r1 = r11.q     // Catch: java.lang.Throwable -> L44
            com.google.android.gms.common.util.Clock r3 = com.google.android.gms.ads.internal.zzt.zzk()     // Catch: java.lang.Throwable -> L44
            long r3 = r3.currentTimeMillis()     // Catch: java.lang.Throwable -> L44
            r5 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 / r5
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L46
            java.lang.String r1 = "{}"
            r11.o = r1     // Catch: java.lang.Throwable -> L44
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r11.q = r1     // Catch: java.lang.Throwable -> L44
            java.lang.String r1 = ""
            monitor-exit(r11)
            goto L57
        L44:
            r0 = move-exception
            goto L87
        L46:
            java.lang.String r1 = r11.o     // Catch: java.lang.Throwable -> L44
            java.lang.String r2 = "{}"
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L44
            if (r1 != 0) goto L54
            java.lang.String r1 = r11.o     // Catch: java.lang.Throwable -> L44
            monitor-exit(r11)
            goto L57
        L54:
            java.lang.String r1 = ""
            monitor-exit(r11)
        L57:
            boolean r2 = r11.c()
            com.google.android.gms.ads.internal.util.zzax r3 = com.google.android.gms.ads.internal.zzt.zzo()
            boolean r3 = r3.zzk()
            org.json.JSONObject r4 = r11.p
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L6b
            r4 = r6
            goto L6c
        L6b:
            r4 = r5
        L6c:
            long r7 = r11.w
            l32 r11 = defpackage.p32.La
            com.google.android.gms.internal.ads.zzbhc r9 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r11 = r9.a(r11)
            java.lang.Long r11 = (java.lang.Long) r11
            long r9 = r11.longValue()
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 >= 0) goto L83
            r5 = r6
        L83:
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        L87:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L44
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hc0.b():java.lang.Object");
    }

    private final Object c() {
        HashMap map;
        jm2 jm2Var = (jm2) ((pr2) this.b).c;
        synchronized (jm2Var) {
            map = new HashMap();
            if (((Boolean) zzbd.zzc().a(p32.P8)).booleanValue()) {
                jm2Var.b();
                for (Map.Entry entry : jm2Var.a.entrySet()) {
                    map.put((zzdzf) entry.getKey(), new ArrayDeque((Collection) entry.getValue()));
                }
            }
        }
        return new zzezg(map);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006c A[Catch: IOException -> 0x0041, TryCatch #1 {IOException -> 0x0041, blocks: (B:3:0x0004, B:5:0x0029, B:7:0x003b, B:12:0x0046, B:17:0x006c, B:18:0x0090, B:20:0x00a3, B:22:0x00b9, B:24:0x00c2, B:29:0x00e8, B:31:0x0106, B:34:0x012e, B:42:0x0148, B:40:0x0144, B:27:0x00d6, B:15:0x005a, B:35:0x012f, B:36:0x013d), top: B:48:0x0004, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e8 A[Catch: IOException -> 0x0041, TryCatch #1 {IOException -> 0x0041, blocks: (B:3:0x0004, B:5:0x0029, B:7:0x003b, B:12:0x0046, B:17:0x006c, B:18:0x0090, B:20:0x00a3, B:22:0x00b9, B:24:0x00c2, B:29:0x00e8, B:31:0x0106, B:34:0x012e, B:42:0x0148, B:40:0x0144, B:27:0x00d6, B:15:0x005a, B:35:0x012f, B:36:0x013d), top: B:48:0x0004, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object d() {
        /*
            Method dump skipped, instruction units count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hc0.d():java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:131:0x030e  */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object call() {
        /*
            Method dump skipped, instruction units count: 1662
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hc0.call():java.lang.Object");
    }
}
