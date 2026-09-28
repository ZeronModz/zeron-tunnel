package com.blacksquircle.ui.language.base.model;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.hz;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/blacksquircle/ui/language/base/model/TextStructure;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "text", "<init>", "(Ljava/lang/CharSequence;)V", "Line", "language-base"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TextStructure {
    public final CharSequence a;
    public final ArrayList b;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/blacksquircle/ui/language/base/model/TextStructure$Line;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "start", "<init>", "(I)V", "language-base"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Line {
        public int a;

        public Line(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Line) && this.a == ((Line) obj).a;
        }

        /* JADX INFO: renamed from: hashCode, reason: from getter */
        public final int getA() {
            return this.a;
        }

        public final String toString() {
            return hz.p(this.a, "Line(start=", ")");
        }
    }

    public TextStructure(CharSequence charSequence) {
        charSequence.getClass();
        this.a = charSequence;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        arrayList.add(new Line(0));
    }

    public final int a(int i) {
        return i == this.b.size() + (-1) ? this.a.length() : b(i + 1) - 1;
    }

    public final int b(int i) {
        ArrayList arrayList = this.b;
        if (i >= arrayList.size()) {
            return -1;
        }
        return ((Line) arrayList.get(i)).a;
    }

    public final int c(int i) {
        int size = this.b.size() - 1;
        int i2 = 0;
        while (i2 < size) {
            int i3 = (i2 + size) / 2;
            if (i >= b(i3)) {
                if (i > b(i3)) {
                    i2 = i3 + 1;
                    if (i < b(i2)) {
                    }
                }
                return i3;
            }
            size = i3;
        }
        return r0.size() - 1;
    }
}
