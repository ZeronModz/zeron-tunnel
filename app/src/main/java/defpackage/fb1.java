package defpackage;

import io.ktor.util.StringValuesBuilderImpl;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fb1 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ StringValuesBuilderImpl b;

    public /* synthetic */ fb1(StringValuesBuilderImpl stringValuesBuilderImpl, int i) {
        this.a = i;
        this.b = stringValuesBuilderImpl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        mk1 mk1Var = mk1.a;
        StringValuesBuilderImpl stringValuesBuilderImpl = this.b;
        String str = (String) obj;
        List list = (List) obj2;
        switch (i) {
            case 0:
                str.getClass();
                list.getClass();
                stringValuesBuilderImpl.appendMissing(str, list);
                break;
            default:
                str.getClass();
                list.getClass();
                stringValuesBuilderImpl.appendAll(str, list);
                break;
        }
        return mk1Var;
    }
}
