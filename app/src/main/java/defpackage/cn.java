package defpackage;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;
import com.google.android.material.resources.TextAppearanceFontCallback;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class cn extends TextAppearanceFontCallback {
    public final /* synthetic */ Chip a;

    public cn(Chip chip) {
        this.a = chip;
    }

    @Override // com.google.android.material.resources.TextAppearanceFontCallback
    public final void b(Typeface typeface, boolean z) {
        Chip chip = this.a;
        fn fnVar = chip.e;
        chip.setText(fnVar.D0 ? fnVar.F : chip.getText());
        chip.requestLayout();
        chip.invalidate();
    }

    @Override // com.google.android.material.resources.TextAppearanceFontCallback
    public final void a(int i) {
    }
}
