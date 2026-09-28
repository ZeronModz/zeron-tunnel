package io.ktor.serialization;

import com.trilead.ssh2.packets.Packets;
import com.trilead.ssh2.sftp.AttribFlags;
import defpackage.mk1;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.utils.io.ByteReadChannel;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ContentConverterKt$deserialize$$inlined$map$1 implements Flow<Object> {
    public final /* synthetic */ Flow a;
    public final /* synthetic */ Charset b;
    public final /* synthetic */ TypeInfo c;
    public final /* synthetic */ ByteReadChannel d;

    /* JADX INFO: renamed from: io.ktor.serialization.ContentConverterKt$deserialize$$inlined$map$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public final class AnonymousClass2<T> implements FlowCollector {
        public final /* synthetic */ FlowCollector a;
        public final /* synthetic */ Charset b;
        public final /* synthetic */ TypeInfo c;
        public final /* synthetic */ ByteReadChannel d;

        /* JADX INFO: renamed from: io.ktor.serialization.ContentConverterKt$deserialize$$inlined$map$1$2$1, reason: invalid class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "io.ktor.serialization.ContentConverterKt$deserialize$$inlined$map$1$2", f = "ContentConverter.kt", i = {}, l = {Packets.SSH_MSG_USERAUTH_FAILURE, 50}, m = "emit", n = {}, s = {})
        public final class AnonymousClass1 extends ContinuationImpl {
            Object L$0;
            int label;
            /* synthetic */ Object result;

            public AnonymousClass1(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= AttribFlags.SSH_FILEXFER_ATTR_EXTENDED;
                return AnonymousClass2.this.emit(null, this);
            }
        }

        public AnonymousClass2(FlowCollector flowCollector, Charset charset, TypeInfo typeInfo, ByteReadChannel byteReadChannel) {
            this.a = flowCollector;
            this.b = charset;
            this.c = typeInfo;
            this.d = byteReadChannel;
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
        
            if (r7.emit(r9, r0) == r1) goto L22;
         */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r8, kotlin.coroutines.Continuation r9) throws java.lang.Throwable {
            /*
                r7 = this;
                boolean r0 = r9 instanceof io.ktor.serialization.ContentConverterKt$deserialize$$inlined$map$1.AnonymousClass2.AnonymousClass1
                if (r0 == 0) goto L13
                r0 = r9
                io.ktor.serialization.ContentConverterKt$deserialize$$inlined$map$1$2$1 r0 = (io.ktor.serialization.ContentConverterKt$deserialize$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                io.ktor.serialization.ContentConverterKt$deserialize$$inlined$map$1$2$1 r0 = new io.ktor.serialization.ContentConverterKt$deserialize$$inlined$map$1$2$1
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.result
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.label
                r3 = 0
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L39
                if (r2 == r5) goto L31
                if (r2 != r4) goto L2b
                kotlin.d.b(r9)
                goto L5f
            L2b:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.u7.p(r7)
                return r3
            L31:
                java.lang.Object r7 = r0.L$0
                kotlinx.coroutines.flow.FlowCollector r7 = (kotlinx.coroutines.flow.FlowCollector) r7
                kotlin.d.b(r9)
                goto L54
            L39:
                kotlin.d.b(r9)
                io.ktor.serialization.ContentConverter r8 = (io.ktor.serialization.ContentConverter) r8
                kotlinx.coroutines.flow.FlowCollector r9 = r7.a
                r0.L$0 = r9
                r0.label = r5
                java.nio.charset.Charset r2 = r7.b
                io.ktor.util.reflect.TypeInfo r5 = r7.c
                io.ktor.utils.io.ByteReadChannel r7 = r7.d
                java.lang.Object r7 = r8.deserialize(r2, r5, r7, r0)
                if (r7 != r1) goto L51
                goto L5e
            L51:
                r6 = r9
                r9 = r7
                r7 = r6
            L54:
                r0.L$0 = r3
                r0.label = r4
                java.lang.Object r7 = r7.emit(r9, r0)
                if (r7 != r1) goto L5f
            L5e:
                return r1
            L5f:
                mk1 r7 = defpackage.mk1.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.serialization.ContentConverterKt$deserialize$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public ContentConverterKt$deserialize$$inlined$map$1(Flow flow, Charset charset, TypeInfo typeInfo, ByteReadChannel byteReadChannel) {
        this.a = flow;
        this.b = charset;
        this.c = typeInfo;
        this.d = byteReadChannel;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector<? super Object> flowCollector, Continuation continuation) {
        Object objCollect = this.a.collect(new AnonymousClass2(flowCollector, this.b, this.c, this.d), continuation);
        return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : mk1.a;
    }
}
