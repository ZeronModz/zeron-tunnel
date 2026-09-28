package defpackage;

import com.google.android.gms.internal.ads.zzagc;
import com.google.android.gms.internal.ads.zzaz;
import com.google.android.gms.internal.ads.zzdgw;
import com.google.android.gms.internal.ads.zzdhc;
import com.google.android.gms.internal.ads.zzdy;
import com.google.android.ump.ConsentDebugSettings$Builder;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class px1 implements zzagc, zzdhc, zzdy {
    public static final px1 c;
    public static final px1 d;
    public final /* synthetic */ int a;
    public final boolean b;

    static {
        int i = 0;
        c = new px1(true, i);
        d = new px1(false, i);
    }

    public /* synthetic */ px1(boolean z, ConsentDebugSettings$Builder consentDebugSettings$Builder) {
        this.a = 1;
        this.b = z;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                boolean z = !this.b;
                StringBuilder sb = new StringBuilder(String.valueOf(z).length() + 33);
                sb.append("IncorrectFragmentation{expected=");
                sb.append(z);
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdhc
    /* JADX INFO: renamed from: zza */
    public /* synthetic */ void mo3zza(Object obj) {
        switch (this.a) {
            case 2:
                ((zzdgw) obj).zzm(this.b);
                break;
            case 3:
                ((zzdgw) obj).zzn(this.b);
                break;
            default:
                ((zzaz) obj).zzs(this.b);
                break;
        }
    }

    public /* synthetic */ px1(boolean z, int i) {
        this.a = i;
        this.b = z;
    }
}
