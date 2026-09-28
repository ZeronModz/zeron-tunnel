package io.github.g00fy2.quickie.content;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.ec1;
import defpackage.xu;
import defpackage.yg0;
import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lio/github/g00fy2/quickie/content/QRContent;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Plain", "Lio/github/g00fy2/quickie/content/QRContent$Plain;", "quickie-foss_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class QRContent {
    public final String a;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/github/g00fy2/quickie/content/QRContent$Plain;", "Lio/github/g00fy2/quickie/content/QRContent;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "rawBytes", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "rawValue", "<init>", "([BLjava/lang/String;)V", "quickie-foss_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Plain extends QRContent {
        public final byte[] b;
        public final String c;

        public Plain(byte[] bArr, String str) {
            super(bArr, str, null);
            this.b = bArr;
            this.c = str;
        }

        @Override // io.github.g00fy2.quickie.content.QRContent
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getA() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Plain)) {
                return false;
            }
            Plain plain = (Plain) obj;
            return yg0.a(this.b, plain.b) && yg0.a(this.c, plain.c);
        }

        public final int hashCode() {
            byte[] bArr = this.b;
            int iHashCode = (bArr == null ? 0 : Arrays.hashCode(bArr)) * 31;
            String str = this.c;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            return ec1.L("Plain(rawBytes=", Arrays.toString(this.b), ", rawValue=", this.c, ")");
        }
    }

    public QRContent(byte[] bArr, String str, xu xuVar) {
        this.a = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public String getA() {
        return this.a;
    }
}
