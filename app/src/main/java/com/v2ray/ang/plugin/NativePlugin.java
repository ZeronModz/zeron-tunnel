package com.v2ray.ang.plugin;

import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import defpackage.u7;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/v2ray/ang/plugin/NativePlugin;", "Lcom/v2ray/ang/plugin/ResolvedPlugin;", "Landroid/content/pm/ResolveInfo;", "resolveInfo", "<init>", "(Landroid/content/pm/ResolveInfo;)V", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NativePlugin extends ResolvedPlugin {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativePlugin(ResolveInfo resolveInfo) {
        super(resolveInfo);
        resolveInfo.getClass();
        if (resolveInfo.providerInfo != null) {
            return;
        }
        u7.p("Check failed.");
        throw null;
    }

    @Override // com.v2ray.ang.plugin.ResolvedPlugin
    public final ProviderInfo b() {
        ProviderInfo providerInfo = this.a.providerInfo;
        providerInfo.getClass();
        return providerInfo;
    }
}
