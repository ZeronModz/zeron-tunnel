package defpackage;

import androidx.datastore.preferences.protobuf.MessageLite;
import androidx.datastore.preferences.protobuf.x2;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class b50 {
    public static volatile b50 b;
    public static final b50 c = new b50();
    public final Map a = Collections.EMPTY_MAP;

    public static b50 b() {
        b50 b50Var;
        x2 x2Var = x2.c;
        b50 b50Var2 = b;
        if (b50Var2 != null) {
            return b50Var2;
        }
        synchronized (b50.class) {
            try {
                b50Var = b;
                if (b50Var == null) {
                    Class cls = z40.a;
                    b50 b50Var3 = null;
                    if (cls != null) {
                        try {
                            b50Var3 = (b50) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    b50Var = b50Var3 != null ? b50Var3 : c;
                    b = b50Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return b50Var;
    }

    public final void a(int i, MessageLite messageLite) {
        if (Collections.EMPTY_MAP.get(new a50(i, messageLite)) == null) {
            return;
        }
        u7.q();
    }
}
