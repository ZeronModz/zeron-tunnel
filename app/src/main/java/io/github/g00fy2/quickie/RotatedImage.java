package io.github.g00fy2.quickie;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.hz;
import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lio/github/g00fy2/quickie/RotatedImage;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "byteArray", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "width", "height", "<init>", "([BII)V", "quickie-foss_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
final /* data */ class RotatedImage {
    public byte[] a;
    public int b;
    public int c;

    public RotatedImage(byte[] bArr, int i, int i2) {
        bArr.getClass();
        this.a = bArr;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!RotatedImage.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        RotatedImage rotatedImage = (RotatedImage) obj;
        return Arrays.equals(this.a, rotatedImage.a) && this.b == rotatedImage.b && this.c == rotatedImage.c;
    }

    public final int hashCode() {
        return (((Arrays.hashCode(this.a) * 31) + this.b) * 31) + this.c;
    }

    public final String toString() {
        String string = Arrays.toString(this.a);
        int i = this.b;
        int i2 = this.c;
        StringBuilder sb = new StringBuilder("RotatedImage(byteArray=");
        sb.append(string);
        sb.append(", width=");
        sb.append(i);
        sb.append(", height=");
        return hz.q(i2, ")", sb);
    }
}
