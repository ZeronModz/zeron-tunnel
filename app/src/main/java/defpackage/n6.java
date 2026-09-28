package defpackage;

import android.window.OnBackInvokedCallback;
import androidx.appcompat.app.k;
import com.google.android.material.motion.MaterialBackHandler;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n6 implements OnBackInvokedCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n6(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public final void onBackInvoked() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((k) obj).E();
                break;
            case 1:
                ((MaterialBackHandler) obj).handleBackInvoked();
                break;
            case 2:
                ((Function0) obj).invoke();
                break;
            default:
                ((Runnable) obj).run();
                break;
        }
    }
}
