package defpackage;

import android.text.TextUtils;
import com.google.firebase.installations.local.PersistedInstallationEntry;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class tl1 {
    public static final Pattern a = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static tl1 b;

    public tl1(ed1 ed1Var) {
    }

    public final boolean a(PersistedInstallationEntry persistedInstallationEntry) {
        if (TextUtils.isEmpty(persistedInstallationEntry.a())) {
            return true;
        }
        return persistedInstallationEntry.b() + persistedInstallationEntry.g() < (System.currentTimeMillis() / 1000) + 3600;
    }
}
