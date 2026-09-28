package defpackage;

import androidx.work.impl.model.RawWorkInfoDao_Impl;
import java.util.HashMap;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r11 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ RawWorkInfoDao_Impl b;

    public /* synthetic */ r11(RawWorkInfoDao_Impl rawWorkInfoDao_Impl, int i) {
        this.a = i;
        this.b = rawWorkInfoDao_Impl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        mk1 mk1Var = mk1.a;
        RawWorkInfoDao_Impl rawWorkInfoDao_Impl = this.b;
        HashMap map = (HashMap) obj;
        switch (i) {
            case 0:
                rawWorkInfoDao_Impl.b(map);
                break;
            default:
                rawWorkInfoDao_Impl.a(map);
                break;
        }
        return mk1Var;
    }
}
