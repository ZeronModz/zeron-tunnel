package defpackage;

import android.os.Bundle;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
import androidx.emoji2.text.c;
import androidx.emoji2.text.flatbuffer.MetadataList;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class j10 extends InputConnectionWrapper {
    public final TextView a;

    public j10(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        new Object() { // from class: androidx.emoji2.viewsintegration.EmojiInputConnection$EmojiCompatDeleteHelper
        };
        super(inputConnection, false);
        this.a = textView;
        if (b10.k != null) {
            b10 b10VarA = b10.a();
            if (b10VarA.b() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            z00 z00Var = b10VarA.e;
            z00Var.getClass();
            Bundle bundle = editorInfo.extras;
            MetadataList metadataList = z00Var.c.a;
            int iA = metadataList.a(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iA != 0 ? metadataList.b.getInt(iA + metadataList.a) : 0);
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        return c.b(this, this.a.getEditableText(), i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        return c.b(this, this.a.getEditableText(), i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }
}
