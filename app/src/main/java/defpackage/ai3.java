package defpackage;

import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.appset.zzc;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ApiExceptionUtil;
import com.google.android.gms.internal.appset.zze;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ai3 extends zze {
    public final /* synthetic */ TaskCompletionSource a;

    public ai3(TaskCompletionSource taskCompletionSource) {
        this.a = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.appset.zzf
    public final void zzb(Status status, zzc zzcVar) {
        AppSetIdInfo appSetIdInfo = zzcVar != null ? new AppSetIdInfo(zzcVar.a, zzcVar.b) : null;
        boolean zA = status.a();
        TaskCompletionSource taskCompletionSource = this.a;
        if (zA) {
            taskCompletionSource.b(appSetIdInfo);
        } else {
            taskCompletionSource.a(ApiExceptionUtil.a(status));
        }
    }
}
