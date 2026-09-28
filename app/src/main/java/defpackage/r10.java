package defpackage;

import android.widget.EditText;
import androidx.appcompat.widget.SwitchCompat;
import androidx.emoji2.text.EmojiCompat$InitCallback;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class r10 extends EmojiCompat$InitCallback {
    public final /* synthetic */ int a = 0;
    public final WeakReference b;

    public r10(EditText editText) {
        this.b = new WeakReference(editText);
    }

    @Override // androidx.emoji2.text.EmojiCompat$InitCallback
    public void a() {
        switch (this.a) {
            case 1:
                SwitchCompat switchCompat = (SwitchCompat) this.b.get();
                if (switchCompat != null) {
                    switchCompat.c();
                }
                break;
        }
    }

    @Override // androidx.emoji2.text.EmojiCompat$InitCallback
    public final void b() {
        int i = this.a;
        WeakReference weakReference = this.b;
        switch (i) {
            case 0:
                s10.a((EditText) weakReference.get(), 1);
                break;
            default:
                SwitchCompat switchCompat = (SwitchCompat) weakReference.get();
                if (switchCompat != null) {
                    switchCompat.c();
                }
                break;
        }
    }

    public r10(SwitchCompat switchCompat) {
        this.b = new WeakReference(switchCompat);
    }
}
