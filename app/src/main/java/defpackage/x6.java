package defpackage;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.emoji2.viewsintegration.EmojiTextViewHelper;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class x6 {
    public final TextView a;
    public final EmojiTextViewHelper b;

    public x6(TextView textView) {
        this.a = textView;
        this.b = new EmojiTextViewHelper(textView, false);
    }

    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.b.a.j(inputFilterArr);
    }

    public final boolean b() {
        return this.b.a.l();
    }

    public final void c(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = this.a.getContext().obtainStyledAttributes(attributeSet, m11.j, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            e(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void d(boolean z) {
        this.b.a.q(z);
    }

    public final void e(boolean z) {
        this.b.a.r(z);
    }
}
