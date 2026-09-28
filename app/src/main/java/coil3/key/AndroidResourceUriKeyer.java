package coil3.key;

import android.content.res.Configuration;
import android.graphics.Bitmap;
import coil3.Uri;
import coil3.request.Options;
import coil3.util.f;
import defpackage.yg0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcoil3/key/AndroidResourceUriKeyer;", "Lcoil3/key/Keyer;", "Lcoil3/Uri;", "<init>", "()V", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AndroidResourceUriKeyer implements Keyer<Uri> {
    @Override // coil3.key.Keyer
    public final String key(Uri uri, Options options) {
        Uri uri2 = uri;
        if (!yg0.a(uri2.c, "android.resource")) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(uri2);
        sb.append(':');
        Configuration configuration = options.a.getResources().getConfiguration();
        Bitmap.Config[] configArr = f.a;
        sb.append(configuration.uiMode & 48);
        return sb.toString();
    }
}
