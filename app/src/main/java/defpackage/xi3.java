package defpackage;

import android.content.Context;
import android.os.Parcel;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.zza;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.a;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.b;
import defpackage.ai3;
import defpackage.gx2;
import defpackage.ih2;
import defpackage.p92;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class xi3 extends GoogleApi implements AppSetIdClient {
    public static final Api l = new Api("AppSet.API", new oh3(), new Api.ClientKey());
    public final Context j;
    public final a k;

    public xi3(Context context, a aVar) {
        super(context, (Api<com.google.android.gms.common.api.a>) l, Api.ApiOptions.NO_OPTIONS, wb0.c);
        this.j = context;
        this.k = aVar;
    }

    @Override // com.google.android.gms.appset.AppSetIdClient
    public final Task getAppSetIdInfo() {
        if (this.k.b(this.j, 212800000) != 0) {
            return b.d(new ApiException(new Status(17)));
        }
        td1 td1VarA = TaskApiCall.a();
        td1VarA.c = new Feature[]{tm2.a};
        td1VarA.a = new RemoteCall(this) { // from class: com.google.android.gms.internal.appset.zzm
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                gx2 gx2Var = (gx2) ((ih2) obj).getService();
                zza zzaVar = new zza(null, null);
                ai3 ai3Var = new ai3((TaskCompletionSource) obj2);
                gx2Var.getClass();
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken("com.google.android.gms.appset.internal.IAppSetService");
                int i = p92.a;
                parcelObtain.writeInt(1);
                zzaVar.writeToParcel(parcelObtain, 0);
                parcelObtain.writeStrongBinder(ai3Var);
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    gx2Var.a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain.recycle();
                    parcelObtain2.recycle();
                }
            }
        };
        td1VarA.b = false;
        td1VarA.d = 27601;
        return c(0, td1VarA.a());
    }
}
