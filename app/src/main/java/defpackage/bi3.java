package defpackage;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.appupdate.internal.zzg;
import com.google.android.play.core.appupdate.internal.zzm;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class bi3 extends zzg {
    public final zzm b;
    public final TaskCompletionSource c;
    public final /* synthetic */ xj3 d;

    public bi3(xj3 xj3Var, zzm zzmVar, TaskCompletionSource taskCompletionSource) {
        this.d = xj3Var;
        this.b = zzmVar;
        this.c = taskCompletionSource;
    }

    @Override // com.google.android.play.core.appupdate.internal.zzh
    public void zzb(Bundle bundle) {
        this.d.a.c(this.c);
        this.b.c("onCompleteUpdate", new Object[0]);
    }

    @Override // com.google.android.play.core.appupdate.internal.zzh
    public void zzc(Bundle bundle) {
        this.d.a.c(this.c);
        this.b.c("onRequestInfo", new Object[0]);
    }
}
