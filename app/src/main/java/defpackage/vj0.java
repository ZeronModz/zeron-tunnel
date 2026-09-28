package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class vj0 extends l02 {
    public final /* synthetic */ int j;
    public final SideSheetBehavior k;

    public /* synthetic */ vj0(SideSheetBehavior sideSheetBehavior, int i) {
        this.j = i;
        this.k = sideSheetBehavior;
    }

    @Override // defpackage.l02
    public final boolean C(View view) {
        switch (this.j) {
            case 0:
                if (view.getRight() < (q() - r()) / 2) {
                }
                break;
            default:
                if (view.getLeft() > (q() + this.k.m) / 2) {
                }
                break;
        }
        return true;
    }

    @Override // defpackage.l02
    public final boolean D(float f, float f2) {
        switch (this.j) {
            case 0:
                if (Math.abs(f) <= Math.abs(f2) || Math.abs(f) <= 500.0f) {
                }
                break;
            default:
                if (Math.abs(f) <= Math.abs(f2) || Math.abs(f) <= 500.0f) {
                }
                break;
        }
        return false;
    }

    @Override // defpackage.l02
    public final boolean G(View view, float f) {
        int i = this.j;
        SideSheetBehavior sideSheetBehavior = this.k;
        switch (i) {
            case 0:
                if (Math.abs((f * sideSheetBehavior.k) + view.getLeft()) > 0.5f) {
                }
                break;
            default:
                if (Math.abs((f * sideSheetBehavior.k) + view.getRight()) > 0.5f) {
                }
                break;
        }
        return true;
    }

    @Override // defpackage.l02
    public final void N(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        switch (this.j) {
            case 0:
                marginLayoutParams.leftMargin = i;
                break;
            default:
                marginLayoutParams.rightMargin = i;
                break;
        }
    }

    @Override // defpackage.l02
    public final void O(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        int i3 = this.j;
        SideSheetBehavior sideSheetBehavior = this.k;
        switch (i3) {
            case 0:
                if (i <= sideSheetBehavior.m) {
                    marginLayoutParams.leftMargin = i2;
                }
                break;
            default:
                int i4 = sideSheetBehavior.m;
                if (i <= i4) {
                    marginLayoutParams.rightMargin = i4 - i;
                }
                break;
        }
    }

    @Override // defpackage.l02
    public final int b(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.j) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // defpackage.l02
    public final float c(int i) {
        switch (this.j) {
            case 0:
                float fR = r();
                return (i - fR) / (q() - fR);
            default:
                float f = this.k.m;
                return (f - i) / (f - q());
        }
    }

    @Override // defpackage.l02
    public final int o(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.j) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // defpackage.l02
    public final int q() {
        int i = this.j;
        SideSheetBehavior sideSheetBehavior = this.k;
        switch (i) {
            case 0:
                return Math.max(0, sideSheetBehavior.n + sideSheetBehavior.o);
            default:
                return Math.max(0, (sideSheetBehavior.m - sideSheetBehavior.l) - sideSheetBehavior.o);
        }
    }

    @Override // defpackage.l02
    public final int r() {
        int i = this.j;
        SideSheetBehavior sideSheetBehavior = this.k;
        switch (i) {
            case 0:
                return (-sideSheetBehavior.l) - sideSheetBehavior.o;
            default:
                return sideSheetBehavior.m;
        }
    }

    @Override // defpackage.l02
    public final int s() {
        int i = this.j;
        SideSheetBehavior sideSheetBehavior = this.k;
        switch (i) {
            case 0:
                return sideSheetBehavior.o;
            default:
                return sideSheetBehavior.m;
        }
    }

    @Override // defpackage.l02
    public final int t() {
        switch (this.j) {
            case 0:
                return -this.k.l;
            default:
                return q();
        }
    }

    @Override // defpackage.l02
    public final int u(View view) {
        int i = this.j;
        SideSheetBehavior sideSheetBehavior = this.k;
        switch (i) {
            case 0:
                return view.getRight() + sideSheetBehavior.o;
            default:
                return view.getLeft() - sideSheetBehavior.o;
        }
    }

    @Override // defpackage.l02
    public final int v(CoordinatorLayout coordinatorLayout) {
        switch (this.j) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    @Override // defpackage.l02
    public final int w() {
        switch (this.j) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    @Override // defpackage.l02
    public final boolean z(float f) {
        switch (this.j) {
            case 0:
                if (f > 0.0f) {
                }
                break;
            default:
                if (f < 0.0f) {
                }
                break;
        }
        return false;
    }
}
