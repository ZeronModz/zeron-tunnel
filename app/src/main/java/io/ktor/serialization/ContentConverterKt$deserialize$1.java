package io.ktor.serialization;

import com.trilead.ssh2.packets.Packets;
import com.trilead.ssh2.sftp.AttribFlags;
import defpackage.du0;
import defpackage.u7;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.utils.io.ByteReadChannel;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.d;
import kotlin.reflect.KType;
import kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3;
import kotlinx.coroutines.flow.c;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.serialization.ContentConverterKt", f = "ContentConverter.kt", i = {0, 0}, l = {Packets.SSH_MSG_CHANNEL_SUCCESS}, m = "deserialize", n = {"body", "typeInfo"}, s = {"L$0", "L$1"})
final class ContentConverterKt$deserialize$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    public ContentConverterKt$deserialize$1(Continuation<? super ContentConverterKt$deserialize$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ByteReadChannel byteReadChannel;
        TypeInfo typeInfo;
        this.result = obj;
        int i = (this.label | AttribFlags.SSH_FILEXFER_ATTR_EXTENDED) - AttribFlags.SSH_FILEXFER_ATTR_EXTENDED;
        this.label = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (i == 0) {
            d.b(obj);
            ContentConverterKt$deserialize$$inlined$map$1 contentConverterKt$deserialize$$inlined$map$1 = new ContentConverterKt$deserialize$$inlined$map$1(new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3(null), null, null, null);
            ContentConverterKt$deserialize$result$2 contentConverterKt$deserialize$result$2 = new ContentConverterKt$deserialize$result$2(null, null);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            obj = c.j(contentConverterKt$deserialize$$inlined$map$1, contentConverterKt$deserialize$result$2, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            byteReadChannel = null;
            typeInfo = null;
        } else {
            if (i != 1) {
                u7.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            typeInfo = (TypeInfo) this.L$1;
            byteReadChannel = (ByteReadChannel) this.L$0;
            d.b(obj);
        }
        if (obj != null) {
            return obj;
        }
        if (!byteReadChannel.isClosedForRead()) {
            return byteReadChannel;
        }
        KType kType = typeInfo.b;
        if (kType != null && kType.isMarkedNullable()) {
            return du0.a;
        }
        throw new ContentConvertException("No suitable converter found for " + typeInfo, null, 2, null);
    }
}
