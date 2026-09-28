package com.blacksquircle.ui.editorkit.model;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.vh;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/blacksquircle/ui/editorkit/model/FindResult;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "start", "end", "<init>", "(II)V", "editorkit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class FindResult {
    public int a;
    public int b;

    public FindResult(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FindResult)) {
            return false;
        }
        FindResult findResult = (FindResult) obj;
        return this.a == findResult.a && this.b == findResult.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return vh.h(this.a, "FindResult(start=", this.b, ", end=", ")");
    }
}
