package defpackage;

import android.util.Range;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b9 {
    public static final Range a = new Range(0, Integer.MAX_VALUE);
    public static final Range b = new Range(0, Integer.MAX_VALUE);

    static {
        pa paVarA = a();
        paVarA.e = 0;
        paVarA.a();
    }

    public static pa a() {
        pa paVar = new pa();
        paVar.b = -1;
        paVar.c = -1;
        paVar.e = -1;
        Range range = a;
        if (range == null) {
            io0.e("Null bitrate");
            return null;
        }
        paVar.a = range;
        Range range2 = b;
        if (range2 != null) {
            paVar.d = range2;
            return paVar;
        }
        io0.e("Null sampleRate");
        return null;
    }
}
