package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class qm2 extends ResultReceiver {
    public final /* synthetic */ TaskCompletionSource a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qm2(Handler handler, TaskCompletionSource taskCompletionSource) {
        super(handler);
        this.a = taskCompletionSource;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        TaskCompletionSource taskCompletionSource = this.a;
        if (i == 1) {
            taskCompletionSource.d(-1);
        } else if (i != 2) {
            taskCompletionSource.d(1);
        } else {
            taskCompletionSource.d(0);
        }
    }
}
