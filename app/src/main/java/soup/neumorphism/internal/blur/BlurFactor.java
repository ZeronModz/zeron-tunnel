package soup.neumorphism.internal.blur;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.hz;
import defpackage.xu;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\nB5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lsoup/neumorphism/internal/blur/BlurFactor;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "width", "height", "radius", "sampling", TypedValues.Custom.S_COLOR, "<init>", "(IIIII)V", "Companion", "neumorphism_release"}, k = 1, mv = {1, 4, 0})
public final /* data */ class BlurFactor {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lsoup/neumorphism/internal/blur/BlurFactor$Companion;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "DEFAULT_SAMPLING", "I", "MAX_RADIUS", "neumorphism_release"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        public Companion(xu xuVar) {
        }
    }

    static {
        new Companion(null);
    }

    public /* synthetic */ BlurFactor(int i, int i2, int i3, int i4, int i5, int i6, xu xuVar) {
        this(i, i2, (i6 & 4) != 0 ? 25 : i3, (i6 & 8) != 0 ? 1 : i4, (i6 & 16) != 0 ? 0 : i5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlurFactor)) {
            return false;
        }
        BlurFactor blurFactor = (BlurFactor) obj;
        return this.a == blurFactor.a && this.b == blurFactor.b && this.c == blurFactor.c && this.d == blurFactor.d && this.e == blurFactor.e;
    }

    public final int hashCode() {
        return (((((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BlurFactor(width=");
        sb.append(this.a);
        sb.append(", height=");
        sb.append(this.b);
        sb.append(", radius=");
        sb.append(this.c);
        sb.append(", sampling=");
        sb.append(this.d);
        sb.append(", color=");
        return hz.q(this.e, ")", sb);
    }

    public BlurFactor(int i, int i2, int i3, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
    }
}
