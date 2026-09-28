package defpackage;

import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zzga;
import com.google.android.gms.internal.ads.zzcjl;
import com.google.android.gms.internal.ads.zzclh;
import com.google.android.gms.internal.ads.zzdsh;
import com.google.android.gms.internal.ads.zzenv;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tk2 implements zzclh {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzdsh b;
    public final /* synthetic */ zzcjl c;
    public final /* synthetic */ w12 d;

    public /* synthetic */ tk2(zzdsh zzdshVar, zzcjl zzcjlVar, w12 w12Var, int i) {
        this.a = i;
        this.b = zzdshVar;
        this.c = zzcjlVar;
        this.d = w12Var;
    }

    @Override // com.google.android.gms.internal.ads.zzclh
    public final void zza(boolean z, int i, String str, String str2) {
        int i2 = this.a;
        w12 w12Var = this.d;
        zzcjl zzcjlVar = this.c;
        zzdsh zzdshVar = this.b;
        switch (i2) {
            case 0:
                if (!z) {
                    zzdshVar.getClass();
                    int length = String.valueOf(i).length();
                    StringBuilder sb = new StringBuilder(length + 63 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
                    sb.append("Html video Web View failed to load. Error code: ");
                    sb.append(i);
                    sb.append(", Description: ");
                    sb.append(str);
                    w12Var.b(new zzenv(1, vh.s(sb, ", Failing URL: ", str2)));
                } else {
                    zzga zzgaVar = zzdshVar.a.a;
                    if (zzgaVar != null && zzcjlVar.zzh() != null) {
                        zzcjlVar.zzh().a(zzgaVar);
                    }
                    w12Var.c();
                }
                break;
            default:
                zzdshVar.getClass();
                cu2 cu2Var = zzdshVar.a;
                if (!((Boolean) zzbd.zzc().a(p32.N4)).booleanValue()) {
                    zzga zzgaVar2 = cu2Var.a;
                    if (zzgaVar2 != null && zzcjlVar.zzh() != null) {
                        zzcjlVar.zzh().a(zzgaVar2);
                    }
                    w12Var.c();
                } else if (!z) {
                    int length2 = String.valueOf(i).length();
                    StringBuilder sb2 = new StringBuilder(length2 + 64 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
                    sb2.append("Native Video WebView failed to load. Error code: ");
                    sb2.append(i);
                    sb2.append(", Description: ");
                    sb2.append(str);
                    w12Var.b(new zzenv(1, vh.s(sb2, ", Failing URL: ", str2)));
                } else {
                    zzga zzgaVar3 = cu2Var.a;
                    if (zzgaVar3 != null && zzcjlVar.zzh() != null) {
                        zzcjlVar.zzh().a(zzgaVar3);
                    }
                    w12Var.c();
                }
                break;
        }
    }
}
