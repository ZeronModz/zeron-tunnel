package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.imagecapture.b;
import androidx.camera.core.impl.CaptureBundle;
import androidx.camera.core.impl.CaptureStage;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class gz0 {
    public final int a;
    public final Rect b;
    public final int c;
    public final int d;
    public final Matrix e;
    public final b f;
    public final String g;
    public final ListenableFuture i;
    public int j = -1;
    public final ArrayList h = new ArrayList();

    public gz0(CaptureBundle captureBundle, Rect rect, int i, int i2, Matrix matrix, b bVar, ListenableFuture listenableFuture, int i3) {
        this.a = i3;
        this.d = i2;
        this.c = i;
        this.b = rect;
        this.e = matrix;
        this.f = bVar;
        this.g = String.valueOf(captureBundle.hashCode());
        List<CaptureStage> captureStages = captureBundle.getCaptureStages();
        Objects.requireNonNull(captureStages);
        Iterator<CaptureStage> it = captureStages.iterator();
        while (it.hasNext()) {
            this.h.add(Integer.valueOf(it.next().getId()));
        }
        this.i = listenableFuture;
    }
}
