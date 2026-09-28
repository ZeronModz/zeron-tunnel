package kotlinx.io;

import com.google.android.gms.ads.RequestConfiguration;
import com.trilead.ssh2.sftp.AttribFlags;
import defpackage.s31;
import defpackage.u7;
import defpackage.xu;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/io/Segment;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Companion", "kotlinx-io-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Segment {
    public static final Companion h = new Companion(null);
    public final byte[] a;
    public int b;
    public int c;
    public SegmentCopyTracker d;
    public boolean e;
    public Segment f;
    public Segment g;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lkotlinx/io/Segment$Companion;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "SIZE", "I", "SHARE_MINIMUM", "kotlinx-io-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public Companion(xu xuVar) {
        }
    }

    public Segment(xu xuVar) {
        this.a = new byte[AttribFlags.SSH_FILEXFER_ATTR_LINK_COUNT];
        this.e = true;
        this.d = null;
    }

    public final /* synthetic */ int a() {
        return this.a.length - this.c;
    }

    public final /* synthetic */ int b() {
        return this.c - this.b;
    }

    public final byte c(int i) {
        return this.a[this.b + i];
    }

    public final Segment d() {
        Segment segment = this.f;
        Segment segment2 = this.g;
        if (segment2 != null) {
            segment2.getClass();
            segment2.f = this.f;
        }
        Segment segment3 = this.f;
        if (segment3 != null) {
            segment3.getClass();
            segment3.g = this.g;
        }
        this.f = null;
        this.g = null;
        return segment;
    }

    public final void e(Segment segment) {
        segment.getClass();
        segment.g = this;
        segment.f = this.f;
        Segment segment2 = this.f;
        if (segment2 != null) {
            segment2.g = segment;
        }
        this.f = segment;
    }

    public final Segment f() {
        SegmentCopyTracker refCountingCopyTracker = this.d;
        if (refCountingCopyTracker == null) {
            Segment segment = b.a;
            refCountingCopyTracker = new RefCountingCopyTracker();
            this.d = refCountingCopyTracker;
        }
        SegmentCopyTracker segmentCopyTracker = refCountingCopyTracker;
        int i = this.b;
        int i2 = this.c;
        segmentCopyTracker.a();
        return new Segment(this.a, i, i2, segmentCopyTracker, false);
    }

    public final void g(Segment segment, int i) {
        segment.getClass();
        byte[] bArr = segment.a;
        if (!segment.e) {
            u7.p("only owner can write");
            return;
        }
        int i2 = segment.c;
        if (i2 + i > 8192) {
            SegmentCopyTracker segmentCopyTracker = segment.d;
            if (segmentCopyTracker != null ? segmentCopyTracker.b() : false) {
                s31.c();
                return;
            }
            int i3 = segment.c;
            int i4 = segment.b;
            if ((i3 + i) - i4 > 8192) {
                s31.c();
                return;
            }
            kotlin.collections.b.f(0, i4, i3, bArr, bArr);
            i2 = segment.c - segment.b;
            segment.c = i2;
            segment.b = 0;
        }
        int i5 = this.b;
        kotlin.collections.b.f(i2, i5, i5 + i, this.a, bArr);
        segment.c += i;
        this.b += i;
    }

    public /* synthetic */ Segment(byte[] bArr, int i, int i2, SegmentCopyTracker segmentCopyTracker, boolean z, xu xuVar) {
        this(bArr, i, i2, segmentCopyTracker, z);
    }

    public Segment(byte[] bArr, int i, int i2, SegmentCopyTracker segmentCopyTracker, boolean z) {
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = segmentCopyTracker;
        this.e = z;
    }
}
