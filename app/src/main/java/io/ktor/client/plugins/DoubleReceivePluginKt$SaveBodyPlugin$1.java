package io.ktor.client.plugins;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class DoubleReceivePluginKt$SaveBodyPlugin$1 extends FunctionReferenceImpl implements Function0<SaveBodyPluginConfig> {
    public static final DoubleReceivePluginKt$SaveBodyPlugin$1 INSTANCE = new DoubleReceivePluginKt$SaveBodyPlugin$1();

    public DoubleReceivePluginKt$SaveBodyPlugin$1() {
        super(0, SaveBodyPluginConfig.class, "<init>", "<init>()V", 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final SaveBodyPluginConfig invoke() {
        return new SaveBodyPluginConfig();
    }
}
