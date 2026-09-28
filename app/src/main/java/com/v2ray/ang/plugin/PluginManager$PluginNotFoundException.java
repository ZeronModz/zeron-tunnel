package com.v2ray.ang.plugin;

import com.google.android.gms.ads.RequestConfiguration;
import java.io.FileNotFoundException;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/v2ray/ang/plugin/PluginManager$PluginNotFoundException", "Ljava/io/FileNotFoundException;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "plugin", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "getPlugin", "()Ljava/lang/String;", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PluginManager$PluginNotFoundException extends FileNotFoundException {
    private final String plugin;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PluginManager$PluginNotFoundException(String str) {
        super(str);
        str.getClass();
        this.plugin = str;
    }

    public final String getPlugin() {
        return this.plugin;
    }
}
