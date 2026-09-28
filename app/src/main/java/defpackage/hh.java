package defpackage;

import androidx.work.impl.Processor;
import androidx.work.impl.WorkDatabase;
import com.google.common.cache.b;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hh implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ hh(Object obj, int i, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                return ((b) obj3).reload(obj2, obj).get();
            default:
                String str = (String) obj;
                int i2 = Processor.l;
                WorkDatabase workDatabase = ((Processor) obj3).e;
                ((ArrayList) obj2).addAll(workDatabase.x().getTagsForWorkSpecId(str));
                return workDatabase.w().getWorkSpec(str);
        }
    }
}
