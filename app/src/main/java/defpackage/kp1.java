package defpackage;

import com.v2ray.ang.dto.NetworkType;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class kp1 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[NetworkType.values().length];
        try {
            iArr[NetworkType.KCP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[NetworkType.GRPC.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
