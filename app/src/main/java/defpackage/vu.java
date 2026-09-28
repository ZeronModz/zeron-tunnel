package defpackage;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class vu {
    public final /* synthetic */ int a;
    public final int b;

    public /* synthetic */ vu(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    public static String a(int i) {
        char c = (char) ((i >> 24) & 255);
        char c2 = (char) ((i >> 16) & 255);
        char c3 = (char) ((i >> 8) & 255);
        char c4 = (char) (i & 255);
        StringBuilder sb = new StringBuilder(vh.b(String.valueOf(c).length(), String.valueOf(c2).length(), String.valueOf(c3).length(), String.valueOf(c4).length()));
        sb.append(c);
        sb.append(c2);
        sb.append(c3);
        sb.append(c4);
        return sb.toString();
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return a(this.b);
            default:
                return super.toString();
        }
    }
}
