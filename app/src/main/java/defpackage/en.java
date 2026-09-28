package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.widget.ExploreByTouchHelper;
import dev.zeron.tunnel.R;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class en extends ExploreByTouchHelper {
    public final /* synthetic */ Chip q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public en(Chip chip, Chip chip2) {
        super(chip2);
        this.q = chip;
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper
    public final int n(float f, float f2) {
        Rect rect = Chip.x;
        Chip chip = this.q;
        fn fnVar = chip.e;
        if (fnVar == null) {
            return 0;
        }
        Drawable drawable = fnVar.M;
        return ((drawable != null ? qj1.E(drawable) : null) == null || !chip.getCloseIconTouchBounds().contains(f, f2)) ? 0 : 1;
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper
    public final void o(ArrayList arrayList) {
        fn fnVar;
        arrayList.add(0);
        Rect rect = Chip.x;
        Chip chip = this.q;
        fn fnVar2 = chip.e;
        if (fnVar2 != null) {
            Drawable drawable = fnVar2.M;
            if ((drawable != null ? qj1.E(drawable) : null) == null || (fnVar = chip.e) == null || !fnVar.L || chip.h == null) {
                return;
            }
            arrayList.add(1);
        }
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper
    public final boolean s(int i, int i2, Bundle bundle) {
        boolean z = false;
        if (i2 == 16) {
            Chip chip = this.q;
            if (i == 0) {
                return chip.performClick();
            }
            if (i == 1) {
                chip.playSoundEffect(0);
                View.OnClickListener onClickListener = chip.h;
                if (onClickListener != null) {
                    onClickListener.onClick(chip);
                    z = true;
                }
                if (chip.t) {
                    chip.s.x(1, 1);
                }
            }
        }
        return z;
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper
    public final void t(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        Chip chip = this.q;
        fn fnVar = chip.e;
        accessibilityNodeInfoCompat.a.setCheckable(fnVar != null && fnVar.R);
        accessibilityNodeInfoCompat.m(chip.isClickable());
        accessibilityNodeInfoCompat.l(chip.getAccessibilityClassName());
        accessibilityNodeInfoCompat.w(chip.getText());
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper
    public final void u(int i, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        CharSequence charSequence = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        if (i != 1) {
            accessibilityNodeInfoCompat.p(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
            accessibilityNodeInfoCompat.k(Chip.x);
            return;
        }
        Chip chip = this.q;
        CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
        if (closeIconContentDescription != null) {
            accessibilityNodeInfoCompat.p(closeIconContentDescription);
        } else {
            CharSequence text = chip.getText();
            Context context = chip.getContext();
            if (!TextUtils.isEmpty(text)) {
                charSequence = text;
            }
            accessibilityNodeInfoCompat.p(context.getString(R.string.mtrl_chip_close_icon_content_description, charSequence).trim());
        }
        accessibilityNodeInfoCompat.k(chip.getCloseIconTouchBoundsInt());
        accessibilityNodeInfoCompat.b(AccessibilityNodeInfoCompat.AccessibilityActionCompat.g);
        accessibilityNodeInfoCompat.a.setEnabled(chip.isEnabled());
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper
    public final void v(int i, boolean z) {
        if (i == 1) {
            Chip chip = this.q;
            chip.n = z;
            chip.refreshDrawableState();
        }
    }
}
