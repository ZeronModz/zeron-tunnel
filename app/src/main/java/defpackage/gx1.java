package defpackage;

import com.google.android.gms.internal.consent_sdk.zzaw;
import com.google.android.gms.internal.consent_sdk.zzax;
import com.google.android.gms.internal.consent_sdk.zzbq;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class gx1 implements zzaw {
    public final yw1 a;
    public zzbq b;

    public /* synthetic */ gx1(yw1 yw1Var) {
        this.a = yw1Var;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzaw
    public final /* bridge */ /* synthetic */ zzaw zza(zzbq zzbqVar) {
        this.b = zzbqVar;
        return this;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzaw
    public final zzax zzb() {
        zzbq zzbqVar = this.b;
        if (zzbqVar != null) {
            return new jx2(this.a, zzbqVar);
        }
        u7.p(String.valueOf(zzbq.class.getCanonicalName()).concat(" must be set"));
        return null;
    }
}
