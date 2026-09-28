package defpackage;

import android.content.Context;
import com.google.android.datatransport.runtime.backends.BackendFactory;
import com.google.android.datatransport.runtime.backends.BackendRegistry;
import com.google.android.datatransport.runtime.backends.TransportBackend;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class zp0 implements BackendRegistry {
    public final y6 a;
    public final ns b;
    public final HashMap c;

    public zp0(Context context, ns nsVar) {
        y6 y6Var = new y6(22, (Object) context, false);
        this.c = new HashMap();
        this.a = y6Var;
        this.b = nsVar;
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendRegistry
    public final synchronized TransportBackend get(String str) {
        if (this.c.containsKey(str)) {
            return (TransportBackend) this.c.get(str);
        }
        BackendFactory backendFactoryH = this.a.h(str);
        if (backendFactoryH == null) {
            return null;
        }
        ns nsVar = this.b;
        TransportBackend transportBackendCreate = backendFactoryH.create(new za(nsVar.a, nsVar.b, nsVar.c, str));
        this.c.put(str, transportBackendCreate);
        return transportBackendCreate;
    }
}
