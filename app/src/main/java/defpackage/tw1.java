package defpackage;

import android.net.Uri;
import com.google.android.gms.internal.ads.f0;
import com.google.android.gms.internal.ads.zzguc;
import com.google.android.gms.internal.ads.zzguf;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class tw1 {
    public final Uri a;
    public final List b;
    public final zzguf c;

    static {
        String str = wt2.a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
    }

    public /* synthetic */ tw1(Uri uri, List list, zzguf zzgufVar) {
        this.a = uri;
        ArrayList arrayList = f0.a;
        this.b = list;
        this.c = zzgufVar;
        int i = zzguf.zzd;
        zzguc zzgucVar = new zzguc();
        if (zzgufVar.size() <= 0) {
            zzgucVar.f();
        } else {
            zzgufVar.get(0).getClass();
            u7.q();
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tw1)) {
            return false;
        }
        tw1 tw1Var = (tw1) obj;
        return this.a.equals(tw1Var.a) && this.b.equals(tw1Var.b) && this.c.equals(tw1Var.c);
    }

    public final int hashCode() {
        return (int) ((((long) ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 923521)) * 961)) * 31)) * 31) - Long.MAX_VALUE);
    }
}
