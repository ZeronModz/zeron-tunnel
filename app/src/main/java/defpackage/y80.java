package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.appcompat.widget.ForwardingListener;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class y80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ForwardingListener b;

    public /* synthetic */ y80(ForwardingListener forwardingListener, int i) {
        this.a = i;
        this.b = forwardingListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        ForwardingListener forwardingListener = this.b;
        switch (i) {
            case 0:
                ViewParent parent = forwardingListener.d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                break;
            default:
                forwardingListener.a();
                View view = forwardingListener.d;
                if (view.isEnabled() && !view.isLongClickable() && forwardingListener.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    forwardingListener.g = true;
                    break;
                }
                break;
        }
    }
}
