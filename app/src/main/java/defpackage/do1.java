package defpackage;

import android.view.View;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class do1 implements AccessibilityViewCommand {
    public final /* synthetic */ eo1 a;

    public do1(eo1 eo1Var) {
        this.a = eo1Var;
    }

    @Override // androidx.core.view.accessibility.AccessibilityViewCommand
    public final boolean perform(View view, AccessibilityViewCommand.CommandArguments commandArguments) {
        int currentItem = ((ViewPager2) view).getCurrentItem() - 1;
        ViewPager2 viewPager2 = this.a.d;
        if (viewPager2.r) {
            viewPager2.d(currentItem, true);
        }
        return true;
    }
}
