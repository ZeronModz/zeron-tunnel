package defpackage;

import com.google.android.gms.internal.ads.zzhbp;
import com.google.android.gms.internal.ads.zzhcg;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class j53 extends zzhcg {
    public final k53 a;
    public final hc3 b;
    public final Integer c;

    public j53(k53 k53Var, hc3 hc3Var, Integer num) {
        this.a = k53Var;
        this.b = hc3Var;
        this.c = num;
    }

    public static j53 d(k53 k53Var, Integer num) throws GeneralSecurityException {
        hc3 hc3VarA;
        q43 q43Var = k53Var.b;
        if (q43Var == q43.k) {
            if (num == null) {
                zg1.m("For given Variant TINK the value of idRequirement must be non-null");
                return null;
            }
            hc3VarA = hc3.a(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        } else {
            if (q43Var != q43.l) {
                throw new GeneralSecurityException("Unknown Variant: ".concat(k53Var.b.b));
            }
            if (num != null) {
                zg1.m("For given Variant NO_PREFIX the value of idRequirement must be null");
                return null;
            }
            hc3VarA = hc3.a(new byte[0]);
        }
        return new j53(k53Var, hc3VarA, num);
    }

    @Override // com.google.android.gms.internal.ads.zzhcg, com.google.android.gms.internal.ads.zzhaz
    public final /* synthetic */ zzhbp a() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.zzhaz
    public final Integer b() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.ads.zzhcg
    public final hc3 c() {
        return this.b;
    }
}
