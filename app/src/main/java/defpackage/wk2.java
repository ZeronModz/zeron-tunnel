package defpackage;

import com.google.android.gms.internal.ads.zzboh;
import com.google.android.gms.internal.ads.zzcjl;
import com.google.android.gms.internal.ads.zzgzl;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class wk2 implements zzgzl {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ zzboh c;

    public wk2(yk2 yk2Var, String str, zzboh zzbohVar, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = str;
                this.c = zzbohVar;
                Objects.requireNonNull(yk2Var);
                break;
            default:
                this.b = str;
                this.c = zzbohVar;
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th) {
        int i = this.a;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    /* JADX INFO: renamed from: zzb */
    public final /* bridge */ /* synthetic */ void mo5zzb(Object obj) {
        int i = this.a;
        zzboh zzbohVar = this.c;
        String str = this.b;
        switch (i) {
            case 0:
                ((zzcjl) obj).zzab(str, zzbohVar);
                break;
            default:
                ((zzcjl) obj).zzac(str, zzbohVar);
                break;
        }
    }

    private final void a(Throwable th) {
    }

    private final void b(Throwable th) {
    }
}
