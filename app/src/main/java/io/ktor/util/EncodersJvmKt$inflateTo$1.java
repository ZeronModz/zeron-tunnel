package io.ktor.util;

import com.trilead.ssh2.sftp.AttribFlags;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.util.EncodersJvmKt", f = "EncodersJvm.kt", i = {0}, l = {167}, m = "inflateTo", n = {"inflated"}, s = {"I$0"})
final class EncodersJvmKt$inflateTo$1 extends ContinuationImpl {
    int I$0;
    int label;
    /* synthetic */ Object result;

    public EncodersJvmKt$inflateTo$1(Continuation<? super EncodersJvmKt$inflateTo$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= AttribFlags.SSH_FILEXFER_ATTR_EXTENDED;
        return a.e(null, null, null, null, this);
    }
}
