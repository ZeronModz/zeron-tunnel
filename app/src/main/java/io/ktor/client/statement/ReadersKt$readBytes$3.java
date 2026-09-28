package io.ktor.client.statement;

import androidx.datastore.preferences.protobuf.x0;
import com.trilead.ssh2.sftp.AttribFlags;
import defpackage.mc2;
import defpackage.u7;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.d;
import kotlinx.io.Source;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.statement.ReadersKt", f = "Readers.kt", i = {}, l = {x0.RUBY_PACKAGE_FIELD_NUMBER}, m = "readBytes", n = {}, s = {})
final class ReadersKt$readBytes$3 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    public ReadersKt$readBytes$3(Continuation<? super ReadersKt$readBytes$3> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.result = obj;
        int i = this.label | AttribFlags.SSH_FILEXFER_ATTR_EXTENDED;
        this.label = i;
        if ((i & AttribFlags.SSH_FILEXFER_ATTR_EXTENDED) != 0) {
            this.label = i - AttribFlags.SSH_FILEXFER_ATTR_EXTENDED;
        } else {
            this = new ReadersKt$readBytes$3(this);
        }
        Object obj2 = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            d.b(obj2);
            throw null;
        }
        if (i2 == 1) {
            d.b(obj2);
            return mc2.B((Source) obj2);
        }
        u7.p("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
