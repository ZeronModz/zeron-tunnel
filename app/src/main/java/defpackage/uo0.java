package defpackage;

import android.view.View;
import com.google.android.material.timepicker.MaterialTimePicker;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class uo0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ MaterialTimePicker b;

    public /* synthetic */ uo0(MaterialTimePicker materialTimePicker, int i) {
        this.a = i;
        this.b = materialTimePicker;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        MaterialTimePicker materialTimePicker = this.b;
        switch (i) {
            case 0:
                Iterator it = materialTimePicker.o0.iterator();
                while (it.hasNext()) {
                    ((View.OnClickListener) it.next()).onClick(view);
                }
                materialTimePicker.X(false, false);
                break;
            case 1:
                Iterator it2 = materialTimePicker.p0.iterator();
                while (it2.hasNext()) {
                    ((View.OnClickListener) it2.next()).onClick(view);
                }
                materialTimePicker.X(false, false);
                break;
            default:
                materialTimePicker.H0 = materialTimePicker.H0 == 0 ? 1 : 0;
                materialTimePicker.c0(materialTimePicker.F0);
                break;
        }
    }
}
