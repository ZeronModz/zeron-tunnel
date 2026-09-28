package com.blacksquircle.ui.editorkit.plugin.pinchzoom;

import com.blacksquircle.ui.editorkit.plugin.base.EditorPlugin;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.xu;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/blacksquircle/ui/editorkit/plugin/pinchzoom/PinchZoomPlugin;", "Lcom/blacksquircle/ui/editorkit/plugin/base/EditorPlugin;", "<init>", "()V", "Companion", "editorkit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PinchZoomPlugin extends EditorPlugin {
    public final float c;
    public final float d;
    public boolean e;
    public float f;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/blacksquircle/ui/editorkit/plugin/pinchzoom/PinchZoomPlugin$Companion;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "DEFAULT_MAX_TEXT_SIZE", "F", "DEFAULT_MIN_TEXT_SIZE", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "PLUGIN_ID", "Ljava/lang/String;", "editorkit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion(xu xuVar) {
        }
    }

    static {
        new Companion(null);
    }

    public PinchZoomPlugin() {
        super("pinchzoom-0361");
        this.c = 10.0f;
        this.d = 20.0f;
        this.f = 1.0f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000c, code lost:
    
        if (r0 != 3) goto L30;
     */
    @Override // com.blacksquircle.ui.editorkit.plugin.base.EditorPlugin
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean l(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getAction()
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L89
            r3 = 2
            if (r0 == r3) goto L10
            r6 = 3
            if (r0 == r6) goto L89
            goto L88
        L10:
            int r0 = r6.getPointerCount()
            if (r0 != r3) goto L88
            float r0 = r6.getX(r1)
            float r3 = r6.getX(r2)
            float r0 = r0 - r3
            float r3 = r6.getY(r1)
            float r6 = r6.getY(r2)
            float r3 = r3 - r6
            float r0 = r0 * r0
            float r3 = r3 * r3
            float r3 = r3 + r0
            double r3 = (double) r3
            double r3 = java.lang.Math.sqrt(r3)
            float r6 = (float) r3
            boolean r0 = r5.e
            if (r0 != 0) goto L63
            com.blacksquircle.ui.editorkit.widget.TextProcessor r0 = r5.b
            if (r0 == 0) goto L3e
            android.content.Context r0 = r0.getContext()
            goto L3f
        L3e:
            r0 = 0
        L3f:
            if (r0 == 0) goto L5b
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.scaledDensity
            com.blacksquircle.ui.editorkit.widget.TextProcessor r1 = r5.b
            r1.getClass()
            float r1 = r1.getTextSize()
            float r1 = r1 / r0
            float r1 = r1 / r6
            r5.f = r1
            r5.e = r2
            goto L63
        L5b:
            java.lang.String r6 = "EditorPlugin "
            java.lang.String r0 = " not attached to a context."
            defpackage.io0.n(r6, r5, r0)
            return r1
        L63:
            float r0 = r5.f
            float r0 = r0 * r6
            com.blacksquircle.ui.editorkit.widget.TextProcessor r6 = r5.b
            r6.getClass()
            float r1 = r5.c
            int r3 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r3 >= 0) goto L72
            goto L84
        L72:
            float r1 = r5.d
            int r5 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r5 <= 0) goto L79
            goto L84
        L79:
            r5 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 * r5
            double r0 = (double) r0
            double r0 = java.lang.Math.ceil(r0)
            float r0 = (float) r0
            float r1 = r0 / r5
        L84:
            r6.setTextSize(r1)
            return r2
        L88:
            return r1
        L89:
            r5.e = r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blacksquircle.ui.editorkit.plugin.pinchzoom.PinchZoomPlugin.l(android.view.MotionEvent):boolean");
    }
}
