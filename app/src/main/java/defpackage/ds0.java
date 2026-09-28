package defpackage;

import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.sync.MutexImpl;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ds0 {
    public static final Symbol a = new Symbol("NO_OWNER");
    public static final Symbol b = new Symbol("ALREADY_LOCKED_BY_OWNER");

    public static MutexImpl a() {
        return new MutexImpl(false);
    }
}
