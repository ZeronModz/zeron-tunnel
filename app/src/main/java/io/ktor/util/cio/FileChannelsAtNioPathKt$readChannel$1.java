package io.ktor.util.cio;

import defpackage.hz;
import defpackage.if3;
import defpackage.mk1;
import defpackage.u7;
import defpackage.vh;
import defpackage.zu0;
import io.ktor.utils.io.WriterScope;
import java.io.Closeable;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.d;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/utils/io/WriterScope;", "Lmk1;", "<anonymous>", "(Lio/ktor/utils/io/WriterScope;)V"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "io.ktor.util.cio.FileChannelsAtNioPathKt$readChannel$1", f = "FileChannelsAtNioPath.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
final class FileChannelsAtNioPathKt$readChannel$1 extends SuspendLambda implements Function2<WriterScope, Continuation<? super mk1>, Object> {
    final /* synthetic */ long $endInclusive;
    final /* synthetic */ long $fileLength;
    final /* synthetic */ long $start;
    final /* synthetic */ Path $this_readChannel;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileChannelsAtNioPathKt$readChannel$1(long j, long j2, long j3, Path path, Continuation<? super FileChannelsAtNioPathKt$readChannel$1> continuation) {
        super(2, continuation);
        this.$start = j;
        this.$endInclusive = j2;
        this.$fileLength = j3;
        this.$this_readChannel = path;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<mk1> create(Object obj, Continuation<?> continuation) {
        FileChannelsAtNioPathKt$readChannel$1 fileChannelsAtNioPathKt$readChannel$1 = new FileChannelsAtNioPathKt$readChannel$1(this.$start, this.$endInclusive, this.$fileLength, this.$this_readChannel, continuation);
        fileChannelsAtNioPathKt$readChannel$1.L$0 = obj;
        return fileChannelsAtNioPathKt$readChannel$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(WriterScope writerScope, Continuation<? super mk1> continuation) {
        return ((FileChannelsAtNioPathKt$readChannel$1) create(writerScope, continuation)).invokeSuspend(mk1.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th;
        Closeable closeable;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                u7.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            closeable = (Closeable) this.L$0;
            try {
                d.b(obj);
                if3.c(closeable, null);
                return mk1.a;
            } catch (Throwable th2) {
                th = th2;
                try {
                    throw th;
                } catch (Throwable th3) {
                    if3.c(closeable, th);
                    throw th3;
                }
            }
        }
        d.b(obj);
        WriterScope writerScope = (WriterScope) this.L$0;
        long j = this.$start;
        if (j < 0) {
            zu0.e(hz.r(j, "start position shouldn't be negative but it is "));
            return null;
        }
        long j2 = this.$endInclusive;
        long j3 = this.$fileLength;
        if (j2 > j3 - 1) {
            StringBuilder sbW = vh.w(j3, "endInclusive points to the position out of the file: file size = ", ", endInclusive = ");
            sbW.append(j2);
            throw new IllegalArgumentException(sbW.toString().toString());
        }
        SeekableByteChannel seekableByteChannelNewByteChannel = Files.newByteChannel(this.$this_readChannel, new OpenOption[0]);
        long j4 = this.$start;
        long j5 = this.$endInclusive;
        try {
            seekableByteChannelNewByteChannel.getClass();
            this.L$0 = seekableByteChannelNewByteChannel;
            this.label = 1;
            if (a.b(seekableByteChannelNewByteChannel, writerScope, j4, j5, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            closeable = seekableByteChannelNewByteChannel;
            if3.c(closeable, null);
            return mk1.a;
        } catch (Throwable th4) {
            th = th4;
            closeable = seekableByteChannelNewByteChannel;
            throw th;
        }
    }
}
