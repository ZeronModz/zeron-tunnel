package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.gms.internal.ads.zzgnb;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class n03 implements zzgnb {
    public final ArrayList a = new ArrayList();

    @Override // com.google.android.gms.internal.ads.zzgnb
    public final synchronized void zzc(Map map, Context context, View view) {
        ArrayList arrayList = this.a;
        map.put("vst", new ArrayList(arrayList));
        arrayList.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzgnb
    public final void zzb(Map map) {
    }

    @Override // com.google.android.gms.internal.ads.zzgnb
    public final void zzd(Map map) {
    }
}
