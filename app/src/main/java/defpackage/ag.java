package defpackage;

import kotlinx.coroutines.channels.ChannelSegment;
import kotlinx.coroutines.internal.Symbol;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ag {
    public static final ChannelSegment a = new ChannelSegment(-1, null, null, 0);
    public static final int b = mu.t(32, 12, "kotlinx.coroutines.bufferedChannel.segmentSize");
    public static final int c = mu.t(10000, 12, "kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations");
    public static final Symbol d = new Symbol("BUFFERED");
    public static final Symbol e = new Symbol("SHOULD_BUFFER");
    public static final Symbol f = new Symbol("S_RESUMING_BY_RCV");
    public static final Symbol g = new Symbol("RESUMING_BY_EB");
    public static final Symbol h = new Symbol("POISONED");
    public static final Symbol i = new Symbol("DONE_RCV");
    public static final Symbol j = new Symbol("INTERRUPTED_SEND");
    public static final Symbol k = new Symbol("INTERRUPTED_RCV");
    public static final Symbol l = new Symbol("CHANNEL_CLOSED");
    public static final Symbol m = new Symbol("SUSPEND");
    public static final Symbol n = new Symbol("SUSPEND_NO_WAITER");
    public static final Symbol o = new Symbol("FAILED");
    public static final Symbol p = new Symbol("NO_RECEIVE_RESULT");
    public static final Symbol q = new Symbol("CLOSE_HANDLER_CLOSED");
    public static final Symbol r = new Symbol("CLOSE_HANDLER_INVOKED");
    public static final Symbol s = new Symbol("NO_CLOSE_CAUSE");
}
