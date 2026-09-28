package io.ktor.util.date;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.xu;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lio/ktor/util/date/WeekDay;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY", "ktor-utils"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WeekDay {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ WeekDay[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String value;
    public static final WeekDay MONDAY = new WeekDay("MONDAY", 0, "Mon");
    public static final WeekDay TUESDAY = new WeekDay("TUESDAY", 1, "Tue");
    public static final WeekDay WEDNESDAY = new WeekDay("WEDNESDAY", 2, "Wed");
    public static final WeekDay THURSDAY = new WeekDay("THURSDAY", 3, "Thu");
    public static final WeekDay FRIDAY = new WeekDay("FRIDAY", 4, "Fri");
    public static final WeekDay SATURDAY = new WeekDay("SATURDAY", 5, "Sat");
    public static final WeekDay SUNDAY = new WeekDay("SUNDAY", 6, "Sun");

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/util/date/WeekDay$Companion;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "ktor-utils"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public Companion(xu xuVar) {
        }
    }

    private static final /* synthetic */ WeekDay[] $values() {
        return new WeekDay[]{MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY};
    }

    static {
        WeekDay[] weekDayArr$values = $values();
        $VALUES = weekDayArr$values;
        $ENTRIES = kotlin.enums.a.a(weekDayArr$values);
        INSTANCE = new Companion(null);
    }

    private WeekDay(String str, int i, String str2) {
        this.value = str2;
    }

    public static EnumEntries<WeekDay> getEntries() {
        return $ENTRIES;
    }

    public static WeekDay valueOf(String str) {
        return (WeekDay) Enum.valueOf(WeekDay.class, str);
    }

    public static WeekDay[] values() {
        return (WeekDay[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
