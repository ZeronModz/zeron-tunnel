package defpackage;

import android.view.View;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.video.internal.encoder.Encoder;
import androidx.camera.video.internal.encoder.EncoderConfig;
import androidx.camera.video.internal.encoder.EncoderFactory;
import androidx.camera.video.internal.encoder.EncoderImpl;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import io.github.g00fy2.quickie.QRScannerActivity;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.spec.InvalidKeySpecException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zu0 implements Deferred.DeferredHandler, OnApplyWindowInsetsListener, EncoderFactory, SurfaceRequest.TransformationInfoListener {
    public static /* synthetic */ void a() {
        throw new AssertionError();
    }

    public static /* synthetic */ void b(int i, int i2, String str) {
        throw new IllegalArgumentException(str + i + 'x' + i2);
    }

    public static /* synthetic */ void c(int i, String str) {
        throw new IllegalArgumentException(str + i);
    }

    public static /* synthetic */ void d(int i, StringBuilder sb) {
        sb.append(i);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public static /* synthetic */ void e(Object obj) {
        throw new IllegalArgumentException(obj.toString());
    }

    public static /* synthetic */ void f(Object obj, Object obj2, Object obj3, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        sb.append(obj3);
        throw new IllegalStateException(sb.toString(), th);
    }

    public static /* synthetic */ void g(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void h(String str) throws InvalidKeySpecException {
        throw new InvalidKeySpecException(str);
    }

    public static /* synthetic */ void i(String str, int i, Object obj) {
        throw new IllegalArgumentException(str + i + obj);
    }

    public static /* synthetic */ void j(String str, Object obj, Object obj2) throws IOException {
        throw new IOException(str + obj + obj2);
    }

    public static /* synthetic */ void k(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void l(String str, Throwable th) {
        throw new RuntimeException(str, th);
    }

    public static /* synthetic */ void m(String str, Object[] objArr) {
        throw new IllegalArgumentException(String.format(str, objArr));
    }

    public static /* synthetic */ void n(Throwable th) {
        throw new IllegalStateException(th);
    }

    public static /* synthetic */ void o(int i, String str) throws IOException {
        throw new IOException(str + i);
    }

    public static /* synthetic */ void p(String str) throws InvalidAlgorithmParameterException {
        throw new InvalidAlgorithmParameterException(str);
    }

    public static /* synthetic */ void q(String str, Object obj, Object obj2) {
        throw new IllegalStateException((str + obj + obj2).toString());
    }

    @Override // androidx.camera.video.internal.encoder.EncoderFactory
    public Encoder createEncoder(Executor executor, EncoderConfig encoderConfig) {
        return new EncoderImpl(executor, encoderConfig);
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        int i = QRScannerActivity.j;
        view.getClass();
        windowInsetsCompat.getClass();
        og0 og0VarG = windowInsetsCompat.a.g(519);
        view.setPadding(og0VarG.a, og0VarG.b, og0VarG.c, og0VarG.d);
        return WindowInsetsCompat.b;
    }

    @Override // com.google.firebase.inject.Deferred.DeferredHandler
    public void handle(Provider provider) {
    }

    @Override // androidx.camera.core.SurfaceRequest.TransformationInfoListener
    public void onTransformationInfoUpdate(qc1 qc1Var) {
    }
}
