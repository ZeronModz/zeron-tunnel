package io.ktor.util;

import defpackage.hv;
import defpackage.kf2;
import defpackage.lv;
import defpackage.oy;
import defpackage.pt0;
import defpackage.tb0;
import java.util.List;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferedChannel;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c {
    public static final List a = kotlin.collections.c.A("NativePRNGNonBlocking", "WINDOWS-PRNG", "DRBG");
    public static final BufferedChannel b = kf2.a(1024, 6, null);
    public static final Job c;

    static {
        CoroutineName coroutineName = new CoroutineName("nonce-generator");
        lv lvVar = oy.a;
        hv hvVar = hv.c;
        pt0 pt0Var = pt0.b;
        hvVar.getClass();
        c = kotlinx.coroutines.c.c(tb0.a, kotlin.coroutines.b.d(pt0Var, hvVar).plus(coroutineName), CoroutineStart.LAZY, new NonceKt$nonceGeneratorJob$1(null));
    }
}
