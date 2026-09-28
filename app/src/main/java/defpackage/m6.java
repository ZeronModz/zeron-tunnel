package defpackage;

import android.content.res.Configuration;
import android.os.LocaleList;
import androidx.core.os.a;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m6 {
    public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    public static a b(Configuration configuration) {
        return a.c(configuration.getLocales().toLanguageTags());
    }

    public static void c(a aVar) {
        LocaleList.setDefault(LocaleList.forLanguageTags(aVar.g()));
    }

    public static void d(Configuration configuration, a aVar) {
        configuration.setLocales(LocaleList.forLanguageTags(aVar.g()));
    }
}
