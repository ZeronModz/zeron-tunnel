package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.h;
import androidx.core.view.insets.e;
import androidx.core.view.insets.f;
import androidx.core.view.r;
import defpackage.id1;
import defpackage.og0;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class id1 {
    public final e a;
    public final ArrayList b = new ArrayList();
    public og0 c;
    public og0 d;
    public int e;

    public id1(ViewGroup viewGroup) {
        og0 og0Var = og0.e;
        this.c = og0Var;
        this.d = og0Var;
        Drawable background = viewGroup.getBackground();
        this.e = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        e eVar = new e(this, viewGroup.getContext(), viewGroup);
        this.a = eVar;
        eVar.setWillNotDraw(true);
        OnApplyWindowInsetsListener onApplyWindowInsetsListener = new OnApplyWindowInsetsListener() { // from class: androidx.core.view.insets.d
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                id1 id1Var = this.a;
                ArrayList arrayList = id1Var.b;
                og0 og0VarG = windowInsetsCompat.a.g(519);
                r rVar = windowInsetsCompat.a;
                og0 og0VarB = og0.b(og0VarG, rVar.g(64));
                og0 og0VarB2 = og0.b(rVar.h(519), rVar.h(64));
                if (!og0VarB.equals(id1Var.c) || !og0VarB2.equals(id1Var.d)) {
                    id1Var.c = og0VarB;
                    id1Var.d = og0VarB2;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ((SystemBarStateMonitor$Callback) arrayList.get(size)).onInsetsChanged(og0VarB, og0VarB2);
                    }
                }
                return windowInsetsCompat;
            }
        };
        WeakHashMap weakHashMap = h.a;
        cn1.m(eVar, onApplyWindowInsetsListener);
        WindowInsetsAnimationCompat.a(eVar, new f(this));
        viewGroup.addView(eVar, 0);
    }
}
