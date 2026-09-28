package defpackage;

import com.google.android.gms.internal.ads.zzguf;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class z13 extends q13 {
    public final zzguf c;

    public z13(int i, zzguf zzgufVar) {
        super(zzgufVar.size(), i);
        this.c = zzgufVar;
    }

    @Override // defpackage.q13
    public final Object a(int i) {
        return this.c.get(i);
    }
}
