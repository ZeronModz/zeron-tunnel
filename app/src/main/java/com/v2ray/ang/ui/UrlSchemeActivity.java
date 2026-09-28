package com.v2ray.ang.ui;

import android.net.Uri;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.m;
import defpackage.hv;
import defpackage.l8;
import defpackage.lv;
import defpackage.oy;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/v2ray/ang/ui/UrlSchemeActivity;", "Lcom/v2ray/ang/ui/BaseActivity;", "<init>", "()V", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class UrlSchemeActivity extends BaseActivity {
    public static final /* synthetic */ int d = 0;
    public final Lazy c = kotlin.c.b(new l8(this, 24));

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v7, types: [T, java.lang.String] */
    public final void h(String str, String str2) throws UnsupportedEncodingException {
        if (str.length() == 0) {
            return;
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ?? Decode = URLDecoder.decode(str, "UTF-8");
        ref$ObjectRef.element = Decode;
        Uri uri = Uri.parse(Decode);
        if (uri != null) {
            String fragment = uri.getFragment();
            if ((fragment == null || fragment.length() == 0) && str2 != null && str2.length() != 0) {
                ref$ObjectRef.element = ref$ObjectRef.element + "#" + str2;
            }
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImplA = m.a(this);
            lv lvVar = oy.a;
            kotlinx.coroutines.c.d(lifecycleCoroutineScopeImplA, hv.c, null, new UrlSchemeActivity$parseUri$1(ref$ObjectRef, this, null), 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00b9 A[Catch: Exception -> 0x00cc, TryCatch #0 {Exception -> 0x00cc, blocks: (B:3:0x0010, B:5:0x0021, B:7:0x002d, B:9:0x0039, B:50:0x00bf, B:10:0x003e, B:12:0x004a, B:14:0x0050, B:17:0x0058, B:23:0x006b, B:26:0x0074, B:28:0x007e, B:34:0x008a, B:35:0x008e, B:36:0x0092, B:39:0x009b, B:41:0x00a5, B:47:0x00b1, B:48:0x00b5, B:49:0x00b9), top: B:53:0x0010 }] */
    @Override // com.v2ray.ang.ui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r6) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.v2ray.ang.ui.UrlSchemeActivity.onCreate(android.os.Bundle):void");
    }
}
