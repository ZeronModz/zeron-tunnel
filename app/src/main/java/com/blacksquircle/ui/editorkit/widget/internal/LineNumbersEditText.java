package com.blacksquircle.ui.editorkit.widget.internal;

import android.R;
import android.content.Context;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.widget.Toast;
import com.blacksquircle.ui.language.base.model.TextStructure;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.jk0;
import defpackage.xu;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR*\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R*\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R\u0017\u0010!\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lcom/blacksquircle/ui/editorkit/widget/internal/LineNumbersEditText;", "Lcom/blacksquircle/ui/editorkit/widget/internal/ScrollableEditText;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "text", "Lmk1;", "setTextContent", "(Ljava/lang/CharSequence;)V", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "value", "f", "Z", "getSoftKeyboard", "()Z", "setSoftKeyboard", "(Z)V", "softKeyboard", "g", "getReadOnly", "setReadOnly", "readOnly", "Lcom/blacksquircle/ui/language/base/model/TextStructure;", "h", "Lcom/blacksquircle/ui/language/base/model/TextStructure;", "getStructure", "()Lcom/blacksquircle/ui/language/base/model/TextStructure;", "structure", "editorkit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class LineNumbersEditText extends ScrollableEditText {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public boolean softKeyboard;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public boolean readOnly;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public final TextStructure structure;
    public final jk0 i;
    public int j;
    public int k;
    public CharSequence l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LineNumbersEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.structure = new TextStructure(new SpannableStringBuilder());
        this.i = new jk0(0, this);
        this.l = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        setGravity(8388659);
        setInputType(655361);
    }

    public void b(int i, int i2) {
        TextStructure textStructure = this.structure;
        if (i != 0) {
            textStructure.b.add(i, new TextStructure.Line(i2));
        } else {
            textStructure.getClass();
        }
    }

    public void d(int i, int i2, int i3, CharSequence charSequence) {
        this.j = i;
        this.k = i + i2;
    }

    public void e(int i, int i2, int i3, CharSequence charSequence) {
        CharSequence charSequenceSubSequence;
        if (charSequence == null || (charSequenceSubSequence = charSequence.subSequence(i, i3 + i)) == null) {
            charSequenceSubSequence = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        this.l = charSequenceSubSequence;
        h(this.j, this.k, charSequenceSubSequence);
        int i4 = this.j;
        TextStructure textStructure = this.structure;
        int iC = textStructure.c(i4);
        int iC2 = textStructure.c(this.l.length() + this.j);
        if (iC > iC2) {
            return;
        }
        while (true) {
            int iB = textStructure.b(iC);
            int iA = textStructure.a(iC);
            if (iB <= iA) {
                f(iC, iB, iA);
            }
            if (iC == iC2) {
                return;
            } else {
                iC++;
            }
        }
    }

    public void g(int i) {
        TextStructure textStructure = this.structure;
        if (i != 0) {
            textStructure.b.remove(i);
        } else {
            textStructure.getClass();
        }
    }

    public final boolean getReadOnly() {
        return this.readOnly;
    }

    public final boolean getSoftKeyboard() {
        return this.softKeyboard;
    }

    public final TextStructure getStructure() {
        return this.structure;
    }

    public final void h(int i, int i2, CharSequence charSequence) {
        if (i < 0) {
            i = 0;
        }
        TextStructure textStructure = this.structure;
        CharSequence charSequence2 = textStructure.a;
        CharSequence charSequence3 = textStructure.a;
        ArrayList arrayList = textStructure.b;
        if (i2 > charSequence2.length()) {
            i2 = charSequence3.length();
        }
        int length = charSequence.length() - (i2 - i);
        int iC = textStructure.c(i);
        for (int i3 = i; i3 < i2; i3++) {
            if (charSequence3.charAt(i3) == '\n') {
                g(1 + iC);
            }
        }
        int iC2 = textStructure.c(i) + 1;
        if (1 <= iC2 && iC2 < arrayList.size()) {
            while (iC2 < arrayList.size()) {
                int iB = textStructure.b(iC2) + length;
                if (iC2 <= 0 || iB > 0) {
                    ((TextStructure.Line) arrayList.get(iC2)).a = iB;
                } else {
                    if (iC2 != 0) {
                        arrayList.remove(iC2);
                    }
                    iC2--;
                }
                iC2++;
            }
        }
        int length2 = charSequence.length();
        for (int i4 = 0; i4 < length2; i4++) {
            if (charSequence.charAt(i4) == '\n') {
                int i5 = i + i4;
                b(textStructure.c(i5) + 1, i5 + 1);
            }
        }
        if (charSequence3 instanceof Editable) {
            ((Editable) charSequence3).replace(i, i2, charSequence);
        }
    }

    public final void setReadOnly(boolean z) {
        this.readOnly = z;
        setFocusable(!z);
        setFocusableInTouchMode(!z);
    }

    public final void setSoftKeyboard(boolean z) {
        this.softKeyboard = z;
        setImeOptions(z ? 0 : 268435456);
    }

    public void setTextContent(CharSequence text) {
        TextStructure textStructure = this.structure;
        text.getClass();
        jk0 jk0Var = this.i;
        removeTextChangedListener(jk0Var);
        try {
            setText(text);
            h(0, textStructure.a.length(), text);
        } catch (Throwable th) {
            th.printStackTrace();
            setText(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
            h(0, textStructure.a.length(), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
            Toast.makeText(getContext(), th.getMessage(), 1).show();
        }
        addTextChangedListener(jk0Var);
    }

    public void c(Editable editable) {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LineNumbersEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ LineNumbersEditText(Context context, AttributeSet attributeSet, int i, int i2, xu xuVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R.attr.autoCompleteTextViewStyle : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LineNumbersEditText(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public void f(int i, int i2, int i3) {
    }
}
