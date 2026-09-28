package defpackage;

import android.graphics.Typeface;
import androidx.core.content.res.ResourcesCompat$FontCallback;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.resources.TextAppearanceFontCallback;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class be1 extends ResourcesCompat$FontCallback {
    public final /* synthetic */ TextAppearanceFontCallback a;
    public final /* synthetic */ TextAppearance b;

    public be1(TextAppearance textAppearance, TextAppearanceFontCallback textAppearanceFontCallback) {
        this.b = textAppearance;
        this.a = textAppearanceFontCallback;
    }

    @Override // androidx.core.content.res.ResourcesCompat$FontCallback
    public final void b(int i) {
        this.b.m = true;
        this.a.a(i);
    }

    @Override // androidx.core.content.res.ResourcesCompat$FontCallback
    public final void c(Typeface typeface) {
        TextAppearance textAppearance = this.b;
        Typeface typefaceCreate = Typeface.create(typeface, textAppearance.c);
        textAppearance.n = typefaceCreate;
        textAppearance.m = true;
        this.a.b(typefaceCreate, false);
    }
}
