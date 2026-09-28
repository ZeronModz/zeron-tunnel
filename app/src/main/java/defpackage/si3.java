package defpackage;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.install.InstallException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class si3 extends bi3 {
    @Override // defpackage.bi3, com.google.android.play.core.appupdate.internal.zzh
    public final void zzb(Bundle bundle) {
        super.zzb(bundle);
        int i = bundle.getInt("error.code", -2);
        TaskCompletionSource taskCompletionSource = this.c;
        if (i != 0) {
            taskCompletionSource.c(new InstallException(bundle.getInt("error.code", -2)));
        } else {
            taskCompletionSource.d(null);
        }
    }
}
