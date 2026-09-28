package defpackage;

import androidx.window.core.SpecificationComputer;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class o50 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SpecificationComputer.VerificationMode.values().length];
        iArr[SpecificationComputer.VerificationMode.STRICT.ordinal()] = 1;
        iArr[SpecificationComputer.VerificationMode.LOG.ordinal()] = 2;
        iArr[SpecificationComputer.VerificationMode.QUIET.ordinal()] = 3;
        a = iArr;
    }
}
