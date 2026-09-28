package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.internal.ads.zzfax;
import com.google.android.gms.internal.ads.zzgzy;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class vr2 implements zzfax {
    public final zzgzy a;
    public final Context b;

    public vr2(zzgzy zzgzyVar, Context context) {
        this.a = zzgzyVar;
        this.b = context;
    }

    public final Intent a() {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        boolean zBooleanValue = ((Boolean) zzbd.zzc().a(p32.wc)).booleanValue();
        Context context = this.b;
        return (!zBooleanValue || Build.VERSION.SDK_INT < 33) ? context.registerReceiver(null, intentFilter) : context.registerReceiver(null, intentFilter, 4);
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final ListenableFuture zza() {
        return this.a.zzc(new hc0(this, 16));
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 14;
    }
}
