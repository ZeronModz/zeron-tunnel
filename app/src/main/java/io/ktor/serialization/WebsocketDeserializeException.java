package io.ktor.serialization;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.xu;
import io.ktor.websocket.Frame;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lio/ktor/serialization/WebsocketDeserializeException;", "Lio/ktor/serialization/WebsocketContentConvertException;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "message", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "cause", "Lio/ktor/websocket/Frame;", TypedValues.AttributesType.S_FRAME, "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;Lio/ktor/websocket/Frame;)V", "Lio/ktor/websocket/Frame;", "getFrame", "()Lio/ktor/websocket/Frame;", "ktor-serialization"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WebsocketDeserializeException extends WebsocketContentConvertException {
    private final Frame frame;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebsocketDeserializeException(String str, Throwable th, Frame frame) {
        super(str, th);
        str.getClass();
        frame.getClass();
        this.frame = frame;
    }

    public final Frame getFrame() {
        return this.frame;
    }

    public /* synthetic */ WebsocketDeserializeException(String str, Throwable th, Frame frame, int i, xu xuVar) {
        this(str, (i & 2) != 0 ? null : th, frame);
    }
}
