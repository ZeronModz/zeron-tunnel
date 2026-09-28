package defpackage;

import android.content.Context;
import com.google.android.gms.internal.ads.zzfvh;
import com.google.android.gms.internal.ads.zzgdh;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class nz2 extends zzfvh {
    public final zzgdh f;

    public nz2(Context context, ExecutorService executorService, zzgdh zzgdhVar) {
        super(context, executorService, new TaskCompletionSource().a, false);
        this.f = zzgdhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfvh
    public final void b(int i, long j) {
        this.f.zzb(i, j, null, null);
        new TaskCompletionSource().b(Boolean.TRUE);
    }

    @Override // com.google.android.gms.internal.ads.zzfvh
    public final void c(int i, long j, Exception exc) {
        this.f.zzb(i, j, exc, null);
        new TaskCompletionSource().b(Boolean.TRUE);
    }

    @Override // com.google.android.gms.internal.ads.zzfvh
    public final void d(int i, String str) {
        this.f.zzb(i, -1L, null, str);
        new TaskCompletionSource().b(Boolean.TRUE);
    }
}
