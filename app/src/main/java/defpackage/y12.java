package defpackage;

import android.os.Bundle;
import android.util.JsonReader;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.nonagon.signalgeneration.zzbj;
import com.google.android.gms.internal.ads.z;
import com.google.android.gms.internal.ads.zzbzu;
import com.google.android.gms.internal.ads.zzefg;
import com.google.android.gms.internal.ads.zzgyw;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y12 implements zzgyw {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzbzu b;

    public /* synthetic */ y12(zzbzu zzbzuVar, int i) {
        this.a = i;
        this.b = zzbzuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgyw
    public final ListenableFuture zza(Object obj) {
        int i = this.a;
        zzbzu zzbzuVar = this.b;
        switch (i) {
            case 0:
                zzefg zzefgVar = (zzefg) obj;
                zzbj zzbjVar = new zzbj(new JsonReader(new InputStreamReader(zzefgVar.a)), zzefgVar.b);
                try {
                    zzbjVar.zzb = zzbb.zza().zzm(zzbzuVar.a).toString();
                    break;
                } catch (JSONException unused) {
                    zzbjVar.zzb = "{}";
                }
                Bundle bundle = zzbzuVar.n;
                if (!bundle.isEmpty()) {
                    try {
                        zzbjVar.zzc = zzbb.zza().zzm(bundle).toString();
                        break;
                    } catch (JSONException unused2) {
                    }
                }
                return z.j(zzbjVar);
            case 1:
                return z.j(new zzefg((InputStream) obj, zzbzuVar));
            case 2:
                return z.j(new zzefg((InputStream) obj, zzbzuVar));
            default:
                zzbzuVar.j = new String(p23.a((InputStream) obj), StandardCharsets.UTF_8);
                return z.j(zzbzuVar);
        }
    }
}
