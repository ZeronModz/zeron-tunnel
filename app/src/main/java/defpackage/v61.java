package defpackage;

import android.hardware.camera2.params.InputConfiguration;
import androidx.camera.core.impl.CaptureConfig$Builder;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.SessionConfig$ErrorListener;
import androidx.camera.core.impl.SessionConfig$OutputConfig;
import java.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class v61 {
    public static final List i = Arrays.asList(1, 5, 3);
    public final ArrayList a;
    public final SessionConfig$OutputConfig b;
    public final List c;
    public final List d;
    public final List e;
    public final SessionConfig$ErrorListener f;
    public final el g;
    public final InputConfiguration h;

    public v61(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, el elVar, SessionConfig$ErrorListener sessionConfig$ErrorListener, InputConfiguration inputConfiguration, SessionConfig$OutputConfig sessionConfig$OutputConfig) {
        this.a = arrayList;
        this.c = DesugarCollections.unmodifiableList(arrayList2);
        this.d = DesugarCollections.unmodifiableList(arrayList3);
        this.e = DesugarCollections.unmodifiableList(arrayList4);
        this.f = sessionConfig$ErrorListener;
        this.g = elVar;
        this.h = inputConfiguration;
        this.b = sessionConfig$OutputConfig;
    }

    public static v61 a() {
        return new v61(new ArrayList(), new ArrayList(0), new ArrayList(0), new ArrayList(0), new CaptureConfig$Builder().d(), null, null, null);
    }

    public final List b() {
        ArrayList arrayList = new ArrayList();
        for (SessionConfig$OutputConfig sessionConfig$OutputConfig : this.a) {
            arrayList.add(sessionConfig$OutputConfig.f());
            Iterator it = sessionConfig$OutputConfig.e().iterator();
            while (it.hasNext()) {
                arrayList.add((DeferrableSurface) it.next());
            }
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }
}
