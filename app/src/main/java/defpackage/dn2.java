package defpackage;

import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.internal.client.zzex;
import com.google.android.gms.internal.ads.v3;
import com.google.android.gms.internal.ads.zzbqm;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class dn2 extends zzbqm {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dn2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.google.android.gms.internal.ads.zzbqn
    public final void zzb(List list) {
        int i;
        ArrayList arrayList;
        switch (this.a) {
            case 0:
                ((v3) this.b).b(list);
                return;
            default:
                zzex zzexVar = (zzex) this.b;
                synchronized (zzexVar.zzw()) {
                    zzexVar.zzy(false);
                    zzexVar.zzz(true);
                    arrayList = new ArrayList(zzexVar.zzx());
                    zzexVar.zzx().clear();
                    break;
                }
                InitializationStatus initializationStatusZzB = zzex.zzB(list);
                int size = arrayList.size();
                for (i = 0; i < size; i++) {
                    ((OnInitializationCompleteListener) arrayList.get(i)).onInitializationComplete(initializationStatusZzB);
                }
                return;
        }
    }
}
