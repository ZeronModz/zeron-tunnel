package com.v2ray.ang.service;

import android.net.LocalSocket;
import android.net.LocalSocketAddress;
import defpackage.mk1;
import defpackage.u7;
import java.io.FileDescriptor;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.d;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lmk1;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 2, 0})
@DebugMetadata(c = "com.v2ray.ang.service.V2RayVpnService$sendFd$1", f = "V2RayVpnService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class V2RayVpnService$sendFd$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super mk1>, Object> {
    final /* synthetic */ FileDescriptor $fd;
    final /* synthetic */ String $path;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V2RayVpnService$sendFd$1(String str, FileDescriptor fileDescriptor, Continuation<? super V2RayVpnService$sendFd$1> continuation) {
        super(2, continuation);
        this.$path = str;
        this.$fd = fileDescriptor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<mk1> create(Object obj, Continuation<?> continuation) {
        return new V2RayVpnService$sendFd$1(this.$path, this.$fd, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super mk1> continuation) {
        return ((V2RayVpnService$sendFd$1) create(coroutineScope, continuation)).invokeSuspend(mk1.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            u7.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        d.b(obj);
        int i = 0;
        while (true) {
            try {
                Thread.sleep(50 << i);
                LocalSocket localSocket = new LocalSocket();
                String str = this.$path;
                FileDescriptor fileDescriptor = this.$fd;
                try {
                    localSocket.connect(new LocalSocketAddress(str, LocalSocketAddress.Namespace.FILESYSTEM));
                    localSocket.setFileDescriptorsForSend(new FileDescriptor[]{fileDescriptor});
                    localSocket.getOutputStream().write(42);
                    localSocket.close();
                    break;
                } finally {
                }
            } catch (Exception unused) {
                if (i > 5) {
                    break;
                }
                i++;
            }
        }
        return mk1.a;
    }
}
