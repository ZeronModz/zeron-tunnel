package defpackage;

import android.view.ContentInfo;
import android.view.View;
import androidx.core.view.a;
import androidx.core.view.c;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class jn1 {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static c b(View view, c cVar) {
        ContentInfo contentInfoD = cVar.d();
        ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoD);
        if (contentInfoPerformReceiveContent == null) {
            return null;
        }
        return contentInfoPerformReceiveContent == contentInfoD ? cVar : new c(new a(contentInfoPerformReceiveContent));
    }
}
