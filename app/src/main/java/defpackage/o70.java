package defpackage;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.internal.ChannelFlowOperatorImpl;
import kotlinx.coroutines.flow.internal.FusibleFlow;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class o70 {
    public static Flow a(Flow flow, int i) {
        BufferOverflow bufferOverflow = BufferOverflow.SUSPEND;
        if (i < 0 && i != -2 && i != -1) {
            zu0.e(hz.o(i, "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was "));
            return null;
        }
        if (i == -1) {
            bufferOverflow = BufferOverflow.DROP_OLDEST;
            i = 0;
        }
        int i2 = i;
        BufferOverflow bufferOverflow2 = bufferOverflow;
        return flow instanceof FusibleFlow ? ((FusibleFlow) flow).fuse(EmptyCoroutineContext.INSTANCE, i2, bufferOverflow2) : new ChannelFlowOperatorImpl(flow, null, i2, bufferOverflow2, 2, null);
    }
}
