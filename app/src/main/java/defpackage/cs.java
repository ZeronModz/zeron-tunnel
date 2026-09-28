package defpackage;

import android.os.Bundle;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventReceiver;
import com.google.firebase.crashlytics.internal.analytics.BlockingAnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.analytics.BreadcrumbAnalyticsEventReceiver;
import java.util.Objects;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class cs implements AnalyticsConnector.AnalyticsConnectorListener {
    public BlockingAnalyticsEventLogger a;
    public BreadcrumbAnalyticsEventReceiver b;

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorListener
    public final void onMessageTriggered(int i, Bundle bundle) {
        String string;
        Logger logger = Logger.b;
        Locale locale = Locale.US;
        Objects.toString(bundle);
        logger.a(2);
        if (bundle == null || (string = bundle.getString("name")) == null) {
            return;
        }
        Bundle bundle2 = bundle.getBundle("params");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        AnalyticsEventReceiver analyticsEventReceiver = "clx".equals(bundle2.getString("_o")) ? this.a : this.b;
        if (analyticsEventReceiver == null) {
            return;
        }
        analyticsEventReceiver.onEvent(string, bundle2);
    }
}
