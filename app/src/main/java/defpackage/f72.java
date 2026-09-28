package defpackage;

import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.internal.ads.zzbsf;
import com.google.android.gms.internal.ads.zzbsk;
import com.google.android.gms.internal.ads.zzcep;
import com.google.android.gms.internal.ads.zzcer;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class f72 implements zzcer, zzcep {
    public final /* synthetic */ zzbsf a;

    public f72(zzbsf zzbsfVar) {
        Objects.requireNonNull(zzbsfVar);
        this.a = zzbsfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcep
    /* JADX INFO: renamed from: zza */
    public void mo21zza() {
        zze.zza("Rejecting reference for JS Engine.");
        boolean zBooleanValue = ((Boolean) zzbd.zzc().a(p32.K8)).booleanValue();
        zzbsf zzbsfVar = this.a;
        if (zBooleanValue) {
            zzbsfVar.c(new IllegalStateException("Unable to create JS engine reference."), "SdkJavascriptFactory.createNewReference.FailureCallback");
        } else {
            zzbsfVar.b();
        }
    }

    public f72(zzbsk zzbskVar, zzbsf zzbsfVar) {
        this.a = zzbsfVar;
        Objects.requireNonNull(zzbskVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcer, com.google.android.gms.internal.ads.zzdhc
    /* JADX INFO: renamed from: zza */
    public /* synthetic */ void mo3zza(Object obj) {
        zze.zza("Releasing engine reference.");
        this.a.d.e();
    }
}
