package defpackage;

import androidx.datastore.preferences.protobuf.r1;
import androidx.datastore.preferences.protobuf.x2;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d50 {
    public static final r1 a = new r1();
    public static final c50 b;

    static {
        x2 x2Var = x2.c;
        c50 c50Var = null;
        try {
            c50Var = (c50) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = c50Var;
    }
}
