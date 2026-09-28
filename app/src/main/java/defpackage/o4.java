package defpackage;

import android.os.Bundle;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.crashlytics.AnalyticsDeferredProxy;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.analytics.BlockingAnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.analytics.BreadcrumbAnalyticsEventReceiver;
import com.google.firebase.crashlytics.internal.analytics.CrashlyticsOriginAnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource;
import com.google.firebase.crashlytics.internal.breadcrumbs.DisabledBreadcrumbSource;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o4 implements Deferred.DeferredHandler, BreadcrumbSource, AnalyticsEventLogger {
    public final /* synthetic */ AnalyticsDeferredProxy a;

    public /* synthetic */ o4(AnalyticsDeferredProxy analyticsDeferredProxy) {
        this.a = analyticsDeferredProxy;
    }

    @Override // com.google.firebase.inject.Deferred.DeferredHandler
    public void handle(Provider provider) {
        AnalyticsDeferredProxy analyticsDeferredProxy = this.a;
        Logger logger = Logger.b;
        logger.a(3);
        AnalyticsConnector analyticsConnector = (AnalyticsConnector) provider.get();
        CrashlyticsOriginAnalyticsEventLogger crashlyticsOriginAnalyticsEventLogger = new CrashlyticsOriginAnalyticsEventLogger(analyticsConnector);
        cs csVar = new cs();
        AnalyticsConnector.AnalyticsConnectorHandle analyticsConnectorHandleRegisterAnalyticsConnectorListener = analyticsConnector.registerAnalyticsConnectorListener("clx", csVar);
        if (analyticsConnectorHandleRegisterAnalyticsConnectorListener == null) {
            logger.a(3);
            analyticsConnectorHandleRegisterAnalyticsConnectorListener = analyticsConnector.registerAnalyticsConnectorListener("crash", csVar);
            if (analyticsConnectorHandleRegisterAnalyticsConnectorListener != null) {
                logger.a(5);
            }
        }
        if (analyticsConnectorHandleRegisterAnalyticsConnectorListener == null) {
            logger.a(5);
            return;
        }
        logger.a(3);
        BreadcrumbAnalyticsEventReceiver breadcrumbAnalyticsEventReceiver = new BreadcrumbAnalyticsEventReceiver();
        BlockingAnalyticsEventLogger blockingAnalyticsEventLogger = new BlockingAnalyticsEventLogger(crashlyticsOriginAnalyticsEventLogger, 500, TimeUnit.MILLISECONDS);
        synchronized (analyticsDeferredProxy) {
            try {
                Iterator it = analyticsDeferredProxy.d.iterator();
                while (it.hasNext()) {
                    breadcrumbAnalyticsEventReceiver.registerBreadcrumbHandler((BreadcrumbHandler) it.next());
                }
                csVar.b = breadcrumbAnalyticsEventReceiver;
                csVar.a = blockingAnalyticsEventLogger;
                analyticsDeferredProxy.c = breadcrumbAnalyticsEventReceiver;
                analyticsDeferredProxy.b = blockingAnalyticsEventLogger;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger
    public void logEvent(String str, Bundle bundle) {
        this.a.b.logEvent(str, bundle);
    }

    @Override // com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource
    public void registerBreadcrumbHandler(BreadcrumbHandler breadcrumbHandler) {
        AnalyticsDeferredProxy analyticsDeferredProxy = this.a;
        synchronized (analyticsDeferredProxy) {
            try {
                if (analyticsDeferredProxy.c instanceof DisabledBreadcrumbSource) {
                    analyticsDeferredProxy.d.add(breadcrumbHandler);
                }
                analyticsDeferredProxy.c.registerBreadcrumbHandler(breadcrumbHandler);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
