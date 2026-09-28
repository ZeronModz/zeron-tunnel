package com.blacksquircle.ui.editorkit.exception;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.hz;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/blacksquircle/ui/editorkit/exception/LineException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "line", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "(I)V", "editorkit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LineException extends RuntimeException {
    public LineException(int i) {
        super(hz.p(i, "Line ", " does not exists"));
    }
}
