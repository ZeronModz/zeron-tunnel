package kotlinx.io;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J+\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\nH&¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000bH&¢\u0006\u0004\b\b\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0004H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u000bH&¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0007H&¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0007H&¢\u0006\u0004\b \u0010\u001fJ\u000f\u0010!\u001a\u00020\u0007H'¢\u0006\u0004\b!\u0010\u001fR\u001a\u0010&\u001a\u00020\"8&X§\u0004¢\u0006\f\u0012\u0004\b%\u0010\u001f\u001a\u0004\b#\u0010$\u0082\u0001\u0002\"'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006(À\u0006\u0001"}, d2 = {"Lkotlinx/io/Sink;", "Lkotlinx/io/RawSink;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "source", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "startIndex", "endIndex", "Lmk1;", "write", "([BII)V", "Lkotlinx/io/RawSource;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "transferFrom", "(Lkotlinx/io/RawSource;)J", "byteCount", "(Lkotlinx/io/RawSource;J)V", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "byte", "writeByte", "(B)V", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "short", "writeShort", "(S)V", "int", "writeInt", "(I)V", "long", "writeLong", "(J)V", "flush", "()V", "emit", "hintEmit", "Lkotlinx/io/Buffer;", "getBuffer", "()Lkotlinx/io/Buffer;", "getBuffer$annotations", "buffer", "Lkotlinx/io/RealSink;", "kotlinx-io-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface Sink extends RawSink {
    void emit();

    @Override // kotlinx.io.RawSink, java.io.Flushable
    void flush();

    /* JADX INFO: renamed from: getBuffer */
    Buffer getC();

    void hintEmit();

    long transferFrom(RawSource source);

    void write(RawSource source, long byteCount);

    void write(byte[] source, int startIndex, int endIndex);

    void writeByte(byte b);

    void writeInt(int i);

    void writeLong(long j);

    void writeShort(short s);
}
