package defpackage;

import android.os.RemoteException;
import androidx.work.multiprocess.IWorkManagerImpl;
import androidx.work.multiprocess.IWorkManagerImplCallback;
import androidx.work.multiprocess.RemoteDispatcher;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class y21 implements RemoteDispatcher {
    @Override // androidx.work.multiprocess.RemoteDispatcher
    public final void execute(Object obj, IWorkManagerImplCallback iWorkManagerImplCallback) throws RemoteException {
        ((IWorkManagerImpl) obj).cancelUniqueWork("subscription_updater", iWorkManagerImplCallback);
    }
}
