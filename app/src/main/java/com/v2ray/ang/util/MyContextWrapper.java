package com.v2ray.ang.util;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.LocaleList;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.xu;
import java.util.Locale;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0006B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/v2ray/ang/util/MyContextWrapper;", "Landroid/content/ContextWrapper;", "Landroid/content/Context;", "base", "<init>", "(Landroid/content/Context;)V", "Companion", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class MyContextWrapper extends ContextWrapper {
    public static final Companion a = new Companion(null);

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/v2ray/ang/util/MyContextWrapper$Companion;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public Companion(xu xuVar) {
        }

        public static ContextWrapper a(Context context, Locale locale) {
            Context contextCreateConfigurationContext;
            Resources resources = context.getResources();
            resources.getClass();
            Configuration configuration = resources.getConfiguration();
            configuration.getClass();
            if (Build.VERSION.SDK_INT >= 24) {
                configuration.setLocale(locale);
                LocaleList localeList = new LocaleList(locale);
                LocaleList.setDefault(localeList);
                configuration.setLocales(localeList);
                contextCreateConfigurationContext = context.createConfigurationContext(configuration);
            } else {
                configuration.setLocale(locale);
                contextCreateConfigurationContext = context.createConfigurationContext(configuration);
            }
            contextCreateConfigurationContext.getClass();
            return new ContextWrapper(contextCreateConfigurationContext);
        }
    }

    public MyContextWrapper(Context context) {
        super(context);
    }
}
