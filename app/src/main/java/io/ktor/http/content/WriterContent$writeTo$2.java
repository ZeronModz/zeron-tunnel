package io.ktor.http.content;

import com.trilead.ssh2.sftp.ErrorCodes;
import defpackage.if3;
import defpackage.mk1;
import defpackage.u7;
import io.ktor.utils.io.ByteWriteChannel;
import java.io.Closeable;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lmk1;", "<anonymous>", "()V"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "io.ktor.http.content.WriterContent$writeTo$2", f = "WriterContent.kt", i = {}, l = {ErrorCodes.SSH_FX_BYTE_RANGE_LOCK_REFUSED}, m = "invokeSuspend", n = {}, s = {})
final class WriterContent$writeTo$2 extends SuspendLambda implements Function1<Continuation<? super mk1>, Object> {
    final /* synthetic */ ByteWriteChannel $channel;
    final /* synthetic */ Charset $charset;
    Object L$0;
    int label;
    final /* synthetic */ WriterContent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WriterContent$writeTo$2(ByteWriteChannel byteWriteChannel, Charset charset, WriterContent writerContent, Continuation<? super WriterContent$writeTo$2> continuation) {
        super(1, continuation);
        this.$channel = byteWriteChannel;
        this.$charset = charset;
        this.this$0 = writerContent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<mk1> create(Continuation<?> continuation) {
        return new WriterContent$writeTo$2(this.$channel, this.$charset, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super mk1> continuation) {
        return ((WriterContent$writeTo$2) create(continuation)).invokeSuspend(mk1.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Closeable closeable;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                u7.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            closeable = (Closeable) this.L$0;
            try {
                d.b(obj);
                if3.c(closeable, null);
                return mk1.a;
            } catch (Throwable th) {
                th = th;
                try {
                    throw th;
                } catch (Throwable th2) {
                    if3.c(closeable, th);
                    throw th2;
                }
            }
        }
        d.b(obj);
        ByteWriteChannel byteWriteChannel = this.$channel;
        Charset charset = this.$charset;
        byteWriteChannel.getClass();
        charset.getClass();
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new io.ktor.utils.io.jvm.javaio.b(byteWriteChannel), charset);
        try {
            Function2 function2 = this.this$0.a;
            this.L$0 = outputStreamWriter;
            this.label = 1;
            if (function2.invoke(outputStreamWriter, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            closeable = outputStreamWriter;
            if3.c(closeable, null);
            return mk1.a;
        } catch (Throwable th3) {
            th = th3;
            closeable = outputStreamWriter;
            throw th;
        }
    }
}
