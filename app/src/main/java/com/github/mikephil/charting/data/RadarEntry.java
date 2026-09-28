package com.github.mikephil.charting.data;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class RadarEntry extends Entry {
    public RadarEntry(float f) {
        super(0.0f, f);
    }

    @Override // com.github.mikephil.charting.data.Entry
    public final float b() {
        return this.d;
    }

    public RadarEntry(float f, Object obj) {
        super(0.0f, f, obj);
    }
}
