package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.common.moduleinstall.InstallStatusListener;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import com.google.android.gms.common.moduleinstall.internal.zaa;
import com.google.android.gms.common.moduleinstall.internal.zay;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class eu1 extends zaa {
    public final /* synthetic */ AtomicReference b;
    public final /* synthetic */ TaskCompletionSource c;
    public final /* synthetic */ InstallStatusListener d;
    public final /* synthetic */ zay e;

    public eu1(zay zayVar, AtomicReference atomicReference, TaskCompletionSource taskCompletionSource, InstallStatusListener installStatusListener) {
        this.e = zayVar;
        this.b = atomicReference;
        this.c = taskCompletionSource;
        this.d = installStatusListener;
    }

    @Override // com.google.android.gms.common.moduleinstall.internal.zaa, com.google.android.gms.common.moduleinstall.internal.zae
    public final void zad(Status status, ModuleInstallResponse moduleInstallResponse) {
        if (moduleInstallResponse != null) {
            this.b.set(moduleInstallResponse);
        }
        TaskUtil.a(status, null, this.c);
        if (!status.a() || (moduleInstallResponse != null && moduleInstallResponse.b)) {
            InstallStatusListener installStatusListener = this.d;
            yg0.n(installStatusListener, "Listener must not be null");
            yg0.k("InstallStatusListener", "Listener type must not be empty");
            this.e.b(new ml0(installStatusListener));
        }
    }
}
