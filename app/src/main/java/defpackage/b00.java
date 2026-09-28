package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.core.view.accessibility.AccessibilityManagerCompat$TouchExplorationStateChangeListener;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.h;
import dev.zeron.tunnel.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textfield.b;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b00 extends r20 {
    public final int e;
    public final int f;
    public final TimeInterpolator g;
    public AutoCompleteTextView h;
    public final mn i;
    public final nn j;
    public final b1 k;
    public boolean l;
    public boolean m;
    public boolean n;
    public long o;
    public AccessibilityManager p;
    public ValueAnimator q;
    public ValueAnimator r;

    public b00(b bVar) {
        super(bVar);
        int i = 2;
        this.i = new mn(this, i);
        this.j = new nn(this, i);
        this.k = new b1(this, 16);
        this.o = Long.MAX_VALUE;
        this.f = MaterialAttributes.c(bVar.getContext(), R.attr.motionDurationShort3, 67);
        this.e = MaterialAttributes.c(bVar.getContext(), R.attr.motionDurationShort3, 50);
        this.g = kf2.v(bVar.getContext(), R.attr.motionEasingLinearInterpolator, AnimationUtils.a);
    }

    @Override // defpackage.r20
    public final void a() {
        if (this.p.isTouchExplorationEnabled() && this.h.getInputType() != 0 && !this.d.hasFocus()) {
            this.h.dismissDropDown();
        }
        this.h.post(new w2(this, 26));
    }

    @Override // defpackage.r20
    public final int c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // defpackage.r20
    public final int d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // defpackage.r20
    public final View.OnFocusChangeListener e() {
        return this.j;
    }

    @Override // defpackage.r20
    public final View.OnClickListener f() {
        return this.i;
    }

    @Override // defpackage.r20
    public final AccessibilityManagerCompat$TouchExplorationStateChangeListener h() {
        return this.k;
    }

    @Override // defpackage.r20
    public final boolean i(int i) {
        return i != 0;
    }

    @Override // defpackage.r20
    public final boolean k() {
        return this.n;
    }

    @Override // defpackage.r20
    public final void l(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            s31.f("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
            return;
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new zz(this, 0));
        this.h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: a00
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                b00 b00Var = this.a;
                b00Var.m = true;
                b00Var.o = System.currentTimeMillis();
                b00Var.s(false);
            }
        });
        this.h.setThreshold(0);
        TextInputLayout textInputLayout = this.a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (editText.getInputType() == 0 && this.p.isTouchExplorationEnabled()) {
            WeakHashMap weakHashMap = h.a;
            this.d.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // defpackage.r20
    public final void m(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        if (this.h.getInputType() == 0) {
            accessibilityNodeInfoCompat.l(Spinner.class.getName());
        }
        if (accessibilityNodeInfoCompat.h()) {
            accessibilityNodeInfoCompat.r(null);
        }
    }

    @Override // defpackage.r20
    public final void n(AccessibilityEvent accessibilityEvent) {
        if (this.p.isEnabled() && this.h.getInputType() == 0) {
            boolean z = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.n && !this.h.isPopupShowing();
            if (accessibilityEvent.getEventType() == 1 || z) {
                t();
                this.m = true;
                this.o = System.currentTimeMillis();
            }
        }
    }

    @Override // defpackage.r20
    public final void q() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.g;
        valueAnimatorOfFloat.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat.setDuration(this.f);
        int i = 1;
        valueAnimatorOfFloat.addUpdateListener(new mz(this, i));
        this.r = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat2.setDuration(this.e);
        valueAnimatorOfFloat2.addUpdateListener(new mz(this, i));
        this.q = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addListener(new d2(this, 3));
        this.p = (AccessibilityManager) this.c.getSystemService("accessibility");
    }

    @Override // defpackage.r20
    public final void r() {
        AutoCompleteTextView autoCompleteTextView = this.h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.h.setOnDismissListener(null);
        }
    }

    public final void s(boolean z) {
        if (this.n != z) {
            this.n = z;
            this.r.cancel();
            this.q.start();
        }
    }

    public final void t() {
        if (this.h == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.o;
        if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300) {
            this.m = false;
        }
        if (this.m) {
            this.m = false;
            return;
        }
        s(!this.n);
        boolean z = this.n;
        AutoCompleteTextView autoCompleteTextView = this.h;
        if (!z) {
            autoCompleteTextView.dismissDropDown();
        } else {
            autoCompleteTextView.requestFocus();
            this.h.showDropDown();
        }
    }
}
