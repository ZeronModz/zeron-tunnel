package defpackage;

import android.os.ParcelFileDescriptor;
import java.io.PushbackInputStream;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class x12 extends PushbackInputStream {
    public final /* synthetic */ tj1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x12(tj1 tj1Var, ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream) {
        super(autoCloseInputStream, 1);
        this.a = tj1Var;
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        ((l00) this.a.d).e();
        super.close();
    }
}
