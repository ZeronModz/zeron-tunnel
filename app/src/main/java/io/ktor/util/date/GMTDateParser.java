package io.ktor.util.date;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.u7;
import defpackage.xu;
import defpackage.yg0;
import java.util.Iterator;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lio/ktor/util/date/GMTDateParser;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "pattern", "<init>", "(Ljava/lang/String;)V", "Companion", "ktor-utils"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GMTDateParser {
    public final String a;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\f\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004¨\u0006\f"}, d2 = {"Lio/ktor/util/date/GMTDateParser$Companion;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "SECONDS", "C", "MINUTES", "HOURS", "DAY_OF_MONTH", "MONTH", "YEAR", "ZONE", "ANY", "ktor-utils"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public Companion(xu xuVar) {
        }
    }

    static {
        new Companion(null);
    }

    public GMTDateParser(String str) {
        str.getClass();
        this.a = str;
        if (str.length() > 0) {
            return;
        }
        u7.p("Date parser pattern shouldn't be empty.");
        throw null;
    }

    public static void a(GMTDateBuilder gMTDateBuilder, char c, String str) {
        Month next;
        if (c != '*') {
            if (c == 'M') {
                Month.INSTANCE.getClass();
                Iterator<Month> it = Month.getEntries().iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if (yg0.a(next.getValue(), str)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                Month month = next;
                if (month == null) {
                    throw new IllegalStateException("Invalid month: ".concat(str).toString());
                }
                gMTDateBuilder.e = month;
                return;
            }
            if (c == 'Y') {
                gMTDateBuilder.f = Integer.valueOf(Integer.parseInt(str));
                return;
            }
            if (c == 'd') {
                gMTDateBuilder.d = Integer.valueOf(Integer.parseInt(str));
                return;
            }
            if (c == 'h') {
                gMTDateBuilder.c = Integer.valueOf(Integer.parseInt(str));
                return;
            }
            if (c == 'm') {
                gMTDateBuilder.b = Integer.valueOf(Integer.parseInt(str));
                return;
            }
            if (c == 's') {
                gMTDateBuilder.a = Integer.valueOf(Integer.parseInt(str));
                return;
            }
            if (c == 'z') {
                if (str.equals("GMT")) {
                    return;
                }
                u7.p("Check failed.");
            } else {
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) != c) {
                        u7.p("Check failed.");
                        return;
                    }
                }
            }
        }
    }

    public final GMTDate b(String str) {
        str.getClass();
        GMTDateBuilder gMTDateBuilder = new GMTDateBuilder();
        String str2 = this.a;
        char cCharAt = str2.charAt(0);
        int i = 0;
        int i2 = 1;
        int i3 = 0;
        while (i2 < str2.length()) {
            try {
                if (str2.charAt(i2) == cCharAt) {
                    i2++;
                } else {
                    int i4 = (i + i2) - i3;
                    a(gMTDateBuilder, cCharAt, str.substring(i, i4));
                    try {
                        cCharAt = str2.charAt(i2);
                        i3 = i2;
                        i2++;
                        i = i4;
                    } catch (Throwable unused) {
                        i = i4;
                        throw new InvalidDateStringException(str, i, str2);
                    }
                }
            } catch (Throwable unused2) {
            }
        }
        if (i < str.length()) {
            a(gMTDateBuilder, cCharAt, str.substring(i));
        }
        Integer num = gMTDateBuilder.a;
        num.getClass();
        int iIntValue = num.intValue();
        Integer num2 = gMTDateBuilder.b;
        num2.getClass();
        int iIntValue2 = num2.intValue();
        Integer num3 = gMTDateBuilder.c;
        num3.getClass();
        int iIntValue3 = num3.intValue();
        Integer num4 = gMTDateBuilder.d;
        num4.getClass();
        int iIntValue4 = num4.intValue();
        Month month = gMTDateBuilder.e;
        if (month == null) {
            yg0.N("month");
            throw null;
        }
        Integer num5 = gMTDateBuilder.f;
        num5.getClass();
        return a.a(iIntValue, iIntValue2, iIntValue3, iIntValue4, month, num5.intValue());
    }
}
