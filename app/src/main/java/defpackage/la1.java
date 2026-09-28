package defpackage;

import com.google.common.base.h;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class la1 {
    public boolean a;
    public long b;
    public long c;

    public final String toString() {
        String str;
        long jNanoTime = this.a ? (System.nanoTime() - this.c) + this.b : this.b;
        TimeUnit timeUnit = jNanoTime / 86400000000000L > 0 ? TimeUnit.DAYS : jNanoTime / 3600000000000L > 0 ? TimeUnit.HOURS : jNanoTime / 60000000000L > 0 ? TimeUnit.MINUTES : jNanoTime / 1000000000 > 0 ? TimeUnit.SECONDS : jNanoTime / 1000000 > 0 ? TimeUnit.MILLISECONDS : jNanoTime / 1000 > 0 ? TimeUnit.MICROSECONDS : TimeUnit.NANOSECONDS;
        h hVar = ww0.a;
        StringBuilder sb = new StringBuilder(String.format(Locale.ROOT, "%.4g", Double.valueOf(jNanoTime / r2.convert(1L, timeUnit))));
        sb.append(" ");
        switch (ka1.a[timeUnit.ordinal()]) {
            case 1:
                str = "ns";
                break;
            case 2:
                str = "μs";
                break;
            case 3:
                str = "ms";
                break;
            case 4:
                str = "s";
                break;
            case 5:
                str = "min";
                break;
            case 6:
                str = "h";
                break;
            case 7:
                str = "d";
                break;
            default:
                zu0.a();
                return null;
        }
        sb.append(str);
        return sb.toString();
    }
}
