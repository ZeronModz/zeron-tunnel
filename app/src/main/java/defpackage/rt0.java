package defpackage;

import kotlinx.coroutines.DisposableHandle;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class rt0 implements DisposableHandle {
    public static final rt0 a = new rt0();

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof rt0);
    }

    public final int hashCode() {
        return 207988788;
    }

    public final String toString() {
        return "NonDisposableHandle";
    }

    @Override // kotlinx.coroutines.DisposableHandle
    public final void dispose() {
    }
}
