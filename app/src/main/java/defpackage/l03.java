package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.gms.internal.ads.f6;
import com.google.android.gms.internal.ads.k5;
import com.google.android.gms.internal.ads.zzgdd;
import com.google.android.gms.internal.ads.zzgnb;
import com.google.android.gms.internal.ads.zzgzy;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class l03 implements zzgnb, zzgdd {
    public final Context a;
    public final f6 b;
    public final zzgzy c;
    public final k5 d;
    public final AtomicBoolean e = new AtomicBoolean(false);
    public ListenableFuture f = u33.b;

    public l03(Context context, k5 k5Var, f6 f6Var, zzgzy zzgzyVar) {
        this.a = context;
        this.b = f6Var;
        this.c = zzgzyVar;
        this.d = k5Var;
    }

    @Override // com.google.android.gms.internal.ads.zzgdd
    public final ListenableFuture zza() {
        if (this.e.getAndSet(true) || !this.d.A()) {
            return u33.b;
        }
        return this.c.zza(new pt2(this, 14));
    }

    @Override // com.google.android.gms.internal.ads.zzgnb
    public final void zzb(Map map) {
        map.put("gs", this.f);
    }

    @Override // com.google.android.gms.internal.ads.zzgnb
    public final void zzc(Map map, Context context, View view) {
        map.put("gs", this.f);
    }

    @Override // com.google.android.gms.internal.ads.zzgnb
    public final void zzd(Map map) {
        map.put("gs", this.f);
    }
}
