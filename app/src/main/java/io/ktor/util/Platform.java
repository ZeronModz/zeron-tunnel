package io.ktor.util;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.xu;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0004\u0007\u0002\u0003\b¨\u0006\t"}, d2 = {"Lio/ktor/util/Platform;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "uw0", "vw0", "Js", "WasmJs", "JsPlatform", "Lio/ktor/util/Platform$Js;", "Lio/ktor/util/Platform$WasmJs;", "ktor-utils"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class Platform {

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lio/ktor/util/Platform$Js;", "Lio/ktor/util/Platform;", "Lio/ktor/util/Platform$JsPlatform;", "jsPlatform", "<init>", "(Lio/ktor/util/Platform$JsPlatform;)V", "ktor-utils"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Js extends Platform {
        public final JsPlatform a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Js(JsPlatform jsPlatform) {
            super(null);
            jsPlatform.getClass();
            this.a = jsPlatform;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Js) && this.a == ((Js) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Js(jsPlatform=" + this.a + ')';
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lio/ktor/util/Platform$JsPlatform;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "<init>", "(Ljava/lang/String;I)V", "Browser", "Node", "ktor-utils"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class JsPlatform {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ JsPlatform[] $VALUES;
        public static final JsPlatform Browser = new JsPlatform("Browser", 0);
        public static final JsPlatform Node = new JsPlatform("Node", 1);

        private static final /* synthetic */ JsPlatform[] $values() {
            return new JsPlatform[]{Browser, Node};
        }

        static {
            JsPlatform[] jsPlatformArr$values = $values();
            $VALUES = jsPlatformArr$values;
            $ENTRIES = kotlin.enums.a.a(jsPlatformArr$values);
        }

        private JsPlatform(String str, int i) {
        }

        public static EnumEntries<JsPlatform> getEntries() {
            return $ENTRIES;
        }

        public static JsPlatform valueOf(String str) {
            return (JsPlatform) Enum.valueOf(JsPlatform.class, str);
        }

        public static JsPlatform[] values() {
            return (JsPlatform[]) $VALUES.clone();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lio/ktor/util/Platform$WasmJs;", "Lio/ktor/util/Platform;", "Lio/ktor/util/Platform$JsPlatform;", "jsPlatform", "<init>", "(Lio/ktor/util/Platform$JsPlatform;)V", "ktor-utils"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class WasmJs extends Platform {
        public final JsPlatform a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WasmJs(JsPlatform jsPlatform) {
            super(null);
            jsPlatform.getClass();
            this.a = jsPlatform;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof WasmJs) && this.a == ((WasmJs) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "WasmJs(jsPlatform=" + this.a + ')';
        }
    }

    public Platform(xu xuVar) {
    }
}
