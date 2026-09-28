package defpackage;

import androidx.camera.core.impl.QuirkSettingsHolder;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.m;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class mx {
    public static volatile Quirks a;

    static {
        QuirkSettingsHolder quirkSettingsHolder = QuirkSettingsHolder.c;
        quirkSettingsHolder.a.addObserver(fy.b(), new m(new lx(0)));
    }
}
