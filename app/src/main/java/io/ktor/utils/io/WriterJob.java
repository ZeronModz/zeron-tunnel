package io.ktor.utils.io;

import kotlin.Metadata;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/ktor/utils/io/WriterJob;", "Lio/ktor/utils/io/ChannelJob;", "Lio/ktor/utils/io/ByteReadChannel;", "channel", "Lkotlinx/coroutines/Job;", "job", "<init>", "(Lio/ktor/utils/io/ByteReadChannel;Lkotlinx/coroutines/Job;)V", "ktor-io"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WriterJob implements ChannelJob {
    public final ByteReadChannel a;
    public final Job b;

    public WriterJob(ByteReadChannel byteReadChannel, Job job) {
        byteReadChannel.getClass();
        job.getClass();
        this.a = byteReadChannel;
        this.b = job;
    }

    @Override // io.ktor.utils.io.ChannelJob
    /* JADX INFO: renamed from: getJob, reason: from getter */
    public final Job getB() {
        return this.b;
    }
}
