package io.ktor.client.plugins;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class UserAgentKt$UserAgent$1 extends AdaptedFunctionReference implements Function0<UserAgentConfig> {
    public static final UserAgentKt$UserAgent$1 INSTANCE = new UserAgentKt$UserAgent$1();

    public UserAgentKt$UserAgent$1() {
        super(0, UserAgentConfig.class, "<init>", "<init>(Ljava/lang/String;)V", 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final UserAgentConfig invoke() {
        return new UserAgentConfig(null, 1, null);
    }
}
