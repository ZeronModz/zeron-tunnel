package io.ktor.util.date;

import io.ktor.util.date.Month;
import java.util.DesugarTimeZone;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static final TimeZone a = DesugarTimeZone.getTimeZone("GMT");

    public static final GMTDate a(int i, int i2, int i3, int i4, Month month, int i5) {
        month.getClass();
        Calendar calendar = Calendar.getInstance(a, Locale.ROOT);
        calendar.getClass();
        calendar.set(1, i5);
        calendar.set(2, month.ordinal());
        calendar.set(5, i4);
        calendar.set(11, i3);
        calendar.set(12, i2);
        calendar.set(13, i);
        calendar.set(14, 0);
        return c(calendar, null);
    }

    public static final GMTDate b(Long l) {
        Calendar calendar = Calendar.getInstance(a, Locale.ROOT);
        calendar.getClass();
        return c(calendar, l);
    }

    public static final GMTDate c(Calendar calendar, Long l) {
        if (l != null) {
            calendar.setTimeInMillis(l.longValue());
        }
        int i = calendar.get(16) + calendar.get(15);
        int i2 = calendar.get(13);
        int i3 = calendar.get(12);
        int i4 = calendar.get(11);
        int i5 = (calendar.get(7) + 5) % 7;
        WeekDay.INSTANCE.getClass();
        WeekDay weekDay = WeekDay.getEntries().get(i5);
        int i6 = calendar.get(5);
        int i7 = calendar.get(6);
        Month.Companion companion = Month.INSTANCE;
        int i8 = calendar.get(2);
        companion.getClass();
        return new GMTDate(i2, i3, i4, weekDay, i6, i7, Month.getEntries().get(i8), calendar.get(1), calendar.getTimeInMillis() + ((long) i));
    }
}
