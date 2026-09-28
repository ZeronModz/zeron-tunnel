package io.ktor.http;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.xu;
import defpackage.yg0;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u0001:\u0004\u0006\u0007\b\tB\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Lio/ktor/http/CacheControl;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lio/ktor/http/CacheControl$Visibility;", "visibility", "<init>", "(Lio/ktor/http/CacheControl$Visibility;)V", "Visibility", "NoCache", "NoStore", "MaxAge", "ktor-http"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class CacheControl {
    public final Visibility a;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lio/ktor/http/CacheControl$NoCache;", "Lio/ktor/http/CacheControl;", "Lio/ktor/http/CacheControl$Visibility;", "visibility", "<init>", "(Lio/ktor/http/CacheControl$Visibility;)V", "ktor-http"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NoCache extends CacheControl {
        public NoCache(Visibility visibility) {
            super(visibility);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof NoCache) {
                return this.a == ((NoCache) obj).a;
            }
            return false;
        }

        public final int hashCode() {
            Visibility visibility = this.a;
            if (visibility != null) {
                return visibility.hashCode();
            }
            return 0;
        }

        public final String toString() {
            Visibility visibility = this.a;
            if (visibility == null) {
                return "no-cache";
            }
            return "no-cache, " + visibility.getHeaderValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lio/ktor/http/CacheControl$NoStore;", "Lio/ktor/http/CacheControl;", "Lio/ktor/http/CacheControl$Visibility;", "visibility", "<init>", "(Lio/ktor/http/CacheControl$Visibility;)V", "ktor-http"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NoStore extends CacheControl {
        public NoStore(Visibility visibility) {
            super(visibility);
        }

        public final boolean equals(Object obj) {
            return (obj instanceof NoStore) && ((NoStore) obj).a == this.a;
        }

        public final int hashCode() {
            Visibility visibility = this.a;
            if (visibility != null) {
                return visibility.hashCode();
            }
            return 0;
        }

        public final String toString() {
            Visibility visibility = this.a;
            if (visibility == null) {
                return "no-store";
            }
            return "no-store, " + visibility.getHeaderValue();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lio/ktor/http/CacheControl$Visibility;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "headerValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getHeaderValue$ktor_http", "()Ljava/lang/String;", "Public", "Private", "ktor-http"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Visibility {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Visibility[] $VALUES;
        private final String headerValue;
        public static final Visibility Public = new Visibility("Public", 0, "public");
        public static final Visibility Private = new Visibility("Private", 1, "private");

        private static final /* synthetic */ Visibility[] $values() {
            return new Visibility[]{Public, Private};
        }

        static {
            Visibility[] visibilityArr$values = $values();
            $VALUES = visibilityArr$values;
            $ENTRIES = kotlin.enums.a.a(visibilityArr$values);
        }

        private Visibility(String str, int i, String str2) {
            this.headerValue = str2;
        }

        public static EnumEntries<Visibility> getEntries() {
            return $ENTRIES;
        }

        public static Visibility valueOf(String str) {
            return (Visibility) Enum.valueOf(Visibility.class, str);
        }

        public static Visibility[] values() {
            return (Visibility[]) $VALUES.clone();
        }

        /* JADX INFO: renamed from: getHeaderValue$ktor_http, reason: from getter */
        public final String getHeaderValue() {
            return this.headerValue;
        }
    }

    public CacheControl(Visibility visibility) {
        this.a = visibility;
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lio/ktor/http/CacheControl$MaxAge;", "Lio/ktor/http/CacheControl;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "maxAgeSeconds", "proxyMaxAgeSeconds", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "mustRevalidate", "proxyRevalidate", "Lio/ktor/http/CacheControl$Visibility;", "visibility", "<init>", "(ILjava/lang/Integer;ZZLio/ktor/http/CacheControl$Visibility;)V", "ktor-http"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class MaxAge extends CacheControl {
        public final int b;
        public final Integer c;
        public final boolean d;
        public final boolean e;

        public /* synthetic */ MaxAge(int i, Integer num, boolean z, boolean z2, Visibility visibility, int i2, xu xuVar) {
            this(i, (i2 & 2) != 0 ? null : num, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? false : z2, (i2 & 16) != 0 ? null : visibility);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MaxAge)) {
                return false;
            }
            MaxAge maxAge = (MaxAge) obj;
            return maxAge.b == this.b && yg0.a(maxAge.c, this.c) && maxAge.d == this.d && maxAge.e == this.e && maxAge.a == this.a;
        }

        public final int hashCode() {
            int i = this.b * 31;
            Integer num = this.c;
            int iIntValue = (((((i + (num != null ? num.intValue() : 0)) * 31) + (this.d ? 1231 : 1237)) * 31) + (this.e ? 1231 : 1237)) * 31;
            Visibility visibility = this.a;
            return iIntValue + (visibility != null ? visibility.hashCode() : 0);
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList(5);
            arrayList.add("max-age=" + this.b);
            Integer num = this.c;
            if (num != null) {
                arrayList.add("s-maxage=" + num);
            }
            if (this.d) {
                arrayList.add("must-revalidate");
            }
            if (this.e) {
                arrayList.add("proxy-revalidate");
            }
            Visibility visibility = this.a;
            if (visibility != null) {
                arrayList.add(visibility.getHeaderValue());
            }
            return kotlin.collections.c.w(arrayList, ", ", null, null, null, 62);
        }

        public MaxAge(int i, Integer num, boolean z, boolean z2, Visibility visibility) {
            super(visibility);
            this.b = i;
            this.c = num;
            this.d = z;
            this.e = z2;
        }
    }
}
