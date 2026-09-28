package com.v2ray.ang.service;

import android.content.Context;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.hv;
import defpackage.lv;
import defpackage.oy;
import defpackage.zr;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlinx.coroutines.c;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/v2ray/ang/service/ProcessService;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "<init>", "()V", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ProcessService {
    public Process a;

    public final void a(Context context, ArrayList arrayList) {
        context.getClass();
        arrayList.toString();
        try {
            ProcessBuilder processBuilder = new ProcessBuilder(arrayList);
            processBuilder.redirectErrorStream(true);
            this.a = processBuilder.directory(context.getFilesDir()).start();
            lv lvVar = oy.a;
            c.d(zr.a(hv.c), null, null, new ProcessService$runProcess$1(this, null), 3);
            String.valueOf(this.a);
        } catch (Exception e) {
            e.toString();
        }
    }
}
