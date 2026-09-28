package com.github.mikephil.charting.utils;

import defpackage.ou0;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class FSize extends ObjectPool$Poolable {
    public static final ou0 d;
    public float b;
    public float c;

    static {
        ou0 ou0VarA = ou0.a(256, new FSize(0.0f, 0.0f));
        d = ou0VarA;
        ou0VarA.f = 0.5f;
    }

    public FSize(float f, float f2) {
        this.b = f;
        this.c = f2;
    }

    @Override // com.github.mikephil.charting.utils.ObjectPool$Poolable
    public final ObjectPool$Poolable a() {
        return new FSize(0.0f, 0.0f);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof FSize) {
            FSize fSize = (FSize) obj;
            if (this.b == fSize.b && this.c == fSize.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.c) ^ Float.floatToIntBits(this.b);
    }

    public final String toString() {
        return this.b + "x" + this.c;
    }

    public FSize() {
    }
}
