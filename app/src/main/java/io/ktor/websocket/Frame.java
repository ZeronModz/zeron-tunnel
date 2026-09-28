package io.ktor.websocket;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.firebase.messaging.Constants$ScionAnalytics$MessageType;
import defpackage.if3;
import defpackage.ii2;
import defpackage.mc2;
import defpackage.p60;
import defpackage.rt0;
import defpackage.vh;
import defpackage.xm;
import defpackage.xu;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.io.Buffer;
import kotlinx.io.Source;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0005\b\t\n\u000b\f¨\u0006\r"}, d2 = {"Lio/ktor/websocket/Frame;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Binary", "Text", "Close", "Ping", "Pong", "Companion", "Lio/ktor/websocket/Frame$Binary;", "Lio/ktor/websocket/Frame$Close;", "Lio/ktor/websocket/Frame$Ping;", "Lio/ktor/websocket/Frame$Pong;", "Lio/ktor/websocket/Frame$Text;", "ktor-websockets"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class Frame {
    public static final Companion i = new Companion(null);
    public static final byte[] j = new byte[0];
    public final boolean a;
    public final FrameType b;
    public final byte[] c;
    public final DisposableHandle d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final ByteBuffer h;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lio/ktor/websocket/Frame$Companion;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Empty", "[B", "ktor-websockets"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public Companion(xu xuVar) {
        }

        public static Frame a(boolean z, FrameType frameType, byte[] bArr, boolean z2, boolean z3, boolean z4) {
            frameType.getClass();
            int i = b.a[frameType.ordinal()];
            if (i == 1) {
                return new Binary(z, bArr, z2, z3, z4);
            }
            if (i == 2) {
                return new Text(z, bArr, z2, z3, z4);
            }
            if (i == 3) {
                return new Close(bArr);
            }
            if (i == 4) {
                return new Ping(bArr);
            }
            if (i == 5) {
                return new Pong(bArr, rt0.a);
            }
            p60.b();
            return null;
        }
    }

    public /* synthetic */ Frame(boolean z, FrameType frameType, byte[] bArr, DisposableHandle disposableHandle, boolean z2, boolean z3, boolean z4, int i2, xu xuVar) {
        this(z, frameType, bArr, (i2 & 8) != 0 ? rt0.a : disposableHandle, (i2 & 16) != 0 ? false : z2, (i2 & 32) != 0 ? false : z3, (i2 & 64) != 0 ? false : z4, null);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Frame ");
        sb.append(this.b);
        sb.append(" (fin=");
        sb.append(this.a);
        sb.append(", buffer len = ");
        return vh.o(sb, this.c.length, ')');
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000b¨\u0006\f"}, d2 = {"Lio/ktor/websocket/Frame$Ping;", "Lio/ktor/websocket/Frame;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, Constants$ScionAnalytics$MessageType.DATA_MESSAGE, "<init>", "([B)V", "Lkotlinx/io/Source;", "packet", "(Lkotlinx/io/Source;)V", "Ljava/nio/ByteBuffer;", "buffer", "(Ljava/nio/ByteBuffer;)V", "ktor-websockets"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Ping extends Frame {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ping(byte[] bArr) {
            super(true, FrameType.PING, bArr, rt0.a, false, false, false, null);
            bArr.getClass();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Ping(ByteBuffer byteBuffer) {
            this(ii2.p(byteBuffer));
            byteBuffer.getClass();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Ping(Source source) {
            this(mc2.D(source, -1));
            source.getClass();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\rB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u000eB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\t\u0010\u0011¨\u0006\u0012"}, d2 = {"Lio/ktor/websocket/Frame$Binary;", "Lio/ktor/websocket/Frame;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "fin", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, Constants$ScionAnalytics$MessageType.DATA_MESSAGE, "rsv1", "rsv2", "rsv3", "<init>", "(Z[BZZZ)V", "Ljava/nio/ByteBuffer;", "buffer", "(ZLjava/nio/ByteBuffer;)V", "(Z[B)V", "Lkotlinx/io/Source;", "packet", "(ZLkotlinx/io/Source;)V", "ktor-websockets"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Binary extends Frame {
        public /* synthetic */ Binary(boolean z, byte[] bArr, boolean z2, boolean z3, boolean z4, int i, xu xuVar) {
            this(z, bArr, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3, (i & 16) != 0 ? false : z4);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Binary(boolean z, byte[] bArr, boolean z2, boolean z3, boolean z4) {
            super(z, FrameType.BINARY, bArr, rt0.a, z2, z3, z4, null);
            bArr.getClass();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Binary(boolean z, ByteBuffer byteBuffer) {
            this(z, ii2.p(byteBuffer));
            byteBuffer.getClass();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Binary(boolean z, byte[] bArr) {
            this(z, bArr, false, false, false);
            bArr.getClass();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Binary(boolean z, Source source) {
            this(z, mc2.D(source, -1));
            source.getClass();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nB\u001b\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\rB\u0011\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0006\u0010\u000e¨\u0006\u000f"}, d2 = {"Lio/ktor/websocket/Frame$Pong;", "Lio/ktor/websocket/Frame;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, Constants$ScionAnalytics$MessageType.DATA_MESSAGE, "Lkotlinx/coroutines/DisposableHandle;", "disposableHandle", "<init>", "([BLkotlinx/coroutines/DisposableHandle;)V", "Lkotlinx/io/Source;", "packet", "(Lkotlinx/io/Source;)V", "Ljava/nio/ByteBuffer;", "buffer", "(Ljava/nio/ByteBuffer;Lkotlinx/coroutines/DisposableHandle;)V", "(Ljava/nio/ByteBuffer;)V", "ktor-websockets"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Pong extends Frame {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Pong(byte[] bArr, DisposableHandle disposableHandle) {
            super(true, FrameType.PONG, bArr, disposableHandle, false, false, false, null);
            bArr.getClass();
            disposableHandle.getClass();
        }

        public /* synthetic */ Pong(byte[] bArr, DisposableHandle disposableHandle, int i, xu xuVar) {
            this(bArr, (i & 2) != 0 ? rt0.a : disposableHandle);
        }

        public /* synthetic */ Pong(ByteBuffer byteBuffer, DisposableHandle disposableHandle, int i, xu xuVar) {
            this(byteBuffer, (i & 2) != 0 ? rt0.a : disposableHandle);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Pong(ByteBuffer byteBuffer, DisposableHandle disposableHandle) {
            this(ii2.p(byteBuffer), disposableHandle);
            byteBuffer.getClass();
            disposableHandle.getClass();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Pong(ByteBuffer byteBuffer) {
            this(ii2.p(byteBuffer), rt0.a);
            byteBuffer.getClass();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Pong(Source source) {
            this(mc2.D(source, -1), rt0.a);
            source.getClass();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\t\u0010\u000eB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\t\u0010\u0011B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\t\u0010\u0014¨\u0006\u0015"}, d2 = {"Lio/ktor/websocket/Frame$Text;", "Lio/ktor/websocket/Frame;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "fin", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, Constants$ScionAnalytics$MessageType.DATA_MESSAGE, "rsv1", "rsv2", "rsv3", "<init>", "(Z[BZZZ)V", "(Z[B)V", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "text", "(Ljava/lang/String;)V", "Lkotlinx/io/Source;", "packet", "(ZLkotlinx/io/Source;)V", "Ljava/nio/ByteBuffer;", "buffer", "(ZLjava/nio/ByteBuffer;)V", "ktor-websockets"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Text extends Frame {
        public /* synthetic */ Text(boolean z, byte[] bArr, boolean z2, boolean z3, boolean z4, int i, xu xuVar) {
            this(z, bArr, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3, (i & 16) != 0 ? false : z4);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Text(String str) {
            this(true, if3.M(str, xm.a));
            str.getClass();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Text(boolean z, byte[] bArr, boolean z2, boolean z3, boolean z4) {
            super(z, FrameType.TEXT, bArr, rt0.a, z2, z3, z4, null);
            bArr.getClass();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Text(boolean z, byte[] bArr) {
            this(z, bArr, false, false, false);
            bArr.getClass();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Text(boolean z, ByteBuffer byteBuffer) {
            this(z, ii2.p(byteBuffer));
            byteBuffer.getClass();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Text(boolean z, Source source) {
            this(z, mc2.D(source, -1));
            source.getClass();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bB\t\b\u0016¢\u0006\u0004\b\u0004\u0010\fB\u0011\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0004\u0010\u000f¨\u0006\u0010"}, d2 = {"Lio/ktor/websocket/Frame$Close;", "Lio/ktor/websocket/Frame;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, Constants$ScionAnalytics$MessageType.DATA_MESSAGE, "<init>", "([B)V", "Lio/ktor/websocket/CloseReason;", "reason", "(Lio/ktor/websocket/CloseReason;)V", "Lkotlinx/io/Source;", "packet", "(Lkotlinx/io/Source;)V", "()V", "Ljava/nio/ByteBuffer;", "buffer", "(Ljava/nio/ByteBuffer;)V", "ktor-websockets"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Close extends Frame {
        public Close(CloseReason closeReason) {
            closeReason.getClass();
            Buffer buffer = new Buffer();
            buffer.writeShort(closeReason.a);
            if3.P(buffer, closeReason.b);
            this(buffer);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Close(byte[] bArr) {
            super(true, FrameType.CLOSE, bArr, rt0.a, false, false, false, null);
            bArr.getClass();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Close(ByteBuffer byteBuffer) {
            this(ii2.p(byteBuffer));
            byteBuffer.getClass();
        }

        public Close() {
            this(Frame.j);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Close(Source source) {
            this(mc2.D(source, -1));
            source.getClass();
        }
    }

    public Frame(boolean z, FrameType frameType, byte[] bArr, DisposableHandle disposableHandle, boolean z2, boolean z3, boolean z4, xu xuVar) {
        this.a = z;
        this.b = frameType;
        this.c = bArr;
        this.d = disposableHandle;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.getClass();
        this.h = byteBufferWrap;
    }
}
