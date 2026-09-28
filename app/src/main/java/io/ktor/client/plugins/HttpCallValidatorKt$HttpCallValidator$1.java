package io.ktor.client.plugins;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class HttpCallValidatorKt$HttpCallValidator$1 extends FunctionReferenceImpl implements Function0<HttpCallValidatorConfig> {
    public static final HttpCallValidatorKt$HttpCallValidator$1 INSTANCE = new HttpCallValidatorKt$HttpCallValidator$1();

    public HttpCallValidatorKt$HttpCallValidator$1() {
        super(0, HttpCallValidatorConfig.class, "<init>", "<init>()V", 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final HttpCallValidatorConfig invoke() {
        return new HttpCallValidatorConfig();
    }
}
