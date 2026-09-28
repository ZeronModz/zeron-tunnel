package defpackage;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.g3;
import com.google.android.gms.internal.ads.z;
import com.google.android.gms.internal.ads.zzbzu;
import com.google.android.gms.internal.ads.zzecz;
import com.google.android.gms.internal.ads.zzefe;
import com.google.android.gms.internal.ads.zzeff;
import com.google.android.gms.internal.ads.zzehr;
import com.google.android.gms.internal.ads.zzfoe;
import com.google.android.gms.internal.ads.zzgzy;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class do2 implements zzefe {
    public static final Pattern h = Pattern.compile("Received error HTTP response code: (.*)");
    public final zzecz a;
    public final zzgzy b;
    public final cu2 c;
    public final ScheduledExecutorService d;
    public final zzehr e;
    public final bv2 f;
    public final Context g;

    public do2(Context context, cu2 cu2Var, zzecz zzeczVar, zzgzy zzgzyVar, ScheduledExecutorService scheduledExecutorService, zzehr zzehrVar, bv2 bv2Var) {
        this.g = context;
        this.c = cu2Var;
        this.a = zzeczVar;
        this.b = zzgzyVar;
        this.d = scheduledExecutorService;
        this.e = zzehrVar;
        this.f = bv2Var;
    }

    @Override // com.google.android.gms.internal.ads.zzefe
    public final ListenableFuture zza(zzbzu zzbzuVar) {
        zzecz zzeczVar = this.a;
        zzgzy zzgzyVar = zzeczVar.b;
        String str = zzbzuVar.d;
        zzt.zzc();
        y23 y23VarR = z.R(zzs.zzH(str) ? z.v(new zzeff(1)) : z.R(zzeczVar.a.zzc(new mx0(zzeczVar, 6, zzbzuVar, false)), ExecutionException.class, ww1.d, zzgzyVar), zzeff.class, new yn2(zzeczVar, zzbzuVar, Binder.getCallingUid(), 0), zzgzyVar);
        zzfoe zzfoeVarX = ec1.X(this.g, 11);
        yg0.Y(y23VarR, zzfoeVarX);
        ListenableFuture listenableFutureZ = z.Z(y23VarR, new t62(this, 6), this.b);
        if (((Boolean) zzbd.zzc().a(p32.B6)).booleanValue()) {
            listenableFutureZ = z.R(z.T(listenableFutureZ, ((Integer) zzbd.zzc().a(p32.C6)).intValue(), TimeUnit.SECONDS, this.d), TimeoutException.class, ww1.e, g3.g);
        }
        yg0.e0(listenableFutureZ, this.f, zzfoeVarX, false);
        listenableFutureZ.addListener(new s33(0, listenableFutureZ, new uh2(this, 8)), g3.g);
        return listenableFutureZ;
    }
}
