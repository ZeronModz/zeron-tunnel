package defpackage;

import android.graphics.Typeface;
import com.google.android.material.internal.CollapsingTextHelper;
import com.google.android.material.resources.CancelableFontCallback;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class go implements CancelableFontCallback.ApplyFont {
    public final /* synthetic */ CollapsingTextHelper a;

    public go(CollapsingTextHelper collapsingTextHelper) {
        this.a = collapsingTextHelper;
    }

    @Override // com.google.android.material.resources.CancelableFontCallback.ApplyFont
    public final void apply(Typeface typeface) {
        CollapsingTextHelper collapsingTextHelper = this.a;
        if (collapsingTextHelper.m(typeface)) {
            collapsingTextHelper.i(false);
        }
    }
}
