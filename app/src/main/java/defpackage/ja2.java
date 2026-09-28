package defpackage;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzj;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzccq;
import com.google.android.gms.internal.ads.zzccr;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ja2 extends zzccr {
    public final Clock b;
    public final se3 c;
    public final se3 d;
    public final se3 e;

    public ja2(Context context, Clock clock, zzj zzjVar, zzccq zzccqVar) {
        this.b = clock;
        te3 te3VarA = te3.a(context);
        te3 te3VarA2 = te3.a(zzjVar);
        int i = 0;
        this.c = se3.a(new fa2(te3VarA, te3VarA2, 0));
        te3 te3VarA3 = te3.a(clock);
        se3 se3VarA = se3.a(new ha2(te3VarA3, te3VarA2, te3.a(zzccqVar), i));
        this.d = se3VarA;
        this.e = se3.a(new la2(te3VarA, new ia2(te3VarA3, se3VarA), i));
    }

    @Override // com.google.android.gms.internal.ads.zzccr
    public final i31 a() {
        return new i31((Object) this.b, 13, this.d.zzb(), false);
    }
}
