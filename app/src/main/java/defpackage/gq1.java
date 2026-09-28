package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.PathInterpolator;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.l;
import androidx.core.view.r;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class gq1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ WindowInsetsAnimationCompat a;
    public final /* synthetic */ WindowInsetsCompat b;
    public final /* synthetic */ WindowInsetsCompat c;
    public final /* synthetic */ int d;
    public final /* synthetic */ View e;

    public gq1(WindowInsetsAnimationCompat windowInsetsAnimationCompat, WindowInsetsCompat windowInsetsCompat, WindowInsetsCompat windowInsetsCompat2, int i, View view) {
        this.a = windowInsetsAnimationCompat;
        this.b = windowInsetsCompat;
        this.c = windowInsetsCompat2;
        this.d = i;
        this.e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        WindowInsetsAnimationCompat windowInsetsAnimationCompat = this.a;
        iq1 iq1Var = windowInsetsAnimationCompat.a;
        iq1Var.e(animatedFraction);
        float fC = iq1Var.c();
        PathInterpolator pathInterpolator = l.e;
        WindowInsetsCompat windowInsetsCompat = this.b;
        WindowInsetsCompat.Builder builder = new WindowInsetsCompat.Builder(windowInsetsCompat);
        int i = 1;
        while (true) {
            oq1 oq1Var = builder.a;
            if (i > 512) {
                l.h(this.e, oq1Var.b(), Collections.singletonList(windowInsetsAnimationCompat));
                return;
            }
            int i2 = this.d & i;
            r rVar = windowInsetsCompat.a;
            if (i2 == 0) {
                oq1Var.c(i, rVar.g(i));
            } else {
                og0 og0VarG = rVar.g(i);
                og0 og0VarG2 = this.c.a.g(i);
                float f = 1.0f - fC;
                oq1Var.c(i, WindowInsetsCompat.e(og0VarG, (int) (((double) ((og0VarG.a - og0VarG2.a) * f)) + 0.5d), (int) (((double) ((og0VarG.b - og0VarG2.b) * f)) + 0.5d), (int) (((double) ((og0VarG.c - og0VarG2.c) * f)) + 0.5d), (int) (((double) ((og0VarG.d - og0VarG2.d) * f)) + 0.5d)));
            }
            i <<= 1;
        }
    }
}
