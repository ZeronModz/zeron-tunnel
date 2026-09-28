package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class cc1 {
    public static final List a(Cursor cursor) {
        List<Uri> notificationUris = cursor.getNotificationUris();
        notificationUris.getClass();
        return notificationUris;
    }

    public static final void b(Cursor cursor, ContentResolver contentResolver, List list) {
        cursor.setNotificationUris(contentResolver, list);
    }
}
