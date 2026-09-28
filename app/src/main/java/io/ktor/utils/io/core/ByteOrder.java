package io.ktor.utils.io.core;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lio/ktor/utils/io/core/ByteOrder;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Ljava/nio/ByteOrder;", "nioOrder", "<init>", "(Ljava/lang/String;ILjava/nio/ByteOrder;)V", "Ljava/nio/ByteOrder;", "getNioOrder", "()Ljava/nio/ByteOrder;", "Companion", "BIG_ENDIAN", "LITTLE_ENDIAN", "ktor-io"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ByteOrder {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ByteOrder[] $VALUES;
    public static final ByteOrder BIG_ENDIAN;
    public static final ByteOrder LITTLE_ENDIAN;

    /* JADX INFO: renamed from: native, reason: not valid java name */
    private static final ByteOrder f0native;
    private final java.nio.ByteOrder nioOrder;

    private static final /* synthetic */ ByteOrder[] $values() {
        return new ByteOrder[]{BIG_ENDIAN, LITTLE_ENDIAN};
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [io.ktor.utils.io.core.ByteOrder$Companion] */
    static {
        java.nio.ByteOrder byteOrder = java.nio.ByteOrder.BIG_ENDIAN;
        byteOrder.getClass();
        ByteOrder byteOrder2 = new ByteOrder("BIG_ENDIAN", 0, byteOrder);
        BIG_ENDIAN = byteOrder2;
        java.nio.ByteOrder byteOrder3 = java.nio.ByteOrder.LITTLE_ENDIAN;
        byteOrder3.getClass();
        ByteOrder byteOrder4 = new ByteOrder("LITTLE_ENDIAN", 1, byteOrder3);
        LITTLE_ENDIAN = byteOrder4;
        ByteOrder[] byteOrderArr$values = $values();
        $VALUES = byteOrderArr$values;
        $ENTRIES = a.a(byteOrderArr$values);
        INSTANCE = new Object(null) { // from class: io.ktor.utils.io.core.ByteOrder.Companion
        };
        java.nio.ByteOrder byteOrderNativeOrder = java.nio.ByteOrder.nativeOrder();
        byteOrderNativeOrder.getClass();
        f0native = byteOrderNativeOrder != byteOrder ? byteOrder4 : byteOrder2;
    }

    private ByteOrder(String str, int i, java.nio.ByteOrder byteOrder) {
        this.nioOrder = byteOrder;
    }

    public static EnumEntries<ByteOrder> getEntries() {
        return $ENTRIES;
    }

    public static ByteOrder valueOf(String str) {
        return (ByteOrder) Enum.valueOf(ByteOrder.class, str);
    }

    public static ByteOrder[] values() {
        return (ByteOrder[]) $VALUES.clone();
    }

    public final java.nio.ByteOrder getNioOrder() {
        return this.nioOrder;
    }
}
