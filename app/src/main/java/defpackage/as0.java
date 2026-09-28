package defpackage;

import com.google.common.collect.MutableClassToInstanceMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class as0 extends a90 {
    public final /* synthetic */ int a;
    public final Map.Entry b;

    public as0(Map.Entry entry) {
        this.a = 1;
        entry.getClass();
        this.b = entry;
    }

    @Override // defpackage.a90
    public final Map.Entry a() {
        switch (this.a) {
        }
        return this.b;
    }

    @Override // defpackage.e90
    public final Object delegate() {
        switch (this.a) {
        }
        return this.b;
    }

    @Override // defpackage.a90, java.util.Map.Entry
    public boolean equals(Object obj) {
        switch (this.a) {
            case 2:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (cn0.y(getKey(), entry.getKey()) && cn0.y(getValue(), entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return super.equals(obj);
        }
    }

    @Override // defpackage.a90, java.util.Map.Entry
    public final Object setValue(Object obj) {
        switch (this.a) {
            case 0:
                MutableClassToInstanceMap.cast((Class) getKey(), obj);
                return super.setValue(obj);
            case 1:
                throw new UnsupportedOperationException();
            default:
                obj.getClass();
                return super.setValue(obj);
        }
    }

    public /* synthetic */ as0(Map.Entry entry, int i) {
        this.a = i;
        this.b = entry;
    }
}
