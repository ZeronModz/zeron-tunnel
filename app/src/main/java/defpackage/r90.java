package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.o;
import androidx.fragment.app.s;
import com.google.android.gms.internal.ads.zzcce;
import com.google.android.gms.internal.ads.zzcjw;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class r90 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ r90(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                o oVar = (o) obj2;
                Fragment fragment = oVar.c;
                oVar.k();
                s.f((ViewGroup) fragment.F.getParent(), ((s90) obj).a.G()).e();
                break;
            default:
                ((zzcjw) obj).f(view, (zzcce) obj2, 10);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        int i = this.a;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }
}
