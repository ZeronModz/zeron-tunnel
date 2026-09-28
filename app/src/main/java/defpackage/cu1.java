package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import com.google.android.gms.common.moduleinstall.internal.zaa;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class cu1 extends zaa {
    public final /* synthetic */ int b;
    public final /* synthetic */ TaskCompletionSource c;

    public /* synthetic */ cu1(int i, TaskCompletionSource taskCompletionSource) {
        this.b = i;
        this.c = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.moduleinstall.internal.zaa, com.google.android.gms.common.moduleinstall.internal.zae
    public void zab(Status status) {
        switch (this.b) {
            case 1:
                TaskUtil.a(status, null, this.c);
                break;
            default:
                super.zab(status);
                break;
        }
    }

    @Override // com.google.android.gms.common.moduleinstall.internal.zaa, com.google.android.gms.common.moduleinstall.internal.zae
    public void zac(Status status, ModuleInstallIntentResponse moduleInstallIntentResponse) {
        switch (this.b) {
            case 3:
                TaskUtil.a(status, moduleInstallIntentResponse, this.c);
                break;
            default:
                super.zac(status, moduleInstallIntentResponse);
                break;
        }
    }

    @Override // com.google.android.gms.common.moduleinstall.internal.zaa, com.google.android.gms.common.moduleinstall.internal.zae
    public void zad(Status status, ModuleInstallResponse moduleInstallResponse) {
        switch (this.b) {
            case 2:
                TaskUtil.a(status, moduleInstallResponse, this.c);
                break;
            default:
                super.zad(status, moduleInstallResponse);
                break;
        }
    }

    @Override // com.google.android.gms.common.moduleinstall.internal.zaa, com.google.android.gms.common.moduleinstall.internal.zae
    public void zae(Status status, ModuleAvailabilityResponse moduleAvailabilityResponse) {
        switch (this.b) {
            case 0:
                TaskUtil.a(status, moduleAvailabilityResponse, this.c);
                break;
            default:
                super.zae(status, moduleAvailabilityResponse);
                break;
        }
    }
}
