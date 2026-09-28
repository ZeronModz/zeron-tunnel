package defpackage;

import java.util.Iterator;
import kotlin.text.Regex;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class o61 {
    public static final Regex a = new Regex("\r\n|\r|\n");

    public static final void a(Object obj, String str, StringBuilder sb) {
        if (obj != null) {
            Iterator<T> it = a.split(obj.toString(), 0).iterator();
            while (it.hasNext()) {
                sb.append(str + ": " + ((String) it.next()) + "\r\n");
            }
        }
    }
}
