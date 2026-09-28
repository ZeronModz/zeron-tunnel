package defpackage;

import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.d0;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hf1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Toolbar b;

    public /* synthetic */ hf1(Toolbar toolbar, int i) {
        this.a = i;
        this.b = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Toolbar toolbar = this.b;
        switch (i) {
            case 0:
                d0 d0Var = toolbar.M;
                e eVar = d0Var == null ? null : d0Var.b;
                if (eVar != null) {
                    eVar.collapseActionView();
                }
                break;
            default:
                toolbar.invalidateMenu();
                break;
        }
    }
}
