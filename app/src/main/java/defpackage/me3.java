package defpackage;

import com.google.android.gms.measurement.internal.e;
import com.google.android.gms.measurement.internal.g0;
import com.google.android.gms.measurement.internal.zzjd;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class me3 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ zzjd e;

    public /* synthetic */ me3(zzjd zzjdVar, String str, String str2, String str3, int i) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = zzjdVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.a;
        String str = this.d;
        String str2 = this.c;
        String str3 = this.b;
        zzjd zzjdVar = this.e;
        switch (i) {
            case 0:
                g0 g0Var = zzjdVar.a;
                g0Var.w();
                e eVar = g0Var.c;
                g0.P(eVar);
                return eVar.W(str3, str2, str);
            case 1:
                g0 g0Var2 = zzjdVar.a;
                g0Var2.w();
                e eVar2 = g0Var2.c;
                g0.P(eVar2);
                return eVar2.W(str3, str2, str);
            case 2:
                g0 g0Var3 = zzjdVar.a;
                g0Var3.w();
                e eVar3 = g0Var3.c;
                g0.P(eVar3);
                return eVar3.a0(str3, str2, str);
            default:
                g0 g0Var4 = zzjdVar.a;
                g0Var4.w();
                e eVar4 = g0Var4.c;
                g0.P(eVar4);
                return eVar4.a0(str3, str2, str);
        }
    }
}
