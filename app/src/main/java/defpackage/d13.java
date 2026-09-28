package defpackage;

import android.os.Bundle;
import com.google.android.gms.internal.ads.zzgok;
import com.google.android.gms.internal.ads.zzgpt;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class d13 extends zzgok {
    public final zzgpt a;
    public final /* synthetic */ e13 b;

    public d13(e13 e13Var, zzgpt zzgptVar) {
        this.b = e13Var;
        this.a = zzgptVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgol
    public final void zzb(Bundle bundle) {
        lp2 lp2Var;
        int i = bundle.getInt("statusCode", 8150);
        String string = bundle.getString("sessionToken");
        int i2 = bundle.getInt("uiMode", 0);
        z03 z03Var = new z03();
        byte b = (byte) (z03Var.d | 1);
        z03Var.a = i;
        byte b2 = (byte) (b | 1);
        z03Var.d = b2;
        if (string != null) {
            z03Var.b = string;
        }
        z03Var.c = i2;
        z03Var.d = (byte) (b2 | 2);
        this.a.zza(z03Var.a());
        if (i != 8157 || (lp2Var = this.b.a) == null) {
            return;
        }
        e13.c.a("unbind LMD display overlay service", new Object[0]);
        lp2Var.a(new pt2(lp2Var, 18));
    }
}
