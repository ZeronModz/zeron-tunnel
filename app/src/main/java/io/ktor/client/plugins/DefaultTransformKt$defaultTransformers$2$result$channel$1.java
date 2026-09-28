package io.ktor.client.plugins;

import com.trilead.ssh2.packets.Packets;
import defpackage.j03;
import defpackage.mk1;
import defpackage.u7;
import defpackage.zr;
import io.ktor.client.statement.HttpResponse;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteWriteChannel;
import io.ktor.utils.io.WriterScope;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/utils/io/WriterScope;", "Lmk1;", "<anonymous>", "(Lio/ktor/utils/io/WriterScope;)V"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "io.ktor.client.plugins.DefaultTransformKt$defaultTransformers$2$result$channel$1", f = "DefaultTransform.kt", i = {}, l = {Packets.SSH_MSG_CHANNEL_CLOSE}, m = "invokeSuspend", n = {}, s = {})
public final class DefaultTransformKt$defaultTransformers$2$result$channel$1 extends SuspendLambda implements Function2<WriterScope, Continuation<? super mk1>, Object> {
    final /* synthetic */ Object $body;
    final /* synthetic */ HttpResponse $response;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultTransformKt$defaultTransformers$2$result$channel$1(Object obj, HttpResponse httpResponse, Continuation<? super DefaultTransformKt$defaultTransformers$2$result$channel$1> continuation) {
        super(2, continuation);
        this.$body = obj;
        this.$response = httpResponse;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<mk1> create(Object obj, Continuation<?> continuation) {
        DefaultTransformKt$defaultTransformers$2$result$channel$1 defaultTransformKt$defaultTransformers$2$result$channel$1 = new DefaultTransformKt$defaultTransformers$2$result$channel$1(this.$body, this.$response, continuation);
        defaultTransformKt$defaultTransformers$2$result$channel$1.L$0 = obj;
        return defaultTransformKt$defaultTransformers$2$result$channel$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(WriterScope writerScope, Continuation<? super mk1> continuation) {
        return ((DefaultTransformKt$defaultTransformers$2$result$channel$1) create(writerScope, continuation)).invokeSuspend(mk1.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.d.b(obj);
                WriterScope writerScope = (WriterScope) this.L$0;
                ByteReadChannel byteReadChannel = (ByteReadChannel) this.$body;
                ByteWriteChannel byteWriteChannel = writerScope.a;
                this.label = 1;
                obj = io.ktor.utils.io.c.c(byteReadChannel, byteWriteChannel, Long.MAX_VALUE, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    u7.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.d.b(obj);
            }
            ((Number) obj).longValue();
            return mk1.a;
        } catch (CancellationException e) {
            zr.b(this.$response, e);
            throw e;
        } catch (Throwable th) {
            zr.b(this.$response, j03.a("Receive failed", th));
            throw th;
        }
    }
}
