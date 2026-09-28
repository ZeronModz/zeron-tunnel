package com.blacksquircle.ui.editorkit.model;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.hz;
import defpackage.vh;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/blacksquircle/ui/editorkit/model/TextChange;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "newText", "oldText", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "start", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "editorkit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class TextChange {
    public String a;
    public String b;
    public int c;

    public TextChange(String str, String str2, int i) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextChange)) {
            return false;
        }
        TextChange textChange = (TextChange) obj;
        return this.a.equals(textChange.a) && this.b.equals(textChange.b) && this.c == textChange.c;
    }

    public final int hashCode() {
        return vh.c(this.a.hashCode() * 31, 31, this.b) + this.c;
    }

    public final String toString() {
        return hz.q(this.c, ")", hz.A("TextChange(newText=", this.a, ", oldText=", this.b, ", start="));
    }
}
