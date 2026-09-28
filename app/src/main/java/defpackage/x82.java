package defpackage;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzfa;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.zzbyj;
import com.google.android.gms.internal.ads.zzccz;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class x82 extends zzccz {
    public final /* synthetic */ QueryInfoGenerationCallback a;

    public x82(zzbyj zzbyjVar, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        this.a = queryInfoGenerationCallback;
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final void zzb(String str) {
        this.a.onFailure(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final void zzc(String str, String str2, Bundle bundle) {
        this.a.onSuccess(new QueryInfo(new zzfa(str, bundle, str2)));
    }
}
