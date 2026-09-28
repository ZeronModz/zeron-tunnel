package defpackage;

import androidx.collection.LruCache;
import com.google.android.gms.internal.measurement.zzc;
import com.google.android.gms.measurement.internal.e;
import com.google.android.gms.measurement.internal.g0;
import com.google.android.gms.measurement.internal.m;
import com.google.android.gms.measurement.internal.o;
import com.google.android.gms.measurement.internal.r;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class f83 extends LruCache {
    public final /* synthetic */ o g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f83(o oVar) {
        super(20);
        this.g = oVar;
    }

    @Override // androidx.collection.LruCache
    public final Object a(Object obj) throws Throwable {
        String str = (String) obj;
        yg0.j(str);
        o oVar = this.g;
        oVar.b();
        yg0.j(str);
        e eVar = oVar.b.c;
        g0.P(eVar);
        tj1 tj1VarG0 = eVar.g0(str);
        if (tj1VarG0 == null) {
            return null;
        }
        m mVar = oVar.a.f;
        r.h(mVar);
        mVar.n.b(str, "Populate EES config from database on cache miss. appId");
        oVar.i(str, oVar.j(str, (byte[]) tj1VarG0.b));
        f83 f83Var = oVar.j;
        f83Var.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (f83Var.c) {
            Set<Map.Entry> setEntrySet = f83Var.b.a.entrySet();
            setEntrySet.getClass();
            for (Map.Entry entry : setEntrySet) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return (zzc) linkedHashMap.get(str);
    }
}
