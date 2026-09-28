package defpackage;

import kotlinx.coroutines.channels.ChannelResult$Closed;
import kotlinx.coroutines.channels.ChannelResult$Companion;
import kotlinx.coroutines.channels.ChannelResult$Failed;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class km {
    public static final ChannelResult$Companion b = new ChannelResult$Companion(null);
    public static final ChannelResult$Failed c = new ChannelResult$Failed();
    public final Object a;

    public static final Throwable a(Object obj) {
        ChannelResult$Closed channelResult$Closed = obj instanceof ChannelResult$Closed ? (ChannelResult$Closed) obj : null;
        if (channelResult$Closed != null) {
            return channelResult$Closed.a;
        }
        return null;
    }

    public static final Object b(Object obj) {
        if (obj instanceof ChannelResult$Failed) {
            return null;
        }
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof km) {
            return yg0.a(this.a, ((km) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.a;
        if (obj instanceof ChannelResult$Closed) {
            return ((ChannelResult$Closed) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
