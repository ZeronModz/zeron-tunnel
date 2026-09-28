package io.github.g00fy2.quickie.extensions;

import android.graphics.Bitmap;
import defpackage.oy;
import defpackage.zr;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.c;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static final void a(Bitmap bitmap, int[] iArr, Function1 function1, Function1 function12) {
        bitmap.getClass();
        iArr.getClass();
        c.d(zr.a(oy.a), null, null, new BitmapQrReaderKt$readQrCode$1(iArr, bitmap, function1, function12, null), 3);
    }
}
