package defpackage;

import com.google.android.gms.internal.ads.zzbox;
import com.google.android.gms.internal.ads.zzboy;
import com.google.android.gms.internal.ads.zzbso;
import com.google.android.gms.internal.ads.zzcen;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class j62 implements zzbox {
    public final /* synthetic */ zzcen a;

    public j62(zzboy zzboyVar, zzcen zzcenVar) {
        this.a = zzcenVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbox
    public final void zza(JSONObject jSONObject) {
        this.a.a(jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbox
    public final void zzb(String str) {
        this.a.b(new zzbso(str));
    }
}
