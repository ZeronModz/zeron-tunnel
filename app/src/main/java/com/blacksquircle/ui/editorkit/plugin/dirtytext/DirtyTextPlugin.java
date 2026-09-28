package com.blacksquircle.ui.editorkit.plugin.dirtytext;

import com.blacksquircle.ui.editorkit.plugin.base.EditorPlugin;
import com.blacksquircle.ui.editorkit.widget.TextProcessor;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.xu;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/blacksquircle/ui/editorkit/plugin/dirtytext/DirtyTextPlugin;", "Lcom/blacksquircle/ui/editorkit/plugin/base/EditorPlugin;", "<init>", "()V", "Companion", "editorkit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DirtyTextPlugin extends EditorPlugin {

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/blacksquircle/ui/editorkit/plugin/dirtytext/DirtyTextPlugin$Companion;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "PLUGIN_ID", "Ljava/lang/String;", "editorkit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion(xu xuVar) {
        }
    }

    static {
        new Companion(null);
    }

    public DirtyTextPlugin() {
        super("dirty-text-9124");
    }

    @Override // com.blacksquircle.ui.editorkit.plugin.base.EditorPlugin
    public final void f(TextProcessor textProcessor) {
        this.b = null;
    }

    @Override // com.blacksquircle.ui.editorkit.plugin.base.EditorPlugin
    public final void a() {
    }

    @Override // com.blacksquircle.ui.editorkit.plugin.base.EditorPlugin
    public final void o(CharSequence charSequence) {
    }
}
