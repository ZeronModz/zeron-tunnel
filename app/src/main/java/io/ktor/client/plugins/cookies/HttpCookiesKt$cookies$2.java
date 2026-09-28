package io.ktor.client.plugins.cookies;

import com.trilead.ssh2.sftp.AttribFlags;
import defpackage.ie0;
import defpackage.u7;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.d;
import org.slf4j.Logger;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.plugins.cookies.HttpCookiesKt", f = "HttpCookies.kt", i = {}, l = {142}, m = "cookies", n = {}, s = {})
final class HttpCookiesKt$cookies$2 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    public HttpCookiesKt$cookies$2(Continuation<? super HttpCookiesKt$cookies$2> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.result = obj;
        int i = this.label | AttribFlags.SSH_FILEXFER_ATTR_EXTENDED;
        this.label = i;
        Logger logger = c.a;
        if ((i & AttribFlags.SSH_FILEXFER_ATTR_EXTENDED) != 0) {
            this.label = i - AttribFlags.SSH_FILEXFER_ATTR_EXTENDED;
        } else {
            this = new HttpCookiesKt$cookies$2(this);
        }
        Object obj2 = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            d.b(obj2);
            ie0.b(null, HttpCookies.d);
            throw null;
        }
        if (i2 != 1) {
            u7.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        d.b(obj2);
        List list = (List) obj2;
        return list == null ? EmptyList.INSTANCE : list;
    }
}
