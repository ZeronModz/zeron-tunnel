package defpackage;

import io.ktor.client.plugins.observer.DelegatedCall;
import io.ktor.utils.io.ByteReadChannel;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fw implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ByteReadChannel b;

    public /* synthetic */ fw(ByteReadChannel byteReadChannel, int i) {
        this.a = i;
        this.b = byteReadChannel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        ByteReadChannel byteReadChannel = this.b;
        switch (i) {
            case 0:
                int i2 = DelegatedCall.g;
                break;
        }
        return byteReadChannel;
    }
}
