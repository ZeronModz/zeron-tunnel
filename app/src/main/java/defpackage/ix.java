package defpackage;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ix extends y6 {
    public final boolean f;

    public ix(pf pfVar, boolean z) {
        super(pfVar);
        this.f = z;
    }

    public final qd A() {
        qd[] qdVarArr = (qd[]) this.c;
        sd sdVar = new sd();
        sd sdVar2 = new sd();
        sd sdVar3 = new sd();
        sd sdVar4 = new sd();
        for (qd qdVar : qdVarArr) {
            if (qdVar != null) {
                qdVar.c();
                int i = qdVar.e % 30;
                int i2 = qdVar.f;
                if (!this.f) {
                    i2 += 2;
                }
                int i3 = i2 % 3;
                if (i3 == 0) {
                    sdVar2.b((i * 3) + 1);
                } else if (i3 == 1) {
                    sdVar4.b(i / 3);
                    sdVar3.b(i % 3);
                } else if (i3 == 2) {
                    sdVar.b(i + 1);
                }
            }
        }
        if (sdVar.a().length == 0 || sdVar2.a().length == 0 || sdVar3.a().length == 0 || sdVar4.a().length == 0 || sdVar.a()[0] < 1 || sdVar2.a()[0] + sdVar3.a()[0] < 3 || sdVar2.a()[0] + sdVar3.a()[0] > 90) {
            return null;
        }
        qd qdVar2 = new qd(sdVar.a()[0], sdVar2.a()[0], sdVar3.a()[0], sdVar4.a()[0], 0);
        B(qdVarArr, qdVar2);
        return qdVar2;
    }

    public final void B(qd[] qdVarArr, qd qdVar) {
        for (int i = 0; i < qdVarArr.length; i++) {
            qd qdVar2 = qdVarArr[i];
            if (qdVar2 != null) {
                int i2 = qdVar2.e % 30;
                int i3 = qdVar2.f;
                if (i3 > qdVar.f) {
                    qdVarArr[i] = null;
                } else {
                    if (!this.f) {
                        i3 += 2;
                    }
                    int i4 = i3 % 3;
                    if (i4 != 0) {
                        if (i4 != 1) {
                            if (i4 == 2 && i2 + 1 != qdVar.b) {
                                qdVarArr[i] = null;
                            }
                        } else if (i2 / 3 != qdVar.c || i2 % 3 != qdVar.e) {
                            qdVarArr[i] = null;
                        }
                    } else if ((i2 * 3) + 1 != qdVar.d) {
                        qdVarArr[i] = null;
                    }
                }
            }
        }
    }

    @Override // defpackage.y6
    public final String toString() {
        return "IsLeft: " + this.f + '\n' + super.toString();
    }
}
