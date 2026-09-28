package defpackage;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.k;
import androidx.appcompat.app.l;
import androidx.appcompat.view.SupportActionModeWrapper;
import androidx.appcompat.view.WindowCallbackWrapper;
import androidx.appcompat.view.menu.MenuBuilder;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class p6 extends WindowCallbackWrapper {
    public l b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final /* synthetic */ k f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6(k kVar, Window.Callback callback) {
        super(callback);
        this.f = kVar;
    }

    public final void a(Window.Callback callback) {
        try {
            this.c = true;
            callback.onContentChanged();
        } finally {
            this.c = false;
        }
    }

    @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z = this.d;
        Window.Callback callback = this.a;
        return z ? callback.dispatchKeyEvent(keyEvent) : this.f.t(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (!this.a.dispatchKeyShortcutEvent(keyEvent)) {
            int keyCode = keyEvent.getKeyCode();
            k kVar = this.f;
            kVar.B();
            ActionBar actionBar = kVar.o;
            if (actionBar == null || !actionBar.i(keyCode, keyEvent)) {
                t6 t6Var = kVar.M;
                if (t6Var == null || !kVar.G(t6Var, keyEvent.getKeyCode(), keyEvent)) {
                    if (kVar.M == null) {
                        t6 t6VarA = kVar.A(0);
                        kVar.H(t6VarA, keyEvent);
                        boolean zG = kVar.G(t6VarA, keyEvent.getKeyCode(), keyEvent);
                        t6VarA.k = false;
                        if (zG) {
                        }
                    }
                    return false;
                }
                t6 t6Var2 = kVar.M;
                if (t6Var2 != null) {
                    t6Var2.l = true;
                    return true;
                }
            }
        }
        return true;
    }

    @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
    public final void onContentChanged() {
        if (this.c) {
            this.a.onContentChanged();
        }
    }

    @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof MenuBuilder)) {
            return this.a.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        View viewOnCreatePanelView;
        l lVar = this.b;
        return (lVar == null || (viewOnCreatePanelView = lVar.onCreatePanelView(i)) == null) ? this.a.onCreatePanelView(i) : viewOnCreatePanelView;
    }

    @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        super.onMenuOpened(i, menu);
        if (i == 108) {
            k kVar = this.f;
            kVar.B();
            ActionBar actionBar = kVar.o;
            if (actionBar != null) {
                actionBar.c(true);
            }
        }
        return true;
    }

    @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.e) {
            this.a.onPanelClosed(i, menu);
            return;
        }
        super.onPanelClosed(i, menu);
        k kVar = this.f;
        if (i == 108) {
            kVar.B();
            ActionBar actionBar = kVar.o;
            if (actionBar != null) {
                actionBar.c(false);
                return;
            }
            return;
        }
        if (i == 0) {
            t6 t6VarA = kVar.A(i);
            if (t6VarA.m) {
                kVar.r(t6VarA, false);
            }
        }
    }

    @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        MenuBuilder menuBuilder = menu instanceof MenuBuilder ? (MenuBuilder) menu : null;
        if (i == 0 && menuBuilder == null) {
            return false;
        }
        if (menuBuilder != null) {
            menuBuilder.x = true;
        }
        l lVar = this.b;
        if (lVar != null) {
            lVar.onPreparePanel(i);
        }
        boolean zOnPreparePanel = this.a.onPreparePanel(i, view, menu);
        if (menuBuilder != null) {
            menuBuilder.x = false;
        }
        return zOnPreparePanel;
    }

    @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        MenuBuilder menuBuilder = this.f.A(0).h;
        if (menuBuilder != null) {
            super.onProvideKeyboardShortcuts(list, menuBuilder, i);
        } else {
            super.onProvideKeyboardShortcuts(list, menu, i);
        }
    }

    @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        if (i != 0) {
            return aq1.b(this.a, callback, i);
        }
        k kVar = this.f;
        SupportActionModeWrapper.CallbackWrapper callbackWrapper = new SupportActionModeWrapper.CallbackWrapper(kVar.k, callback);
        androidx.appcompat.view.ActionMode actionModeL = kVar.l(callbackWrapper);
        if (actionModeL != null) {
            return callbackWrapper.a(actionModeL);
        }
        return null;
    }

    @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
