package defpackage;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.w;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class wf3 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Bundle d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ w h;

    public wf3(w wVar, String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = bundle;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = wVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.h.j(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
    }
}
