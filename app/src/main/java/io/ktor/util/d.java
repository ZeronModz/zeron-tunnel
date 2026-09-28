package io.ktor.util;

import defpackage.uw0;
import defpackage.vw0;
import defpackage.yg0;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class d {
    public static final boolean a;

    static {
        uw0 uw0Var = uw0.a;
        a = false;
        yg0.a(uw0Var, uw0Var);
        yg0.a(uw0Var, vw0.a);
        String property = System.getProperty("io.ktor.development");
        if (property != null) {
            Boolean.parseBoolean(property);
        }
    }
}
