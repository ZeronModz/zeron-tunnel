package defpackage;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class et1 extends TaskApiCall {
    public final /* synthetic */ td1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public et1(td1 td1Var, Feature[] featureArr, boolean z, int i) {
        super(featureArr, z, i);
        this.d = td1Var;
    }

    @Override // com.google.android.gms.common.api.internal.TaskApiCall
    public final void b(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) throws RemoteException {
        this.d.a.accept(anyClient, taskCompletionSource);
    }
}
