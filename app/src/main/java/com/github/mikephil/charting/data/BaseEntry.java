package com.github.mikephil.charting.data;

import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class BaseEntry {
    public float a;
    public Object b;
    public final Drawable c;

    public BaseEntry() {
        this.a = 0.0f;
        this.b = null;
        this.c = null;
    }

    public float a() {
        return this.a;
    }

    public BaseEntry(float f) {
        this.b = null;
        this.c = null;
        this.a = f;
    }

    public BaseEntry(float f, Object obj) {
        this(f);
        this.b = obj;
    }

    public BaseEntry(float f, Drawable drawable) {
        this(f);
        this.c = drawable;
    }

    public BaseEntry(float f, Drawable drawable, Object obj) {
        this(f);
        this.c = drawable;
        this.b = obj;
    }
}
