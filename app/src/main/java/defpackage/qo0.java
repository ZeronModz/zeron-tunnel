package defpackage;

import androidx.fragment.app.Fragment;
import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.datepicker.MaterialTextInputPicker;
import com.google.android.material.datepicker.OnSelectionChangedListener;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class qo0 extends OnSelectionChangedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ qo0(Fragment fragment, int i) {
        this.a = i;
        this.b = fragment;
    }

    @Override // com.google.android.material.datepicker.OnSelectionChangedListener
    public final void a() {
        int i = this.a;
        Fragment fragment = this.b;
        switch (i) {
            case 0:
                ((MaterialDatePicker) fragment).O0.setEnabled(false);
                break;
            default:
                Iterator it = ((MaterialTextInputPicker) fragment).Y.iterator();
                while (it.hasNext()) {
                    ((OnSelectionChangedListener) it.next()).a();
                }
                break;
        }
    }

    @Override // com.google.android.material.datepicker.OnSelectionChangedListener
    public final void b(Object obj) {
        int i = this.a;
        Fragment fragment = this.b;
        switch (i) {
            case 0:
                MaterialDatePicker materialDatePicker = (MaterialDatePicker) fragment;
                String selectionDisplayString = materialDatePicker.c0().getSelectionDisplayString(materialDatePicker.f());
                materialDatePicker.L0.setContentDescription(materialDatePicker.c0().getSelectionContentDescription(materialDatePicker.M()));
                materialDatePicker.L0.setText(selectionDisplayString);
                materialDatePicker.O0.setEnabled(materialDatePicker.c0().isSelectionComplete());
                break;
            default:
                Iterator it = ((MaterialTextInputPicker) fragment).Y.iterator();
                while (it.hasNext()) {
                    ((OnSelectionChangedListener) it.next()).b(obj);
                }
                break;
        }
    }
}
