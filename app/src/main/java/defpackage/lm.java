package defpackage;

import kotlinx.serialization.json.internal.CharArrayPoolBase;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class lm extends CharArrayPoolBase {
    public static final lm c = new lm();

    public final void b(char[] cArr) {
        cArr.getClass();
        synchronized (this) {
            int i = this.b;
            if (cArr.length + i < e8.a) {
                this.b = i + cArr.length;
                this.a.addLast(cArr);
            }
        }
    }
}
