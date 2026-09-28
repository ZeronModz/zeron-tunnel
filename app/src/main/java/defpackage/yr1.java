package defpackage;

import java.io.IOException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;
import okio.RealBufferedSource;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yr1 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Ref$ObjectRef b;
    public final /* synthetic */ RealBufferedSource c;
    public final /* synthetic */ Ref$ObjectRef d;
    public final /* synthetic */ Ref$ObjectRef e;

    public /* synthetic */ yr1(Ref$ObjectRef ref$ObjectRef, RealBufferedSource realBufferedSource, Ref$ObjectRef ref$ObjectRef2, Ref$ObjectRef ref$ObjectRef3) {
        this.b = ref$ObjectRef;
        this.c = realBufferedSource;
        this.d = ref$ObjectRef2;
        this.e = ref$ObjectRef3;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [T, java.lang.Long] */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r0v5, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r0v9, types: [T, java.lang.Long] */
    /* JADX WARN: Type inference failed for: r1v15, types: [T, java.lang.Long] */
    /* JADX WARN: Type inference failed for: r1v9, types: [T, java.lang.Integer] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws IOException {
        int i = this.a;
        mk1 mk1Var = mk1.a;
        Ref$ObjectRef ref$ObjectRef = this.e;
        Ref$ObjectRef ref$ObjectRef2 = this.d;
        RealBufferedSource realBufferedSource = this.c;
        Ref$ObjectRef ref$ObjectRef3 = this.b;
        switch (i) {
            case 0:
                int iIntValue = ((Integer) obj).intValue();
                long jLongValue = ((Long) obj2).longValue();
                if (iIntValue == 21589) {
                    if (jLongValue >= 1) {
                        byte b = realBufferedSource.readByte();
                        boolean z = (b & 1) == 1;
                        boolean z2 = (b & 2) == 2;
                        boolean z3 = (b & 4) == 4;
                        long j = z ? 5L : 1L;
                        if (z2) {
                            j += 4;
                        }
                        if (z3) {
                            j += 4;
                        }
                        if (jLongValue >= j) {
                            if (z) {
                                ref$ObjectRef3.element = Integer.valueOf(realBufferedSource.readIntLe());
                            }
                            if (z2) {
                                ref$ObjectRef2.element = Integer.valueOf(realBufferedSource.readIntLe());
                            }
                            if (z3) {
                                ref$ObjectRef.element = Integer.valueOf(realBufferedSource.readIntLe());
                            }
                        } else {
                            p60.f("bad zip: extended timestamp extra too short");
                        }
                    } else {
                        p60.f("bad zip: extended timestamp extra too short");
                    }
                }
                break;
            default:
                int iIntValue2 = ((Integer) obj).intValue();
                long jLongValue2 = ((Long) obj2).longValue();
                if (iIntValue2 == 1) {
                    if (ref$ObjectRef3.element != 0) {
                        p60.f("bad zip: NTFS extra attribute tag 0x0001 repeated");
                    } else if (jLongValue2 == 24) {
                        ref$ObjectRef3.element = Long.valueOf(realBufferedSource.readLongLe());
                        ref$ObjectRef2.element = Long.valueOf(realBufferedSource.readLongLe());
                        ref$ObjectRef.element = Long.valueOf(realBufferedSource.readLongLe());
                    } else {
                        p60.f("bad zip: NTFS extra attribute tag 0x0001 size != 24");
                    }
                }
                break;
        }
        return mk1Var;
    }

    public /* synthetic */ yr1(RealBufferedSource realBufferedSource, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, Ref$ObjectRef ref$ObjectRef3) {
        this.c = realBufferedSource;
        this.b = ref$ObjectRef;
        this.d = ref$ObjectRef2;
        this.e = ref$ObjectRef3;
    }
}
