package defpackage;

import com.google.android.gms.internal.measurement.zzah;
import com.google.android.gms.internal.measurement.zzai;
import com.google.android.gms.internal.measurement.zzao;
import com.google.android.gms.internal.measurement.zzg;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zi3 extends zzai {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zi3(String str, int i) {
        super(str);
        this.c = i;
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzao a(zzg zzgVar, List list) {
        switch (this.c) {
            case 0:
            case 1:
                return this;
            default:
                return new zzah(Double.valueOf(0.0d));
        }
    }
}
