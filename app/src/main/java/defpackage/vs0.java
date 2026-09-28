package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import dev.zeron.tunnel.R;
import com.google.android.material.navigation.NavigationBarItemView;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class vs0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vs0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ld ldVar;
        int i9 = this.a;
        Object obj = this.b;
        switch (i9) {
            case 0:
                NavigationBarItemView navigationBarItemView = (NavigationBarItemView) obj;
                ImageView imageView = navigationBarItemView.n;
                if (imageView.getVisibility() == 0 && (ldVar = navigationBarItemView.F) != null) {
                    Rect rect = new Rect();
                    imageView.getDrawingRect(rect);
                    ldVar.setBounds(rect);
                    ldVar.h(imageView, null);
                    break;
                }
                break;
            case 1:
                SearchView searchView = (SearchView) obj;
                SearchView.SearchAutoComplete searchAutoComplete = searchView.p;
                View view2 = searchView.x;
                if (view2.getWidth() > 1) {
                    Resources resources = searchView.getContext().getResources();
                    int paddingLeft = searchView.r.getPaddingLeft();
                    Rect rect2 = new Rect();
                    boolean z = xo1.a;
                    boolean z2 = searchView.getLayoutDirection() == 1;
                    int dimensionPixelSize = searchView.P ? resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width) : 0;
                    searchAutoComplete.getDropDownBackground().getPadding(rect2);
                    int i10 = rect2.left;
                    searchAutoComplete.setDropDownHorizontalOffset(z2 ? -i10 : paddingLeft - (i10 + dimensionPixelSize));
                    searchAutoComplete.setDropDownWidth((((view2.getWidth() + rect2.left) + rect2.right) + dimensionPixelSize) - paddingLeft);
                }
                break;
            default:
                rf1 rf1Var = (rf1) obj;
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                rf1Var.K = iArr[0];
                view.getWindowVisibleDisplayFrame(rf1Var.D);
                break;
        }
    }
}
