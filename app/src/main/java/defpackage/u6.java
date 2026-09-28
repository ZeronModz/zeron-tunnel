package defpackage;

import android.view.Window;
import androidx.appcompat.app.k;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPresenter;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class u6 implements MenuPresenter.Callback {
    public final /* synthetic */ k a;

    public u6(k kVar) {
        this.a = kVar;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
    public final void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
        t6 t6Var;
        MenuBuilder menuBuilderM = menuBuilder.m();
        int i = 0;
        boolean z2 = menuBuilderM != menuBuilder;
        if (z2) {
            menuBuilder = menuBuilderM;
        }
        k kVar = this.a;
        t6[] t6VarArr = kVar.L;
        int length = t6VarArr != null ? t6VarArr.length : 0;
        while (true) {
            if (i < length) {
                t6Var = t6VarArr[i];
                if (t6Var != null && t6Var.h == menuBuilder) {
                    break;
                } else {
                    i++;
                }
            } else {
                t6Var = null;
                break;
            }
        }
        if (t6Var != null) {
            if (!z2) {
                kVar.r(t6Var, z);
            } else {
                kVar.p(t6Var.a, t6Var, menuBuilderM);
                kVar.r(t6Var, true);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
    public final boolean onOpenSubMenu(MenuBuilder menuBuilder) {
        Window.Callback callback;
        if (menuBuilder != menuBuilder.m()) {
            return true;
        }
        k kVar = this.a;
        if (!kVar.F || (callback = kVar.l.getCallback()) == null || kVar.Q) {
            return true;
        }
        callback.onMenuOpened(108, menuBuilder);
        return true;
    }
}
