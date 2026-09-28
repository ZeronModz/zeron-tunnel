package com.journeyapps.barcodescanner.camera;

import android.hardware.Camera;
import java.util.Objects;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static final /* synthetic */ int a = 0;

    static {
        Pattern.compile(";");
    }

    public static String a(String[] strArr, List list) {
        Arrays.toString(strArr);
        Objects.toString(list);
        if (list == null) {
            return null;
        }
        for (String str : strArr) {
            if (list.contains(str)) {
                return str;
            }
        }
        return null;
    }

    public static void b(Camera.Parameters parameters, boolean z) {
        List<String> supportedFlashModes = parameters.getSupportedFlashModes();
        String strA = z ? a(new String[]{"torch", "on"}, supportedFlashModes) : a(new String[]{"off"}, supportedFlashModes);
        if (strA == null || strA.equals(parameters.getFlashMode())) {
            return;
        }
        parameters.setFlashMode(strA);
    }
}
