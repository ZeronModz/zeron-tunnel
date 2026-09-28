package defpackage;

import android.os.RemoteException;
import androidx.work.Data;
import androidx.work.ForegroundInfo;
import androidx.work.multiprocess.IWorkManagerImpl;
import androidx.work.multiprocess.IWorkManagerImplCallback;
import androidx.work.multiprocess.RemoteDispatcher;
import androidx.work.multiprocess.parcelable.ParcelableForegroundRequestInfo;
import androidx.work.multiprocess.parcelable.ParcelableUpdateRequest;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class x21 implements RemoteDispatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x21(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // androidx.work.multiprocess.RemoteDispatcher
    public final void execute(Object obj, IWorkManagerImplCallback iWorkManagerImplCallback) throws RemoteException {
        switch (this.a) {
            case 0:
                ((IWorkManagerImpl) obj).setForegroundAsync(bw0.a(new ParcelableForegroundRequestInfo((String) this.b, (ForegroundInfo) this.c)), iWorkManagerImplCallback);
                break;
            default:
                ((IWorkManagerImpl) obj).setProgress(bw0.a(new ParcelableUpdateRequest((UUID) this.b, (Data) this.c)), iWorkManagerImplCallback);
                break;
        }
    }
}
