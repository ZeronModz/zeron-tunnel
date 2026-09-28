package defpackage;

import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.ads.RequestConfiguration;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s03 {
    public static final ClipData a = ClipData.newIntent(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, new Intent());

    public static Intent a(int i, Intent intent) {
        boolean zB = b(0, 17);
        boolean zB2 = b(0, 9);
        boolean zB3 = b(0, 5);
        boolean zB4 = b(0, 3);
        n8.b0("Must set component on Intent.", intent.getComponent() != null);
        if (b(0, 1)) {
            n8.b0("Cannot set mutability flags if PendingIntent.FLAG_IMMUTABLE is set.", !b(i, 67108864));
        } else {
            n8.b0("Must set PendingIntent.FLAG_IMMUTABLE for SDK >= 23 if no parts of intent are mutable.", b(i, 67108864));
        }
        Intent intent2 = new Intent(intent);
        if (!b(i, 67108864)) {
            if (intent2.getPackage() == null) {
                intent2.setPackage(intent2.getComponent().getPackageName());
            }
            if (!zB4 && intent2.getAction() == null) {
                intent2.setAction(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
            }
            if (!zB2 && intent2.getCategories() == null) {
                intent2.addCategory(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
            }
            if (!zB3 && intent2.getData() == null) {
                intent2.setDataAndType(Uri.EMPTY, "*/*");
            }
            if (!zB && intent2.getClipData() == null) {
                intent2.setClipData(a);
            }
        }
        return intent2;
    }

    public static boolean b(int i, int i2) {
        return (i & i2) == i2;
    }
}
