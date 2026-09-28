package defpackage;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class nw0 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;

    public nw0(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.a = f;
        this.b = f4;
        this.c = f7;
        this.d = f2;
        this.e = f5;
        this.f = f8;
        this.g = f3;
        this.h = f6;
        this.i = f9;
    }

    public static nw0 a(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        nw0 nw0VarB = b(f, f2, f3, f4, f5, f6, f7, f8);
        float f17 = nw0VarB.e;
        float f18 = nw0VarB.i;
        float f19 = nw0VarB.f;
        float f20 = nw0VarB.h;
        float f21 = (f17 * f18) - (f19 * f20);
        float f22 = nw0VarB.g;
        float f23 = nw0VarB.d;
        float f24 = (f19 * f22) - (f23 * f18);
        float f25 = (f23 * f20) - (f17 * f22);
        float f26 = nw0VarB.c;
        float f27 = nw0VarB.b;
        float f28 = (f26 * f20) - (f27 * f18);
        float f29 = nw0VarB.a;
        float f30 = (f18 * f29) - (f26 * f22);
        float f31 = (f22 * f27) - (f20 * f29);
        float f32 = (f27 * f19) - (f26 * f17);
        float f33 = (f26 * f23) - (f19 * f29);
        float f34 = (f29 * f17) - (f27 * f23);
        nw0 nw0VarB2 = b(f9, f10, f11, f12, f13, f14, f15, f16);
        float f35 = nw0VarB2.a;
        float f36 = nw0VarB2.d;
        float f37 = nw0VarB2.g;
        float f38 = (f37 * f32) + (f36 * f28) + (f35 * f21);
        float f39 = (f37 * f33) + (f36 * f30) + (f35 * f24);
        float f40 = f37 * f34;
        float f41 = f40 + (f36 * f31) + (f35 * f25);
        float f42 = nw0VarB2.b;
        float f43 = nw0VarB2.e;
        float f44 = nw0VarB2.h;
        float f45 = (f44 * f32) + (f43 * f28) + (f42 * f21);
        float f46 = (f44 * f33) + (f43 * f30) + (f42 * f24);
        float f47 = f44 * f34;
        float f48 = f47 + (f43 * f31) + (f42 * f25);
        float f49 = nw0VarB2.c;
        float f50 = nw0VarB2.f;
        float f51 = f28 * f50;
        float f52 = nw0VarB2.i;
        return new nw0(f38, f39, f41, f45, f46, f48, (f32 * f52) + f51 + (f21 * f49), (f33 * f52) + (f30 * f50) + (f24 * f49), (f52 * f34) + (f50 * f31) + (f49 * f25));
    }

    public static nw0 b(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        float f9 = ((f - f3) + f5) - f7;
        float f10 = ((f2 - f4) + f6) - f8;
        if (f9 == 0.0f && f10 == 0.0f) {
            return new nw0(f3 - f, f5 - f3, f, f4 - f2, f6 - f4, f2, 0.0f, 0.0f, 1.0f);
        }
        float f11 = f3 - f5;
        float f12 = f7 - f5;
        float f13 = f4 - f6;
        float f14 = f8 - f6;
        float f15 = (f11 * f14) - (f12 * f13);
        float f16 = ((f14 * f9) - (f12 * f10)) / f15;
        float f17 = ((f11 * f10) - (f9 * f13)) / f15;
        return new nw0((f16 * f3) + (f3 - f), (f17 * f7) + (f7 - f), f, (f16 * f4) + (f4 - f2), (f17 * f8) + (f8 - f2), f2, f16, f17, 1.0f);
    }
}
