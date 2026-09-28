package defpackage;

import com.google.android.material.datepicker.OnSelectionChangedListener;
import com.google.android.material.datepicker.RangeDateSelector;
import com.google.android.material.textfield.TextInputLayout;
import java.text.SimpleDateFormat;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class o11 extends gu {
    public final /* synthetic */ int i;
    public final /* synthetic */ TextInputLayout j;
    public final /* synthetic */ TextInputLayout k;
    public final /* synthetic */ OnSelectionChangedListener l;
    public final /* synthetic */ RangeDateSelector m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o11(RangeDateSelector rangeDateSelector, String str, SimpleDateFormat simpleDateFormat, TextInputLayout textInputLayout, kh khVar, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, OnSelectionChangedListener onSelectionChangedListener, int i) {
        super(str, simpleDateFormat, textInputLayout, khVar);
        this.i = i;
        this.m = rangeDateSelector;
        this.j = textInputLayout2;
        this.k = textInputLayout3;
        this.l = onSelectionChangedListener;
    }

    @Override // defpackage.gu
    public final void a() {
        int i = this.i;
        OnSelectionChangedListener onSelectionChangedListener = this.l;
        TextInputLayout textInputLayout = this.k;
        TextInputLayout textInputLayout2 = this.j;
        RangeDateSelector rangeDateSelector = this.m;
        switch (i) {
            case 0:
                rangeDateSelector.e = null;
                rangeDateSelector.a(textInputLayout2, textInputLayout, onSelectionChangedListener);
                break;
            default:
                rangeDateSelector.f = null;
                rangeDateSelector.a(textInputLayout2, textInputLayout, onSelectionChangedListener);
                break;
        }
    }

    @Override // defpackage.gu
    public final void b(Long l) {
        int i = this.i;
        OnSelectionChangedListener onSelectionChangedListener = this.l;
        TextInputLayout textInputLayout = this.k;
        TextInputLayout textInputLayout2 = this.j;
        RangeDateSelector rangeDateSelector = this.m;
        switch (i) {
            case 0:
                rangeDateSelector.e = l;
                rangeDateSelector.a(textInputLayout2, textInputLayout, onSelectionChangedListener);
                break;
            default:
                rangeDateSelector.f = l;
                rangeDateSelector.a(textInputLayout2, textInputLayout, onSelectionChangedListener);
                break;
        }
    }
}
