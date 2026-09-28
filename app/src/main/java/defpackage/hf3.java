package defpackage;

import android.net.Uri;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class hf3 {
    public static final Uri a = Uri.parse("content://com.google.android.gsf.gservices");
    public static final Pattern b;
    public static final Pattern c;

    static {
        Uri.parse("content://com.google.android.gsf.gservices/prefix");
        b = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
        c = Pattern.compile("^(0|false|f|off|no|n)$", 2);
    }
}
