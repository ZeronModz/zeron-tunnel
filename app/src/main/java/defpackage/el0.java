package defpackage;

import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ListPopupWindow;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.internal.ads.zzduu;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class el0 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ el0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                ListPopupWindow listPopupWindow = (ListPopupWindow) this.b;
                cl0 cl0Var = listPopupWindow.r;
                Handler handler = listPopupWindow.v;
                PopupWindow popupWindow = listPopupWindow.z;
                int action = motionEvent.getAction();
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (action == 0 && popupWindow != null && popupWindow.isShowing() && x >= 0 && x < popupWindow.getWidth() && y >= 0 && y < popupWindow.getHeight()) {
                    handler.postDelayed(cl0Var, 250L);
                } else if (action == 1) {
                    handler.removeCallbacks(cl0Var);
                }
                return false;
            case 1:
                if (((Checkable) view).isChecked()) {
                    return ((GestureDetector) this.b).onTouchEvent(motionEvent);
                }
                return false;
            default:
                zzduu zzduuVar = (zzduu) this.b;
                if (((Boolean) zzbd.zzc().a(p32.yb)).booleanValue() && motionEvent != null && motionEvent.getAction() == 0) {
                    zzduuVar.r.a = motionEvent;
                }
                zzduuVar.j.zza();
                if (view != 0) {
                    view.performClick();
                }
                return false;
        }
    }
}
