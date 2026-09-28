package defpackage;

import android.view.View;
import android.widget.EditText;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nn implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nn(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                qn qnVar = (qn) obj;
                qnVar.s(qnVar.t());
                break;
            case 1:
                for (EditText editText : (EditText[]) obj) {
                    if (editText.hasFocus()) {
                    }
                    break;
                }
                wo1.e(view, false);
                break;
            default:
                b00 b00Var = (b00) obj;
                b00Var.l = z;
                b00Var.p();
                if (!z) {
                    b00Var.s(false);
                    b00Var.m = false;
                }
                break;
        }
    }
}
