package defpackage;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zzce;
import com.google.android.gms.ads.internal.client.zzch;
import com.google.android.gms.ads.internal.client.zzft;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzfqr;
import com.google.android.gms.internal.ads.zzfqz;
import com.google.android.gms.internal.ads.zzfra;
import com.google.android.gms.internal.ads.zzfrc;
import com.google.android.gms.internal.ads.zzfsa;
import com.google.android.gms.internal.ads.zzfsf;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class wv2 {
    public final Context a;
    public final VersionInfoParcel b;
    public final ScheduledExecutorService c;
    public final vu2 d;
    public final ClientApi e = new ClientApi();
    public final gu2 f;
    public final Clock g;
    public final zzfqr h;

    public wv2(Context context, VersionInfoParcel versionInfoParcel, ScheduledExecutorService scheduledExecutorService, vu2 vu2Var, gu2 gu2Var, Clock clock, zzfqr zzfqrVar) {
        this.a = context;
        this.b = versionInfoParcel;
        this.c = scheduledExecutorService;
        this.d = vu2Var;
        this.g = clock;
        this.f = gu2Var;
        this.h = zzfqrVar;
    }

    public final zzfsa a(zzft zzftVar, zzce zzceVar) {
        AdFormat adFormat = AdFormat.getAdFormat(zzftVar.zzb);
        if (adFormat == null) {
            return null;
        }
        int iOrdinal = adFormat.ordinal();
        gu2 gu2Var = this.f;
        Context context = this.a;
        ClientApi clientApi = this.e;
        VersionInfoParcel versionInfoParcel = this.b;
        if (iOrdinal == 1) {
            return new zzfrc(clientApi, context, versionInfoParcel.clientJarVersion, gu2Var, zzftVar, zzceVar, this.c, this.d, c(), this.g);
        }
        if (iOrdinal == 2) {
            return new zzfsf(clientApi, context, versionInfoParcel.clientJarVersion, gu2Var, zzftVar, zzceVar, this.c, this.d, c(), this.g);
        }
        if (iOrdinal != 5) {
            return null;
        }
        return new zzfqz(clientApi, context, versionInfoParcel.clientJarVersion, gu2Var, zzftVar, zzceVar, this.c, this.d, c(), this.g);
    }

    public final zzfsa b(String str, zzft zzftVar, zzch zzchVar) {
        AdFormat adFormat = AdFormat.getAdFormat(zzftVar.zzb);
        if (adFormat == null) {
            return null;
        }
        int iOrdinal = adFormat.ordinal();
        gu2 gu2Var = this.f;
        Context context = this.a;
        ClientApi clientApi = this.e;
        VersionInfoParcel versionInfoParcel = this.b;
        if (iOrdinal == 1) {
            return new zzfrc(str, clientApi, context, versionInfoParcel.clientJarVersion, gu2Var, zzftVar, zzchVar, this.c, this.d, c(), this.g, this.h);
        }
        if (iOrdinal == 2) {
            return new zzfsf(str, clientApi, context, versionInfoParcel.clientJarVersion, gu2Var, zzftVar, zzchVar, this.c, this.d, c(), this.g, this.h);
        }
        if (iOrdinal != 5) {
            return null;
        }
        return new zzfqz(str, clientApi, context, versionInfoParcel.clientJarVersion, gu2Var, zzftVar, zzchVar, this.c, this.d, c(), this.g, this.h);
    }

    public final zzfra c() {
        return new zzfra(((Long) zzbd.zzc().a(p32.G)).longValue(), 2.0d, ((Long) zzbd.zzc().a(p32.H)).longValue(), 0.2d, this.g);
    }
}
