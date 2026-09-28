package defpackage;

import com.google.firebase.platforminfo.UserAgentPublisher;
import java.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class xv implements UserAgentPublisher {
    public final String a;
    public final rb0 b;

    public xv(Set set, rb0 rb0Var) {
        this.a = a(set);
        this.b = rb0Var;
    }

    public static String a(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            rb rbVar = (rb) it.next();
            sb.append(rbVar.a);
            sb.append('/');
            sb.append(rbVar.b);
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    @Override // com.google.firebase.platforminfo.UserAgentPublisher
    public final String getUserAgent() {
        Set setUnmodifiableSet;
        rb0 rb0Var = this.b;
        synchronized (((HashSet) rb0Var.b)) {
            setUnmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) rb0Var.b);
        }
        boolean zIsEmpty = setUnmodifiableSet.isEmpty();
        String str = this.a;
        if (zIsEmpty) {
            return str;
        }
        return str + ' ' + a(rb0Var.a());
    }
}
