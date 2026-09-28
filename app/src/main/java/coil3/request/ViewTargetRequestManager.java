package coil3.request;

import android.view.View;
import defpackage.bn0;
import defpackage.lv;
import defpackage.oy;
import defpackage.tb0;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.c;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcoil3/request/ViewTargetRequestManager;", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ViewTargetRequestManager implements View.OnAttachStateChangeListener {
    public final View a;
    public ViewTargetDisposable b;
    public Job c;
    public ViewTargetRequestDelegate d;
    public boolean e;

    public ViewTargetRequestManager(View view) {
        this.a = view;
    }

    public final synchronized void a() {
        try {
            Job job = this.c;
            if (job != null) {
                job.cancel((CancellationException) null);
            }
            tb0 tb0Var = tb0.a;
            lv lvVar = oy.a;
            this.c = c.d(tb0Var, bn0.a.e(), null, new ViewTargetRequestManager$dispose$1(this, null), 2);
            this.b = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        ViewTargetRequestDelegate viewTargetRequestDelegate = this.d;
        if (viewTargetRequestDelegate == null) {
            return;
        }
        this.e = true;
        viewTargetRequestDelegate.a.enqueue(viewTargetRequestDelegate.b);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewTargetRequestDelegate viewTargetRequestDelegate = this.d;
        if (viewTargetRequestDelegate != null) {
            viewTargetRequestDelegate.dispose();
        }
    }
}
