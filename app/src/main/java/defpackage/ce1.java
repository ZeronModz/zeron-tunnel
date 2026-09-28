package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.resources.TextAppearanceFontCallback;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ce1 extends TextAppearanceFontCallback {
    public final /* synthetic */ Context a;
    public final /* synthetic */ TextPaint b;
    public final /* synthetic */ TextAppearanceFontCallback c;
    public final /* synthetic */ TextAppearance d;

    public ce1(TextAppearance textAppearance, Context context, TextPaint textPaint, TextAppearanceFontCallback textAppearanceFontCallback) {
        this.d = textAppearance;
        this.a = context;
        this.b = textPaint;
        this.c = textAppearanceFontCallback;
    }

    @Override // com.google.android.material.resources.TextAppearanceFontCallback
    public final void a(int i) {
        this.c.a(i);
    }

    @Override // com.google.android.material.resources.TextAppearanceFontCallback
    public final void b(Typeface typeface, boolean z) {
        this.d.g(this.a, this.b, typeface);
        this.c.b(typeface, z);
    }
}
