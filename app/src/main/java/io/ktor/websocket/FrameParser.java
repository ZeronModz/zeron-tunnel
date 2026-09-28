package io.ktor.websocket;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.s31;
import io.ktor.websocket.FrameType;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lio/ktor/websocket/FrameParser;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "<init>", "()V", "State", "ktor-websockets"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FrameParser {
    public final AtomicReference a = new AtomicReference(State.HEADER0);
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public int g;
    public int h;
    public int i;
    public long j;
    public Integer k;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lio/ktor/websocket/FrameParser$State;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "<init>", "(Ljava/lang/String;I)V", "HEADER0", "LENGTH", "MASK_KEY", "BODY", "ktor-websockets"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class State {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State HEADER0 = new State("HEADER0", 0);
        public static final State LENGTH = new State("LENGTH", 1);
        public static final State MASK_KEY = new State("MASK_KEY", 2);
        public static final State BODY = new State("BODY", 3);

        private static final /* synthetic */ State[] $values() {
            return new State[]{HEADER0, LENGTH, MASK_KEY, BODY};
        }

        static {
            State[] stateArr$values = $values();
            $VALUES = stateArr$values;
            $ENTRIES = kotlin.enums.a.a(stateArr$values);
        }

        private State(String str, int i) {
        }

        public static EnumEntries<State> getEntries() {
            return $ENTRIES;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    public final FrameType a() {
        FrameType.Companion companion = FrameType.INSTANCE;
        int i = this.g;
        companion.getClass();
        FrameType frameType = (i < 0 || i > FrameType.maxOpcode) ? null : FrameType.byOpcodeArray[i];
        if (frameType != null) {
            return frameType;
        }
        s31.e(Integer.toHexString(this.g), "Unsupported opcode ");
        return null;
    }
}
