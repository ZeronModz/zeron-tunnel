package defpackage;

import com.google.common.collect.ArrayTable;
import com.google.common.collect.ImmutableList;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class f8 extends m0 {
    public final /* synthetic */ int c;
    public final Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f8(ImmutableList immutableList, int i) {
        super(immutableList.size(), i);
        this.c = 3;
        this.d = immutableList;
    }

    @Override // defpackage.m0
    public final Object a(int i) {
        int i2 = this.c;
        Object obj = this.d;
        switch (i2) {
            case 0:
                return ((ArrayTable) obj).getValue(i);
            case 1:
                h8 h8Var = (h8) obj;
                cn0.j(i, h8Var.a.size());
                return new g8(h8Var, i);
            case 2:
                return ((Iterable[]) ((u70) obj).c)[i].iterator();
            default:
                return ((ImmutableList) obj).get(i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f8(Object obj, int i, int i2) {
        super(i, 0);
        this.c = i2;
        this.d = obj;
    }
}
