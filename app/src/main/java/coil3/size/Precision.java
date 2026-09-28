package coil3.size;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcoil3/size/Precision;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "<init>", "(Ljava/lang/String;I)V", "EXACT", "INEXACT", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Precision {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Precision[] $VALUES;
    public static final Precision EXACT = new Precision("EXACT", 0);
    public static final Precision INEXACT = new Precision("INEXACT", 1);

    private static final /* synthetic */ Precision[] $values() {
        return new Precision[]{EXACT, INEXACT};
    }

    static {
        Precision[] precisionArr$values = $values();
        $VALUES = precisionArr$values;
        $ENTRIES = a.a(precisionArr$values);
    }

    private Precision(String str, int i) {
    }

    public static EnumEntries<Precision> getEntries() {
        return $ENTRIES;
    }

    public static Precision valueOf(String str) {
        return (Precision) Enum.valueOf(Precision.class, str);
    }

    public static Precision[] values() {
        return (Precision[]) $VALUES.clone();
    }
}
