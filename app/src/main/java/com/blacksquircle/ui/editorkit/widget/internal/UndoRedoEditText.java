package com.blacksquircle.ui.editorkit.widget.internal;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import com.blacksquircle.ui.editorkit.model.TextChange;
import com.blacksquircle.ui.editorkit.model.UndoStack;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.xu;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u00002\u00020\u0001:\u0001#B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001a\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015R$\u0010\"\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006$"}, d2 = {"Lcom/blacksquircle/ui/editorkit/widget/internal/UndoRedoEditText;", "Lcom/blacksquircle/ui/editorkit/widget/internal/LineNumbersEditText;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "text", "Lmk1;", "setTextContent", "(Ljava/lang/CharSequence;)V", "Lcom/blacksquircle/ui/editorkit/model/UndoStack;", "m", "Lcom/blacksquircle/ui/editorkit/model/UndoStack;", "getUndoStack", "()Lcom/blacksquircle/ui/editorkit/model/UndoStack;", "setUndoStack", "(Lcom/blacksquircle/ui/editorkit/model/UndoStack;)V", "undoStack", "n", "getRedoStack", "setRedoStack", "redoStack", "Lcom/blacksquircle/ui/editorkit/widget/internal/UndoRedoEditText$OnUndoRedoChangedListener;", "o", "Lcom/blacksquircle/ui/editorkit/widget/internal/UndoRedoEditText$OnUndoRedoChangedListener;", "getOnUndoRedoChangedListener", "()Lcom/blacksquircle/ui/editorkit/widget/internal/UndoRedoEditText$OnUndoRedoChangedListener;", "setOnUndoRedoChangedListener", "(Lcom/blacksquircle/ui/editorkit/widget/internal/UndoRedoEditText$OnUndoRedoChangedListener;)V", "onUndoRedoChangedListener", "OnUndoRedoChangedListener", "editorkit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class UndoRedoEditText extends LineNumbersEditText {

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public UndoStack undoStack;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public UndoStack redoStack;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public OnUndoRedoChangedListener onUndoRedoChangedListener;
    public TextChange p;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/blacksquircle/ui/editorkit/widget/internal/UndoRedoEditText$OnUndoRedoChangedListener;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lmk1;", "onUndoRedoChanged", "()V", "editorkit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface OnUndoRedoChangedListener {
        void onUndoRedoChanged();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UndoRedoEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.undoStack = new UndoStack();
        this.redoStack = new UndoStack();
    }

    @Override // com.blacksquircle.ui.editorkit.widget.internal.LineNumbersEditText
    public void d(int i, int i2, int i3, CharSequence charSequence) {
        super.d(i, i2, i3, charSequence);
        TextChange textChange = null;
        if (i2 < Integer.MAX_VALUE) {
            textChange = new TextChange(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, String.valueOf(charSequence != null ? charSequence.subSequence(i, i2 + i) : null), i);
        } else {
            this.undoStack.c();
            this.redoStack.c();
        }
        this.p = textChange;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0057  */
    @Override // com.blacksquircle.ui.editorkit.widget.internal.LineNumbersEditText
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(int r3, int r4, int r5, java.lang.CharSequence r6) {
        /*
            r2 = this;
            super.e(r3, r4, r5, r6)
            com.blacksquircle.ui.editorkit.model.TextChange r4 = r2.p
            if (r4 == 0) goto L8e
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1 = 0
            if (r5 >= r0) goto L7b
            if (r6 == 0) goto L15
            int r5 = r5 + r3
            java.lang.CharSequence r5 = r6.subSequence(r3, r5)
            goto L16
        L15:
            r5 = r1
        L16:
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r4.a = r5
            com.blacksquircle.ui.editorkit.model.TextChange r4 = r2.p
            if (r4 == 0) goto L85
            int r5 = r4.c
            if (r3 != r5) goto L85
            java.lang.String r3 = r4.b
            int r3 = r3.length()
            r4 = 0
            r5 = 1
            if (r3 <= 0) goto L30
            r3 = r5
            goto L31
        L30:
            r3 = r4
        L31:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L57
            com.blacksquircle.ui.editorkit.model.TextChange r3 = r2.p
            if (r3 == 0) goto L4d
            java.lang.String r3 = r3.a
            int r3 = r3.length()
            if (r3 <= 0) goto L48
            r4 = r5
        L48:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r4)
            goto L4e
        L4d:
            r3 = r1
        L4e:
            r3.getClass()
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L85
        L57:
            com.blacksquircle.ui.editorkit.model.TextChange r3 = r2.p
            if (r3 == 0) goto L5e
            java.lang.String r4 = r3.b
            goto L5f
        L5e:
            r4 = r1
        L5f:
            if (r3 == 0) goto L64
            java.lang.String r3 = r3.a
            goto L65
        L64:
            r3 = r1
        L65:
            boolean r3 = defpackage.yg0.a(r4, r3)
            if (r3 != 0) goto L85
            com.blacksquircle.ui.editorkit.model.UndoStack r3 = r2.undoStack
            com.blacksquircle.ui.editorkit.model.TextChange r4 = r2.p
            r4.getClass()
            r3.b(r4)
            com.blacksquircle.ui.editorkit.model.UndoStack r3 = r2.redoStack
            r3.c()
            goto L85
        L7b:
            com.blacksquircle.ui.editorkit.model.UndoStack r3 = r2.undoStack
            r3.c()
            com.blacksquircle.ui.editorkit.model.UndoStack r3 = r2.redoStack
            r3.c()
        L85:
            r2.p = r1
            com.blacksquircle.ui.editorkit.widget.internal.UndoRedoEditText$OnUndoRedoChangedListener r2 = r2.onUndoRedoChangedListener
            if (r2 == 0) goto L8e
            r2.onUndoRedoChanged()
        L8e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blacksquircle.ui.editorkit.widget.internal.UndoRedoEditText.e(int, int, int, java.lang.CharSequence):void");
    }

    public final OnUndoRedoChangedListener getOnUndoRedoChangedListener() {
        return this.onUndoRedoChangedListener;
    }

    public final UndoStack getRedoStack() {
        return this.redoStack;
    }

    public final UndoStack getUndoStack() {
        return this.undoStack;
    }

    public final void setOnUndoRedoChangedListener(OnUndoRedoChangedListener onUndoRedoChangedListener) {
        this.onUndoRedoChangedListener = onUndoRedoChangedListener;
    }

    public final void setRedoStack(UndoStack undoStack) {
        undoStack.getClass();
        this.redoStack = undoStack;
    }

    @Override // com.blacksquircle.ui.editorkit.widget.internal.LineNumbersEditText
    public void setTextContent(CharSequence text) {
        text.getClass();
        super.setTextContent(text);
        OnUndoRedoChangedListener onUndoRedoChangedListener = this.onUndoRedoChangedListener;
        if (onUndoRedoChangedListener != null) {
            onUndoRedoChangedListener.onUndoRedoChanged();
        }
    }

    public final void setUndoStack(UndoStack undoStack) {
        undoStack.getClass();
        this.undoStack = undoStack;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UndoRedoEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ UndoRedoEditText(Context context, AttributeSet attributeSet, int i, int i2, xu xuVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R.attr.autoCompleteTextViewStyle : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UndoRedoEditText(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
