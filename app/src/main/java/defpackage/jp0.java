package defpackage;

import android.content.Context;
import android.view.ActionProvider;
import android.view.View;
import androidx.appcompat.view.menu.MenuItemWrapperICS;
import androidx.appcompat.view.menu.SubMenuBuilder;
import androidx.appcompat.view.menu.e;
import androidx.core.view.ActionProvider;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class jp0 extends ActionProvider implements ActionProvider.VisibilityListener {
    public ip0 b;
    public final android.view.ActionProvider c;
    public final /* synthetic */ MenuItemWrapperICS d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jp0(MenuItemWrapperICS menuItemWrapperICS, Context context, android.view.ActionProvider actionProvider) {
        super(context);
        this.d = menuItemWrapperICS;
        this.c = actionProvider;
    }

    @Override // androidx.core.view.ActionProvider
    public final boolean a() {
        return this.c.hasSubMenu();
    }

    @Override // androidx.core.view.ActionProvider
    public final boolean b() {
        return this.c.isVisible();
    }

    @Override // androidx.core.view.ActionProvider
    public final View c() {
        return this.c.onCreateActionView();
    }

    @Override // androidx.core.view.ActionProvider
    public final View d(e eVar) {
        return this.c.onCreateActionView(eVar);
    }

    @Override // androidx.core.view.ActionProvider
    public final boolean e() {
        return this.c.onPerformDefaultAction();
    }

    @Override // androidx.core.view.ActionProvider
    public final void f(SubMenuBuilder subMenuBuilder) {
        this.c.onPrepareSubMenu(this.d.b(subMenuBuilder));
    }

    @Override // androidx.core.view.ActionProvider
    public final boolean g() {
        return this.c.overridesItemVisibility();
    }

    @Override // androidx.core.view.ActionProvider
    public final void h(ip0 ip0Var) {
        this.b = ip0Var;
        this.c.setVisibilityListener(this);
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        ip0 ip0Var = this.b;
        if (ip0Var != null) {
            ip0Var.onActionProviderVisibilityChanged(z);
        }
    }
}
