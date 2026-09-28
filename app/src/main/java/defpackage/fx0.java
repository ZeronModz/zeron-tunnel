package defpackage;

import kotlinx.serialization.json.ClassDiscriminatorMode;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class fx0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ClassDiscriminatorMode.values().length];
        try {
            iArr[ClassDiscriminatorMode.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ClassDiscriminatorMode.POLYMORPHIC.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ClassDiscriminatorMode.ALL_JSON_OBJECTS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
