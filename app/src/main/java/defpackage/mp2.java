package defpackage;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.internal.ads.zzdbs;
import com.google.android.gms.internal.ads.zzdmb;
import com.google.android.gms.internal.ads.zzdmc;
import com.google.android.gms.internal.ads.zzekj;
import com.google.android.gms.internal.ads.zzekm;
import com.google.android.gms.internal.ads.zzfjr;
import com.google.android.gms.internal.ads.zzfki;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class mp2 implements zzdmc {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzekj b;
    public final /* synthetic */ tt2 c;

    public /* synthetic */ mp2(zzekm zzekmVar, zzekj zzekjVar, tt2 tt2Var, int i) {
        this.a = i;
        this.b = zzekjVar;
        this.c = tt2Var;
    }

    @Override // com.google.android.gms.internal.ads.zzdmc
    public final void zza(boolean z, Context context, zzdbs zzdbsVar) throws zzdmb {
        zzfjr zzfjrVar;
        int i = this.a;
        zzekj zzekjVar = this.b;
        switch (i) {
            case 0:
                try {
                    zzfki zzfkiVar = (zzfki) zzekjVar.b;
                    zzfkiVar.b(z);
                    try {
                        zzfkiVar.a.zzN(new a(context));
                        return;
                    } finally {
                    }
                } catch (zzfjr e) {
                    throw new zzdmb(e.getCause());
                }
            case 1:
                try {
                    zzfki zzfkiVar2 = (zzfki) zzekjVar.b;
                    zzfkiVar2.b(z);
                    try {
                        zzfkiVar2.a.zzE(new a(context));
                        return;
                    } finally {
                    }
                } catch (zzfjr e2) {
                    throw new zzdmb(e2.getCause());
                }
            default:
                try {
                    zzfki zzfkiVar3 = (zzfki) zzekjVar.b;
                    zzfkiVar3.b(z);
                    try {
                        zzfkiVar3.a.zzp();
                        return;
                    } finally {
                    }
                } catch (zzfjr e3) {
                    zzo.zzj("Cannot show rewarded video.", e3);
                    throw new zzdmb(e3.getCause());
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdmc
    /* JADX INFO: renamed from: zzb */
    public final tt2 mo79zzb() {
        switch (this.a) {
        }
        return this.c;
    }
}
