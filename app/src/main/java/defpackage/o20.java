package defpackage;

import android.text.Editable;
import com.google.android.material.internal.TextWatcherAdapter;
import com.google.android.material.textfield.b;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class o20 extends TextWatcherAdapter {
    public final /* synthetic */ b a;

    public o20(b bVar) {
        this.a = bVar;
    }

    @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.a.b().a();
    }

    @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.a.b().b();
    }
}
