package defpackage;

import androidx.work.impl.model.WorkSpecDao_Impl;
import java.util.HashMap;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nr1 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ WorkSpecDao_Impl b;

    public /* synthetic */ nr1(WorkSpecDao_Impl workSpecDao_Impl, int i) {
        this.a = i;
        this.b = workSpecDao_Impl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        mk1 mk1Var = mk1.a;
        WorkSpecDao_Impl workSpecDao_Impl = this.b;
        HashMap map = (HashMap) obj;
        switch (i) {
            case 0:
                workSpecDao_Impl.b(map);
                break;
            default:
                workSpecDao_Impl.a(map);
                break;
        }
        return mk1Var;
    }
}
