package defpackage;

import com.google.android.gms.internal.ads.zzdx;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qv1 implements Executor {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzdx b;

    public /* synthetic */ qv1(zzdx zzdxVar, int i) {
        this.a = i;
        this.b = zzdxVar;
    }

    @Override // java.util.concurrent.Executor
    public final /* synthetic */ void execute(Runnable runnable) {
        int i = this.a;
        zzdx zzdxVar = this.b;
        switch (i) {
            case 0:
                zzdxVar.zzn(runnable);
                break;
            default:
                zzdxVar.zzn(runnable);
                break;
        }
    }
}
