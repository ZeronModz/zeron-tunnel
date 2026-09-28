package defpackage;

import androidx.datastore.preferences.core.Preferences;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class wh0 {
    public static final Object a(Preferences preferences, Preferences.Key key, Serializable serializable) {
        preferences.getClass();
        key.getClass();
        Object objC = preferences.c(key);
        return objC == null ? serializable : objC;
    }
}
