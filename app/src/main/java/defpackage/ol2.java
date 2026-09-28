package defpackage;

import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.internal.ads.zzdvl;
import com.google.android.gms.internal.ads.zzfjr;
import com.google.android.gms.internal.ads.zzfki;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ol2 {
    public final HashMap a = new HashMap();

    public final synchronized void a(String str, zzfki zzfkiVar) {
        zzfjr zzfjrVar;
        g82 g82VarZzH;
        if (this.a.containsKey(str)) {
            return;
        }
        g82 g82VarZzI = null;
        if (zzfkiVar == null) {
            g82VarZzH = null;
        } else {
            try {
                g82VarZzH = zzfkiVar.a.zzH();
            } finally {
                try {
                } catch (zzfjr unused) {
                }
            }
        }
        if (zzfkiVar != null) {
            try {
                g82VarZzI = zzfkiVar.a.zzI();
            } finally {
                try {
                } catch (zzfjr unused2) {
                }
            }
        }
        boolean z = true;
        if (((Boolean) zzbd.zzc().a(p32.Na)).booleanValue()) {
            if (zzfkiVar == null) {
                z = false;
            } else {
                try {
                    zzfkiVar.a();
                } catch (zzfjr unused3) {
                    z = false;
                }
            }
        }
        this.a.put(str, new zzdvl(str, g82VarZzH, g82VarZzI, z));
    }

    public final synchronized zzdvl b(String str) {
        return (zzdvl) this.a.get(str);
    }
}
