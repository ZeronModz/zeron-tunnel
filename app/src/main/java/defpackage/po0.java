package defpackage;

import android.view.View;
import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class po0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ MaterialDatePicker b;

    public /* synthetic */ po0(MaterialDatePicker materialDatePicker, int i) {
        this.a = i;
        this.b = materialDatePicker;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        MaterialDatePicker materialDatePicker = this.b;
        switch (i) {
            case 0:
                Iterator it = materialDatePicker.o0.iterator();
                while (it.hasNext()) {
                    ((MaterialPickerOnPositiveButtonClickListener) it.next()).onPositiveButtonClick(materialDatePicker.c0().getSelection());
                }
                materialDatePicker.X(false, false);
                break;
            default:
                Iterator it2 = materialDatePicker.p0.iterator();
                while (it2.hasNext()) {
                    ((View.OnClickListener) it2.next()).onClick(view);
                }
                materialDatePicker.X(false, false);
                break;
        }
    }
}
