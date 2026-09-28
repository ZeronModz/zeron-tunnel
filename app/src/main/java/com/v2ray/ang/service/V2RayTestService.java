package com.v2ray.ang.service;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.os.SystemClock;
import dev.zeron.tunnel.R;
import com.google.android.gms.ads.RequestConfiguration;
import com.v2ray.ang.dto.ConfigResult;
import com.v2ray.ang.dto.EConfigType;
import com.v2ray.ang.dto.ProfileItem;
import defpackage.bx0;
import defpackage.dm1;
import defpackage.i60;
import defpackage.m91;
import defpackage.mk1;
import defpackage.qf3;
import defpackage.u7;
import defpackage.ul1;
import defpackage.yq0;
import defpackage.zq0;
import go.Seq;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.c;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.d;
import kotlin.jvm.functions.Function2;
import kotlin.text.Regex;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.g;
import libv2ray.Libv2ray;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/v2ray/ang/service/V2RayTestService;", "Landroid/app/Service;", "<init>", "()V", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class V2RayTestService extends Service {
    public static final /* synthetic */ int b = 0;
    public final Lazy a = c.b(new yq0(24));

    /* JADX INFO: renamed from: com.v2ray.ang.service.V2RayTestService$onStartCommand$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lmk1;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 2, 0})
    @DebugMetadata(c = "com.v2ray.ang.service.V2RayTestService$onStartCommand$1", f = "V2RayTestService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super mk1>, Object> {
        final /* synthetic */ String $guid;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$guid = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<mk1> create(Object obj, Continuation<?> continuation) {
            return V2RayTestService.this.new AnonymousClass1(this.$guid, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super mk1> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(mk1.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            String str;
            ConfigResult configResult;
            String string;
            Pair pair;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                u7.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            d.b(obj);
            V2RayTestService v2RayTestService = V2RayTestService.this;
            String str2 = this.$guid;
            int i = V2RayTestService.b;
            v2RayTestService.getClass();
            Lazy lazy = zq0.a;
            ProfileItem profileItemE = zq0.e(str2);
            long jMeasureOutboundDelay = -1;
            if (profileItemE != null) {
                EConfigType configType = profileItemE.getConfigType();
                EConfigType eConfigType = EConfigType.HYSTERIA2;
                str = "https://www.gstatic.com/generate_204";
                if (configType == eConfigType) {
                    Lazy lazy2 = bx0.a;
                    EConfigType configType2 = profileItemE.getConfigType();
                    if (configType2 != null && configType2.equals(eConfigType)) {
                        Regex regex = ul1.a;
                        int iD = ul1.d(kotlin.collections.c.z(0));
                        ArrayList arrayListA = bx0.a(v2RayTestService, bx0.b(v2RayTestService, profileItemE, iD));
                        ProcessService processService = new ProcessService();
                        processService.a(v2RayTestService, arrayListA);
                        Thread.sleep(1000L);
                        m91 m91Var = m91.a;
                        String strD = zq0.z().d("pref_delay_test_url");
                        HttpURLConnection httpURLConnectionA = i60.a(strD != null ? strD : "https://www.gstatic.com/generate_204", iD, 15000, 15000, false);
                        if (httpURLConnectionA == null) {
                            pair = new Pair(-1L, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                        } else {
                            try {
                                try {
                                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                                    int responseCode = httpURLConnectionA.getResponseCode();
                                    jMeasureOutboundDelay = SystemClock.elapsedRealtime() - jElapsedRealtime;
                                    if (responseCode != 204 && (responseCode != 200 || qf3.r(httpURLConnectionA) != 0)) {
                                        throw new IOException(v2RayTestService.getString(R.string.connection_test_error_status_code, Integer.valueOf(responseCode)));
                                    }
                                    string = v2RayTestService.getString(R.string.connection_test_available, Long.valueOf(jMeasureOutboundDelay));
                                    string.getClass();
                                } catch (Throwable th) {
                                    httpURLConnectionA.disconnect();
                                    throw th;
                                }
                            } catch (IOException e) {
                                string = v2RayTestService.getString(R.string.connection_test_error, e.getMessage());
                                string.getClass();
                            } catch (Exception e2) {
                                string = v2RayTestService.getString(R.string.connection_test_error, e2.getMessage());
                                string.getClass();
                            }
                            httpURLConnectionA.disconnect();
                            pair = new Pair(Long.valueOf(jMeasureOutboundDelay), string);
                        }
                        try {
                            Process process = processService.a;
                            if (process != null) {
                                process.destroy();
                            }
                        } catch (Exception unused) {
                        }
                        jMeasureOutboundDelay = ((Number) pair.getFirst()).longValue();
                    }
                } else {
                    try {
                        ProfileItem profileItemE2 = zq0.e(str2);
                        configResult = profileItemE2 == null ? new ConfigResult(false, null, null, null, 14, null) : profileItemE2.getConfigType() == EConfigType.CUSTOM ? dm1.g(str2) : dm1.i(v2RayTestService, str2, profileItemE2);
                    } catch (Exception unused2) {
                        configResult = new ConfigResult(false, null, null, null, 14, null);
                    }
                    if (configResult.getStatus()) {
                        m91 m91Var2 = m91.a;
                        String content = configResult.getContent();
                        content.getClass();
                        try {
                            Lazy lazy3 = zq0.a;
                            String strD2 = zq0.z().d("pref_delay_test_url");
                            if (strD2 != null) {
                                str = strD2;
                            }
                            jMeasureOutboundDelay = Libv2ray.measureOutboundDelay(content, str);
                        } catch (Exception unused3) {
                        }
                    }
                }
            }
            V2RayTestService v2RayTestService2 = V2RayTestService.this;
            Pair pair2 = new Pair(this.$guid, new Long(jMeasureOutboundDelay));
            v2RayTestService2.getClass();
            try {
                Intent intent = new Intent();
                intent.setAction("com.v2ray.ang.action.activity");
                intent.setPackage("dev.zeron.tunnel");
                intent.putExtra("key", 71);
                intent.putExtra("content", pair2);
                v2RayTestService2.sendBroadcast(intent);
            } catch (Exception unused4) {
            }
            return mk1.a;
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        Seq.setContext((Context) this);
        Regex regex = ul1.a;
        Libv2ray.initCoreEnv(ul1.E(this), ul1.i());
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        Job job;
        Object serializableExtra;
        Integer numValueOf = intent != null ? Integer.valueOf(intent.getIntExtra("key", 0)) : null;
        Lazy lazy = this.a;
        if (numValueOf != null && numValueOf.intValue() == 7) {
            if (Build.VERSION.SDK_INT >= 33) {
                serializableExtra = intent.getSerializableExtra("content", String.class);
            } else {
                Object serializableExtra2 = intent.getSerializableExtra("content");
                if (!(serializableExtra2 instanceof String)) {
                    serializableExtra2 = null;
                }
                serializableExtra = (String) serializableExtra2;
            }
            String str = (String) serializableExtra;
            if (str == null) {
                str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            }
            kotlinx.coroutines.c.d((CoroutineScope) lazy.getValue(), null, null, new AnonymousClass1(str, null), 3);
        } else if (numValueOf != null && numValueOf.intValue() == 72 && (job = (Job) ((CoroutineScope) lazy.getValue()).getC().get(Job.Key)) != null) {
            g.c(job);
        }
        return super.onStartCommand(intent, i, i2);
    }
}
