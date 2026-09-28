package defpackage;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import androidx.appcompat.widget.ActivityChooserView;
import androidx.core.view.ActionProvider;
import com.google.android.material.internal.ContextUtils;
import com.google.android.material.internal.NavigationMenuPresenter;
import com.google.android.material.internal.NavigationMenuView;
import com.google.android.material.navigation.NavigationView;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class r2 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ViewGroup b;

    public /* synthetic */ r2(ViewGroup viewGroup, int i) {
        this.a = i;
        this.b = viewGroup;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ActionProvider.SubUiVisibilityListener subUiVisibilityListener;
        Rect rect;
        int i = this.a;
        boolean z = true;
        ViewGroup viewGroup = this.b;
        switch (i) {
            case 0:
                ActivityChooserView activityChooserView = (ActivityChooserView) viewGroup;
                if (activityChooserView.b()) {
                    if (!activityChooserView.isShown()) {
                        activityChooserView.getListPopupWindow().dismiss();
                        break;
                    } else {
                        activityChooserView.getListPopupWindow().show();
                        ActionProvider actionProvider = activityChooserView.j;
                        if (actionProvider != null && (subUiVisibilityListener = actionProvider.a) != null) {
                            subUiVisibilityListener.onSubUiVisibilityChanged(true);
                            break;
                        }
                    }
                }
                break;
            default:
                NavigationView navigationView = (NavigationView) viewGroup;
                int[] iArr = navigationView.l;
                navigationView.getLocationOnScreen(iArr);
                boolean z2 = iArr[1] == 0;
                NavigationMenuPresenter navigationMenuPresenter = navigationView.i;
                if (navigationMenuPresenter.y != z2) {
                    navigationMenuPresenter.y = z2;
                    int i2 = (navigationMenuPresenter.b.getChildCount() <= 0 && navigationMenuPresenter.y) ? navigationMenuPresenter.A : 0;
                    NavigationMenuView navigationMenuView = navigationMenuPresenter.a;
                    navigationMenuView.setPadding(0, i2, 0, navigationMenuView.getPaddingBottom());
                }
                navigationView.setDrawTopInsetForeground(z2 && navigationView.o);
                int i3 = iArr[0];
                navigationView.setDrawLeftInsetForeground(i3 == 0 || navigationView.getWidth() + i3 == 0);
                Activity activityA = ContextUtils.a(navigationView.getContext());
                if (activityA != null) {
                    WindowManager windowManager = (WindowManager) activityA.getSystemService("window");
                    if (Build.VERSION.SDK_INT >= 30) {
                        rect = u1.g(windowManager);
                    } else {
                        Display defaultDisplay = windowManager.getDefaultDisplay();
                        Point point = new Point();
                        defaultDisplay.getRealSize(point);
                        rect = new Rect();
                        rect.right = point.x;
                        rect.bottom = point.y;
                    }
                    navigationView.setDrawBottomInsetForeground((rect.height() - navigationView.getHeight() == iArr[1]) && (Color.alpha(activityA.getWindow().getNavigationBarColor()) != 0) && navigationView.p);
                    if (rect.width() != iArr[0] && rect.width() - navigationView.getWidth() != iArr[0]) {
                        z = false;
                    }
                    navigationView.setDrawRightInsetForeground(z);
                }
                break;
        }
    }
}
