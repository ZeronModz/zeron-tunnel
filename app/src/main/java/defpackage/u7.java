package defpackage;

import android.graphics.ColorSpace;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import androidx.camera.core.Preview$SurfaceProvider;
import androidx.camera.core.SurfaceRequest;
import androidx.fragment.app.Fragment;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.ComponentRegistrarProcessor;
import java.io.EOFException;
import java.util.ConcurrentModificationException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u7 implements Preview$SurfaceProvider, ComponentRegistrarProcessor {
    public static /* bridge */ /* synthetic */ ColorSpace b(Object obj) {
        return (ColorSpace) obj;
    }

    public static /* synthetic */ void d() {
        throw new ConcurrentModificationException();
    }

    public static /* synthetic */ void e(int i, StringBuilder sb) {
        sb.append(i);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public static /* synthetic */ void f(Fragment fragment, String str) {
        throw new IllegalStateException(str + ((Object) fragment.toString()) + ((Object) " is already attached to a FragmentManager."));
    }

    public static /* synthetic */ void g(Object obj) {
        throw new AssertionError(obj);
    }

    public static /* synthetic */ void h(Object obj, String str) {
        throw new AssertionError(str + obj);
    }

    public static /* synthetic */ void i(String str) {
        throw new IndexOutOfBoundsException(str);
    }

    public static /* synthetic */ void j(String str, float f, Object obj, float f2) {
        throw new IllegalStateException(str + f + obj + f2 + ((Object) ")"));
    }

    public static /* synthetic */ void k(StringBuilder sb, Object obj) {
        sb.append(obj);
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void m() throws EOFException {
        throw new EOFException();
    }

    public static /* synthetic */ void n(int i, StringBuilder sb) {
        sb.append(i);
        throw new IllegalStateException(sb.toString().toString());
    }

    public static /* synthetic */ void o(Object obj, String str) {
        throw new IllegalArgumentException((str + obj).toString());
    }

    public static /* synthetic */ void p(String str) {
        throw new IllegalStateException(str);
    }

    public static /* synthetic */ void q() {
        throw new ClassCastException();
    }

    public static /* synthetic */ void r(String str) {
        throw new IllegalArgumentException(str);
    }

    public static /* synthetic */ void s(String str) {
        throw new UnsupportedOperationException(str);
    }

    @Override // androidx.camera.core.Preview$SurfaceProvider
    public void onSurfaceRequested(SurfaceRequest surfaceRequest) {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(surfaceRequest.b.getWidth(), surfaceRequest.b.getHeight());
        surfaceTexture.detachFromGLContext();
        Surface surface = new Surface(surfaceTexture);
        surfaceRequest.b(surface, fy.b(), new tk(0, surface, surfaceTexture));
    }

    @Override // com.google.firebase.components.ComponentRegistrarProcessor
    public List processRegistrar(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }
}
