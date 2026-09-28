package defpackage;

import android.text.Editable;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class h10 extends Editable.Factory {
    public static final Object a = new Object();
    public static volatile h10 b;
    public static Class c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = c;
        return cls != null ? new j91(cls, charSequence) : super.newEditable(charSequence);
    }
}
