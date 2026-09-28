package defpackage;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.IMultiInstanceInvalidationCallback;
import androidx.room.MultiInstanceInvalidationService;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class wr0 extends RemoteCallbackList {
    public final /* synthetic */ MultiInstanceInvalidationService a;

    public wr0(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.a = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object obj) {
        ((IMultiInstanceInvalidationCallback) iInterface).getClass();
        obj.getClass();
        this.a.b.remove((Integer) obj);
    }
}
