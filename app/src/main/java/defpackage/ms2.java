package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.nonagon.signalgeneration.zzaa;
import com.google.android.gms.internal.ads.d0;
import com.google.android.gms.internal.ads.z;
import com.google.android.gms.internal.ads.zzeam;
import com.google.android.gms.internal.ads.zzeqf;
import com.google.android.gms.internal.ads.zzeqo;
import com.google.android.gms.internal.ads.zzfae;
import com.google.android.gms.internal.ads.zzfax;
import com.google.android.gms.internal.ads.zzgyv;
import com.google.android.gms.internal.ads.zzgzy;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ms2 implements zzfax {
    public static final zzfae k = new zzfae(new JSONArray().toString(), new Bundle(), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
    public final zzgzy a;
    public final ScheduledExecutorService b;
    public final wq2 c;
    public final Context d;
    public final cu2 e;
    public final zzeqf f;
    public final ql2 g;
    public final zzeam h;
    public final int i;
    public final String j;

    public ms2(zzgzy zzgzyVar, ScheduledExecutorService scheduledExecutorService, String str, wq2 wq2Var, Context context, cu2 cu2Var, zzeqf zzeqfVar, ql2 ql2Var, zzeam zzeamVar, int i) {
        this.a = zzgzyVar;
        this.b = scheduledExecutorService;
        this.j = str;
        this.c = wq2Var;
        this.d = context;
        this.e = cu2Var;
        this.f = zzeqfVar;
        this.g = ql2Var;
        this.h = zzeamVar;
        this.i = i;
    }

    public final void a(ArrayList arrayList, Map map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            zzeqo zzeqoVar = (zzeqo) ((Map.Entry) it.next()).getValue();
            String str = zzeqoVar.a;
            Bundle bundle = this.e.d.zzm;
            Bundle bundle2 = bundle != null ? bundle.getBundle(str) : null;
            ms2 ms2Var = this;
            arrayList.add(ms2Var.b(str, Collections.singletonList(zzeqoVar.e), bundle2, zzeqoVar.b, zzeqoVar.c));
            this = ms2Var;
        }
    }

    public final q33 b(final String str, final List list, final Bundle bundle, final boolean z, final boolean z2) {
        zzgyv zzgyvVar = new zzgyv() { // from class: is2
            /* JADX WARN: Removed duplicated region for block: B:53:0x0051 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            @Override // com.google.android.gms.internal.ads.zzgyv
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final com.google.common.util.concurrent.ListenableFuture zza() throws android.os.RemoteException {
                /*
                    Method dump skipped, instruction units count: 304
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.is2.zza():com.google.common.util.concurrent.ListenableFuture");
            }
        };
        zzgzy zzgzyVar = this.a;
        q33 q33VarQ = q33.q(z.H(zzgyvVar, zzgzyVar));
        if (!((Boolean) zzbd.zzc().a(p32.f2)).booleanValue()) {
            q33VarQ = (q33) z.T(q33VarQ, ((Long) zzbd.zzc().a(p32.Y1)).longValue(), TimeUnit.MILLISECONDS, this.b);
        }
        return z.N(q33VarQ, Throwable.class, new a62(str, 3), zzgzyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final ListenableFuture zza() {
        int i = this.i;
        zzfae zzfaeVar = k;
        if (i == 2) {
            return z.j(zzfaeVar);
        }
        cu2 cu2Var = this.e;
        if (cu2Var.s) {
            if (!Arrays.asList(((String) zzbd.zzc().a(p32.l2)).split(",")).contains(zzaa.zzb(zzaa.zzc(cu2Var.d)))) {
                return z.j(zzfaeVar);
            }
        }
        return z.H(new d0(this, 5), this.a);
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 32;
    }
}
