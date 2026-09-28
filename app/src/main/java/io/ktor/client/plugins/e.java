package io.ktor.client.plugins;

import io.ktor.client.plugins.internal.ByteChannelReplay;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.JobImpl;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return DefaultTransformKt$defaultTransformers$2.invokeSuspend$lambda$1$lambda$0((JobImpl) obj);
            default:
                return ((ByteChannelReplay) obj).a();
        }
    }
}
