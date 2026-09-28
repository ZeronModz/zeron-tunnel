package io.ktor.util.cio;

import com.trilead.ssh2.sftp.AttribFlags;
import defpackage.mc2;
import defpackage.u7;
import io.ktor.utils.io.c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.d;
import kotlinx.io.Source;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.util.cio.ReadersKt", f = "Readers.kt", i = {}, l = {17}, m = "toByteArray", n = {}, s = {})
final class ReadersKt$toByteArray$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    public ReadersKt$toByteArray$1(Continuation<? super ReadersKt$toByteArray$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.result = obj;
        int i = (this.label | AttribFlags.SSH_FILEXFER_ATTR_EXTENDED) - AttribFlags.SSH_FILEXFER_ATTR_EXTENDED;
        this.label = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (i == 0) {
            d.b(obj);
            this.label = 1;
            obj = c.r(null, 0L, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                u7.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            d.b(obj);
        }
        return mc2.B((Source) obj);
    }
}
