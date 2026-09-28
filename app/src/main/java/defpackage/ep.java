package defpackage;

import kotlin.Result;
import kotlin.d;
import kotlinx.coroutines.CompletedExceptionally;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ep {
    public static final Object a(Object obj) {
        if (!(obj instanceof CompletedExceptionally)) {
            return Result.m36constructorimpl(obj);
        }
        Result.Companion companion = Result.INSTANCE;
        return Result.m36constructorimpl(d.a(((CompletedExceptionally) obj).a));
    }
}
