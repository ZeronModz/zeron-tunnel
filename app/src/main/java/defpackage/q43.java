package defpackage;

import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzdhc;
import com.google.android.gms.internal.ads.zzdin;
import com.google.android.gms.internal.ads.zzdjy;
import com.google.android.gms.internal.ads.zzgzl;
import java.util.Objects;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class q43 implements zzgzl, zzdhc {
    public static final q43 c;
    public static final q43 d;
    public static final q43 e;
    public static final q43 f;
    public static final q43 g;
    public static final q43 h;
    public static final q43 i;
    public static final q43 j;
    public static final q43 k;
    public static final q43 l;
    public static final q43 m;
    public static final q43 n;
    public static final q43 o;
    public static final q43 p;
    public static final q43 q;
    public final /* synthetic */ int a;
    public String b;

    static {
        int i2 = 0;
        c = new q43("SHA1", i2);
        d = new q43("SHA224", i2);
        e = new q43("SHA256", i2);
        f = new q43("SHA384", i2);
        g = new q43("SHA512", i2);
        int i3 = 1;
        h = new q43("TINK", i3);
        i = new q43("CRUNCHY", i3);
        j = new q43("NO_PREFIX", i3);
        int i4 = 2;
        k = new q43("TINK", i4);
        l = new q43("NO_PREFIX", i4);
        int i5 = 3;
        m = new q43("TINK", i5);
        n = new q43("NO_PREFIX", i5);
        int i6 = 4;
        o = new q43("SHA256", i6);
        p = new q43("SHA384", i6);
        q = new q43("SHA512", i6);
    }

    public q43(String str) {
        this.a = 6;
        str.getClass();
        this.b = str;
    }

    public String a(Iterable iterable) {
        Iterator it = iterable.iterator();
        StringBuilder sb = new StringBuilder();
        try {
            if (it.hasNext()) {
                sb.append(b(it.next()));
                while (it.hasNext()) {
                    sb.append((CharSequence) this.b);
                    sb.append(b(it.next()));
                }
            }
            return sb.toString();
        } catch (IOException e2) {
            u7.g(e2);
            return null;
        }
    }

    public CharSequence b(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return this.b;
            case 1:
                return this.b;
            case 2:
                return this.b;
            case 3:
                return this.b;
            case 4:
                return this.b;
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdhc
    /* JADX INFO: renamed from: zza */
    public /* synthetic */ void mo3zza(Object obj) {
        switch (this.a) {
            case 8:
                ((zzdin) obj).zza(this.b);
                break;
            default:
                ((zzdjy) obj).zze(this.b);
                break;
        }
    }

    public /* synthetic */ q43(String str, int i2) {
        this.a = i2;
        this.b = str;
    }

    public q43(q43 q43Var) {
        this.a = 6;
        this.b = q43Var.b;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public void zza(Throwable th) {
        zzt.zzh().g(th, this.b);
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    /* JADX INFO: renamed from: zzb */
    public void mo5zzb(Object obj) {
    }
}
