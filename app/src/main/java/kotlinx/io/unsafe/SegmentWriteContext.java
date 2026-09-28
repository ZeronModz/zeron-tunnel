package kotlinx.io.unsafe;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlinx.io.Segment;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\bg\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ/\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\rJ7\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\u000fJ?\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\u0011ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, d2 = {"Lkotlinx/io/unsafe/SegmentWriteContext;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lkotlinx/io/Segment;", "segment", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, TypedValues.CycleType.S_WAVE_OFFSET, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "value", "Lmk1;", "setUnchecked", "(Lkotlinx/io/Segment;IB)V", "b0", "b1", "(Lkotlinx/io/Segment;IBB)V", "b2", "(Lkotlinx/io/Segment;IBBB)V", "b3", "(Lkotlinx/io/Segment;IBBBB)V", "kotlinx-io-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface SegmentWriteContext {
    void setUnchecked(Segment segment, int offset, byte value);

    void setUnchecked(Segment segment, int offset, byte b0, byte b1);

    void setUnchecked(Segment segment, int offset, byte b0, byte b1, byte b2);

    void setUnchecked(Segment segment, int offset, byte b0, byte b1, byte b2, byte b3);
}
