package defpackage;

import java.util.DesugarCollections;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z8 {
    public static final List a = DesugarCollections.unmodifiableList(Arrays.asList(48000, 44100, 22050, 11025, 8000, 4800));

    public final int a() {
        oa oaVar = (oa) this;
        int i = oaVar.d;
        jx0.b(i > 0, "Invalid channel count: " + i);
        int i2 = oaVar.e;
        if (i2 == 2) {
            return i * 2;
        }
        if (i2 == 3) {
            return i;
        }
        if (i2 != 4) {
            if (i2 == 21) {
                return i * 3;
            }
            if (i2 != 22) {
                u7.r(hz.o(i2, "Invalid audio encoding: "));
                return 0;
            }
        }
        return i * 4;
    }
}
