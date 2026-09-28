package defpackage;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class qd {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;

    public qd(int i, int i2, int i3, int i4, int i5) {
        this.a = i5;
        switch (i5) {
            case 1:
                this.f = -1;
                this.b = i;
                this.c = i2;
                this.d = i3;
                this.e = i4;
                break;
            default:
                this.b = i;
                this.c = i4;
                this.d = i2;
                this.e = i3;
                this.f = i2 + i3;
                break;
        }
    }

    public boolean a() {
        int i = this.b;
        int i2 = 2;
        if ((i & 7) != 0) {
            int i3 = this.e;
            int i4 = this.c;
            if (((i3 > i4 ? 1 : i3 == i4 ? 2 : 4) & i) == 0) {
                return false;
            }
        }
        if ((i & 112) != 0) {
            int i5 = this.e;
            int i6 = this.d;
            if ((((i5 > i6 ? 1 : i5 == i6 ? 2 : 4) << 4) & i) == 0) {
                return false;
            }
        }
        if ((i & 1792) != 0) {
            int i7 = this.f;
            int i8 = this.c;
            if ((((i7 > i8 ? 1 : i7 == i8 ? 2 : 4) << 8) & i) == 0) {
                return false;
            }
        }
        if ((i & 28672) != 0) {
            int i9 = this.f;
            int i10 = this.d;
            if (i9 > i10) {
                i2 = 1;
            } else if (i9 != i10) {
                i2 = 4;
            }
            if (((i2 << 12) & i) == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean b(int i) {
        return i != -1 && this.d == (i % 3) * 3;
    }

    public void c() {
        this.f = (this.d / 3) + ((this.e / 30) * 3);
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return this.f + "|" + this.e;
            default:
                return super.toString();
        }
    }
}
