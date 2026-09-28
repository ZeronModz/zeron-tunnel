package defpackage;

import com.google.android.gms.internal.measurement.zzao;
import com.google.android.gms.internal.measurement.zzg;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class kz1 {
    public final ArrayList a = new ArrayList();

    public abstract zzao a(String str, zzg zzgVar, ArrayList arrayList);

    public final void b(String str) {
        if (!this.a.contains(n8.o0(str))) {
            throw new IllegalArgumentException("Command not supported");
        }
        throw new UnsupportedOperationException("Command not implemented: ".concat(String.valueOf(str)));
    }
}
