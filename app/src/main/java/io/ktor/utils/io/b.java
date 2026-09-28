package io.ktor.utils.io;

import io.ktor.utils.io.ByteChannel;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements ByteChannel.Slot {
    public static final b a = new b();

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof b);
    }

    public final int hashCode() {
        return -231472095;
    }

    public final String toString() {
        return "Empty";
    }
}
