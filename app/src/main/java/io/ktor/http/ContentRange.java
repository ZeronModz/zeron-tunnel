package io.ktor.http;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.xu;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lio/ktor/http/ContentRange;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Bounded", "TailFrom", "Suffix", "Lio/ktor/http/ContentRange$Bounded;", "Lio/ktor/http/ContentRange$Suffix;", "Lio/ktor/http/ContentRange$TailFrom;", "ktor-http"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ContentRange {

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/ktor/http/ContentRange$Bounded;", "Lio/ktor/http/ContentRange;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, TypedValues.TransitionType.S_FROM, TypedValues.TransitionType.S_TO, "<init>", "(JJ)V", "ktor-http"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Bounded extends ContentRange {
        public final long a;
        public final long b;

        public Bounded(long j, long j2) {
            super(null);
            this.a = j;
            this.b = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Bounded)) {
                return false;
            }
            Bounded bounded = (Bounded) obj;
            return this.a == bounded.a && this.b == bounded.b;
        }

        public final int hashCode() {
            long j = this.a;
            int i = ((int) (j ^ (j >>> 32))) * 31;
            long j2 = this.b;
            return i + ((int) ((j2 >>> 32) ^ j2));
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.a);
            sb.append('-');
            sb.append(this.b);
            return sb.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lio/ktor/http/ContentRange$Suffix;", "Lio/ktor/http/ContentRange;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "lastCount", "<init>", "(J)V", "ktor-http"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Suffix extends ContentRange {
        public final long a;

        public Suffix(long j) {
            super(null);
            this.a = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Suffix) && this.a == ((Suffix) obj).a;
        }

        public final int hashCode() {
            long j = this.a;
            return (int) (j ^ (j >>> 32));
        }

        public final String toString() {
            return "-" + this.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lio/ktor/http/ContentRange$TailFrom;", "Lio/ktor/http/ContentRange;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, TypedValues.TransitionType.S_FROM, "<init>", "(J)V", "ktor-http"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TailFrom extends ContentRange {
        public final long a;

        public TailFrom(long j) {
            super(null);
            this.a = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TailFrom) && this.a == ((TailFrom) obj).a;
        }

        public final int hashCode() {
            long j = this.a;
            return (int) (j ^ (j >>> 32));
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.a);
            sb.append('-');
            return sb.toString();
        }
    }

    public ContentRange(xu xuVar) {
    }
}
