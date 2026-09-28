package io.ktor.util;

import com.trilead.ssh2.packets.Packets;
import defpackage.mk1;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.WriterScope;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/utils/io/WriterScope;", "Lmk1;", "<anonymous>", "(Lio/ktor/utils/io/WriterScope;)V"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "io.ktor.util.EncodersJvmKt$inflate$1", f = "EncodersJvm.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6}, l = {78, Packets.SSH_MSG_CHANNEL_EXTENDED_DATA, Packets.SSH_MSG_CHANNEL_EOF, 106, 113, 119, 131}, m = "invokeSuspend", n = {"$this$writer", "readBuffer", "writeBuffer", "inflater", "checksum", "$this$writer", "readBuffer", "writeBuffer", "inflater", "checksum", "magic", "format", "flags", "$this$writer", "readBuffer", "writeBuffer", "inflater", "checksum", "magic", "format", "flags", "$this$writer", "readBuffer", "writeBuffer", "inflater", "checksum", "$this$writer", "readBuffer", "writeBuffer", "inflater", "checksum", "totalSize", "$this$writer", "readBuffer", "writeBuffer", "inflater", "checksum", "totalSize", "$this$writer", "readBuffer", "writeBuffer", "inflater", "checksum", "totalSize"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "S$0", "B$0", "B$1", "L$0", "L$1", "L$2", "L$3", "L$4", "S$0", "B$0", "B$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5"})
final class EncodersJvmKt$inflate$1 extends SuspendLambda implements Function2<WriterScope, Continuation<? super mk1>, Object> {
    final /* synthetic */ boolean $gzip;
    final /* synthetic */ ByteReadChannel $source;
    byte B$0;
    byte B$1;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    short S$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EncodersJvmKt$inflate$1(boolean z, ByteReadChannel byteReadChannel, Continuation<? super EncodersJvmKt$inflate$1> continuation) {
        super(2, continuation);
        this.$gzip = z;
        this.$source = byteReadChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<mk1> create(Object obj, Continuation<?> continuation) {
        EncodersJvmKt$inflate$1 encodersJvmKt$inflate$1 = new EncodersJvmKt$inflate$1(this.$gzip, this.$source, continuation);
        encodersJvmKt$inflate$1.L$0 = obj;
        return encodersJvmKt$inflate$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(WriterScope writerScope, Continuation<? super mk1> continuation) {
        return ((EncodersJvmKt$inflate$1) create(writerScope, continuation)).invokeSuspend(mk1.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x01f9, code lost:
    
        if (io.ktor.utils.io.c.g(r5, 2, r18) == r1) goto L92;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x024c A[Catch: all -> 0x0039, TRY_ENTER, TryCatch #2 {all -> 0x0039, blocks: (B:7:0x0031, B:94:0x0304, B:88:0x02df, B:90:0x02e5, B:95:0x031b, B:97:0x031f, B:99:0x0327, B:101:0x0345, B:104:0x034a, B:105:0x036e, B:106:0x036f, B:107:0x0376, B:108:0x0377, B:109:0x039a, B:110:0x039b, B:114:0x03af, B:115:0x03b6, B:74:0x027f, B:76:0x0285, B:78:0x028b, B:84:0x02ce, B:65:0x0242, B:68:0x024c, B:71:0x0265, B:73:0x026d, B:85:0x02d3, B:87:0x02d9, B:116:0x03b7, B:17:0x0082), top: B:127:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x026d A[Catch: all -> 0x0039, TryCatch #2 {all -> 0x0039, blocks: (B:7:0x0031, B:94:0x0304, B:88:0x02df, B:90:0x02e5, B:95:0x031b, B:97:0x031f, B:99:0x0327, B:101:0x0345, B:104:0x034a, B:105:0x036e, B:106:0x036f, B:107:0x0376, B:108:0x0377, B:109:0x039a, B:110:0x039b, B:114:0x03af, B:115:0x03b6, B:74:0x027f, B:76:0x0285, B:78:0x028b, B:84:0x02ce, B:65:0x0242, B:68:0x024c, B:71:0x0265, B:73:0x026d, B:85:0x02d3, B:87:0x02d9, B:116:0x03b7, B:17:0x0082), top: B:127:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0285 A[Catch: all -> 0x0039, TryCatch #2 {all -> 0x0039, blocks: (B:7:0x0031, B:94:0x0304, B:88:0x02df, B:90:0x02e5, B:95:0x031b, B:97:0x031f, B:99:0x0327, B:101:0x0345, B:104:0x034a, B:105:0x036e, B:106:0x036f, B:107:0x0376, B:108:0x0377, B:109:0x039a, B:110:0x039b, B:114:0x03af, B:115:0x03b6, B:74:0x027f, B:76:0x0285, B:78:0x028b, B:84:0x02ce, B:65:0x0242, B:68:0x024c, B:71:0x0265, B:73:0x026d, B:85:0x02d3, B:87:0x02d9, B:116:0x03b7, B:17:0x0082), top: B:127:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02d3 A[Catch: all -> 0x0039, TryCatch #2 {all -> 0x0039, blocks: (B:7:0x0031, B:94:0x0304, B:88:0x02df, B:90:0x02e5, B:95:0x031b, B:97:0x031f, B:99:0x0327, B:101:0x0345, B:104:0x034a, B:105:0x036e, B:106:0x036f, B:107:0x0376, B:108:0x0377, B:109:0x039a, B:110:0x039b, B:114:0x03af, B:115:0x03b6, B:74:0x027f, B:76:0x0285, B:78:0x028b, B:84:0x02ce, B:65:0x0242, B:68:0x024c, B:71:0x0265, B:73:0x026d, B:85:0x02d3, B:87:0x02d9, B:116:0x03b7, B:17:0x0082), top: B:127:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02e5 A[Catch: all -> 0x0039, TryCatch #2 {all -> 0x0039, blocks: (B:7:0x0031, B:94:0x0304, B:88:0x02df, B:90:0x02e5, B:95:0x031b, B:97:0x031f, B:99:0x0327, B:101:0x0345, B:104:0x034a, B:105:0x036e, B:106:0x036f, B:107:0x0376, B:108:0x0377, B:109:0x039a, B:110:0x039b, B:114:0x03af, B:115:0x03b6, B:74:0x027f, B:76:0x0285, B:78:0x028b, B:84:0x02ce, B:65:0x0242, B:68:0x024c, B:71:0x0265, B:73:0x026d, B:85:0x02d3, B:87:0x02d9, B:116:0x03b7, B:17:0x0082), top: B:127:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x031b A[Catch: all -> 0x0039, TryCatch #2 {all -> 0x0039, blocks: (B:7:0x0031, B:94:0x0304, B:88:0x02df, B:90:0x02e5, B:95:0x031b, B:97:0x031f, B:99:0x0327, B:101:0x0345, B:104:0x034a, B:105:0x036e, B:106:0x036f, B:107:0x0376, B:108:0x0377, B:109:0x039a, B:110:0x039b, B:114:0x03af, B:115:0x03b6, B:74:0x027f, B:76:0x0285, B:78:0x028b, B:84:0x02ce, B:65:0x0242, B:68:0x024c, B:71:0x0265, B:73:0x026d, B:85:0x02d3, B:87:0x02d9, B:116:0x03b7, B:17:0x0082), top: B:127:0x000a }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x026b -> B:65:0x0242). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x026d -> B:74:0x027f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x02aa -> B:82:0x02b2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:93:0x0303 -> B:94:0x0304). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 988
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.util.EncodersJvmKt$inflate$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
