package defpackage;

import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import com.google.android.material.search.SearchView;
import io.github.g00fy2.quickie.QRScannerActivity;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zz implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zz(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                b00 b00Var = (b00) obj;
                if (motionEvent.getAction() == 1) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - b00Var.o;
                    if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300) {
                        b00Var.m = false;
                    }
                    b00Var.t();
                    b00Var.m = true;
                    b00Var.o = System.currentTimeMillis();
                }
                return false;
            case 1:
                int i2 = QRScannerActivity.j;
                ((ScaleGestureDetector) obj).onTouchEvent(motionEvent);
                return true;
            default:
                SearchView searchView = (SearchView) obj;
                int i3 = SearchView.D;
                if (searchView.b()) {
                    searchView.a();
                }
                return false;
        }
    }
}
