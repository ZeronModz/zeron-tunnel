package com.blacksquircle.ui.editorkit.plugin.base;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u00020\u0004\"\b\b\u0000\u0010\b*\u00020\u00072\u0006\u0010\t\u001a\u00028\u0000H&¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0010\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\b*\u00020\u00072\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/blacksquircle/ui/editorkit/plugin/base/PluginContainer;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lcom/blacksquircle/ui/editorkit/plugin/base/PluginSupplier;", "supplier", "Lmk1;", "plugins", "(Lcom/blacksquircle/ui/editorkit/plugin/base/PluginSupplier;)V", "Lcom/blacksquircle/ui/editorkit/plugin/base/EditorPlugin;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "plugin", "installPlugin", "(Lcom/blacksquircle/ui/editorkit/plugin/base/EditorPlugin;)V", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "pluginId", "uninstallPlugin", "(Ljava/lang/String;)V", "findPlugin", "(Ljava/lang/String;)Lcom/blacksquircle/ui/editorkit/plugin/base/EditorPlugin;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "hasPlugin", "(Ljava/lang/String;)Z", "editorkit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface PluginContainer {
    <T extends EditorPlugin> T findPlugin(String pluginId);

    boolean hasPlugin(String pluginId);

    <T extends EditorPlugin> void installPlugin(T plugin);

    void plugins(PluginSupplier supplier);

    void uninstallPlugin(String pluginId);
}
