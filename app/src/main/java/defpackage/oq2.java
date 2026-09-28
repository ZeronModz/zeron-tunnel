package defpackage;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.zzbvs;
import com.google.android.gms.internal.ads.zzeki;
import com.google.android.gms.internal.ads.zzekj;
import com.google.android.gms.internal.ads.zzelv;
import com.google.android.gms.internal.ads.zzeqf;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class oq2 implements zzeki {
    public final zzeqf a;
    public final ql2 b;

    public oq2(zzeqf zzeqfVar, ql2 ql2Var) {
        this.a = zzeqfVar;
        this.b = ql2Var;
    }

    @Override // com.google.android.gms.internal.ads.zzeki
    public final zzekj zza(String str, JSONObject jSONObject) {
        zzbvs zzbvsVarB;
        if (((Boolean) zzbd.zzc().a(p32.k2)).booleanValue()) {
            try {
                zzbvsVarB = this.b.b(str);
            } catch (RemoteException e) {
                zzo.zzg("Coundn't create RTB adapter: ", e);
            }
        } else {
            ConcurrentHashMap concurrentHashMap = this.a.a;
            zzbvsVarB = concurrentHashMap.containsKey(str) ? (zzbvs) concurrentHashMap.get(str) : null;
        }
        if (zzbvsVarB == null) {
            return null;
        }
        return new zzekj(zzbvsVarB, new zzelv(), str);
    }
}
