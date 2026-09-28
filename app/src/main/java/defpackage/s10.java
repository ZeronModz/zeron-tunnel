package defpackage;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class s10 implements TextWatcher {
    public final EditText a;
    public final boolean b;
    public r10 c;
    public boolean d = true;

    public s10(EditText editText, boolean z) {
        this.a = editText;
        this.b = z;
    }

    public static void a(EditText editText, int i) {
        int length;
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            b10 b10VarA = b10.a();
            if (editableText == null) {
                length = 0;
            } else {
                b10VarA.getClass();
                length = editableText.length();
            }
            b10VarA.e(0, length, editableText);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) throws Throwable {
        EditText editText = this.a;
        if (editText.isInEditMode() || !this.d) {
            return;
        }
        if ((this.b || b10.k != null) && i2 <= i3 && (charSequence instanceof Spannable)) {
            int iB = b10.a().b();
            if (iB != 0) {
                if (iB == 1) {
                    b10.a().e(i, i3 + i, (Spannable) charSequence);
                    return;
                } else if (iB != 3) {
                    return;
                }
            }
            b10 b10VarA = b10.a();
            r10 r10Var = this.c;
            if (r10Var == null) {
                r10Var = new r10(editText);
                this.c = r10Var;
            }
            b10VarA.f(r10Var);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
