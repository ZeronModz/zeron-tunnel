package defpackage;

import okhttp3.Protocol;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class uu0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Protocol.values().length];
        try {
            iArr[Protocol.HTTP_1_0.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Protocol.HTTP_1_1.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Protocol.SPDY_3.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[Protocol.HTTP_2.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[Protocol.H2_PRIOR_KNOWLEDGE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[Protocol.QUIC.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        a = iArr;
    }
}
