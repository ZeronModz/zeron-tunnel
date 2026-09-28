package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.MotionEvent;
import androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.util.zzj;
import com.google.android.gms.internal.ads.z;
import com.google.android.gms.internal.ads.zzbyr;
import com.google.android.gms.internal.ads.zzdva;
import com.google.android.gms.internal.ads.zzgzy;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ve2 {
    public final Context a;
    public final zzg b;
    public final hp2 c;
    public final zzdva d;
    public final zzgzy e;
    public final zzgzy f;
    public final ScheduledExecutorService g;
    public zzbyr h;
    public zzbyr i;

    public ve2(Context context, zzj zzjVar, hp2 hp2Var, zzdva zzdvaVar, zzgzy zzgzyVar, zzgzy zzgzyVar2, ScheduledExecutorService scheduledExecutorService) {
        this.a = context;
        this.b = zzjVar;
        this.c = hp2Var;
        this.d = zzdvaVar;
        this.e = zzgzyVar;
        this.f = zzgzyVar2;
        this.g = scheduledExecutorService;
    }

    public static boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains((CharSequence) zzbd.zzc().a(p32.Fb));
    }

    public final ListenableFuture a(String str, Random random) {
        return TextUtils.isEmpty(str) ? z.j(str) : z.R(c(str, this.d.a, random), Throwable.class, new e62(this, str, 1), this.e);
    }

    public final ListenableFuture c(String str, MotionEvent motionEvent, Random random) {
        ListenableFuture listenableFutureV;
        try {
            if (!str.contains((CharSequence) zzbd.zzc().a(p32.Fb)) || this.b.zzx()) {
                return z.j(str);
            }
            Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
            builderBuildUpon.appendQueryParameter((String) zzbd.zzc().a(p32.Gb), String.valueOf(random.nextInt(Integer.MAX_VALUE)));
            if (motionEvent == null) {
                builderBuildUpon.appendQueryParameter((String) zzbd.zzc().a(p32.Hb), "11");
                return z.j(builderBuildUpon.toString());
            }
            hp2 hp2Var = this.c;
            hp2Var.getClass();
            try {
                MeasurementManagerFutures measurementManagerFuturesA = MeasurementManagerFutures.a(hp2Var.b);
                hp2Var.a = measurementManagerFuturesA;
                listenableFutureV = measurementManagerFuturesA == null ? z.v(new IllegalStateException("MeasurementManagerFutures is null")) : measurementManagerFuturesA.b();
            } catch (Exception e) {
                listenableFutureV = z.v(e);
            }
            return z.R(z.Z(q33.q(listenableFutureV), new ue2(this, builderBuildUpon, str, motionEvent, 0), this.f), Throwable.class, new j72(1, this, builderBuildUpon), this.e);
        } catch (Exception e2) {
            return z.v(e2);
        }
    }
}
