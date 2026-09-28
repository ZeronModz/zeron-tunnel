package defpackage;

import androidx.activity.OnBackPressedCallback;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.NavController;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class v90 extends OnBackPressedCallback {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v90(Object obj, int i) {
        super(false);
        this.d = i;
        this.e = obj;
    }

    @Override // androidx.activity.OnBackPressedCallback
    public final void a() {
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case 0:
                FragmentManager fragmentManager = (FragmentManager) obj;
                fragmentManager.y(true);
                if (!fragmentManager.h.a) {
                    fragmentManager.g.c();
                } else {
                    fragmentManager.Q();
                }
                break;
            default:
                ((NavController) obj).e();
                break;
        }
    }
}
