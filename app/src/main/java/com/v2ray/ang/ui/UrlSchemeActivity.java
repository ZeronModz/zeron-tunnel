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

 
 
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/v2ray/ang/ui/UrlSchemeActivity;", "Lcom/v2ray/ang/ui/BaseActivity;", "<init>", "()V", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class UrlSchemeActivity extends BaseActivity {
    public static final   int d = 0;
    public final Lazy c = kotlin.c.b(new l8(this, 24));

     
     
     
    public final void h(String str, String str2) throws UnsupportedEncodingException {
        if (str.length() == 0) {
            return;
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        String Decode = URLDecoder.decode(str, "UTF-8");
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

     
    @Override // com.v2ray.ang.ui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
     
    public final void onCreate(android.os.Bundle r6) {
         
        throw new UnsupportedOperationException("Method not decompiled: com.v2ray.ang.ui.UrlSchemeActivity.onCreate(android.os.Bundle):void");
    }
}
