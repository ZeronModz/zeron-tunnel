package io.ktor.client.plugins;

import defpackage.mk1;
import defpackage.ne0;
import defpackage.oe0;
import defpackage.u7;
import defpackage.xm;
import defpackage.yg0;
import io.ktor.client.HttpClientConfig;
import io.ktor.client.plugins.api.ClientPluginBuilder;
import io.ktor.client.statement.HttpReceivePipeline;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ c(HttpClientConfig httpClientConfig) {
        this.a = 1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        io.ktor.client.plugins.api.c cVar = io.ktor.client.plugins.api.c.a;
        mk1 mk1Var = mk1.a;
        switch (i) {
            case 0:
                ClientPluginBuilder clientPluginBuilder = (ClientPluginBuilder) obj;
                clientPluginBuilder.getClass();
                clientPluginBuilder.a(b.a, new BodyProgressKt$BodyProgress$1$1(null));
                clientPluginBuilder.a(a.a, new BodyProgressKt$BodyProgress$1$2(null));
                return mk1Var;
            case 1:
                HttpCallValidatorConfig httpCallValidatorConfig = (HttpCallValidatorConfig) obj;
                httpCallValidatorConfig.getClass();
                httpCallValidatorConfig.c = false;
                httpCallValidatorConfig.a.add(new DefaultResponseValidationKt$addDefaultResponseValidation$1$1(null));
                return mk1Var;
            case 2:
                ClientPluginBuilder clientPluginBuilder2 = (ClientPluginBuilder) obj;
                clientPluginBuilder2.getClass();
                HttpReceivePipeline httpReceivePipeline = clientPluginBuilder2.a.h;
                HttpReceivePipeline.g.getClass();
                httpReceivePipeline.g(HttpReceivePipeline.h, new DoubleReceivePluginKt$SaveBodyPlugin$2$1(false, null));
                return mk1Var;
            case 3:
                ClientPluginBuilder clientPluginBuilder3 = (ClientPluginBuilder) obj;
                clientPluginBuilder3.getClass();
                HttpCallValidatorConfig httpCallValidatorConfig2 = (HttpCallValidatorConfig) clientPluginBuilder3.b;
                List listJ = kotlin.collections.c.J(httpCallValidatorConfig2.a);
                List listJ2 = kotlin.collections.c.J(httpCallValidatorConfig2.b);
                clientPluginBuilder3.a(io.ktor.client.plugins.api.d.a, new HttpCallValidatorKt$HttpCallValidator$2$1(httpCallValidatorConfig2.c, null));
                clientPluginBuilder3.a(cVar, new HttpCallValidatorKt$HttpCallValidator$2$2(listJ, null));
                clientPluginBuilder3.a(q.a, new HttpCallValidatorKt$HttpCallValidator$2$3(listJ2, null));
                clientPluginBuilder3.a(o.a, new HttpCallValidatorKt$HttpCallValidator$2$4(listJ2, null));
                return mk1Var;
            case 4:
                ClientPluginBuilder clientPluginBuilder4 = (ClientPluginBuilder) obj;
                clientPluginBuilder4.getClass();
                HttpPlainTextConfig httpPlainTextConfig = (HttpPlainTextConfig) clientPluginBuilder4.b;
                LinkedHashMap linkedHashMap = httpPlainTextConfig.b;
                List<Pair> listN = kotlin.collections.c.N(kotlin.collections.d.g(linkedHashMap), new Comparator() { // from class: io.ktor.client.plugins.HttpPlainTextKt$HttpPlainText$lambda$6$$inlined$sortedByDescending$1
                    @Override // java.util.Comparator
                    public final int compare(Object obj2, Object obj3) {
                        return kotlin.comparisons.a.a((Float) ((Pair) obj3).getSecond(), (Float) ((Pair) obj2).getSecond());
                    }
                });
                Charset charset = httpPlainTextConfig.c;
                LinkedHashSet linkedHashSet = httpPlainTextConfig.a;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : linkedHashSet) {
                    if (!linkedHashMap.containsKey((Charset) obj2)) {
                        arrayList.add(obj2);
                    }
                }
                List<Charset> listN2 = kotlin.collections.c.N(arrayList, new Comparator() { // from class: io.ktor.client.plugins.HttpPlainTextKt$HttpPlainText$lambda$6$$inlined$sortedBy$1
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        Charset charset2 = (Charset) obj3;
                        charset2.getClass();
                        String strName = charset2.name();
                        strName.getClass();
                        Charset charset3 = (Charset) obj4;
                        charset3.getClass();
                        String strName2 = charset3.name();
                        strName2.getClass();
                        return kotlin.comparisons.a.a(strName, strName2);
                    }
                });
                StringBuilder sb = new StringBuilder();
                for (Charset charset2 : listN2) {
                    if (sb.length() > 0) {
                        sb.append(",");
                    }
                    charset2.getClass();
                    String strName = charset2.name();
                    strName.getClass();
                    sb.append(strName);
                }
                for (Pair pair : listN) {
                    Charset charset3 = (Charset) pair.component1();
                    float fFloatValue = ((Number) pair.component2()).floatValue();
                    if (sb.length() > 0) {
                        sb.append(",");
                    }
                    double d = fFloatValue;
                    if (0.0d > d || d > 1.0d) {
                        u7.p("Check failed.");
                        return null;
                    }
                    double dB = ((double) kotlin.math.a.b(100.0f * fFloatValue)) / 100.0d;
                    charset3.getClass();
                    String strName2 = charset3.name();
                    strName2.getClass();
                    sb.append(strName2 + ";q=" + dB);
                }
                if (sb.length() == 0) {
                    charset.getClass();
                    String strName3 = charset.name();
                    strName3.getClass();
                    sb.append(strName3);
                }
                String string = sb.toString();
                Charset charset4 = (Charset) kotlin.collections.c.s(listN2);
                if (charset4 == null) {
                    Pair pair2 = (Pair) kotlin.collections.c.s(listN);
                    charset4 = pair2 != null ? (Charset) pair2.getFirst() : null;
                    if (charset4 == null) {
                        charset4 = xm.a;
                    }
                }
                clientPluginBuilder4.a(p.a, new HttpPlainTextKt$HttpPlainText$2$1(string, charset4, null));
                clientPluginBuilder4.a(io.ktor.client.plugins.api.e.a, new HttpPlainTextKt$HttpPlainText$2$2(charset, null));
                return mk1Var;
            case 5:
                ClientPluginBuilder clientPluginBuilder5 = (ClientPluginBuilder) obj;
                clientPluginBuilder5.getClass();
                clientPluginBuilder5.a(cVar, new HttpRedirectKt$HttpRedirect$2$1(true, false, clientPluginBuilder5, null));
                return mk1Var;
            case 6:
                ClientPluginBuilder clientPluginBuilder6 = (ClientPluginBuilder) obj;
                clientPluginBuilder6.getClass();
                clientPluginBuilder6.a(r.a, new HttpRequestLifecycleKt$HttpRequestLifecycle$1$1(clientPluginBuilder6, null));
                return mk1Var;
            case 7:
                ClientPluginBuilder clientPluginBuilder7 = (ClientPluginBuilder) obj;
                clientPluginBuilder7.getClass();
                HttpRequestRetryConfig httpRequestRetryConfig = (HttpRequestRetryConfig) clientPluginBuilder7.b;
                ne0 ne0Var = httpRequestRetryConfig.a;
                if (ne0Var == null) {
                    yg0.N("shouldRetry");
                    throw null;
                }
                ne0 ne0Var2 = httpRequestRetryConfig.b;
                if (ne0Var2 == null) {
                    yg0.N("shouldRetryOnException");
                    throw null;
                }
                oe0 oe0Var = httpRequestRetryConfig.c;
                if (oe0Var != null) {
                    clientPluginBuilder7.a(cVar, new HttpRequestRetryKt$HttpRequestRetry$2$1(ne0Var, ne0Var2, httpRequestRetryConfig.f, oe0Var, httpRequestRetryConfig.d, clientPluginBuilder7, httpRequestRetryConfig.e, null));
                    return mk1Var;
                }
                yg0.N("delayMillis");
                throw null;
            case 8:
                ClientPluginBuilder clientPluginBuilder8 = (ClientPluginBuilder) obj;
                clientPluginBuilder8.getClass();
                HttpTimeoutConfig httpTimeoutConfig = (HttpTimeoutConfig) clientPluginBuilder8.b;
                clientPluginBuilder8.a(cVar, new HttpTimeoutKt$HttpTimeout$2$1(httpTimeoutConfig.a, httpTimeoutConfig.b, httpTimeoutConfig.c, null));
                return mk1Var;
            default:
                ClientPluginBuilder clientPluginBuilder9 = (ClientPluginBuilder) obj;
                clientPluginBuilder9.getClass();
                clientPluginBuilder9.a(io.ktor.client.plugins.api.b.a, new UserAgentKt$UserAgent$2$1(((UserAgentConfig) clientPluginBuilder9.b).a, null));
                return mk1Var;
        }
    }

    public /* synthetic */ c(int i) {
        this.a = i;
    }
}
