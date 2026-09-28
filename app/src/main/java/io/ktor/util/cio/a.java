package io.ktor.util.cio;

import defpackage.hv;
import defpackage.l8;
import defpackage.lv;
import defpackage.oy;
import defpackage.xg;
import defpackage.zr;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.WriterJob;
import io.ktor.utils.io.d;
import java.io.File;
import kotlin.Lazy;
import kotlin.c;
import kotlin.coroutines.b;
import kotlinx.coroutines.CoroutineName;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static ByteReadChannel a(File file) {
        lv lvVar = oy.a;
        hv hvVar = hv.c;
        file.getClass();
        hvVar.getClass();
        long length = file.length();
        Lazy lazyB = c.b(new l8(file, 4));
        WriterJob writerJobI = d.i(zr.a(hvVar), b.d(hvVar, new CoroutineName("file-reader")), new FileChannelsKt$readChannel$writer$1(0L, -1L, length, lazyB, null));
        writerJobI.b.invokeOnCompletion(new xg(new l8(lazyB, 5), 0));
        return writerJobI.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f1, code lost:
    
        if (r1.flush(r4) == r5) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01ca, code lost:
    
        if (r6.flush(r4) == r5) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01cc, code lost:
    
        return r5;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00f1 -> B:43:0x00f5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x01ca -> B:75:0x01cd). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(java.nio.channels.SeekableByteChannel r20, io.ktor.utils.io.WriterScope r21, long r22, long r24, kotlin.coroutines.jvm.internal.ContinuationImpl r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.util.cio.a.b(java.nio.channels.SeekableByteChannel, io.ktor.utils.io.WriterScope, long, long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
