package defpackage;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.view.Surface;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.processing.ShaderProvider;
import androidx.camera.core.processing.util.GLUtils$InputFormat;
import androidx.camera.core.processing.util.GLUtils$SamplerShaderProgram;
import java.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class hb0 {
    public static final int[] a = {12344};
    public static final int[] b = {12445, 13632, 12344};
    public static final String c;
    public static final String d;
    public static final fb0 e;
    public static final fb0 f;
    public static final fb0 g;
    public static final FloatBuffer h;
    public static final FloatBuffer i;
    public static final zb j;

    static {
        Locale locale = Locale.US;
        c = "uniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n    vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n";
        d = "#version 300 es\nin vec4 aPosition;\nin vec4 aTextureCoord;\nuniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nout vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uTransMatrix * aPosition;\n  vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n";
        e = new fb0(0);
        f = new fb0(1);
        g = new fb0(2);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(32);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        floatBufferAsFloatBuffer.put(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
        floatBufferAsFloatBuffer.position(0);
        h = floatBufferAsFloatBuffer;
        ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(32);
        byteBufferAllocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer2 = byteBufferAllocateDirect2.asFloatBuffer();
        floatBufferAsFloatBuffer2.put(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
        floatBufferAsFloatBuffer2.position(0);
        i = floatBufferAsFloatBuffer2;
        j = new zb(EGL14.EGL_NO_SURFACE, 0, 0);
    }

    public static void a(String str) {
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError == 12288) {
            return;
        }
        io0.i(hz.z(str, ": EGL error: 0x"), Integer.toHexString(iEglGetError));
    }

    public static void b(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError == 0) {
            return;
        }
        io0.i(hz.z(str, ": GL error 0x"), Integer.toHexString(iGlGetError));
    }

    public static void c(Thread thread) {
        jx0.g("Method call must be called on the GL thread.", thread == Thread.currentThread());
    }

    public static void d(AtomicBoolean atomicBoolean, boolean z) {
        jx0.g(z ? "OpenGlRenderer is not initialized" : "OpenGlRenderer is already initialized", z == atomicBoolean.get());
    }

    public static void e(int i2, String str) {
        if (i2 >= 0) {
            return;
        }
        u7.p(vh.m("Unable to locate '", str, "' in program"));
    }

    public static HashMap f(DynamicRange dynamicRange) {
        Object gLUtils$SamplerShaderProgram;
        GLUtils$InputFormat gLUtils$InputFormat;
        Map map = Collections.EMPTY_MAP;
        HashMap map2 = new HashMap();
        GLUtils$InputFormat[] gLUtils$InputFormatArrValues = GLUtils$InputFormat.values();
        int length = gLUtils$InputFormatArrValues.length;
        for (int i2 = 0; i2 < length; i2++) {
            GLUtils$InputFormat gLUtils$InputFormat2 = gLUtils$InputFormatArrValues[i2];
            ShaderProvider shaderProvider = (ShaderProvider) map.get(gLUtils$InputFormat2);
            if (shaderProvider != null) {
                gLUtils$SamplerShaderProgram = new GLUtils$SamplerShaderProgram(dynamicRange, shaderProvider);
            } else if (gLUtils$InputFormat2 == GLUtils$InputFormat.YUV || gLUtils$InputFormat2 == (gLUtils$InputFormat = GLUtils$InputFormat.DEFAULT)) {
                gLUtils$SamplerShaderProgram = new GLUtils$SamplerShaderProgram(dynamicRange, gLUtils$InputFormat2);
            } else {
                jx0.g("Unhandled input format: " + gLUtils$InputFormat2, gLUtils$InputFormat2 == GLUtils$InputFormat.UNKNOWN);
                if (dynamicRange.a()) {
                    gLUtils$SamplerShaderProgram = new gb0() { // from class: androidx.camera.core.processing.util.GLUtils$BlankShaderProgram
                    };
                } else {
                    ShaderProvider shaderProvider2 = (ShaderProvider) map.get(gLUtils$InputFormat);
                    gLUtils$SamplerShaderProgram = shaderProvider2 != null ? new GLUtils$SamplerShaderProgram(dynamicRange, shaderProvider2) : new GLUtils$SamplerShaderProgram(dynamicRange, gLUtils$InputFormat);
                }
            }
            Objects.toString(gLUtils$InputFormat2);
            gLUtils$SamplerShaderProgram.toString();
            map2.put(gLUtils$InputFormat2, gLUtils$SamplerShaderProgram);
        }
        return map2;
    }

    public static int g() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        b("glGenTextures");
        int i2 = iArr[0];
        GLES20.glBindTexture(36197, i2);
        b("glBindTexture " + i2);
        GLES20.glTexParameteri(36197, 10241, 9728);
        GLES20.glTexParameteri(36197, 10240, 9729);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        b("glTexParameter");
        return i2;
    }

    public static EGLSurface h(EGLDisplay eGLDisplay, EGLConfig eGLConfig, Surface surface, int[] iArr) {
        EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, eGLConfig, surface, iArr, 0);
        a("eglCreateWindowSurface");
        if (eGLSurfaceEglCreateWindowSurface != null) {
            return eGLSurfaceEglCreateWindowSurface;
        }
        u7.p("surface was null");
        return null;
    }

    public static String i() {
        Matcher matcher = Pattern.compile("OpenGL ES ([0-9]+)\\.([0-9]+).*").matcher(GLES20.glGetString(7938));
        if (!matcher.find()) {
            return "0.0";
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        String strGroup2 = matcher.group(2);
        strGroup2.getClass();
        return vh.m(strGroup, ".", strGroup2);
    }

    public static int j(int i2, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i2);
        b("glCreateShader type=" + i2);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        km0.g("GLUtils");
        GLES20.glDeleteShader(iGlCreateShader);
        io0.i(vh.v(i2, "Could not compile shader type ", ":"), GLES20.glGetShaderInfoLog(iGlCreateShader));
        return 0;
    }
}
