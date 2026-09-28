package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.ads.z;
import com.google.android.gms.internal.ads.zzeso;
import com.google.android.gms.internal.ads.zzeuz;
import com.google.android.gms.internal.ads.zzeyu;
import com.google.android.gms.internal.ads.zzezo;
import com.google.android.gms.internal.ads.zzfax;
import com.google.android.gms.internal.ads.zzffr;
import com.google.android.gms.internal.ads.zzfiq;
import com.google.android.gms.internal.ads.zzgzy;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class er2 implements zzfax {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ er2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final ListenableFuture zza() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return z.j(new zzeso(k5.a((Context) obj, "com.google.android.gms.permission.AD_ID") == 0));
            case 1:
                ArrayList arrayList = new ArrayList();
                Iterator it = ((Set) obj).iterator();
                while (it.hasNext()) {
                    arrayList.add((String) it.next());
                }
                return z.j(new lr2(arrayList, 0));
            case 2:
                return z.j(new zzeuz(((cu2) obj).q));
            case 3:
                zzffr zzffrVar = (zzffr) obj;
                if (zzffrVar == null) {
                    return z.j(new lr2(null, 2));
                }
                String str = zzffrVar.a;
                return hb1.a(str) ? z.j(new lr2(null, 2)) : z.j(new lr2(str, 2));
            case 4:
                return ((zzgzy) obj).zzc(new k32(2));
            case 5:
                return z.j(new zzeyu((zzfiq) obj));
            default:
                return z.j(new zzezo((Bundle) obj));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        switch (this.a) {
            case 0:
                return 2;
            case 1:
                return 8;
            case 2:
                return 58;
            case 3:
                return 15;
            case 4:
                return 55;
            case 5:
                return 25;
            default:
                return 30;
        }
    }
}
