package defpackage;

import androidx.activity.result.ActivityResultLauncher;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class g90 extends ActivityResultLauncher {
    public final /* synthetic */ AtomicReference a;

    public g90(AtomicReference atomicReference) {
        this.a = atomicReference;
    }

    @Override // androidx.activity.result.ActivityResultLauncher
    public final void a(Object obj) {
        ActivityResultLauncher activityResultLauncher = (ActivityResultLauncher) this.a.get();
        if (activityResultLauncher != null) {
            activityResultLauncher.a(obj);
        } else {
            u7.p("Operation cannot be started before fragment is in created state");
        }
    }
}
