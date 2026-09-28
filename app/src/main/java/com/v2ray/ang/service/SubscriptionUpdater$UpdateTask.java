package com.v2ray.ang.service;

import android.app.Notification;
import android.app.NotificationChannel;
import android.content.Context;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import androidx.work.CoroutineWorker;
import androidx.work.ListenableWorker$Result$Success;
import androidx.work.WorkerParameters;
import dev.zeron.tunnel.R;
import com.v2ray.ang.dto.SubscriptionItem;
import defpackage.ay2;
import defpackage.bu0;
import defpackage.i5;
import defpackage.n5;
import defpackage.zq0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"com/v2ray/ang/service/SubscriptionUpdater$UpdateTask", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SubscriptionUpdater$UpdateTask extends CoroutineWorker {
    public final bu0 c;
    public final NotificationCompat.Builder d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriptionUpdater$UpdateTask(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.c = new bu0(getApplicationContext());
        NotificationCompat.Builder builder = new NotificationCompat.Builder(getApplicationContext(), "subscription_update_channel");
        Notification notification = builder.M;
        notification.when = 0L;
        notification.tickerText = NotificationCompat.Builder.c("Update");
        builder.e = NotificationCompat.Builder.c(context.getString(R.string.title_pref_auto_update_subscription));
        notification.icon = R.drawable.ic_stat_name;
        builder.A = "service";
        builder.l = 0;
        this.d = builder;
    }

    @Override // androidx.work.CoroutineWorker
    public final Object a(Continuation continuation) {
        Lazy lazy = zq0.a;
        ArrayList arrayListI = zq0.i();
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListI) {
            if (((SubscriptionItem) ((Pair) obj).getSecond()).getAutoUpdate()) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            bu0 bu0Var = this.c;
            if (!zHasNext) {
                bu0Var.b.cancel(null, 3);
                return new ListenableWorker$Result$Success();
            }
            Pair pair = (Pair) it.next();
            SubscriptionItem subscriptionItem = (SubscriptionItem) pair.getSecond();
            int i = Build.VERSION.SDK_INT;
            NotificationCompat.Builder builder = this.d;
            if (i >= 26) {
                builder.F = "subscription_update_channel";
                n5.f();
                NotificationChannel notificationChannelB = n5.b();
                if (i >= 26) {
                    i5.c(bu0Var.b, notificationChannelB);
                } else {
                    bu0Var.getClass();
                }
            }
            bu0Var.b(3, builder.a());
            subscriptionItem.getRemarks();
            ay2.x(new Pair(pair.getFirst(), subscriptionItem));
            builder.f = NotificationCompat.Builder.c("Updating " + subscriptionItem.getRemarks());
        }
    }
}
