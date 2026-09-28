package com.github.mikephil.charting.components;

import com.github.mikephil.charting.utils.Utils;
import defpackage.u7;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class Legend extends ComponentBase {
    public LegendEntry[] f;
    public final LegendHorizontalAlignment g;
    public final LegendVerticalAlignment h;
    public final LegendOrientation i;
    public final LegendDirection j;
    public final LegendForm k;
    public final float l;
    public final float m;
    public final float n;
    public final float o;
    public final float p;
    public final float q;
    public float r;
    public float s;
    public float t;
    public final ArrayList u;
    public final ArrayList v;
    public final ArrayList w;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public enum LegendDirection {
        LEFT_TO_RIGHT,
        RIGHT_TO_LEFT
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public enum LegendForm {
        NONE,
        EMPTY,
        DEFAULT,
        SQUARE,
        CIRCLE,
        LINE
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public enum LegendHorizontalAlignment {
        LEFT,
        CENTER,
        RIGHT
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public enum LegendOrientation {
        HORIZONTAL,
        VERTICAL
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public enum LegendVerticalAlignment {
        TOP,
        CENTER,
        BOTTOM
    }

    public Legend() {
        this.f = new LegendEntry[0];
        this.g = LegendHorizontalAlignment.LEFT;
        this.h = LegendVerticalAlignment.BOTTOM;
        this.i = LegendOrientation.HORIZONTAL;
        this.j = LegendDirection.LEFT_TO_RIGHT;
        this.k = LegendForm.SQUARE;
        this.l = 8.0f;
        this.m = 3.0f;
        this.n = 6.0f;
        this.o = 5.0f;
        this.p = 3.0f;
        this.q = 0.95f;
        this.r = 0.0f;
        this.s = 0.0f;
        this.t = 0.0f;
        this.u = new ArrayList(16);
        this.v = new ArrayList(16);
        this.w = new ArrayList(16);
        this.d = Utils.c(10.0f);
        this.b = Utils.c(5.0f);
        this.c = Utils.c(3.0f);
    }

    public Legend(LegendEntry[] legendEntryArr) {
        this();
        if (legendEntryArr != null) {
            this.f = legendEntryArr;
        } else {
            u7.r("entries array is NULL");
            throw null;
        }
    }
}
