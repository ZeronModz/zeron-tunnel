package defpackage;

import com.google.common.base.h;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class yo {
    public static yo compile(String str) {
        h hVar = ww0.a;
        str.getClass();
        return ww0.a.compile(str);
    }

    public static boolean isPcreLike() {
        ww0.a.getClass();
        return true;
    }

    public abstract int flags();

    public abstract vo matcher(CharSequence charSequence);

    public abstract String pattern();
}
