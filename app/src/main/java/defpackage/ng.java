package defpackage;

import io.github.g00fy2.quickie.QRScannerActivity;
import io.ktor.utils.io.ByteChannel;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.android.HandlerContext;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ng implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ng(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ByteChannel byteChannel = (ByteChannel) this.b;
                ByteChannel byteChannel2 = (ByteChannel) this.c;
                Throwable th = (Throwable) obj;
                mk1 mk1Var = mk1.a;
                if (th != null) {
                    byteChannel.cancel(th);
                    byteChannel2.cancel(th);
                }
                return mk1Var;
            case 1:
                HandlerContext handlerContext = (HandlerContext) this.b;
                handlerContext.c.removeCallbacks((f20) this.c);
                return mk1.a;
            case 2:
                Function1 function1 = (Function1) this.b;
                Function1 function12 = (Function1) this.c;
                obj.getClass();
                if (function1 != null) {
                    function1.invoke(obj);
                }
                function12.invoke(obj);
                return mk1.a;
            case 3:
                KSerializer kSerializer = (KSerializer) this.b;
                KSerializer kSerializer2 = (KSerializer) this.c;
                ClassSerialDescriptorBuilder classSerialDescriptorBuilder = (ClassSerialDescriptorBuilder) obj;
                classSerialDescriptorBuilder.getClass();
                ClassSerialDescriptorBuilder.a(classSerialDescriptorBuilder, "key", kSerializer.getB());
                ClassSerialDescriptorBuilder.a(classSerialDescriptorBuilder, "value", kSerializer2.getB());
                return mk1.a;
            default:
                we0 we0Var = (we0) this.b;
                QRScannerActivity qRScannerActivity = (QRScannerActivity) this.c;
                String str = (String) obj;
                int i = QRScannerActivity.j;
                str.getClass();
                synchronized (we0Var.p) {
                    try {
                        we0Var.o.h(null, null);
                        if (we0Var.q != null) {
                            we0Var.n();
                        }
                        we0Var.q = null;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                qRScannerActivity.h(str);
                return mk1.a;
        }
    }
}
