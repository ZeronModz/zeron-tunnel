package defpackage;

import com.google.android.material.datepicker.OnSelectionChangedListener;
import com.google.android.material.datepicker.SingleDateSelector;
import com.google.android.material.textfield.TextInputLayout;
import java.text.SimpleDateFormat;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class i81 extends gu {
    public final /* synthetic */ OnSelectionChangedListener i;
    public final /* synthetic */ TextInputLayout j;
    public final /* synthetic */ SingleDateSelector k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i81(SingleDateSelector singleDateSelector, String str, SimpleDateFormat simpleDateFormat, TextInputLayout textInputLayout, kh khVar, OnSelectionChangedListener onSelectionChangedListener, TextInputLayout textInputLayout2) {
        super(str, simpleDateFormat, textInputLayout, khVar);
        this.k = singleDateSelector;
        this.i = onSelectionChangedListener;
        this.j = textInputLayout2;
    }

    @Override // defpackage.gu
    public final void a() {
        this.k.a = this.j.getError();
        this.i.a();
    }

    @Override // defpackage.gu
    public final void b(Long l) {
        SingleDateSelector singleDateSelector = this.k;
        if (l == null) {
            singleDateSelector.b = null;
            l = null;
        } else {
            singleDateSelector.b = l;
        }
        singleDateSelector.a = null;
        this.i.b(l);
    }
}
