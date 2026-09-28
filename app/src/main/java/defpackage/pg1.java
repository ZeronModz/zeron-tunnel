package defpackage;

import com.google.android.datatransport.Transformer;
import com.google.android.datatransport.Transport;
import com.google.android.datatransport.TransportFactory;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.d;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class pg1 implements TransportFactory {
    public final Set a;
    public final TransportContext b;
    public final d c;

    public pg1(Set set, TransportContext transportContext, d dVar) {
        this.a = set;
        this.b = transportContext;
        this.c = dVar;
    }

    @Override // com.google.android.datatransport.TransportFactory
    public final Transport getTransport(String str, Class cls, n20 n20Var, Transformer transformer) {
        Set set = this.a;
        if (set.contains(n20Var)) {
            return new qg1(this.b, str, n20Var, transformer, this.c);
        }
        zu0.m("%s is not supported byt this factory. Supported encodings are: %s.", new Object[]{n20Var, set});
        return null;
    }

    @Override // com.google.android.datatransport.TransportFactory
    public final Transport getTransport(String str, Class cls, Transformer transformer) {
        return getTransport(str, cls, new n20("proto"), transformer);
    }
}
