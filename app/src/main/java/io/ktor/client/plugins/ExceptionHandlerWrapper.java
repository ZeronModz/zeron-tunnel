package io.ktor.client.plugins;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.mk1;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B>\u00125\u0010\u000b\u001a1\b\u0001\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0002j\u0002`\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lio/ktor/client/plugins/ExceptionHandlerWrapper;", "Lio/ktor/client/plugins/HandlerWrapper;", "Lkotlin/Function2;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lkotlin/ParameterName;", "name", "cause", "Lkotlin/coroutines/Continuation;", "Lmk1;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lio/ktor/client/plugins/CallExceptionHandler;", "handler", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "ktor-client-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ExceptionHandlerWrapper implements HandlerWrapper {
    public final Function2 a;

    public ExceptionHandlerWrapper(Function2<? super Throwable, ? super Continuation<? super mk1>, ? extends Object> function2) {
        function2.getClass();
        this.a = function2;
    }
}
