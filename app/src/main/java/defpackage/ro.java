package defpackage;

import io.ktor.http.HeadersBuilder;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.CombinedContext;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$IntRef;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ro implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ro(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                return CombinedContext.writeReplace$lambda$3((CoroutineContext[]) obj4, (Ref$IntRef) obj3, (mk1) obj, (CoroutineContext.Element) obj2);
            default:
                HeadersBuilder headersBuilder = (HeadersBuilder) obj4;
                Function2 function2 = (Function2) obj3;
                String str = (String) obj;
                List list = (List) obj2;
                str.getClass();
                list.getClass();
                ArrayList arrayList = new ArrayList(list.size());
                for (Object obj5 : list) {
                    if (((Boolean) function2.invoke(str, (String) obj5)).booleanValue()) {
                        arrayList.add(obj5);
                    }
                }
                if (!arrayList.isEmpty()) {
                    headersBuilder.appendAll(str, arrayList);
                }
                return mk1.a;
        }
    }
}
