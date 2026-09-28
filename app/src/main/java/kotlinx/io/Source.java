package kotlinx.io;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0005H&¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0017\u0010\tJ+\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00122\b\b\u0002\u0010\u001b\u001a\u00020\u0012H&¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u001e2\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u001eH&¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0000H&¢\u0006\u0004\b#\u0010$R\u001a\u0010*\u001a\u00020%8&X§\u0004¢\u0006\f\u0012\u0004\b(\u0010)\u001a\u0004\b&\u0010'\u0082\u0001\u0002%+ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006,À\u0006\u0001"}, d2 = {"Lkotlinx/io/Source;", "Lkotlinx/io/RawSource;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "exhausted", "()Z", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "byteCount", "Lmk1;", "require", "(J)V", "request", "(J)Z", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "readByte", "()B", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "readShort", "()S", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "readInt", "()I", "readLong", "()J", "skip", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "sink", "startIndex", "endIndex", "readAtMostTo", "([BII)I", "Lkotlinx/io/RawSink;", "readTo", "(Lkotlinx/io/RawSink;J)V", "transferTo", "(Lkotlinx/io/RawSink;)J", "peek", "()Lkotlinx/io/Source;", "Lkotlinx/io/Buffer;", "getBuffer", "()Lkotlinx/io/Buffer;", "getBuffer$annotations", "()V", "buffer", "Lkotlinx/io/RealSource;", "kotlinx-io-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface Source extends RawSource {
    boolean exhausted();

    Buffer getBuffer();

    Source peek();

    int readAtMostTo(byte[] sink, int startIndex, int endIndex);

    byte readByte();

    int readInt();

    long readLong();

    short readShort();

    void readTo(RawSink sink, long byteCount);

    boolean request(long byteCount);

    void require(long byteCount);

    void skip(long byteCount);

    long transferTo(RawSink sink);
}
