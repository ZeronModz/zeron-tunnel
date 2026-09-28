package com.github.mikephil.charting.utils;

import defpackage.ou0;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class MPPointF extends ObjectPool$Poolable {
    public static final ou0 d;
    public float b;
    public float c;

    static {
        ou0 ou0VarA = ou0.a(32, new MPPointF(0.0f, 0.0f));
        d = ou0VarA;
        ou0VarA.f = 0.5f;
    }

    public MPPointF(float f, float f2) {
        this.b = f;
        this.c = f2;
    }

    public static MPPointF b(float f, float f2) {
        MPPointF mPPointF = (MPPointF) d.b();
        mPPointF.b = f;
        mPPointF.c = f2;
        return mPPointF;
    }

    public static MPPointF c(MPPointF mPPointF) {
        MPPointF mPPointF2 = (MPPointF) d.b();
        mPPointF2.b = mPPointF.b;
        mPPointF2.c = mPPointF.c;
        return mPPointF2;
    }

    public static void d(MPPointF mPPointF) {
        d.c(mPPointF);
    }

    @Override // com.github.mikephil.charting.utils.ObjectPool$Poolable
    public final ObjectPool$Poolable a() {
        return new MPPointF(0.0f, 0.0f);
    }

    public MPPointF() {
    }
}
