package defpackage;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzaz;
import com.google.android.gms.ads.internal.client.zzcr;
import com.google.android.gms.ads.internal.client.zzfk;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class fy1 extends p02 {
    public final /* synthetic */ Context b;
    public final /* synthetic */ zzr c;
    public final /* synthetic */ String d;
    public final /* synthetic */ zzaz e;

    public fy1(zzaz zzazVar, Context context, zzr zzrVar, String str) {
        this.b = context;
        this.c = zzrVar;
        this.d = str;
        Objects.requireNonNull(zzazVar);
        this.e = zzazVar;
    }

    @Override // defpackage.p02
    public final /* bridge */ /* synthetic */ Object a() {
        zzaz.zzm(this.b, "search");
        return new zzfk();
    }

    @Override // defpackage.p02
    public final /* bridge */ /* synthetic */ Object b() {
        return this.e.zzn().zza(this.b, this.c, this.d, null, 3);
    }

    @Override // defpackage.p02
    public final Object c(zzcr zzcrVar) {
        return zzcrVar.zzj(new a(this.b), this.c, this.d, ModuleDescriptor.MODULE_VERSION);
    }
}
