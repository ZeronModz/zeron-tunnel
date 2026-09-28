package defpackage;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.g3;
import com.google.android.gms.internal.ads.zzdxz;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class hc2 {
    public final ec2 a;
    public final zzdxz b;

    public hc2(ec2 ec2Var, zzdxz zzdxzVar) {
        this.a = ec2Var;
        this.b = zzdxzVar;
    }

    public final void a(Context context, VersionInfoParcel versionInfoParcel) {
        if (((Boolean) zzbd.zzc().a(p32.sf)).booleanValue()) {
            Executor threadPoolExecutor = g3.a;
            if (((Boolean) zzbd.zzc().a(p32.uf)).booleanValue()) {
                gc2 gc2Var = new gc2(((Integer) zzbd.zzc().a(p32.wf)).intValue());
                int iIntValue = ((Integer) zzbd.zzc().a(p32.vf)).intValue();
                threadPoolExecutor = new ThreadPoolExecutor(iIntValue, iIntValue, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), gc2Var);
            }
            threadPoolExecutor.execute(new wq(this, 10, context, versionInfoParcel));
        }
    }
}
