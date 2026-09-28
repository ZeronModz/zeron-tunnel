package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Range;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.workaround.TemplateParamsOverride;
import androidx.camera.camera2.interop.CaptureRequestOptions;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.impl.l;
import java.util.DesugarCollections;
import java.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class yi {
    public static void a(CaptureRequest.Builder builder, l lVar) {
        CaptureRequestOptions captureRequestOptionsBuild = CaptureRequestOptions.Builder.b(lVar).build();
        for (jq jqVar : captureRequestOptionsBuild.getConfig().listOptions()) {
            CaptureRequest.Key key = (CaptureRequest.Key) ((xa) jqVar).c;
            try {
                builder.set(key, captureRequestOptionsBuild.getConfig().retrieveOption(jqVar));
            } catch (IllegalArgumentException unused) {
                Objects.toString(key);
                km0.b("Camera2CaptureRequestBuilder");
            }
        }
    }

    public static void b(CaptureRequest.Builder builder, int i, TemplateParamsOverride templateParamsOverride) {
        Map mapUnmodifiableMap;
        if (i == 3 && templateParamsOverride.a) {
            HashMap map = new HashMap();
            map.put(CaptureRequest.CONTROL_CAPTURE_INTENT, 1);
            mapUnmodifiableMap = DesugarCollections.unmodifiableMap(map);
        } else {
            if (i != 4) {
                templateParamsOverride.getClass();
            } else if (templateParamsOverride.b) {
                HashMap map2 = new HashMap();
                map2.put(CaptureRequest.CONTROL_CAPTURE_INTENT, 2);
                mapUnmodifiableMap = DesugarCollections.unmodifiableMap(map2);
            }
            mapUnmodifiableMap = Collections.EMPTY_MAP;
        }
        for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
            builder.set((CaptureRequest.Key) entry.getKey(), entry.getValue());
        }
    }

    public static CaptureRequest c(el elVar, CameraDevice cameraDevice, HashMap map, boolean z, TemplateParamsOverride templateParamsOverride) throws CameraAccessException {
        CaptureRequest.Builder builderCreateCaptureRequest;
        l lVar = elVar.b;
        if (cameraDevice != null) {
            ArrayList arrayList = elVar.a;
            int i = elVar.c;
            TreeMap treeMap = lVar.a;
            List listUnmodifiableList = DesugarCollections.unmodifiableList(arrayList);
            ArrayList arrayList2 = new ArrayList();
            Iterator it = listUnmodifiableList.iterator();
            while (it.hasNext()) {
                Surface surface = (Surface) map.get((DeferrableSurface) it.next());
                if (surface == null) {
                    u7.r("DeferrableSurface not in configuredSurfaceMap");
                    return null;
                }
                arrayList2.add(surface);
            }
            if (!arrayList2.isEmpty()) {
                CameraCaptureResult cameraCaptureResult = elVar.h;
                if (i == 5 && cameraCaptureResult != null && (cameraCaptureResult.getCaptureResult() instanceof TotalCaptureResult)) {
                    km0.a("Camera2CaptureRequestBuilder");
                    builderCreateCaptureRequest = cameraDevice.createReprocessCaptureRequest((TotalCaptureResult) cameraCaptureResult.getCaptureResult());
                } else {
                    km0.a("Camera2CaptureRequestBuilder");
                    if (i == 5) {
                        builderCreateCaptureRequest = cameraDevice.createCaptureRequest(z ? 1 : 2);
                    } else {
                        builderCreateCaptureRequest = cameraDevice.createCaptureRequest(i);
                    }
                }
                b(builderCreateCaptureRequest, i, templateParamsOverride);
                xa xaVar = el.k;
                Object objRetrieveOption = StreamSpec.a;
                try {
                    objRetrieveOption = lVar.retrieveOption(xaVar);
                } catch (IllegalArgumentException unused) {
                }
                Range range = (Range) objRetrieveOption;
                Objects.requireNonNull(range);
                Object objRetrieveOption2 = StreamSpec.a;
                if (!range.equals(objRetrieveOption2)) {
                    CaptureRequest.Key key = CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE;
                    try {
                        objRetrieveOption2 = lVar.retrieveOption(el.k);
                    } catch (IllegalArgumentException unused2) {
                    }
                    Range range2 = (Range) objRetrieveOption2;
                    Objects.requireNonNull(range2);
                    builderCreateCaptureRequest.set(key, range2);
                }
                if (elVar.b() == 1 || elVar.c() == 1) {
                    builderCreateCaptureRequest.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 0);
                } else if (elVar.b() == 2) {
                    builderCreateCaptureRequest.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 2);
                } else if (elVar.c() == 2) {
                    builderCreateCaptureRequest.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 1);
                }
                xa xaVar2 = el.i;
                if (treeMap.containsKey(xaVar2)) {
                    builderCreateCaptureRequest.set(CaptureRequest.JPEG_ORIENTATION, (Integer) lVar.retrieveOption(xaVar2));
                }
                xa xaVar3 = el.j;
                if (treeMap.containsKey(xaVar3)) {
                    builderCreateCaptureRequest.set(CaptureRequest.JPEG_QUALITY, Byte.valueOf(((Integer) lVar.retrieveOption(xaVar3)).byteValue()));
                }
                a(builderCreateCaptureRequest, lVar);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    builderCreateCaptureRequest.addTarget((Surface) it2.next());
                }
                builderCreateCaptureRequest.setTag(elVar.g);
                return builderCreateCaptureRequest.build();
            }
        }
        return null;
    }

    public static CaptureRequest d(el elVar, CameraDevice cameraDevice, TemplateParamsOverride templateParamsOverride) throws CameraAccessException {
        if (cameraDevice == null) {
            return null;
        }
        int i = elVar.c;
        km0.a("Camera2CaptureRequestBuilder");
        CaptureRequest.Builder builderCreateCaptureRequest = cameraDevice.createCaptureRequest(i);
        b(builderCreateCaptureRequest, i, templateParamsOverride);
        a(builderCreateCaptureRequest, elVar.b);
        return builderCreateCaptureRequest.build();
    }
}
