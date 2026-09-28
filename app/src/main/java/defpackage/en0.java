package defpackage;

import androidx.datastore.preferences.protobuf.ProtoSyntax;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class en0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ProtoSyntax.values().length];
        a = iArr;
        try {
            iArr[ProtoSyntax.PROTO3.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
    }
}
