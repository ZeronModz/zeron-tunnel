package coil3.intercept;

import android.content.Context;
import coil3.EventListener;
import coil3.intercept.Interceptor;
import coil3.request.ImageRequest;
import coil3.size.Size;
import com.google.android.gms.ads.RequestConfiguration;
import com.trilead.ssh2.sftp.AttribFlags;
import defpackage.fu0;
import defpackage.oq;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcoil3/intercept/RealInterceptorChain;", "Lcoil3/intercept/Interceptor$Chain;", "Lcoil3/request/ImageRequest;", "initialRequest", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lcoil3/intercept/Interceptor;", "interceptors", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "index", "request", "Lcoil3/size/Size;", "size", "Lcoil3/EventListener;", "eventListener", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "isPlaceholderCached", "<init>", "(Lcoil3/request/ImageRequest;Ljava/util/List;ILcoil3/request/ImageRequest;Lcoil3/size/Size;Lcoil3/EventListener;Z)V", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RealInterceptorChain implements Interceptor.Chain {
    public final ImageRequest a;
    public final List b;
    public final int c;
    public final ImageRequest d;
    public final Size e;
    public final EventListener f;
    public final boolean g;

    /* JADX INFO: renamed from: coil3.intercept.RealInterceptorChain$proceed$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "coil3.intercept.RealInterceptorChain", f = "RealInterceptorChain.kt", i = {0, 0}, l = {31}, m = "proceed", n = {"this", "interceptor"}, s = {"L$0", "L$1"})
    final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= AttribFlags.SSH_FILEXFER_ATTR_EXTENDED;
            return RealInterceptorChain.this.proceed(this);
        }
    }

    public RealInterceptorChain(ImageRequest imageRequest, List<? extends Interceptor> list, int i, ImageRequest imageRequest2, Size size, EventListener eventListener, boolean z) {
        this.a = imageRequest;
        this.b = list;
        this.c = i;
        this.d = imageRequest2;
        this.e = size;
        this.f = eventListener;
        this.g = z;
    }

    public static RealInterceptorChain b(RealInterceptorChain realInterceptorChain, int i, ImageRequest imageRequest, Size size, int i2) {
        if ((i2 & 1) != 0) {
            i = realInterceptorChain.c;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            imageRequest = realInterceptorChain.d;
        }
        ImageRequest imageRequest2 = imageRequest;
        if ((i2 & 4) != 0) {
            size = realInterceptorChain.e;
        }
        return new RealInterceptorChain(realInterceptorChain.a, realInterceptorChain.b, i3, imageRequest2, size, realInterceptorChain.f, realInterceptorChain.g);
    }

    public final void a(ImageRequest imageRequest, Interceptor interceptor) {
        Context context = imageRequest.a;
        ImageRequest imageRequest2 = this.a;
        if (context != imageRequest2.a) {
            oq.g("Interceptor '", interceptor, "' cannot modify the request's context.");
            return;
        }
        if (imageRequest.b == fu0.a) {
            oq.g("Interceptor '", interceptor, "' cannot set the request's data to null.");
        } else if (imageRequest.c != imageRequest2.c) {
            oq.g("Interceptor '", interceptor, "' cannot modify the request's target.");
        } else {
            if (imageRequest.u == imageRequest2.u) {
                return;
            }
            oq.g("Interceptor '", interceptor, "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.");
        }
    }

    @Override // coil3.intercept.Interceptor.Chain
    /* JADX INFO: renamed from: getRequest, reason: from getter */
    public final ImageRequest getD() {
        return this.d;
    }

    @Override // coil3.intercept.Interceptor.Chain
    /* JADX INFO: renamed from: getSize, reason: from getter */
    public final Size getE() {
        return this.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // coil3.intercept.Interceptor.Chain
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object proceed(kotlin.coroutines.Continuation r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof coil3.intercept.RealInterceptorChain.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r8
            coil3.intercept.RealInterceptorChain$proceed$1 r0 = (coil3.intercept.RealInterceptorChain.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            coil3.intercept.RealInterceptorChain$proceed$1 r0 = new coil3.intercept.RealInterceptorChain$proceed$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 != r4) goto L34
            java.lang.Object r7 = r0.L$1
            coil3.intercept.Interceptor r7 = (coil3.intercept.Interceptor) r7
            java.lang.Object r0 = r0.L$0
            coil3.intercept.RealInterceptorChain r0 = (coil3.intercept.RealInterceptorChain) r0
            kotlin.d.b(r8)
            r6 = r8
            r8 = r7
            r7 = r0
            r0 = r6
            goto L5a
        L34:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u7.p(r7)
            return r3
        L3a:
            kotlin.d.b(r8)
            java.util.List r8 = r7.b
            int r2 = r7.c
            java.lang.Object r8 = r8.get(r2)
            coil3.intercept.Interceptor r8 = (coil3.intercept.Interceptor) r8
            int r2 = r2 + r4
            r5 = 6
            coil3.intercept.RealInterceptorChain r2 = b(r7, r2, r3, r3, r5)
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r4
            java.lang.Object r0 = r8.intercept(r2, r0)
            if (r0 != r1) goto L5a
            return r1
        L5a:
            coil3.request.ImageResult r0 = (coil3.request.ImageResult) r0
            coil3.request.ImageRequest r1 = r0.getB()
            r7.a(r1, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.intercept.RealInterceptorChain.proceed(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // coil3.intercept.Interceptor.Chain
    public final Interceptor.Chain withRequest(ImageRequest imageRequest) {
        int i = this.c;
        if (i > 0) {
            a(imageRequest, (Interceptor) this.b.get(i - 1));
        }
        return b(this, 0, imageRequest, null, 5);
    }

    @Override // coil3.intercept.Interceptor.Chain
    public final Interceptor.Chain withSize(Size size) {
        return b(this, 0, null, size, 3);
    }
}
