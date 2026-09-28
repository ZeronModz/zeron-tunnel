package defpackage;

import android.view.View;
import com.google.android.gms.internal.ads.zzcue;
import com.google.android.gms.internal.ads.zzfis;
import com.google.android.gms.internal.ads.zzikg;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class wf2 implements zzikg {
    public final /* synthetic */ int a;
    public final zzcue b;

    public /* synthetic */ wf2(zzcue zzcueVar, int i) {
        this.a = i;
        this.b = zzcueVar;
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final Object zzb() {
        int i = this.a;
        zzcue zzcueVar = this.b;
        switch (i) {
            case 0:
                View view = zzcueVar.b;
                k02.J(view);
                return view;
            case 1:
                zzfis zzfisVar = zzcueVar.c;
                k02.J(zzfisVar);
                return zzfisVar;
            case 2:
                return zzcueVar.a;
            default:
                return zzcueVar.d;
        }
    }
}
