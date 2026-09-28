package defpackage;

import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class m7 extends l7 {
    public final /* synthetic */ AppCompatTextView c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m7(AppCompatTextView appCompatTextView) {
        super(appCompatTextView);
        this.c = appCompatTextView;
    }

    @Override // androidx.appcompat.widget.m, androidx.appcompat.widget.AppCompatTextView.SuperCaller
    public final void setLineHeight(int i, float f) {
        super/*android.widget.TextView*/.setLineHeight(i, f);
    }
}
