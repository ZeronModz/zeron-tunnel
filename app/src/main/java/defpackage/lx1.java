package defpackage;

import com.google.android.gms.internal.ads.zzz;
import com.trilead.ssh2.sftp.AttribFlags;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class lx1 {
    public final String a;
    public final tw1 b;
    public final pw1 c;
    public final ey1 d;
    public final nv1 e;
    public final cx1 f;

    static {
        new zzz().a();
        String str = wt2.a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
    }

    public /* synthetic */ lx1(String str, nv1 nv1Var, tw1 tw1Var, pw1 pw1Var, ey1 ey1Var, cx1 cx1Var) {
        this.a = str;
        this.b = tw1Var;
        this.c = pw1Var;
        this.d = ey1Var;
        this.e = nv1Var;
        this.f = cx1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lx1)) {
            return false;
        }
        lx1 lx1Var = (lx1) obj;
        return this.a.equals(lx1Var.a) && this.e.equals(lx1Var.e) && Objects.equals(this.b, lx1Var.b) && this.c.equals(lx1Var.c) && Objects.equals(this.d, lx1Var.d) && Objects.equals(this.f, lx1Var.f);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        tw1 tw1Var = this.b;
        return (this.d.hashCode() + ((((this.c.hashCode() + ((iHashCode + (tw1Var != null ? tw1Var.hashCode() : 0)) * 31)) * 31) + AttribFlags.SSH_FILEXFER_ATTR_EXTENDED) * 31)) * 31;
    }
}
