package io.ktor.util.debug.plugins;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.vh;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.a;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\tB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lio/ktor/util/debug/plugins/PluginTraceElement;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "pluginName", "handler", "Lio/ktor/util/debug/plugins/PluginTraceElement$PluginEvent;", "event", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lio/ktor/util/debug/plugins/PluginTraceElement$PluginEvent;)V", "PluginEvent", "ktor-utils"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PluginTraceElement {
    public final String a;
    public final String b;
    public final PluginEvent c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lio/ktor/util/debug/plugins/PluginTraceElement$PluginEvent;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "<init>", "(Ljava/lang/String;I)V", "STARTED", "FINISHED", "ktor-utils"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class PluginEvent {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ PluginEvent[] $VALUES;
        public static final PluginEvent STARTED = new PluginEvent("STARTED", 0);
        public static final PluginEvent FINISHED = new PluginEvent("FINISHED", 1);

        private static final /* synthetic */ PluginEvent[] $values() {
            return new PluginEvent[]{STARTED, FINISHED};
        }

        static {
            PluginEvent[] pluginEventArr$values = $values();
            $VALUES = pluginEventArr$values;
            $ENTRIES = a.a(pluginEventArr$values);
        }

        private PluginEvent(String str, int i) {
        }

        public static EnumEntries<PluginEvent> getEntries() {
            return $ENTRIES;
        }

        public static PluginEvent valueOf(String str) {
            return (PluginEvent) Enum.valueOf(PluginEvent.class, str);
        }

        public static PluginEvent[] values() {
            return (PluginEvent[]) $VALUES.clone();
        }
    }

    public PluginTraceElement(String str, String str2, PluginEvent pluginEvent) {
        str.getClass();
        str2.getClass();
        pluginEvent.getClass();
        this.a = str;
        this.b = str2;
        this.c = pluginEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PluginTraceElement)) {
            return false;
        }
        PluginTraceElement pluginTraceElement = (PluginTraceElement) obj;
        return this.a.equals(pluginTraceElement.a) && this.b.equals(pluginTraceElement.b) && this.c == pluginTraceElement.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + vh.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "PluginTraceElement(pluginName=" + this.a + ", handler=" + this.b + ", event=" + this.c + ')';
    }
}
