package defpackage;

import androidx.work.multiprocess.IWorkManagerImplCallback;
import androidx.work.multiprocess.ListenableCallback;
import androidx.work.multiprocess.i;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class z21 extends ListenableCallback {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z21(Executor executor, IWorkManagerImplCallback iWorkManagerImplCallback, ListenableFuture listenableFuture, int i) {
        super(executor, iWorkManagerImplCallback, listenableFuture);
        this.d = i;
    }

    @Override // androidx.work.multiprocess.ListenableCallback
    public final byte[] b(Object obj) {
        switch (this.d) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            default:
                break;
        }
        return i.c;
    }
}
