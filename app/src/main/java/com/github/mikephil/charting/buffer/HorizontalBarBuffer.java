package com.github.mikephil.charting.buffer;

import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class HorizontalBarBuffer extends BarBuffer {
    public HorizontalBarBuffer(int i, int i2, boolean z) {
        super(i, i2, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.buffer.BarBuffer
    public final void b(IBarDataSet iBarDataSet) {
        float f;
        float f2;
        float fAbs;
        float fAbs2;
        float f3;
        float f4 = 1.0f;
        float entryCount = iBarDataSet.getEntryCount() * 1.0f;
        float f5 = this.e / 2.0f;
        int i = 0;
        while (i < entryCount) {
            BarEntry barEntry = (BarEntry) iBarDataSet.getEntryForIndex(i);
            if (barEntry == null) {
                f = f4;
            } else {
                float f6 = barEntry.d;
                float f7 = barEntry.a;
                float[] fArr = barEntry.e;
                float f8 = 0.0f;
                if (!this.c || fArr == null) {
                    f = f4;
                    float f9 = f6 - f5;
                    float f10 = f6 + f5;
                    if (this.d) {
                        f2 = f7 >= 0.0f ? f7 : 0.0f;
                        if (f7 > 0.0f) {
                            f7 = 0.0f;
                        }
                    } else {
                        float f11 = f7 >= 0.0f ? f7 : 0.0f;
                        if (f7 > 0.0f) {
                            f7 = 0.0f;
                        }
                        float f12 = f7;
                        f7 = f11;
                        f2 = f12;
                    }
                    if (f7 > 0.0f) {
                        f7 *= f;
                    } else {
                        f2 *= f;
                    }
                    a(f2, f10, f7, f9);
                } else {
                    float f13 = -barEntry.g;
                    int i2 = 0;
                    float f14 = 0.0f;
                    while (i2 < fArr.length) {
                        float f15 = fArr[i2];
                        if (f15 >= f8) {
                            fAbs = f15 + f14;
                            fAbs2 = f13;
                            f13 = f14;
                            f14 = fAbs;
                        } else {
                            fAbs = Math.abs(f15) + f13;
                            fAbs2 = Math.abs(f15) + f13;
                        }
                        float f16 = f6 - f5;
                        float f17 = f4;
                        float f18 = f6 + f5;
                        float f19 = f8;
                        if (this.d) {
                            f3 = f13 >= fAbs ? f13 : fAbs;
                            if (f13 > fAbs) {
                                f13 = fAbs;
                            }
                        } else {
                            float f20 = f13 >= fAbs ? f13 : fAbs;
                            if (f13 > fAbs) {
                                f13 = fAbs;
                            }
                            float f21 = f20;
                            f3 = f13;
                            f13 = f21;
                        }
                        a(f3 * f17, f18, f13 * f17, f16);
                        i2++;
                        f13 = fAbs2;
                        f4 = f17;
                        f8 = f19;
                    }
                    f = f4;
                }
            }
            i++;
            f4 = f;
        }
        this.a = 0;
    }
}
