package defpackage;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ya1 implements CharSequence {
    public final /* synthetic */ int a;
    public char[] b;
    public String c;

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        switch (this.a) {
        }
        return this.b[i];
    }

    @Override // java.lang.CharSequence
    public final int length() {
        switch (this.a) {
        }
        return this.b.length;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        switch (this.a) {
            case 0:
                return new String(this.b, i, i2 - i);
            default:
                return new String(this.b, i, i2 - i);
        }
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        switch (this.a) {
            case 0:
                String str = this.c;
                if (str != null) {
                    return str;
                }
                String str2 = new String(this.b);
                this.c = str2;
                return str2;
            default:
                String str3 = this.c;
                if (str3 != null) {
                    return str3;
                }
                String str4 = new String(this.b);
                this.c = str4;
                return str4;
        }
    }
}
