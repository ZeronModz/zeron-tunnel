package io.ktor.websocket.serialization;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.trilead.ssh2.packets.Packets;
import com.trilead.ssh2.sftp.AttribFlags;
import com.trilead.ssh2.sftp.Packet;
import defpackage.u7;
import io.ktor.serialization.WebsocketContentConverter;
import io.ktor.serialization.WebsocketDeserializeException;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.websocket.Frame;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.d;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KType;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.websocket.serialization.WebsocketChannelSerializationKt", f = "WebsocketChannelSerialization.kt", i = {0, 0, 0, 1, 1}, l = {Packets.SSH_MSG_CHANNEL_EOF, Packet.SSH_FXP_ATTRS}, m = "receiveDeserializedBase", n = {"typeInfo", "converter", "charset", "typeInfo", TypedValues.AttributesType.S_FRAME}, s = {"L$0", "L$1", "L$2", "L$0", "L$1"})
final class WebsocketChannelSerializationKt$receiveDeserializedBase$2 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    public WebsocketChannelSerializationKt$receiveDeserializedBase$2(Continuation<? super WebsocketChannelSerializationKt$receiveDeserializedBase$2> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        TypeInfo typeInfo;
        Frame frame;
        this.result = obj;
        int i = (this.label | AttribFlags.SSH_FILEXFER_ATTR_EXTENDED) - AttribFlags.SSH_FILEXFER_ATTR_EXTENDED;
        this.label = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (i == 0) {
            d.b(obj);
            throw null;
        }
        if (i == 1) {
            Charset charset = (Charset) this.L$2;
            WebsocketContentConverter websocketContentConverter = (WebsocketContentConverter) this.L$1;
            TypeInfo typeInfo2 = (TypeInfo) this.L$0;
            d.b(obj);
            Frame frame2 = (Frame) obj;
            if (!websocketContentConverter.isApplicable(frame2)) {
                throw new WebsocketDeserializeException("Converter doesn't support frame type " + frame2.b.name(), null, frame2, 2, null);
            }
            this.L$0 = typeInfo2;
            this.L$1 = frame2;
            this.L$2 = null;
            this.label = 2;
            obj = websocketContentConverter.deserialize(charset, typeInfo2, frame2, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            typeInfo = typeInfo2;
            frame = frame2;
        } else {
            if (i != 2) {
                u7.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Frame frame3 = (Frame) this.L$1;
            typeInfo = (TypeInfo) this.L$0;
            d.b(obj);
            frame = frame3;
        }
        if (typeInfo.a.isInstance(obj)) {
            return obj;
        }
        if (obj == null) {
            KType kType = typeInfo.b;
            if (kType == null || !kType.isMarkedNullable()) {
                throw new WebsocketDeserializeException("Frame has null content", null, frame, 2, null);
            }
            return null;
        }
        throw new WebsocketDeserializeException("Can't deserialize value: expected value of type " + typeInfo.a.getSimpleName() + ", got " + Reflection.a(obj.getClass()).getSimpleName(), null, frame, 2, null);
    }
}
