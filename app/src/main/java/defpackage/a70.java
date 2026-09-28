package defpackage;

import androidx.recyclerview.widget.p0;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.trilead.ssh2.sftp.AttribFlags;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class a70 {
    public int a;
    public int b;
    public int c;
    public int d = 0;
    public boolean e;
    public boolean f;
    public boolean g;
    public final /* synthetic */ FlexboxLayoutManager h;

    public a70(FlexboxLayoutManager flexboxLayoutManager) {
        this.h = flexboxLayoutManager;
    }

    public final void a() {
        FlexboxLayoutManager flexboxLayoutManager = this.h;
        if (!flexboxLayoutManager.isMainAxisDirectionHorizontal() && flexboxLayoutManager.u) {
            this.c = this.e ? flexboxLayoutManager.C.g() : flexboxLayoutManager.n - flexboxLayoutManager.C.k();
            return;
        }
        boolean z = this.e;
        p0 p0Var = flexboxLayoutManager.C;
        this.c = z ? p0Var.g() : p0Var.k();
    }

    public final void b() {
        this.a = -1;
        this.b = -1;
        this.c = AttribFlags.SSH_FILEXFER_ATTR_EXTENDED;
        this.f = false;
        this.g = false;
        FlexboxLayoutManager flexboxLayoutManager = this.h;
        boolean zIsMainAxisDirectionHorizontal = flexboxLayoutManager.isMainAxisDirectionHorizontal();
        int i = flexboxLayoutManager.q;
        if (zIsMainAxisDirectionHorizontal) {
            if (i == 0) {
                this.e = flexboxLayoutManager.p == 1;
                return;
            } else {
                this.e = i == 2;
                return;
            }
        }
        if (i == 0) {
            this.e = flexboxLayoutManager.p == 3;
        } else {
            this.e = i == 2;
        }
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.a + ", mFlexLinePosition=" + this.b + ", mCoordinate=" + this.c + ", mPerpendicularCoordinate=" + this.d + ", mLayoutFromEnd=" + this.e + ", mValid=" + this.f + ", mAssignedFromSavedState=" + this.g + '}';
    }
}
