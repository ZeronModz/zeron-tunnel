package io.ktor.client.plugins.internal;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.m8;
import defpackage.oy;
import defpackage.tb0;
import defpackage.xu;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.WriterJob;
import io.ktor.utils.io.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.a;
import sun.misc.Unsafe;

 
 
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lio/ktor/client/plugins/internal/ByteChannelReplay;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lio/ktor/utils/io/ByteReadChannel;", "origin", "<init>", "(Lio/ktor/utils/io/ByteReadChannel;)V", "CopyFromSourceTask", "ktor-client-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ByteChannelReplay {
    public static final   long b = m8.a.objectFieldOffset(ByteChannelReplay.class.getDeclaredField("content"));
    public final ByteReadChannel a;
    private volatile   Object content;

    public ByteChannelReplay(ByteReadChannel byteReadChannel) {
        byteReadChannel.getClass();
        this.a = byteReadChannel;
        this.content = null;
    }

     
     
     
     
    public final ByteReadChannel a() throws Throwable {
        tb0 tb0Var = tb0.a;
        if (this.a.getClosedCause() != null) {
            Throwable closedCause = this.a.getClosedCause();
            closedCause.getClass();
            throw closedCause;
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        Object r2 = this.content;
        ref$ObjectRef.element = r2;
        CompletableDeferred completableDeferred = null;
        Object[] objArr = 0;
        if (r2 == 0) {
            CopyFromSourceTask copyFromSourceTask = new CopyFromSourceTask(this, completableDeferred, 1, objArr == true ? 1 : 0);
            ref$ObjectRef.element = copyFromSourceTask;
            while (true) {
                Unsafe unsafe = m8.a;
                long j = b;
                ByteChannelReplay byteChannelReplay = this;
                if (unsafe.compareAndSwapObject(byteChannelReplay, j, (Object) null, (Object) copyFromSourceTask)) {
                    CopyFromSourceTask copyFromSourceTask2 = (CopyFromSourceTask) ref$ObjectRef.element;
                    copyFromSourceTask2.getClass();
                    WriterJob writerJobJ = d.j(tb0Var, oy.b, new ByteChannelReplay$CopyFromSourceTask$receiveBody$1(copyFromSourceTask2.c, copyFromSourceTask2, null), 2);
                    copyFromSourceTask2.b = writerJobJ;
                    return writerJobJ.a;
                }
                if (unsafe.getObjectVolatile(byteChannelReplay, j) != null) {
                    ref$ObjectRef.element = byteChannelReplay.content;
                    break;
                }
                this = byteChannelReplay;
            }
        }
        return d.j(tb0Var, null, new ByteChannelReplay$replay$1(ref$ObjectRef, null), 3).a;
    }

     
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/ktor/client/plugins/internal/ByteChannelReplay$CopyFromSourceTask;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lkotlinx/coroutines/CompletableDeferred;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "savedResponse", "<init>", "(Lio/ktor/client/plugins/internal/ByteChannelReplay;Lkotlinx/coroutines/CompletableDeferred;)V", "ktor-client-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class CopyFromSourceTask {
        public final CompletableDeferred a;
        public WriterJob b;
        public final   ByteChannelReplay c;

        public   CopyFromSourceTask(ByteChannelReplay byteChannelReplay, CompletableDeferred completableDeferred, int i, xu xuVar) {
            this(byteChannelReplay, (i & 1) != 0 ? a.a() : completableDeferred);
        }

        public CopyFromSourceTask(ByteChannelReplay byteChannelReplay, CompletableDeferred<byte[]> completableDeferred) {
            completableDeferred.getClass();
            this.c = byteChannelReplay;
            this.a = completableDeferred;
        }
    }
}
