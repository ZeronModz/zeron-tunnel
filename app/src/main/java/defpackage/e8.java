package defpackage;

import kotlin.Result;
import kotlin.text.g;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class e8 {
    public static final int a;

    static {
        Object objD;
        try {
            Result.Companion companion = Result.INSTANCE;
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            property.getClass();
            objD = Result.m36constructorimpl(g.a0(property));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objD = vh.d(th);
        }
        if (Result.m42isFailureimpl(objD)) {
            objD = null;
        }
        Integer num = (Integer) objD;
        a = num != null ? num.intValue() : 2097152;
    }
}
