package defpackage;

import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.internal.ArrayClassDesc;
import kotlinx.serialization.internal.ArrayListClassDesc;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PrimitiveArrayDescriptor;
import kotlinx.serialization.internal.ReferenceArraySerializer;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class t41 {
    public static final ArrayListClassDesc a = new ArrayListSerializer(tg0.a).b;
    public static final ArrayListClassDesc b;
    public static final PrimitiveArrayDescriptor c;
    public static final PrimitiveArrayDescriptor d;
    public static final PrimitiveArrayDescriptor e;
    public static final PrimitiveArrayDescriptor f;
    public static final PrimitiveArrayDescriptor g;
    public static final PrimitiveArrayDescriptor h;
    public static final ArrayClassDesc i;

    static {
        bb1 bb1Var = bb1.a;
        b = new ArrayListSerializer(bb1Var).b;
        c = ze.c.b;
        d = nm.c.b;
        e = sy.c.b;
        f = e70.c.b;
        g = rg0.c.b;
        h = pm0.c.b;
        i = new ReferenceArraySerializer(Reflection.a(String.class), bb1Var).c;
    }
}
