package defpackage;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import androidx.camera.core.ImageCapture$ScreenFlash;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.SessionConfig$Builder;
import androidx.camera.core.processing.Operation;
import androidx.camera.core.processing.Packet;
import androidx.core.view.WindowInsetsCompat;
import androidx.datastore.preferences.protobuf.DescriptorProtos$Edition;
import androidx.datastore.preferences.protobuf.DescriptorProtos$ExtensionRangeOptions$VerificationState;
import androidx.datastore.preferences.protobuf.DescriptorProtos$FeatureSet$EnumType;
import androidx.datastore.preferences.protobuf.DescriptorProtos$FeatureSet$FieldPresence;
import androidx.datastore.preferences.protobuf.DescriptorProtos$FeatureSet$JsonFormat;
import androidx.datastore.preferences.protobuf.DescriptorProtos$FeatureSet$MessageEncoding;
import androidx.datastore.preferences.protobuf.DescriptorProtos$FeatureSet$RepeatedFieldEncoding;
import androidx.datastore.preferences.protobuf.DescriptorProtos$FeatureSet$Utf8Validation;
import androidx.datastore.preferences.protobuf.Internal$EnumLite;
import androidx.datastore.preferences.protobuf.Internal$EnumLiteMap;
import androidx.window.core.Logger;
import androidx.window.layout.WindowInfoTracker;
import androidx.window.layout.WindowInfoTrackerDecorator;
import androidx.work.Tracer;
import com.google.android.datatransport.cct.internal.AndroidClientInfo;
import com.google.android.datatransport.cct.internal.BatchedLogRequest;
import com.google.android.datatransport.cct.internal.ClientInfo;
import com.google.android.datatransport.cct.internal.ComplianceData;
import com.google.android.datatransport.cct.internal.ExperimentIds;
import com.google.android.datatransport.cct.internal.ExternalPRequestContext;
import com.google.android.datatransport.cct.internal.ExternalPrivacyContext;
import com.google.android.datatransport.cct.internal.LogEvent;
import com.google.android.datatransport.cct.internal.LogRequest;
import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;
import com.google.android.datatransport.cct.internal.a;
import com.google.android.datatransport.cct.internal.b;
import com.google.android.datatransport.cct.internal.c;
import com.google.android.datatransport.cct.internal.f;
import com.google.android.datatransport.cct.internal.h;
import com.google.android.datatransport.cct.internal.o;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.internal.ads.zzagc;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.material.internal.ViewUtils$OnApplyWindowInsetsListener;
import com.google.android.material.internal.ViewUtils$RelativePadding;
import com.google.common.base.Function;
import com.google.common.eventbus.SubscriberExceptionHandler;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import com.trilead.ssh2.sftp.AttribFlags;
import com.trilead.ssh2.sftp.ErrorCodes;
import io.ktor.client.engine.HttpClientEngine;
import io.ktor.client.engine.HttpClientEngineFactory;
import io.ktor.client.engine.okhttp.OkHttpConfig;
import io.ktor.client.engine.okhttp.OkHttpEngine;
import java.util.Objects;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicLong;
import javax.net.ssl.SSLSession;
import kotlin.io.d;
import kotlin.jvm.functions.Function1;
import kotlin.text.Regex;
import org.conscrypt.ConscryptHostnameVerifier;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class i60 implements Logger, Configurator, ConscryptHostnameVerifier, WindowInfoTrackerDecorator, SubscriberExceptionHandler, HttpClientEngineFactory, Continuation, zzagc, SuccessContinuation, Function, Operation, ViewUtils$OnApplyWindowInsetsListener, CameraControlInternal, Tracer, Internal$EnumLiteMap {
    public static final i60 b = new i60(1);
    public static final i60 c = new i60(2);
    public static final i60 d = new i60(3);
    public static final i60 e = new i60(4);
    public static final i60 f = new i60(5);
    public static final i60 g = new i60(7);
    public static final i60 h = new i60(8);
    public static final i60 i = new i60(9);
    public static final /* synthetic */ i60 j = new i60(10);
    public static final /* synthetic */ i60 k = new i60(11);
    public static final i60 l = new i60(12);
    public static final i60 m = new i60(13);
    public static final i60 n = new i60(14);
    public static final /* synthetic */ i60 o = new i60(15);
    public final /* synthetic */ int a;

    public /* synthetic */ i60(int i2) {
        this.a = i2;
    }

    public static HttpURLConnection a(String str, int i2, int i3, int i4, boolean z) {
        HttpURLConnection httpURLConnection;
        str.getClass();
        try {
            URL url = new URL(str);
            URLConnection uRLConnectionOpenConnection = i2 == 0 ? url.openConnection() : url.openConnection(new Proxy(Proxy.Type.HTTP, new InetSocketAddress("127.0.0.1", i2)));
            uRLConnectionOpenConnection.getClass();
            httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            try {
                httpURLConnection.setConnectTimeout(i3);
                httpURLConnection.setReadTimeout(i4);
                if (!z) {
                    httpURLConnection.setRequestProperty("Connection", "close");
                    httpURLConnection.setInstanceFollowRedirects(false);
                    httpURLConnection.setUseCaches(false);
                }
                String userInfo = url.getUserInfo();
                if (userInfo != null) {
                    Regex regex = ul1.a;
                    httpURLConnection.setRequestProperty("Authorization", "Basic ".concat(ul1.c(ul1.C(userInfo))));
                }
                return httpURLConnection;
            } catch (Exception unused) {
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                return null;
            }
        } catch (Exception unused2) {
            httpURLConnection = null;
        }
    }

    public static String b(int i2, String str) {
        str.getClass();
        HttpURLConnection httpURLConnectionA = a(str, i2, 5000, 5000, false);
        if (httpURLConnectionA == null) {
            return null;
        }
        try {
            InputStream inputStream = httpURLConnectionA.getInputStream();
            inputStream.getClass();
            return d.b(new BufferedReader(new InputStreamReader(inputStream, xm.a), AttribFlags.SSH_FILEXFER_ATTR_LINK_COUNT));
        } catch (Exception unused) {
            return null;
        } finally {
            httpURLConnectionA.disconnect();
        }
    }

    public static String c(int i2, String str) {
        int i3 = 0;
        while (true) {
            int i4 = i3 + 1;
            if (i3 >= 3) {
                p60.f("Too many redirects");
                return null;
            }
            HttpURLConnection httpURLConnectionA = a(str, i2, 15000, 15000, false);
            if (httpURLConnectionA != null) {
                httpURLConnectionA.setRequestProperty("User-agent", "v2rayNG/v1.0.8.8");
                httpURLConnectionA.connect();
                int responseCode = httpURLConnectionA.getResponseCode();
                if (300 > responseCode || responseCode >= 400) {
                    try {
                        InputStream inputStream = httpURLConnectionA.getInputStream();
                        try {
                            inputStream.getClass();
                            String strB = d.b(new BufferedReader(new InputStreamReader(inputStream, xm.a), AttribFlags.SSH_FILEXFER_ATTR_LINK_COUNT));
                            inputStream.close();
                            return strB;
                        } finally {
                        }
                    } finally {
                        httpURLConnectionA.disconnect();
                    }
                } else {
                    str = httpURLConnectionA.getHeaderField("Location");
                    if (str == null || str.length() == 0) {
                        break;
                    }
                }
            }
            i3 = i4;
        }
        p60.f("Redirect location not found");
        return null;
    }

    public static final void e(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            try {
                webView.evaluateJavascript(str, null);
            } catch (IllegalStateException unused) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
                sb.append("javascript: ");
                sb.append(str);
                webView.loadUrl(sb.toString());
            }
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    @Override // com.google.common.base.Function, androidx.camera.core.impl.utils.futures.AsyncFunction
    public Object apply(Object obj) {
        switch (this.a) {
            case 16:
                return Long.valueOf(((AtomicLong) obj).get());
            default:
                ta taVar = (ta) obj;
                Packet packet = taVar.a;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                ((Bitmap) packet.c()).compress(Bitmap.CompressFormat.JPEG, taVar.b, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                w30 w30VarD = packet.d();
                Objects.requireNonNull(w30VarD);
                return new cc(byteArray, w30VarD, (Build.VERSION.SDK_INT < 34 || !w1.m((Bitmap) packet.c())) ? 256 : 4101, packet.h(), packet.b(), packet.f(), packet.g(), packet.a());
        }
    }

    @Override // androidx.work.Tracer
    public void beginAsyncSection(String str, int i2) {
        str.getClass();
        k02.a(str, i2);
    }

    @Override // androidx.work.Tracer
    public void beginSection(String str) {
        str.getClass();
        Trace.beginSection(k02.y(str));
    }

    @Override // androidx.camera.core.CameraControl
    public ListenableFuture cancelFocusAndMetering() {
        return rf0.c;
    }

    @Override // com.google.firebase.encoders.config.Configurator
    public void configure(EncoderConfig encoderConfig) {
        f9 f9Var = f9.a;
        encoderConfig.registerEncoder(BatchedLogRequest.class, f9Var);
        encoderConfig.registerEncoder(sa.class, f9Var);
        k9 k9Var = k9.a;
        encoderConfig.registerEncoder(LogRequest.class, k9Var);
        encoderConfig.registerEncoder(ub.class, k9Var);
        a aVar = a.a;
        encoderConfig.registerEncoder(ClientInfo.class, aVar);
        encoderConfig.registerEncoder(f.class, aVar);
        e9 e9Var = e9.a;
        encoderConfig.registerEncoder(AndroidClientInfo.class, e9Var);
        encoderConfig.registerEncoder(ka.class, e9Var);
        j9 j9Var = j9.a;
        encoderConfig.registerEncoder(LogEvent.class, j9Var);
        encoderConfig.registerEncoder(tb.class, j9Var);
        b bVar = b.a;
        encoderConfig.registerEncoder(ComplianceData.class, bVar);
        encoderConfig.registerEncoder(h.class, bVar);
        i9 i9Var = i9.a;
        encoderConfig.registerEncoder(ExternalPrivacyContext.class, i9Var);
        encoderConfig.registerEncoder(hb.class, i9Var);
        h9 h9Var = h9.a;
        encoderConfig.registerEncoder(ExternalPRequestContext.class, h9Var);
        encoderConfig.registerEncoder(gb.class, h9Var);
        c cVar = c.a;
        encoderConfig.registerEncoder(NetworkConnectionInfo.class, cVar);
        encoderConfig.registerEncoder(o.class, cVar);
        g9 g9Var = g9.a;
        encoderConfig.registerEncoder(ExperimentIds.class, g9Var);
        encoderConfig.registerEncoder(fb.class, g9Var);
    }

    @Override // io.ktor.client.engine.HttpClientEngineFactory
    public HttpClientEngine create(Function1 function1) {
        function1.getClass();
        OkHttpConfig okHttpConfig = new OkHttpConfig();
        function1.invoke(okHttpConfig);
        return new OkHttpEngine(okHttpConfig);
    }

    public void d(WebView webView, String str, Object... objArr) {
        if (webView != null) {
            StringBuilder sb = new StringBuilder(128);
            sb.append("if(window.omidBridge!==undefined){omidBridge.");
            sb.append(str);
            sb.append("(");
            for (Object obj : objArr) {
                if (obj == null) {
                    sb.append("null");
                } else if (obj instanceof String) {
                    String string = obj.toString();
                    if (string.startsWith("{")) {
                        sb.append(string);
                    } else {
                        sb.append('\"');
                        sb.append(string);
                        sb.append('\"');
                    }
                } else {
                    sb.append(obj);
                }
                sb.append(",");
            }
            sb.setLength(sb.length() - 1);
            sb.append(")}");
            String string2 = sb.toString();
            Handler handler = webView.getHandler();
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            if (Looper.myLooper() == handler.getLooper()) {
                e(webView, string2);
            } else {
                handler.post(new wn2(this, webView, string2));
            }
        }
    }

    @Override // androidx.window.core.Logger
    public void debug(String str, String str2) {
        str.getClass();
        str2.getClass();
    }

    @Override // androidx.window.layout.WindowInfoTrackerDecorator
    public WindowInfoTracker decorate(WindowInfoTracker windowInfoTracker) {
        windowInfoTracker.getClass();
        return windowInfoTracker;
    }

    @Override // androidx.camera.core.CameraControl
    public ListenableFuture enableTorch(boolean z) {
        return rf0.c;
    }

    @Override // androidx.work.Tracer
    public void endAsyncSection(String str, int i2) {
        str.getClass();
        k02.h(str, i2);
    }

    @Override // androidx.work.Tracer
    public void endSection() {
        Trace.endSection();
    }

    @Override // androidx.datastore.preferences.protobuf.Internal$EnumLiteMap
    public Internal$EnumLite findValueByNumber(int i2) {
        switch (this.a) {
            case 22:
                return DescriptorProtos$Edition.forNumber(i2);
            case 23:
                return DescriptorProtos$ExtensionRangeOptions$VerificationState.forNumber(i2);
            case ErrorCodes.SSH_FX_FILE_IS_A_DIRECTORY /* 24 */:
                return DescriptorProtos$FeatureSet$EnumType.forNumber(i2);
            case ErrorCodes.SSH_FX_BYTE_RANGE_LOCK_CONFLICT /* 25 */:
                return DescriptorProtos$FeatureSet$FieldPresence.forNumber(i2);
            case ErrorCodes.SSH_FX_BYTE_RANGE_LOCK_REFUSED /* 26 */:
                return DescriptorProtos$FeatureSet$JsonFormat.forNumber(i2);
            case 27:
                return DescriptorProtos$FeatureSet$MessageEncoding.forNumber(i2);
            case ErrorCodes.SSH_FX_FILE_CORRUPT /* 28 */:
                return DescriptorProtos$FeatureSet$RepeatedFieldEncoding.forNumber(i2);
            default:
                return DescriptorProtos$FeatureSet$Utf8Validation.forNumber(i2);
        }
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public ListenableFuture getCameraCapturePipelineAsync(int i2, int i3) {
        return xg0.m(new uj());
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public int getFlashMode() {
        return 2;
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public Config getInteropConfig() {
        return null;
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public Rect getSensorRect() {
        return new Rect();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public v61 getSessionConfig() {
        return v61.a();
    }

    @Override // com.google.common.eventbus.SubscriberExceptionHandler
    public void handleException(Throwable th, ub1 ub1Var) {
        throw null;
    }

    @Override // androidx.work.Tracer
    public boolean isEnabled() {
        return k02.r();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public boolean isInVideoUsage() {
        return false;
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public boolean isZslDisabledByByUserCaseConfig() {
        return false;
    }

    @Override // com.google.android.material.internal.ViewUtils$OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat, ViewUtils$RelativePadding viewUtils$RelativePadding) {
        viewUtils$RelativePadding.d = windowInsetsCompat.a() + viewUtils$RelativePadding.d;
        WeakHashMap weakHashMap = androidx.core.view.h.a;
        boolean z = view.getLayoutDirection() == 1;
        int iB = windowInsetsCompat.b();
        int iC = windowInsetsCompat.c();
        int i2 = viewUtils$RelativePadding.a + (z ? iC : iB);
        viewUtils$RelativePadding.a = i2;
        int i3 = viewUtils$RelativePadding.c;
        if (!z) {
            iB = iC;
        }
        int i4 = i3 + iB;
        viewUtils$RelativePadding.c = i4;
        view.setPaddingRelative(i2, viewUtils$RelativePadding.b, i4, viewUtils$RelativePadding.d);
        return windowInsetsCompat;
    }

    @Override // androidx.camera.core.CameraControl
    public ListenableFuture setExposureCompensationIndex(int i2) {
        return xg0.m(0);
    }

    @Override // androidx.camera.core.CameraControl
    public ListenableFuture setLinearZoom(float f2) {
        return rf0.c;
    }

    @Override // androidx.camera.core.CameraControl
    public ListenableFuture setZoomRatio(float f2) {
        return rf0.c;
    }

    @Override // androidx.camera.core.CameraControl
    public ListenableFuture startFocusAndMetering(x70 x70Var) {
        return xg0.m(new f80(false));
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public ListenableFuture submitStillCaptureRequests(List list, int i2, int i3) {
        return xg0.m(Collections.EMPTY_LIST);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) throws IOException {
        switch (this.a) {
            case 10:
                if (task.m()) {
                    return (Bundle) task.i();
                }
                if (Log.isLoggable("Rpc", 3)) {
                    "Error making request: ".concat(String.valueOf(task.h()));
                }
                throw new IOException("SERVICE_NOT_AVAILABLE", task.h());
            default:
                Intent intent = (Intent) ((Bundle) task.i()).getParcelable("notification_data");
                if (intent != null) {
                    return new CloudMessage(intent);
                }
                return null;
        }
    }

    public String toString() {
        switch (this.a) {
            case 12:
                return "NoDeclaredBrand";
            default:
                return super.toString();
        }
    }

    @Override // org.conscrypt.ConscryptHostnameVerifier
    public boolean verify(X509Certificate[] x509CertificateArr, String str, SSLSession sSLSession) {
        return true;
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void clearInteropConfig() {
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void decrementVideoUsage() {
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public CameraControlInternal getImplementation() {
        return this;
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void incrementVideoUsage() {
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void addInteropConfig(Config config) {
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void addZslConfig(SessionConfig$Builder sessionConfig$Builder) {
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void setFlashMode(int i2) {
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void setScreenFlash(ImageCapture$ScreenFlash imageCapture$ScreenFlash) {
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void setZslDisabledByUserCaseConfig(boolean z) {
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        switch (this.a) {
            case 15:
                Bundle bundle = (Bundle) obj;
                int i2 = Rpc.h;
                if (bundle != null && bundle.containsKey("google.messenger")) {
                    return com.google.android.gms.tasks.b.e(null);
                }
                return com.google.android.gms.tasks.b.e(bundle);
            default:
                return com.google.android.gms.tasks.b.e(Boolean.TRUE);
        }
    }
}
