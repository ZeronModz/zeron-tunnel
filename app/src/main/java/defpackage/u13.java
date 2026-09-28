package defpackage;

import com.google.android.gms.internal.ads.zzhb;
import com.google.android.gms.internal.ads.zzhf;
import com.google.android.gms.internal.ads.zzhz;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u13 implements zzhb {
    public final boolean a;
    public final ArrayList b = new ArrayList(1);
    public int c;
    public zzhf d;

    public u13(boolean z) {
        this.a = z;
    }

    public final void a(zzhf zzhfVar) {
        for (int i = 0; i < this.c; i++) {
            ((zzhz) this.b.get(i)).zza(this, zzhfVar, this.a);
        }
    }

    public final void b(zzhf zzhfVar) {
        this.d = zzhfVar;
        for (int i = 0; i < this.c; i++) {
            ((zzhz) this.b.get(i)).zzb(this, zzhfVar, this.a);
        }
    }

    public final void c(int i) {
        zzhf zzhfVar = this.d;
        String str = wt2.a;
        for (int i2 = 0; i2 < this.c; i2++) {
            ((zzhz) this.b.get(i2)).zzc(this, zzhfVar, this.a, i);
        }
    }

    public final void d() {
        zzhf zzhfVar = this.d;
        String str = wt2.a;
        for (int i = 0; i < this.c; i++) {
            ((zzhz) this.b.get(i)).zzd(this, zzhfVar, this.a);
        }
        this.d = null;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zze(zzhz zzhzVar) {
        zzhzVar.getClass();
        ArrayList arrayList = this.b;
        if (arrayList.contains(zzhzVar)) {
            return;
        }
        arrayList.add(zzhzVar);
        this.c++;
    }

    @Override // com.google.android.gms.internal.ads.zzhb, com.google.android.gms.internal.ads.zzhu
    public Map zzj() {
        return Collections.EMPTY_MAP;
    }
}
