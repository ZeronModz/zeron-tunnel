package defpackage;

import com.github.mikephil.charting.formatter.ValueFormatter;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class it0 extends ValueFormatter {
    @Override // com.github.mikephil.charting.formatter.ValueFormatter
    public final String b(float f) {
        return f >= 1024.0f ? String.format("%.1f MB/s", Arrays.copyOf(new Object[]{Float.valueOf(f / 1024.0f)}, 1)) : String.format("%.0f KB/s", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1));
    }
}
