package defpackage;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.f7;
import com.google.android.gms.tasks.Task;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class qx2 extends f7 {
    public Task h;

    @Override // com.google.android.gms.internal.ads.f7
    public final void e() {
        this.h = null;
    }

    @Override // com.google.android.gms.internal.ads.f7
    public final String f() {
        Task task = this.h;
        return task == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : task.toString();
    }
}
