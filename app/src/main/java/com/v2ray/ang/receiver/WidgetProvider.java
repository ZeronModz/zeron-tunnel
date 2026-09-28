package com.v2ray.ang.receiver;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;
import dev.zeron.tunnel.R;
import com.v2ray.ang.service.b;
import kotlin.Metadata;
import libv2ray.CoreController;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/v2ray/ang/receiver/WidgetProvider;", "Landroid/appwidget/AppWidgetProvider;", "<init>", "()V", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WidgetProvider extends AppWidgetProvider {
    public static void a(Context context, AppWidgetManager appWidgetManager, int[] iArr, boolean z) {
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.widget_switch);
        Intent intent = new Intent(context, (Class<?>) WidgetProvider.class);
        intent.setAction("com.v2ray.ang.action.widget.click");
        remoteViews.setOnClickPendingIntent(R.id.layout_switch, PendingIntent.getBroadcast(context, R.id.layout_switch, intent, 201326592));
        if (z) {
            remoteViews.setInt(R.id.image_switch, "setImageResource", R.drawable.ic_stop_24dp);
            remoteViews.setInt(R.id.layout_background, "setBackgroundResource", R.drawable.ic_rounded_corner_active);
        } else {
            remoteViews.setInt(R.id.image_switch, "setImageResource", R.drawable.ic_play_24dp);
            remoteViews.setInt(R.id.layout_background, "setBackgroundResource", R.drawable.ic_rounded_corner_inactive);
        }
        for (int i : iArr) {
            appWidgetManager.updateAppWidget(i, remoteViews);
        }
    }

    @Override // android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        AppWidgetManager appWidgetManager;
        context.getClass();
        intent.getClass();
        super.onReceive(context, intent);
        if ("com.v2ray.ang.action.widget.click".equals(intent.getAction())) {
            CoreController coreController = b.a;
            if (b.a.getIsRunning()) {
                b.g(context);
                return;
            } else {
                b.e(context);
                return;
            }
        }
        if (!"com.v2ray.ang.action.activity".equals(intent.getAction()) || (appWidgetManager = AppWidgetManager.getInstance(context)) == null) {
            return;
        }
        int intExtra = intent.getIntExtra("key", 0);
        if (intExtra != 11) {
            if (intExtra != 12) {
                if (intExtra != 31) {
                    if (intExtra != 32 && intExtra != 41) {
                        return;
                    }
                }
            }
            int[] appWidgetIds = appWidgetManager.getAppWidgetIds(new ComponentName(context, (Class<?>) WidgetProvider.class));
            appWidgetIds.getClass();
            a(context, appWidgetManager, appWidgetIds, false);
            return;
        }
        int[] appWidgetIds2 = appWidgetManager.getAppWidgetIds(new ComponentName(context, (Class<?>) WidgetProvider.class));
        appWidgetIds2.getClass();
        a(context, appWidgetManager, appWidgetIds2, true);
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        context.getClass();
        appWidgetManager.getClass();
        iArr.getClass();
        super.onUpdate(context, appWidgetManager, iArr);
        a(context, appWidgetManager, iArr, b.a.getIsRunning());
    }
}
