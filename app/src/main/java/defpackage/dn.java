package defpackage;

import android.graphics.Outline;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class dn extends ViewOutlineProvider {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dn(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                fn fnVar = ((Chip) obj).e;
                if (fnVar == null) {
                    outline.setAlpha(0.0f);
                } else {
                    fnVar.getOutline(outline);
                }
                break;
            default:
                r71 r71Var = (r71) obj;
                if (r71Var.c != null && !r71Var.d.isEmpty()) {
                    RectF rectF = r71Var.d;
                    outline.setRoundRect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom, r71Var.g);
                    break;
                }
                break;
        }
    }
}
