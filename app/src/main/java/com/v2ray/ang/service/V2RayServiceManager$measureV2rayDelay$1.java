package com.v2ray.ang.service;

import android.app.Service;
import dev.zeron.tunnel.R;
import com.google.android.gms.ads.RequestConfiguration;
import com.v2ray.ang.dto.IPAPIInfo;
import defpackage.aj0;
import defpackage.hz;
import defpackage.i60;
import defpackage.l02;
import defpackage.m91;
import defpackage.mk1;
import defpackage.u7;
import defpackage.ul1;
import defpackage.zq0;
import java.lang.ref.SoftReference;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.d;
import kotlin.jvm.functions.Function2;
import kotlin.text.Regex;
import kotlin.text.g;
import kotlinx.coroutines.CoroutineScope;
import libv2ray.CoreController;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lmk1;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 2, 0})
@DebugMetadata(c = "com.v2ray.ang.service.V2RayServiceManager$measureV2rayDelay$1", f = "V2RayServiceManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class V2RayServiceManager$measureV2rayDelay$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super mk1>, Object> {
    int label;

    public V2RayServiceManager$measureV2rayDelay$1(Continuation<? super V2RayServiceManager$measureV2rayDelay$1> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<mk1> create(Object obj, Continuation<?> continuation) {
        return new V2RayServiceManager$measureV2rayDelay$1(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super mk1> continuation) {
        return ((V2RayServiceManager$measureV2rayDelay$1) create(coroutineScope, continuation)).invokeSuspend(mk1.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String strT;
        long jMeasureDelay;
        IPAPIInfo iPAPIInfo;
        ServiceControl serviceControl;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        String strV = null;
        if (this.label != 0) {
            u7.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        d.b(obj);
        CoreController coreController = b.a;
        SoftReference softReference = b.d;
        Service service = (softReference == null || (serviceControl = (ServiceControl) softReference.get()) == null) ? null : serviceControl.getService();
        if (service != null) {
            try {
                CoreController coreController2 = b.a;
                Lazy lazy = zq0.a;
                String strD = zq0.z().d("pref_delay_test_url");
                if (strD == null) {
                    strD = "https://www.gstatic.com/generate_204";
                }
                jMeasureDelay = coreController2.measureDelay(strD);
                strT = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            } catch (Exception e) {
                String message = e.getMessage();
                strT = message != null ? g.T(message, "\":", message) : "empty message";
                jMeasureDelay = -1;
            }
            if (jMeasureDelay == -1) {
                try {
                    jMeasureDelay = b.a.measureDelay("https://www.google.com/generate_204");
                } catch (Exception e2) {
                    String message2 = e2.getMessage();
                    strT = message2 != null ? g.T(message2, "\":", message2) : "empty message";
                }
            }
            String string = jMeasureDelay >= 0 ? service.getString(R.string.connection_test_available, new Long(jMeasureDelay)) : service.getString(R.string.connection_test_error, strT);
            string.getClass();
            l02.F(service, "com.v2ray.ang.action.activity", string);
            if (jMeasureDelay >= 0) {
                m91 m91Var = m91.a;
                Regex regex = ul1.a;
                Lazy lazy2 = zq0.a;
                String strB = i60.b(ul1.y(Integer.parseInt("10808"), zq0.z().d("pref_socks_port")), "https://speed.cloudflare.com/meta");
                if (strB != null && (iPAPIInfo = (IPAPIInfo) aj0.a(IPAPIInfo.class, strB)) != null) {
                    String ip = iPAPIInfo.getIp();
                    if (ip == null && (ip = iPAPIInfo.getClientIp()) == null && (ip = iPAPIInfo.getIp_addr()) == null) {
                        ip = iPAPIInfo.getQuery();
                    }
                    String country_code = iPAPIInfo.getCountry_code();
                    if (country_code == null && (country_code = iPAPIInfo.getCountry()) == null) {
                        country_code = iPAPIInfo.getCountryCode();
                    }
                    if (country_code == null) {
                        country_code = "unknown";
                    }
                    strV = hz.v("(", country_code, ") ", ip);
                }
                if (strV != null) {
                    l02.F(service, "com.v2ray.ang.action.activity", string + "\n" + strV);
                }
            }
        }
        return mk1.a;
    }
}
