package defpackage;

import android.os.StrictMode;
import com.google.firebase.components.Lazy;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.inject.Provider;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wp implements Provider {
    public final /* synthetic */ int a;

    @Override // com.google.firebase.inject.Provider
    public final Object get() {
        switch (this.a) {
            case 0:
                return Collections.EMPTY_SET;
            case 1:
                return ExecutorsRegistrar.a();
            case 2:
                Lazy lazy = ExecutorsRegistrar.a;
                return new hw(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new qt("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            case 3:
                Lazy lazy2 = ExecutorsRegistrar.a;
                return new hw(Executors.newCachedThreadPool(new qt("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            case 4:
                Lazy lazy3 = ExecutorsRegistrar.a;
                return Executors.newSingleThreadScheduledExecutor(new qt("Firebase Scheduler", 0, null));
            case 5:
            default:
                return null;
        }
    }
}
