package defpackage;

import android.os.Bundle;
import com.google.firebase.crashlytics.internal.common.e;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class fs implements Callable {
    public final /* synthetic */ long a;
    public final /* synthetic */ e b;

    public fs(e eVar, long j) {
        this.b = eVar;
        this.a = j;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bundle bundle = new Bundle();
        bundle.putInt("fatal", 1);
        bundle.putLong("timestamp", this.a);
        this.b.k.logEvent("_ae", bundle);
        return null;
    }
}
