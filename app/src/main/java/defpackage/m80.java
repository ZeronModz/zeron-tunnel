package defpackage;

import androidx.collection.SimpleArrayMap;
import androidx.core.util.Consumer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class m80 implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m80(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.core.util.Consumer
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                n80 n80Var = (n80) obj;
                if (n80Var == null) {
                    n80Var = new n80(-3);
                }
                ((y6) this.b).t(n80Var);
                return;
            default:
                n80 n80Var2 = (n80) obj;
                synchronized (o80.c) {
                    try {
                        SimpleArrayMap simpleArrayMap = o80.d;
                        ArrayList arrayList = (ArrayList) simpleArrayMap.get((String) this.b);
                        if (arrayList == null) {
                            return;
                        }
                        simpleArrayMap.remove((String) this.b);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((Consumer) arrayList.get(i)).accept(n80Var2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
