package io.ktor.client.plugins;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.me0;
import defpackage.mk1;
import defpackage.t;
import defpackage.u7;
import io.ktor.client.plugins.api.ClientPluginBuilder;
import io.ktor.client.request.HttpRequestBuilder;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import org.slf4j.Logger;

 
 
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u001c\u0010\u0006\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lio/ktor/client/request/HttpRequestBuilder;", "request", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "Lmk1;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "proceed", "<anonymous>", "(Lio/ktor/client/request/HttpRequestBuilder;Lkotlin/jvm/functions/Function1;)V"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "io.ktor.client.plugins.HttpRequestLifecycleKt$HttpRequestLifecycle$1$1", f = "HttpRequestLifecycle.kt", i = {0}, l = {27}, m = "invokeSuspend", n = {"executionContext"}, s = {"L$0"})
final class HttpRequestLifecycleKt$HttpRequestLifecycle$1$1 extends SuspendLambda implements Function3<HttpRequestBuilder, Function1<? super Continuation<? super mk1>, ? extends Object>, Continuation<? super mk1>, Object> {
    final   ClientPluginBuilder<mk1> $this_createClientPlugin;
      Object L$0;
      Object L$1;
    int label;

     
    public HttpRequestLifecycleKt$HttpRequestLifecycle$1$1(ClientPluginBuilder<mk1> clientPluginBuilder, Continuation<? super HttpRequestLifecycleKt$HttpRequestLifecycle$1$1> continuation) {
        super(3, continuation);
        this.$this_createClientPlugin = clientPluginBuilder;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(HttpRequestBuilder httpRequestBuilder, Function1<? super Continuation<? super mk1>, ? extends Object> function1, Continuation<? super mk1> continuation) {
        HttpRequestLifecycleKt$HttpRequestLifecycle$1$1 httpRequestLifecycleKt$HttpRequestLifecycle$1$1 = new HttpRequestLifecycleKt$HttpRequestLifecycle$1$1(this.$this_createClientPlugin, continuation);
        httpRequestLifecycleKt$HttpRequestLifecycle$1$1.L$0 = httpRequestBuilder;
        httpRequestLifecycleKt$HttpRequestLifecycle$1$1.L$1 = function1;
        return httpRequestLifecycleKt$HttpRequestLifecycle$1$1.invokeSuspend(mk1.a);
    }

     
     
     
     
     
     
     
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CompletableJob r7;
        CompletableJob r72;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                u7.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7 = (CompletableJob) this.L$0;
            try {
                kotlin.d.b(obj);
                r72 = r7;
                r72.complete();
                return mk1.a;
            } catch (Throwable th) {
                th = th;
                try {
                    r7.completeExceptionally(th);
                    throw th;
                } catch (Throwable th2) {
                    r7.complete();
                    throw th2;
                }
            }
        }
        kotlin.d.b(obj);
        HttpRequestBuilder httpRequestBuilder = (HttpRequestBuilder) this.L$0;
        Function1 function1 = (Function1) this.L$1;
        Job jobB = kotlinx.coroutines.a.b(httpRequestBuilder.e);
        CoroutineContext.Element element = this.$this_createClientPlugin.a.d.get(Job.Key);
        element.getClass();
        Logger logger = me0.a;
        ((JobSupport) jobB).invokeOnCompletion(new t(((Job) element).invokeOnCompletion(new t(jobB, 12)), 13));
        try {
            httpRequestBuilder.e = jobB;
            this.L$0 = jobB;
            this.label = 1;
            if (function1.invoke(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            r72 = jobB;
            r72.complete();
            return mk1.a;
        } catch (Throwable th3) {
            th = th3;
            r7 = jobB;
            r7.completeExceptionally(th);
            throw th;
        }
    }
}
