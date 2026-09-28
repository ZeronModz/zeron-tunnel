package defpackage;

import android.util.Range;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.l;
import java.util.DesugarCollections;
import java.util.Objects;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class el {
    public static final xa i = new xa("camerax.core.captureConfig.rotation", Integer.TYPE, null);
    public static final xa j = new xa("camerax.core.captureConfig.jpegQuality", Integer.class, null);
    public static final xa k = new xa("camerax.core.captureConfig.resolvedFrameRate", Range.class, null);
    public final ArrayList a;
    public final l b;
    public final int c;
    public final boolean d;
    public final List e;
    public final boolean f;
    public final rd1 g;
    public final CameraCaptureResult h;

    public el(ArrayList arrayList, l lVar, int i2, boolean z, ArrayList arrayList2, boolean z2, rd1 rd1Var, CameraCaptureResult cameraCaptureResult) {
        this.a = arrayList;
        this.b = lVar;
        this.c = i2;
        this.e = DesugarCollections.unmodifiableList(arrayList2);
        this.f = z2;
        this.g = rd1Var;
        this.h = cameraCaptureResult;
        this.d = z;
    }

    public final int a() {
        Object obj = this.g.a.get("CAPTURE_CONFIG_ID_KEY");
        if (obj == null) {
            return -1;
        }
        return ((Integer) obj).intValue();
    }

    public final int b() {
        Object objRetrieveOption = 0;
        try {
            objRetrieveOption = this.b.retrieveOption(UseCaseConfig.OPTION_PREVIEW_STABILIZATION_MODE);
        } catch (IllegalArgumentException unused) {
        }
        Integer num = (Integer) objRetrieveOption;
        Objects.requireNonNull(num);
        return num.intValue();
    }

    public final int c() {
        Object objRetrieveOption = 0;
        try {
            objRetrieveOption = this.b.retrieveOption(UseCaseConfig.OPTION_VIDEO_STABILIZATION_MODE);
        } catch (IllegalArgumentException unused) {
        }
        Integer num = (Integer) objRetrieveOption;
        Objects.requireNonNull(num);
        return num.intValue();
    }
}
