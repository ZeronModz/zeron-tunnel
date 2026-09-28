package defpackage;

import com.google.android.gms.measurement.internal.m;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class p13 {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final /* synthetic */ m d;

    public p13(m mVar, int i, boolean z, boolean z2) {
        this.d = mVar;
        this.a = i;
        this.b = z;
        this.c = z2;
    }

    public final void a(String str) {
        this.d.f(this.a, this.b, this.c, str, null, null, null);
    }

    public final void b(Object obj, String str) {
        this.d.f(this.a, this.b, this.c, str, obj, null, null);
    }

    public final void c(String str, Object obj, Object obj2) {
        this.d.f(this.a, this.b, this.c, str, obj, obj2, null);
    }

    public final void d(String str, Object obj, Object obj2, Object obj3) {
        this.d.f(this.a, this.b, this.c, str, obj, obj2, obj3);
    }
}
