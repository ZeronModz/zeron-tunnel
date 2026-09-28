package defpackage;

import android.R;
import android.content.res.TypedArray;
import android.view.View;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.d0;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.preference.Preference;
import com.google.android.gms.internal.ads.zzbwr;
import com.google.android.gms.internal.ads.zzduu;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.internal.NavigationMenuItemView;
import com.google.android.material.internal.NavigationMenuPresenter;
import com.google.android.material.internal.d;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarMenuView;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class c2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public c2(zzbwr zzbwrVar) {
        this.a = 7;
        Objects.requireNonNull(zzbwrVar);
        this.b = zzbwrVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        boolean z = true;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((ActionMode) obj).a();
                break;
            case 1:
                ActionBarDrawerToggle actionBarDrawerToggle = (ActionBarDrawerToggle) obj;
                if (actionBarDrawerToggle.e) {
                    DrawerLayout drawerLayout = actionBarDrawerToggle.b;
                    int iH = drawerLayout.h(8388611);
                    View viewF = drawerLayout.f(8388611);
                    if ((viewF != null ? DrawerLayout.o(viewF) : false) && iH != 2) {
                        drawerLayout.d();
                    } else if (iH != 1) {
                        drawerLayout.q();
                    }
                }
                break;
            case 2:
                BottomSheetDialog bottomSheetDialog = (BottomSheetDialog) obj;
                if (bottomSheetDialog.j && bottomSheetDialog.isShowing()) {
                    if (!bottomSheetDialog.l) {
                        TypedArray typedArrayObtainStyledAttributes = bottomSheetDialog.getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
                        bottomSheetDialog.k = typedArrayObtainStyledAttributes.getBoolean(0, true);
                        typedArrayObtainStyledAttributes.recycle();
                        bottomSheetDialog.l = true;
                    }
                    if (bottomSheetDialog.k) {
                        bottomSheetDialog.cancel();
                    }
                    break;
                }
                break;
            case 3:
                e itemData = ((NavigationBarItemView) view).getItemData();
                NavigationBarMenuView navigationBarMenuView = (NavigationBarMenuView) obj;
                if (!navigationBarMenuView.E.s(itemData, navigationBarMenuView.D, 0)) {
                    itemData.setChecked(true);
                }
                break;
            case 4:
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) view;
                NavigationMenuPresenter navigationMenuPresenter = (NavigationMenuPresenter) obj;
                d dVar = navigationMenuPresenter.f;
                if (dVar != null) {
                    dVar.f = true;
                }
                e itemData2 = navigationMenuItemView.getItemData();
                boolean zS = navigationMenuPresenter.d.s(itemData2, navigationMenuPresenter, 0);
                if (itemData2 != null && itemData2.isCheckable() && zS) {
                    navigationMenuPresenter.f.v(itemData2);
                } else {
                    z = false;
                }
                d dVar2 = navigationMenuPresenter.f;
                if (dVar2 != null) {
                    dVar2.f = false;
                }
                if (z) {
                    navigationMenuPresenter.updateMenuView(false);
                }
                break;
            case 5:
                ((Preference) obj).t(view);
                break;
            case 6:
                d0 d0Var = ((Toolbar) obj).M;
                e eVar = d0Var == null ? null : d0Var.b;
                if (eVar != null) {
                    eVar.collapseActionView();
                }
                break;
            case 7:
                ((zzbwr) obj).e(true);
                break;
            default:
                ((zzduu) obj).j.zza();
                break;
        }
    }

    public /* synthetic */ c2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
