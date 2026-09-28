package defpackage;

import android.os.RemoteException;
import androidx.work.PeriodicWorkRequest;
import androidx.work.multiprocess.IListenableWorkerImpl;
import androidx.work.multiprocess.IWorkManagerImpl;
import androidx.work.multiprocess.IWorkManagerImplCallback;
import androidx.work.multiprocess.RemoteDispatcher;
import androidx.work.multiprocess.RemoteListenableDelegatingWorker;
import androidx.work.multiprocess.RemoteWorkManagerClient;
import androidx.work.multiprocess.parcelable.ParcelableInterruptRequest;
import androidx.work.multiprocess.parcelable.ParcelableWorkRequest;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u21 implements RemoteDispatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u21(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.work.multiprocess.RemoteDispatcher
    public final void execute(Object obj, IWorkManagerImplCallback iWorkManagerImplCallback) throws RemoteException {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                RemoteListenableDelegatingWorker remoteListenableDelegatingWorker = (RemoteListenableDelegatingWorker) obj2;
                IListenableWorkerImpl iListenableWorkerImpl = (IListenableWorkerImpl) obj;
                int i2 = RemoteListenableDelegatingWorker.e;
                iListenableWorkerImpl.getClass();
                iWorkManagerImplCallback.getClass();
                String string = remoteListenableDelegatingWorker.b.a.toString();
                string.getClass();
                byte[] bArrA = bw0.a(new ParcelableInterruptRequest(string, remoteListenableDelegatingWorker.getStopReason()));
                bArrA.getClass();
                iListenableWorkerImpl.interrupt(bArrA, iWorkManagerImplCallback);
                break;
            default:
                oi oiVar = RemoteWorkManagerClient.i;
                ((IWorkManagerImpl) obj).updateUniquePeriodicWorkRequest("subscription_updater", bw0.a(new ParcelableWorkRequest((PeriodicWorkRequest) obj2)), iWorkManagerImplCallback);
                break;
        }
    }
}
