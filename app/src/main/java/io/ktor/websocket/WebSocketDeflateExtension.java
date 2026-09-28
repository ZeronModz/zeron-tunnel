package io.ktor.websocket;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.l02;
import defpackage.lg;
import defpackage.mc2;
import defpackage.mk1;
import defpackage.ni1;
import defpackage.sg;
import defpackage.u7;
import defpackage.xu;
import defpackage.zg1;
import io.ktor.util.AttributeKey;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.utils.io.pool.ByteBufferPool;
import io.ktor.websocket.Frame;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.zip.Deflater;
import java.util.zip.Inflater;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt$asSequence$$inlined$Sequence$1;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ClassReference;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.TypeReference;
import kotlin.sequences.TransformingSequence;
import kotlinx.io.Buffer;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0006\u0007B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lio/ktor/websocket/WebSocketDeflateExtension;", "Lio/ktor/websocket/WebSocketExtension;", "Lio/ktor/websocket/WebSocketDeflateExtension$Config;", "config", "<init>", "(Lio/ktor/websocket/WebSocketDeflateExtension$Config;)V", "Config", "Companion", "ktor-websockets"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WebSocketDeflateExtension implements WebSocketExtension<Config> {
    public static final Companion h = new Companion(null);
    public static final AttributeKey i;
    public static final boolean j;
    public final Companion a;
    public final ArrayList b;
    public final Inflater c;
    public final Deflater d;
    public boolean e;
    public boolean f;
    public boolean g;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lio/ktor/websocket/WebSocketDeflateExtension$Companion;", "Lio/ktor/websocket/WebSocketExtensionFactory;", "Lio/ktor/websocket/WebSocketDeflateExtension$Config;", "Lio/ktor/websocket/WebSocketDeflateExtension;", "ktor-websockets"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion implements WebSocketExtensionFactory<Config, WebSocketDeflateExtension> {
        public Companion(xu xuVar) {
        }

        @Override // io.ktor.websocket.WebSocketExtensionFactory
        public final AttributeKey getKey() {
            return WebSocketDeflateExtension.i;
        }

        @Override // io.ktor.websocket.WebSocketExtensionFactory
        public final boolean getRsv1() {
            return WebSocketDeflateExtension.j;
        }

        @Override // io.ktor.websocket.WebSocketExtensionFactory
        public final boolean getRsv2() {
            Companion companion = WebSocketDeflateExtension.h;
            return false;
        }

        @Override // io.ktor.websocket.WebSocketExtensionFactory
        public final boolean getRsv3() {
            Companion companion = WebSocketDeflateExtension.h;
            return false;
        }

        @Override // io.ktor.websocket.WebSocketExtensionFactory
        public final WebSocketExtension install(Function1<? super Config, mk1> function1) {
            function1.getClass();
            Config config = new Config();
            function1.invoke(config);
            return new WebSocketDeflateExtension(config);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/websocket/WebSocketDeflateExtension$Config;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "<init>", "()V", "ktor-websockets"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Config {
        public final ni1 a = new ni1(2);
    }

    static {
        TypeReference typeReferenceB = null;
        ClassReference classReferenceA = Reflection.a(WebSocketDeflateExtension.class);
        try {
            typeReferenceB = Reflection.b(WebSocketDeflateExtension.class);
        } catch (Throwable unused) {
        }
        i = new AttributeKey("WebsocketDeflateExtension", new TypeInfo(classReferenceA, typeReferenceB));
        j = true;
    }

    public WebSocketDeflateExtension(Config config) {
        config.getClass();
        this.a = h;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new WebSocketExtensionHeader("permessage-deflate", new ArrayList()));
        config.a.invoke(arrayList);
        this.b = arrayList;
        this.c = new Inflater(true);
        this.d = new Deflater(-1, true);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // io.ktor.websocket.WebSocketExtension
    public final boolean clientNegotiation(List list) {
        Object next;
        list.getClass();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((WebSocketExtensionHeader) next).a.equals("permessage-deflate")) {
                break;
            }
        }
        WebSocketExtensionHeader webSocketExtensionHeader = (WebSocketExtensionHeader) next;
        if (webSocketExtensionHeader == null) {
            return false;
        }
        this.f = false;
        this.e = false;
        TransformingSequence transformingSequence = new TransformingSequence(new CollectionsKt___CollectionsKt$asSequence$$inlined$Sequence$1(webSocketExtensionHeader.b), new ni1(4));
        Iterator it2 = transformingSequence.a.iterator();
        while (it2.hasNext()) {
            Pair pair = (Pair) transformingSequence.b.invoke(it2.next());
            String str = (String) pair.component1();
            String str2 = (String) pair.component2();
            switch (str.hashCode()) {
                case -708713803:
                    if (!str.equals("client_no_context_takeover")) {
                        continue;
                    } else {
                        if (!kotlin.text.g.B(str2)) {
                            zg1.l("WebSocket permessage-deflate extension parameter client_no_context_takeover shouldn't have a value. Current: ".concat(str2));
                            return false;
                        }
                        this.e = true;
                    }
                    break;
                case 646404390:
                    if (str.equals("client_max_window_bits") && !kotlin.text.g.B(str2) && Integer.parseInt(str2) != 15) {
                        u7.p("Only 15 window size is supported.");
                        return false;
                    }
                    break;
                    break;
                case 1266201133:
                    if (!str.equals("server_no_context_takeover")) {
                        continue;
                    } else {
                        if (!kotlin.text.g.B(str2)) {
                            zg1.l("WebSocket permessage-deflate extension parameter server_no_context_takeover shouldn't have a value. Current: ".concat(str2));
                            return false;
                        }
                        this.f = true;
                    }
                    break;
                case 2034279582:
                    str.equals("server_max_window_bits");
                    break;
            }
        }
        return true;
    }

    @Override // io.ktor.websocket.WebSocketExtension
    public final WebSocketExtensionFactory<Config, ? extends WebSocketExtension<Config>> getFactory() {
        return this.a;
    }

    @Override // io.ktor.websocket.WebSocketExtension
    public final List getProtocols() {
        return this.b;
    }

    /* JADX WARN: Finally extract failed */
    @Override // io.ktor.websocket.WebSocketExtension
    public final Frame processIncomingFrame(Frame frame) {
        frame.getClass();
        if ((!frame.e || (!(frame instanceof Frame.Text) && !(frame instanceof Frame.Binary))) && !this.g) {
            return frame;
        }
        this.g = true;
        byte[] bArr = frame.c;
        Inflater inflater = this.c;
        inflater.getClass();
        bArr.getClass();
        byte[] bArr2 = mc2.d;
        int length = bArr.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, length + 4);
        System.arraycopy(bArr2, 0, bArrCopyOf, length, 4);
        inflater.setInput(bArrCopyOf);
        Buffer buffer = new Buffer();
        ByteBufferPool byteBufferPool = lg.a;
        Object objBorrow = byteBufferPool.borrow();
        try {
            ByteBuffer byteBuffer = (ByteBuffer) objBorrow;
            long length2 = ((long) bArrCopyOf.length) + inflater.getBytesRead();
            while (inflater.getBytesRead() < length2) {
                byteBuffer.clear();
                byteBuffer.position(byteBuffer.position() + inflater.inflate(byteBuffer.array(), byteBuffer.position(), byteBuffer.limit()));
                byteBuffer.flip();
                l02.K(buffer, byteBuffer);
            }
            byteBufferPool.recycle(objBorrow);
            byte[] bArrD = mc2.D(buffer, -1);
            if (this.f) {
                inflater.reset();
            }
            boolean z = frame.a;
            if (z) {
                this.g = false;
            }
            Frame.Companion companion = Frame.i;
            FrameType frameType = frame.b;
            boolean z2 = !j;
            boolean z3 = frame.f;
            boolean z4 = frame.g;
            companion.getClass();
            return Frame.Companion.a(z, frameType, bArrD, z2, z3, z4);
        } catch (Throwable th) {
            byteBufferPool.recycle(objBorrow);
            throw th;
        }
    }

    @Override // io.ktor.websocket.WebSocketExtension
    public final Frame processOutgoingFrame(Frame frame) {
        byte[] bArrD;
        frame.getClass();
        if (!(frame instanceof Frame.Text) && !(frame instanceof Frame.Binary)) {
            return frame;
        }
        byte[] bArr = frame.c;
        Deflater deflater = this.d;
        deflater.getClass();
        bArr.getClass();
        deflater.setInput(bArr);
        Buffer buffer = new Buffer();
        ByteBufferPool byteBufferPool = lg.a;
        Object objBorrow = byteBufferPool.borrow();
        try {
            ByteBuffer byteBuffer = (ByteBuffer) objBorrow;
            while (!deflater.needsInput()) {
                mc2.o(buffer, deflater, byteBuffer, false);
            }
            do {
            } while (mc2.o(buffer, deflater, byteBuffer, true) != 0);
            byteBufferPool.recycle(objBorrow);
            byte[] bArr2 = mc2.c;
            Buffer bufferA = sg.a(buffer);
            sg.b(bufferA, bufferA.c - 5);
            if (Arrays.equals(mc2.D(bufferA, -1), bArr2)) {
                bArrD = mc2.C(buffer, ((int) buffer.c) - 4);
            } else {
                Buffer buffer2 = new Buffer();
                buffer2.transferFrom(buffer);
                buffer2.writeByte((byte) 0);
                bArrD = mc2.D(buffer2, -1);
            }
            byte[] bArr3 = bArrD;
            if (this.e) {
                deflater.reset();
            }
            Frame.Companion companion = Frame.i;
            boolean z = frame.a;
            FrameType frameType = frame.b;
            boolean z2 = frame.f;
            boolean z3 = frame.g;
            companion.getClass();
            return Frame.Companion.a(z, frameType, bArr3, j, z2, z3);
        } catch (Throwable th) {
            byteBufferPool.recycle(objBorrow);
            throw th;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // io.ktor.websocket.WebSocketExtension
    public final List serverNegotiation(List list) {
        Object next;
        list.getClass();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((WebSocketExtensionHeader) next).a.equals("permessage-deflate")) {
                break;
            }
        }
        WebSocketExtensionHeader webSocketExtensionHeader = (WebSocketExtensionHeader) next;
        if (webSocketExtensionHeader == null) {
            return EmptyList.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        TransformingSequence transformingSequence = new TransformingSequence(new CollectionsKt___CollectionsKt$asSequence$$inlined$Sequence$1(webSocketExtensionHeader.b), new ni1(4));
        Iterator it2 = transformingSequence.a.iterator();
        while (it2.hasNext()) {
            Pair pair = (Pair) transformingSequence.b.invoke(it2.next());
            String str = (String) pair.component1();
            String str2 = (String) pair.component2();
            Locale locale = Locale.getDefault();
            locale.getClass();
            String lowerCase = str.toLowerCase(locale);
            lowerCase.getClass();
            switch (lowerCase.hashCode()) {
                case -708713803:
                    if (!lowerCase.equals("client_no_context_takeover")) {
                        throw new IllegalStateException(("Unsupported extension parameter: (" + str + ", " + str2 + ')').toString());
                    }
                    if (!kotlin.text.g.B(str2)) {
                        u7.p("Check failed.");
                        return null;
                    }
                    this.f = true;
                    arrayList.add("client_no_context_takeover");
                    break;
                    break;
                case 646404390:
                    if (!lowerCase.equals("client_max_window_bits")) {
                        throw new IllegalStateException(("Unsupported extension parameter: (" + str + ", " + str2 + ')').toString());
                    }
                    break;
                    break;
                case 1266201133:
                    if (!lowerCase.equals("server_no_context_takeover")) {
                        throw new IllegalStateException(("Unsupported extension parameter: (" + str + ", " + str2 + ')').toString());
                    }
                    if (!kotlin.text.g.B(str2)) {
                        u7.p("Check failed.");
                        return null;
                    }
                    this.e = true;
                    arrayList.add("server_no_context_takeover");
                    break;
                    break;
                case 2034279582:
                    if (!lowerCase.equals("server_max_window_bits")) {
                        throw new IllegalStateException(("Unsupported extension parameter: (" + str + ", " + str2 + ')').toString());
                    }
                    if (Integer.parseInt(str2) != 15) {
                        u7.p("Only 15 window size is supported");
                        return null;
                    }
                    break;
                    break;
                default:
                    throw new IllegalStateException(("Unsupported extension parameter: (" + str + ", " + str2 + ')').toString());
            }
        }
        return kotlin.collections.c.z(new WebSocketExtensionHeader("permessage-deflate", arrayList));
    }
}
