package com.v2ray.ang.util;

import android.content.Context;
import defpackage.hv;
import defpackage.lv;
import defpackage.oy;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.c;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static Object a(Context context, Continuation continuation) {
        lv lvVar = oy.a;
        return c.e(hv.c, new AppManagerUtil$loadNetworkAppList$2(context, null), continuation);
    }
}
