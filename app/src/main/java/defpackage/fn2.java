package defpackage;

import com.google.android.gms.ads.AdInspectorError;
import com.google.android.gms.ads.OnAdInspectorClosedListener;
import com.google.android.gms.ads.internal.client.zzdm;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzex;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class fn2 extends zzdm {
    public final /* synthetic */ int a;

    public /* synthetic */ fn2(int i) {
        this.a = i;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final void zze(zze zzeVar) {
        switch (this.a) {
            case 0:
            case 1:
                break;
            default:
                OnAdInspectorClosedListener onAdInspectorClosedListenerZzA = zzex.zzb().zzA();
                if (onAdInspectorClosedListenerZzA != null) {
                    onAdInspectorClosedListenerZzA.onAdInspectorClosed(zzeVar == null ? null : new AdInspectorError(zzeVar.zza, zzeVar.zzb, zzeVar.zzc));
                }
                break;
        }
    }

    private final void a(zze zzeVar) {
    }

    private final void b(zze zzeVar) {
    }
}
