package defpackage;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.appcompat.view.menu.MenuItemWrapperICS;
import androidx.collection.SimpleArrayMap;
import androidx.core.internal.view.SupportMenuItem;
import androidx.core.internal.view.SupportSubMenu;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class yd {
    public final Context a;
    public SimpleArrayMap b;
    public SimpleArrayMap c;

    public yd(Context context) {
        this.a = context;
    }

    public final MenuItem a(MenuItem menuItem) {
        if (!(menuItem instanceof SupportMenuItem)) {
            return menuItem;
        }
        SupportMenuItem supportMenuItem = (SupportMenuItem) menuItem;
        SimpleArrayMap simpleArrayMap = this.b;
        if (simpleArrayMap == null) {
            simpleArrayMap = new SimpleArrayMap();
            this.b = simpleArrayMap;
        }
        MenuItem menuItem2 = (MenuItem) simpleArrayMap.get(supportMenuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemWrapperICS menuItemWrapperICS = new MenuItemWrapperICS(this.a, supportMenuItem);
        this.b.put(supportMenuItem, menuItemWrapperICS);
        return menuItemWrapperICS;
    }

    public final SubMenu b(SubMenu subMenu) {
        if (!(subMenu instanceof SupportSubMenu)) {
            return subMenu;
        }
        SupportSubMenu supportSubMenu = (SupportSubMenu) subMenu;
        SimpleArrayMap simpleArrayMap = this.c;
        if (simpleArrayMap == null) {
            simpleArrayMap = new SimpleArrayMap();
            this.c = simpleArrayMap;
        }
        SubMenu subMenu2 = (SubMenu) simpleArrayMap.get(supportSubMenu);
        if (subMenu2 != null) {
            return subMenu2;
        }
        qb1 qb1Var = new qb1(this.a, supportSubMenu);
        this.c.put(supportSubMenu, qb1Var);
        return qb1Var;
    }
}
