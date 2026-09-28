package io.ktor.client.plugins;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.xu;
import io.ktor.utils.io.KtorDsl;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@KtorDsl
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lio/ktor/client/plugins/UserAgentConfig;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "agent", "<init>", "(Ljava/lang/String;)V", "ktor-client-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UserAgentConfig {
    public final String a;

    public /* synthetic */ UserAgentConfig(String str, int i, xu xuVar) {
        this((i & 1) != 0 ? "Ktor http-client" : str);
    }

    public UserAgentConfig(String str) {
        str.getClass();
        this.a = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UserAgentConfig() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
