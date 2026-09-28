package defpackage;

import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.arch.core.util.Function;
import androidx.fragment.app.Fragment;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class l90 extends n90 {
    public final /* synthetic */ Function a;
    public final /* synthetic */ AtomicReference b;
    public final /* synthetic */ ActivityResultContract c;
    public final /* synthetic */ ActivityResultCallback d;
    public final /* synthetic */ Fragment e;

    public l90(Fragment fragment, Function function, AtomicReference atomicReference, ActivityResultContract activityResultContract, ActivityResultCallback activityResultCallback) {
        this.e = fragment;
        this.a = function;
        this.b = atomicReference;
        this.c = activityResultContract;
        this.d = activityResultCallback;
    }

    @Override // defpackage.n90
    public final void a() {
        StringBuilder sb = new StringBuilder("fragment_");
        Fragment fragment = this.e;
        sb.append(fragment.f);
        sb.append("_rq#");
        sb.append(fragment.U.getAndIncrement());
        this.b.set(((ActivityResultRegistry) this.a.apply(null)).e(sb.toString(), fragment, this.c, this.d));
    }
}
