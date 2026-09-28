package defpackage;

import android.net.Uri;
import com.google.android.gms.ads.nonagon.signalgeneration.zzau;
import com.google.android.gms.internal.ads.zzgyw;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kx1 implements zzgyw {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzau b;

    public /* synthetic */ kx1(zzau zzauVar, int i) {
        this.a = i;
        this.b = zzauVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgyw
    public final /* synthetic */ ListenableFuture zza(Object obj) {
        int i = this.a;
        zzau zzauVar = this.b;
        switch (i) {
            case 0:
                return zzauVar.zzp((ArrayList) obj);
            default:
                return zzauVar.zzr((Uri) obj);
        }
    }
}
