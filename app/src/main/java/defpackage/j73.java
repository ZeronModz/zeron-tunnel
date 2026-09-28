package defpackage;

import com.google.android.gms.internal.ads.zzhla;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class j73 {
    public static final j73 b = new j73();
    public final AtomicReference a = new AtomicReference(new r73(new mo2(13)));

    public final synchronized void a(p73 p73Var) {
        AtomicReference atomicReference = this.a;
        mo2 mo2Var = new mo2((r73) atomicReference.get());
        mo2Var.b(p73Var);
        atomicReference.set(new r73(mo2Var));
    }

    public final synchronized void b(zzhla zzhlaVar) {
        AtomicReference atomicReference = this.a;
        mo2 mo2Var = new mo2((r73) atomicReference.get());
        mo2Var.d(zzhlaVar);
        atomicReference.set(new r73(mo2Var));
    }
}
