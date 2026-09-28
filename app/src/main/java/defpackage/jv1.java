package defpackage;

import com.google.android.gms.internal.ads.zzabl;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class jv1 implements zzabl {
    public final /* synthetic */ Executor a;

    public jv1(ExecutorService executorService) {
        this.a = executorService;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.execute(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final void zza() {
        ((ExecutorService) this.a).shutdown();
    }
}
