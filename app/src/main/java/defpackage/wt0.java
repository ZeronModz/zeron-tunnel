package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import androidx.core.app.NotificationCompat$BubbleMetadata$Builder;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class wt0 {
    public static yt0 a(Notification.BubbleMetadata bubbleMetadata) {
        if (bubbleMetadata == null || bubbleMetadata.getIntent() == null) {
            return null;
        }
        PendingIntent intent = bubbleMetadata.getIntent();
        Icon icon = bubbleMetadata.getIcon();
        PorterDuff.Mode mode = IconCompat.k;
        NotificationCompat$BubbleMetadata$Builder notificationCompat$BubbleMetadata$Builder = new NotificationCompat$BubbleMetadata$Builder(intent, kf2.e(icon));
        notificationCompat$BubbleMetadata$Builder.b(1, bubbleMetadata.getAutoExpandBubble());
        notificationCompat$BubbleMetadata$Builder.f = bubbleMetadata.getDeleteIntent();
        notificationCompat$BubbleMetadata$Builder.b(2, bubbleMetadata.isNotificationSuppressed());
        if (bubbleMetadata.getDesiredHeight() != 0) {
            notificationCompat$BubbleMetadata$Builder.c = Math.max(bubbleMetadata.getDesiredHeight(), 0);
            notificationCompat$BubbleMetadata$Builder.d = 0;
        }
        if (bubbleMetadata.getDesiredHeightResId() != 0) {
            notificationCompat$BubbleMetadata$Builder.d = bubbleMetadata.getDesiredHeightResId();
            notificationCompat$BubbleMetadata$Builder.c = 0;
        }
        return notificationCompat$BubbleMetadata$Builder.a();
    }

    public static Notification.BubbleMetadata b(yt0 yt0Var) {
        PendingIntent pendingIntent;
        if (yt0Var == null || (pendingIntent = yt0Var.a) == null) {
            return null;
        }
        Notification.BubbleMetadata.Builder builder = new Notification.BubbleMetadata.Builder();
        IconCompat iconCompat = yt0Var.c;
        iconCompat.getClass();
        Notification.BubbleMetadata.Builder suppressNotification = builder.setIcon(kf2.z(iconCompat, null)).setIntent(pendingIntent).setDeleteIntent(yt0Var.b).setAutoExpandBubble((yt0Var.f & 1) != 0).setSuppressNotification((yt0Var.f & 2) != 0);
        int i = yt0Var.d;
        if (i != 0) {
            suppressNotification.setDesiredHeight(i);
        }
        int i2 = yt0Var.e;
        if (i2 != 0) {
            suppressNotification.setDesiredHeightResId(i2);
        }
        return suppressNotification.build();
    }
}
