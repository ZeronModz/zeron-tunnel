package defpackage;

import android.content.Context;
import kotlin.jvm.JvmStatic;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class y71 {
    @JvmStatic
    public static final boolean a(Context context, String str) {
        context.getClass();
        str.getClass();
        return context.deleteSharedPreferences(str);
    }
}
