package defpackage;

import androidx.concurrent.futures.b;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class il0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AtomicBoolean b;
    public final /* synthetic */ b c;
    public final /* synthetic */ Function0 d;

    public /* synthetic */ il0(AtomicBoolean atomicBoolean, b bVar, Function0 function0, int i) {
        this.a = i;
        this.b = atomicBoolean;
        this.c = bVar;
        this.d = function0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Function0 function0 = this.d;
        b bVar = this.c;
        AtomicBoolean atomicBoolean = this.b;
        switch (i) {
            case 0:
                if (!atomicBoolean.get()) {
                    try {
                        bVar.b(function0.invoke());
                    } catch (Throwable th) {
                        bVar.d(th);
                        return;
                    }
                    break;
                }
                break;
            default:
                if (!atomicBoolean.get()) {
                    try {
                        bVar.b(function0.invoke());
                    } catch (Throwable th2) {
                        bVar.d(th2);
                    }
                    break;
                }
                break;
        }
    }
}
