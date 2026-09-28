package com.v2ray.ang.handler;

import android.content.Context;
import defpackage.i60;
import defpackage.mk1;
import defpackage.mu;
import defpackage.u7;
import defpackage.ul1;
import defpackage.zq0;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.d;
import kotlin.jvm.functions.Function2;
import kotlin.text.Regex;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Ljava/io/File;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.v2ray.ang.handler.UpdateCheckerManager$downloadApk$2", f = "UpdateCheckerManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class UpdateCheckerManager$downloadApk$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super File>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ String $downloadUrl;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateCheckerManager$downloadApk$2(String str, Context context, Continuation<? super UpdateCheckerManager$downloadApk$2> continuation) {
        super(2, continuation);
        this.$downloadUrl = str;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<mk1> create(Object obj, Continuation<?> continuation) {
        return new UpdateCheckerManager$downloadApk$2(this.$downloadUrl, this.$context, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super File> continuation) {
        return ((UpdateCheckerManager$downloadApk$2) create(coroutineScope, continuation)).invokeSuspend(mk1.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            u7.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        d.b(obj);
        try {
            Regex regex = ul1.a;
            Lazy lazy = zq0.a;
            HttpURLConnection httpURLConnectionA = i60.a(this.$downloadUrl, ul1.y(Integer.parseInt("10808"), zq0.z().d("pref_socks_port")), 10000, 10000, true);
            try {
                if (httpURLConnectionA == null) {
                    throw new IllegalStateException("Failed to create connection");
                }
                try {
                    File file = new File(this.$context.getCacheDir(), "update.apk");
                    file.getAbsolutePath();
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        InputStream inputStream = httpURLConnectionA.getInputStream();
                        try {
                            inputStream.getClass();
                            mu.h(inputStream, fileOutputStream);
                            inputStream.close();
                            fileOutputStream.close();
                            try {
                                return file;
                            } catch (Exception e) {
                                return file;
                            }
                        } finally {
                        }
                    } finally {
                    }
                } catch (Exception e2) {
                    e2.getMessage();
                    try {
                        httpURLConnectionA.disconnect();
                    } catch (Exception e3) {
                        e3.getMessage();
                    }
                    return null;
                }
            } finally {
                try {
                    httpURLConnectionA.disconnect();
                } catch (Exception e4) {
                    e4.getMessage();
                }
            }
        } catch (Exception e5) {
            e5.getMessage();
            return null;
        }
    }
}
