package defpackage;

import android.view.View;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.drawerlayout.widget.DrawerLayout;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class iz implements AccessibilityViewCommand {
    public final /* synthetic */ DrawerLayout a;

    public iz(DrawerLayout drawerLayout) {
        this.a = drawerLayout;
    }

    @Override // androidx.core.view.accessibility.AccessibilityViewCommand
    public final boolean perform(View view, AccessibilityViewCommand.CommandArguments commandArguments) {
        if (!DrawerLayout.m(view)) {
            return false;
        }
        DrawerLayout drawerLayout = this.a;
        if (drawerLayout.i(view) == 2) {
            return false;
        }
        drawerLayout.c(view, true);
        return true;
    }
}
