package defpackage;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.cloudmessaging.zzt;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.Constants$ScionAnalytics$MessageType;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class uj3 extends ek3 {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uj3(int i, int i2, Bundle bundle, int i3) {
        super(i, i2, bundle);
        this.e = i3;
    }

    @Override // defpackage.ek3
    public final void a(Bundle bundle) {
        int i = this.e;
        TaskCompletionSource taskCompletionSource = this.b;
        switch (i) {
            case 0:
                if (!bundle.getBoolean("ack", false)) {
                    c(new zzt(4, "Invalid response to one way request", null));
                } else {
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        toString();
                    }
                    taskCompletionSource.b(null);
                }
                break;
            default:
                Bundle bundle2 = bundle.getBundle(Constants$ScionAnalytics$MessageType.DATA_MESSAGE);
                if (bundle2 == null) {
                    bundle2 = Bundle.EMPTY;
                }
                if (Log.isLoggable("MessengerIpcClient", 3)) {
                    toString();
                    String.valueOf(bundle2);
                }
                taskCompletionSource.b(bundle2);
                break;
        }
    }

    @Override // defpackage.ek3
    public final boolean b() {
        switch (this.e) {
            case 0:
                return true;
            default:
                return false;
        }
    }
}
