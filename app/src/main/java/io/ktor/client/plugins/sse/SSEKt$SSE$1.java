package io.ktor.client.plugins.sse;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class SSEKt$SSE$1 extends FunctionReferenceImpl implements Function0<SSEConfig> {
    public static final SSEKt$SSE$1 INSTANCE = new SSEKt$SSE$1();

    public SSEKt$SSE$1() {
        super(0, SSEConfig.class, "<init>", "<init>()V", 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final SSEConfig invoke() {
        return new SSEConfig();
    }
}
