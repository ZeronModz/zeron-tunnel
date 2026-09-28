package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class sf3 extends ef3 {
    public final byte[] d;

    public sf3(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.d = bArr;
    }

    @Override // defpackage.ef3
    public final byte[] c() {
        return this.d;
    }
}
