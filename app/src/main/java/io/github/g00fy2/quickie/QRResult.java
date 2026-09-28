package io.github.g00fy2.quickie;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.xu;
import defpackage.yg0;
import io.github.g00fy2.quickie.content.QRContent;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0004\u0007\u0003¨\u0006\b"}, d2 = {"Lio/github/g00fy2/quickie/QRResult;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "QRSuccess", "yz0", "xz0", "QRError", "Lio/github/g00fy2/quickie/QRResult$QRError;", "Lio/github/g00fy2/quickie/QRResult$QRSuccess;", "quickie-foss_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class QRResult {

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\b\u0000\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/github/g00fy2/quickie/QRResult$QRError;", "Lio/github/g00fy2/quickie/QRResult;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "<init>", "(Ljava/lang/Exception;)V", "quickie-foss_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class QRError extends QRResult {
        public final Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QRError(Exception exc) {
            super(null);
            exc.getClass();
            this.a = exc;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof QRError) && yg0.a(this.a, ((QRError) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "QRError(exception=" + this.a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lio/github/g00fy2/quickie/QRResult$QRSuccess;", "Lio/github/g00fy2/quickie/QRResult;", "Lio/github/g00fy2/quickie/content/QRContent;", "content", "<init>", "(Lio/github/g00fy2/quickie/content/QRContent;)V", "quickie-foss_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class QRSuccess extends QRResult {
        public final QRContent a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QRSuccess(QRContent qRContent) {
            super(null);
            qRContent.getClass();
            this.a = qRContent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof QRSuccess) && yg0.a(this.a, ((QRSuccess) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "QRSuccess(content=" + this.a + ")";
        }
    }

    public QRResult(xu xuVar) {
    }
}
