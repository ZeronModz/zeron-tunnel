package io.ktor.utils.io.core.internal;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.hz;
import defpackage.u7;
import defpackage.vh;
import defpackage.zu0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lio/ktor/utils/io/core/internal/CharArraySequence;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "array", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, TypedValues.CycleType.S_WAVE_OFFSET, "length", "<init>", "([CII)V", "ktor-io"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CharArraySequence implements CharSequence {
    public final char[] a;
    public final int b;
    public final int c;

    public CharArraySequence(char[] cArr, int i, int i2) {
        cArr.getClass();
        this.a = cArr;
        this.b = i;
        this.c = i2;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        int i2 = this.c;
        if (i < i2) {
            return this.a[i + this.b];
        }
        u7.i(vh.g(i, i2, "String index out of bounds: ", " > "));
        return (char) 0;
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return this.c;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        if (i < 0) {
            zu0.e(hz.o(i, "startIndex shouldn't be negative: "));
            return null;
        }
        int i3 = this.c;
        if (i > i3) {
            zu0.e(vh.g(i, i3, "startIndex is too large: ", " > "));
            return null;
        }
        if (i + i2 > i3) {
            zu0.e(vh.g(i2, i3, "endIndex is too large: ", " > "));
            return null;
        }
        if (i2 >= i) {
            return new CharArraySequence(this.a, this.b + i, i2 - i);
        }
        zu0.e(vh.g(i, i2, "endIndex should be greater or equal to startIndex: ", " > "));
        return null;
    }
}
