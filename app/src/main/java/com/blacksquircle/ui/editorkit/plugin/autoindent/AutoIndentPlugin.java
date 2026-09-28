package com.blacksquircle.ui.editorkit.plugin.autoindent;

import com.blacksquircle.ui.editorkit.plugin.base.EditorPlugin;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.xu;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/blacksquircle/ui/editorkit/plugin/autoindent/AutoIndentPlugin;", "Lcom/blacksquircle/ui/editorkit/plugin/base/EditorPlugin;", "<init>", "()V", "Companion", "editorkit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AutoIndentPlugin extends EditorPlugin {
    public static final /* synthetic */ int h = 0;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public String f;
    public boolean g;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/blacksquircle/ui/editorkit/plugin/autoindent/AutoIndentPlugin$Companion;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "PLUGIN_ID", "Ljava/lang/String;", "editorkit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion(xu xuVar) {
        }
    }

    static {
        new Companion(null);
    }

    public AutoIndentPlugin() {
        super("autoindent-7401");
        this.c = true;
        this.d = true;
        this.e = true;
        this.f = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x017d, code lost:
    
        if (r6.getText().charAt(r13 - 1) != '\\') goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x021e, code lost:
    
        if (r6.getText().charAt(r13 - 1) != '\\') goto L80;
     */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x007e A[EDGE_INSN: B:145:0x007e->B:27:0x007e BREAK  A[LOOP:0: B:19:0x0054->B:26:0x007b], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00dd  */
    @Override // com.blacksquircle.ui.editorkit.plugin.base.EditorPlugin
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(final int r13, final int r14, java.lang.CharSequence r15) {
        /*
            Method dump skipped, instruction units count: 888
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blacksquircle.ui.editorkit.plugin.autoindent.AutoIndentPlugin.k(int, int, java.lang.CharSequence):void");
    }
}
