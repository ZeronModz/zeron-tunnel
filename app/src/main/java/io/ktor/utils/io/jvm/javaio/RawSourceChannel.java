package io.ktor.utils.io.jvm.javaio;

import com.trilead.ssh2.sftp.AttribFlags;
import defpackage.j03;
import defpackage.mk1;
import defpackage.sg;
import defpackage.u7;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.CloseToken;
import java.io.EOFException;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.d;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobImpl;
import kotlinx.io.Buffer;
import kotlinx.io.RawSource;
import kotlinx.io.Source;
import org.conscrypt.HpkeSuite;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/ktor/utils/io/jvm/javaio/RawSourceChannel;", "Lio/ktor/utils/io/ByteReadChannel;", "Lkotlinx/io/RawSource;", "source", "Lkotlin/coroutines/CoroutineContext;", "parent", "<init>", "(Lkotlinx/io/RawSource;Lkotlin/coroutines/CoroutineContext;)V", "ktor-io"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RawSourceChannel implements ByteReadChannel {
    public final RawSource a;
    public final CoroutineContext b;
    public CloseToken c;
    public final Buffer d;
    public final JobImpl e;
    public final CoroutineContext f;

    /* JADX INFO: renamed from: io.ktor.utils.io.jvm.javaio.RawSourceChannel$awaitContent$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "io.ktor.utils.io.jvm.javaio.RawSourceChannel", f = "Reading.kt", i = {0, 0}, l = {HpkeSuite.KEM_MLKEM_768}, m = "awaitContent", n = {"this", "min"}, s = {"L$0", "I$0"})
    final class AnonymousClass1 extends ContinuationImpl {
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= AttribFlags.SSH_FILEXFER_ATTR_EXTENDED;
            return RawSourceChannel.this.awaitContent(0, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.jvm.javaio.RawSourceChannel$awaitContent$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lmk1;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "io.ktor.utils.io.jvm.javaio.RawSourceChannel$awaitContent$2", f = "Reading.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super mk1>, Object> {
        final /* synthetic */ int $min;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(int i, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$min = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<mk1> create(Object obj, Continuation<?> continuation) {
            return RawSourceChannel.this.new AnonymousClass2(this.$min, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super mk1> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(mk1.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                u7.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            d.b(obj);
            long atMostTo = 0;
            while (sg.c(RawSourceChannel.this.d) < this.$min && atMostTo >= 0) {
                try {
                    RawSourceChannel rawSourceChannel = RawSourceChannel.this;
                    atMostTo = rawSourceChannel.a.readAtMostTo(rawSourceChannel.d, Long.MAX_VALUE);
                } catch (EOFException unused) {
                    atMostTo = -1;
                }
            }
            if (atMostTo == -1) {
                RawSourceChannel.this.a.close();
                RawSourceChannel.this.e.complete();
                RawSourceChannel.this.c = new CloseToken(null);
            }
            return mk1.a;
        }
    }

    public RawSourceChannel(RawSource rawSource, CoroutineContext coroutineContext) {
        rawSource.getClass();
        coroutineContext.getClass();
        this.a = rawSource;
        this.b = coroutineContext;
        this.d = new Buffer();
        JobImpl jobImpl = new JobImpl((Job) coroutineContext.get(Job.Key));
        this.e = jobImpl;
        this.f = coroutineContext.plus(jobImpl).plus(new CoroutineName("RawSourceChannel"));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.utils.io.ByteReadChannel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object awaitContent(int r6, kotlin.coroutines.Continuation r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof io.ktor.utils.io.jvm.javaio.RawSourceChannel.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.utils.io.jvm.javaio.RawSourceChannel$awaitContent$1 r0 = (io.ktor.utils.io.jvm.javaio.RawSourceChannel.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.jvm.javaio.RawSourceChannel$awaitContent$1 r0 = new io.ktor.utils.io.jvm.javaio.RawSourceChannel$awaitContent$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2e
            int r6 = r0.I$0
            java.lang.Object r5 = r0.L$0
            io.ktor.utils.io.jvm.javaio.RawSourceChannel r5 = (io.ktor.utils.io.jvm.javaio.RawSourceChannel) r5
            kotlin.d.b(r7)
            goto L52
        L2e:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u7.p(r5)
            return r3
        L34:
            kotlin.d.b(r7)
            io.ktor.utils.io.CloseToken r7 = r5.c
            if (r7 == 0) goto L3e
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            return r5
        L3e:
            io.ktor.utils.io.jvm.javaio.RawSourceChannel$awaitContent$2 r7 = new io.ktor.utils.io.jvm.javaio.RawSourceChannel$awaitContent$2
            r7.<init>(r6, r3)
            r0.L$0 = r5
            r0.I$0 = r6
            r0.label = r4
            kotlin.coroutines.CoroutineContext r2 = r5.f
            java.lang.Object r7 = kotlinx.coroutines.c.e(r2, r7, r0)
            if (r7 != r1) goto L52
            return r1
        L52:
            kotlinx.io.Buffer r5 = r5.d
            long r0 = defpackage.sg.c(r5)
            long r5 = (long) r6
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 < 0) goto L5e
            goto L5f
        L5e:
            r4 = 0
        L5f:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.jvm.javaio.RawSourceChannel.awaitContent(int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // io.ktor.utils.io.ByteReadChannel, io.ktor.utils.io.ByteWriteChannel
    public final void cancel(Throwable th) {
        String message;
        String message2;
        if (this.c != null) {
            return;
        }
        String str = "Channel was cancelled";
        if (th == null || (message = th.getMessage()) == null) {
            message = "Channel was cancelled";
        }
        this.e.cancel(j03.a(message, th));
        this.a.close();
        if (th != null && (message2 = th.getMessage()) != null) {
            str = message2;
        }
        this.c = new CloseToken(new IOException(str, th));
    }

    @Override // io.ktor.utils.io.ByteReadChannel, io.ktor.utils.io.ByteWriteChannel
    public final Throwable getClosedCause() {
        CloseToken closeToken = this.c;
        if (closeToken != null) {
            return closeToken.a();
        }
        return null;
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public final Source getReadBuffer() {
        return this.d;
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public final boolean isClosedForRead() {
        return this.c != null && this.d.exhausted();
    }
}
