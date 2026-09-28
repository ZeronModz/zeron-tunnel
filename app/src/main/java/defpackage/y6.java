package defpackage;

import android.R;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.media.MediaCodec;
import android.os.Bundle;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AbsSeekBar;
import android.widget.EditText;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.camera2.internal.compat.CameraManagerCompat$CameraManagerCompatImpl;
import androidx.camera.core.CameraX;
import androidx.camera.core.ProcessingException;
import androidx.camera.core.SurfaceOutput;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.processing.SurfaceEdge;
import androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode;
import androidx.camera.video.d;
import androidx.camera.video.internal.encoder.Encoder;
import androidx.camera.video.internal.encoder.EncoderImpl;
import androidx.camera.video.internal.encoder.f;
import androidx.camera.video.j;
import androidx.concurrent.futures.b;
import androidx.constraintlayout.core.PriorityGoalRow;
import androidx.constraintlayout.core.SolverVariable;
import androidx.core.graphics.TypefaceCompat$ResourcesCallbackAdapter;
import androidx.core.graphics.drawable.WrappedDrawable;
import androidx.emoji2.viewsintegration.EmojiEditTextHelper;
import com.google.android.datatransport.runtime.backends.BackendFactory;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.DataCollectionArbiter;
import com.google.firebase.crashlytics.internal.common.e;
import com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.google.firebase.installations.internal.FidListener;
import com.google.firebase.installations.internal.FidListenerHandle;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import com.google.zxing.Result;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitArray;
import com.google.zxing.oned.c;
import com.trilead.ssh2.sftp.ErrorCodes;
import java.util.Objects;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.InvocationTargetException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class y6 implements CameraManagerCompat$CameraManagerCompatImpl, FutureCallback, SuccessContinuation, FidListenerHandle {
    public static final int[] d = {R.attr.indeterminateDrawable, R.attr.progressDrawable};
    public static final int[] e = {1, 1, 2};
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public y6(EditText editText, boolean z) {
        this.a = 14;
        this.b = editText;
        s10 s10Var = new s10(editText, z);
        this.c = s10Var;
        editText.addTextChangedListener(s10Var);
        if (h10.b == null) {
            synchronized (h10.a) {
                try {
                    if (h10.b == null) {
                        h10 h10Var = new h10();
                        try {
                            h10.c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, h10.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        h10.b = h10Var;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(h10.b);
    }

    public static y6 a(Context context) {
        FileChannel channel;
        FileLock fileLockLock;
        try {
            channel = new RandomAccessFile(new File(context.getFilesDir(), "generatefid.lock"), "rw").getChannel();
            try {
                fileLockLock = channel.lock();
                try {
                    return new y6(10, channel, fileLockLock);
                } catch (IOException | Error | OverlappingFileLockException unused) {
                    if (fileLockLock != null) {
                        try {
                            fileLockLock.release();
                        } catch (IOException unused2) {
                        }
                    }
                    if (channel != null) {
                        try {
                            channel.close();
                        } catch (IOException unused3) {
                        }
                    }
                    return null;
                }
            } catch (IOException | Error | OverlappingFileLockException unused4) {
                fileLockLock = null;
            }
        } catch (IOException | Error | OverlappingFileLockException unused5) {
            channel = null;
            fileLockLock = null;
        }
    }

    public y6 b(y6 y6Var) {
        cr0 cr0Var = (cr0) this.b;
        if (!cr0Var.equals((cr0) y6Var.b)) {
            u7.r("ModulusPolys do not have same ModulusGF field");
            return null;
        }
        if (n()) {
            return y6Var;
        }
        if (y6Var.n()) {
            return this;
        }
        int[] iArr = (int[]) this.c;
        int[] iArr2 = (int[]) y6Var.c;
        if (iArr.length <= iArr2.length) {
            iArr2 = iArr;
            iArr = iArr2;
        }
        int[] iArr3 = new int[iArr.length];
        int length = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length);
        for (int i = length; i < iArr.length; i++) {
            iArr3[i] = cr0Var.a(iArr2[i - length], iArr[i]);
        }
        return new y6(cr0Var, iArr3);
    }

    public void c(Object obj, String str) {
        int length = str.length();
        String strValueOf = String.valueOf(obj);
        ((ArrayList) this.b).add(vh.t(new StringBuilder(length + 1 + strValueOf.length()), str, "=", strValueOf));
    }

    public void d(int[] iArr, String str) {
        ((ArrayList) this.b).add(iArr);
        ((ArrayList) this.c).add(str);
    }

    public void e() {
        tj1 tj1Var = (tj1) this.b;
        if (tj1Var != null) {
            ((AtomicBoolean) tj1Var.c).set(true);
            ((ScheduledFuture) tj1Var.b).cancel(true);
        }
        this.b = null;
    }

    public Result f(int i, int i2, BitArray bitArray) throws NotFoundException {
        EnumMap enumMap;
        int[] iArrL = c.l(bitArray, i2, false, e, new int[3]);
        try {
            return ((fk1) this.c).a(i, bitArray, iArrL);
        } catch (ReaderException unused) {
            fk1 fk1Var = (fk1) this.b;
            StringBuilder sb = fk1Var.b;
            sb.setLength(0);
            int[] iArr = fk1Var.a;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            iArr[3] = 0;
            int i3 = bitArray.b;
            int iF = iArrL[1];
            int i4 = 0;
            for (int i5 = 0; i5 < 2 && iF < i3; i5++) {
                int iH = c.h(bitArray, iArr, iF, c.h);
                sb.append((char) ((iH % 10) + 48));
                for (int i6 : iArr) {
                    iF += i6;
                }
                if (iH >= 10) {
                    i4 |= 1 << (1 - i5);
                }
                if (i5 != 1) {
                    iF = bitArray.f(bitArray.e(iF));
                }
            }
            if (sb.length() != 2) {
                throw NotFoundException.getNotFoundInstance();
            }
            if (Integer.parseInt(sb.toString()) % 4 != i4) {
                throw NotFoundException.getNotFoundInstance();
            }
            String string = sb.toString();
            if (string.length() != 2) {
                enumMap = null;
            } else {
                enumMap = new EnumMap(ResultMetadataType.class);
                enumMap.put(ResultMetadataType.ISSUE_NUMBER, Integer.valueOf(string));
            }
            float f = i;
            Result result = new Result(string, null, new ResultPoint[]{new ResultPoint((iArrL[0] + iArrL[1]) / 2.0f, f), new ResultPoint(iF, f)}, BarcodeFormat.UPC_EAN_EXTENSION);
            if (enumMap != null) {
                result.a(enumMap);
            }
            return result;
        }
    }

    public int g(int i) {
        cr0 cr0Var = (cr0) this.b;
        int[] iArr = (int[]) this.c;
        if (i == 0) {
            return j(0);
        }
        if (i == 1) {
            int iA = 0;
            for (int i2 : iArr) {
                iA = cr0Var.a(iA, i2);
            }
            return iA;
        }
        int iA2 = iArr[0];
        int length = iArr.length;
        for (int i3 = 1; i3 < length; i3++) {
            iA2 = cr0Var.a(cr0Var.c(i, iA2), iArr[i3]);
        }
        return iA2;
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompat$CameraManagerCompatImpl
    public CameraCharacteristics getCameraCharacteristics(String str) throws CameraAccessExceptionCompat {
        try {
            return ((CameraManager) this.b).getCameraCharacteristics(str);
        } catch (CameraAccessException e2) {
            throw CameraAccessExceptionCompat.toCameraAccessExceptionCompat(e2);
        }
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompat$CameraManagerCompatImpl
    public String[] getCameraIdList() throws CameraAccessExceptionCompat {
        try {
            return ((CameraManager) this.b).getCameraIdList();
        } catch (CameraAccessException e2) {
            throw CameraAccessExceptionCompat.toCameraAccessExceptionCompat(e2);
        }
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompat$CameraManagerCompatImpl
    public CameraManager getCameraManager() {
        return (CameraManager) this.b;
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompat$CameraManagerCompatImpl
    public Set getConcurrentCameraIds() {
        return Collections.EMPTY_SET;
    }

    public BackendFactory h(String str) {
        PackageManager packageManager;
        ServiceInfo serviceInfo;
        Map map = (Map) this.c;
        if (map == null) {
            Context context = (Context) this.b;
            try {
                packageManager = context.getPackageManager();
            } catch (PackageManager.NameNotFoundException unused) {
            }
            Bundle bundle = (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128)) == null) ? null : serviceInfo.metaData;
            if (bundle == null) {
                map = Collections.EMPTY_MAP;
            } else {
                HashMap map2 = new HashMap();
                for (String str2 : bundle.keySet()) {
                    Object obj = bundle.get(str2);
                    if ((obj instanceof String) && str2.startsWith("backend:")) {
                        for (String str3 : ((String) obj).split(",", -1)) {
                            String strTrim = str3.trim();
                            if (!strTrim.isEmpty()) {
                                map2.put(strTrim, str2.substring(8));
                            }
                        }
                    }
                }
                map = map2;
            }
            this.c = map;
        }
        String str4 = (String) map.get(str);
        if (str4 == null) {
            return null;
        }
        try {
            return (BackendFactory) Class.forName(str4).asSubclass(BackendFactory.class).getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException unused2) {
            StringBuilder sb = new StringBuilder("Class ");
            sb.append(str4);
            sb.append(" is not found.");
            return null;
        } catch (IllegalAccessException unused3) {
            StringBuilder sb2 = new StringBuilder("Could not instantiate ");
            sb2.append(str4);
            sb2.append(".");
            return null;
        } catch (InstantiationException unused4) {
            StringBuilder sb3 = new StringBuilder("Could not instantiate ");
            sb3.append(str4);
            sb3.append(".");
            return null;
        } catch (NoSuchMethodException unused5) {
            "Could not instantiate ".concat(str4);
            return null;
        } catch (InvocationTargetException unused6) {
            "Could not instantiate ".concat(str4);
            return null;
        }
    }

    public qd i(int i) {
        qd qdVar;
        qd qdVar2;
        qd[] qdVarArr = (qd[]) this.c;
        qd qdVar3 = qdVarArr[m(i)];
        if (qdVar3 != null) {
            return qdVar3;
        }
        for (int i2 = 1; i2 < 5; i2++) {
            int iM = m(i) - i2;
            if (iM >= 0 && (qdVar2 = qdVarArr[iM]) != null) {
                return qdVar2;
            }
            int iM2 = m(i) + i2;
            if (iM2 < qdVarArr.length && (qdVar = qdVarArr[iM2]) != null) {
                return qdVar;
            }
        }
        return null;
    }

    public int j(int i) {
        return ((int[]) this.c)[(r1.length - 1) - i];
    }

    public int k() {
        return ((int[]) this.c).length - 1;
    }

    public KeyListener l(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((EmojiEditTextHelper) this.c).a.getClass();
        if (keyListener instanceof m10) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new m10(keyListener);
    }

    public int m(int i) {
        return i - ((pf) this.b).h;
    }

    public boolean n() {
        return ((int[]) this.c)[0] == 0;
    }

    public void o(AttributeSet attributeSet, int i) {
        boolean z = true;
        switch (this.a) {
            case 0:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.b;
                bf1 bf1VarF = bf1.f(absSeekBar.getContext(), attributeSet, d, i, 0);
                Drawable drawableC = bf1VarF.c(0);
                if (drawableC != null) {
                    if (drawableC instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) drawableC;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i2 = 0; i2 < numberOfFrames; i2++) {
                            Drawable drawableZ = z(animationDrawable.getFrame(i2), true);
                            drawableZ.setLevel(10000);
                            animationDrawable2.addFrame(drawableZ, animationDrawable.getDuration(i2));
                        }
                        animationDrawable2.setLevel(10000);
                        drawableC = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(drawableC);
                }
                Drawable drawableC2 = bf1VarF.c(1);
                if (drawableC2 != null) {
                    absSeekBar.setProgressDrawable(z(drawableC2, false));
                }
                bf1VarF.g();
                return;
            default:
                TypedArray typedArrayObtainStyledAttributes = ((EditText) this.b).getContext().obtainStyledAttributes(attributeSet, m11.j, i, 0);
                try {
                    if (typedArrayObtainStyledAttributes.hasValue(14)) {
                        z = typedArrayObtainStyledAttributes.getBoolean(14, true);
                        break;
                    }
                    typedArrayObtainStyledAttributes.recycle();
                    x(z);
                    return;
                } catch (Throwable th) {
                    typedArrayObtainStyledAttributes.recycle();
                    throw th;
                }
        }
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
    public void onFailure(Throwable th) {
        switch (this.a) {
            case 7:
                w91.i();
                gz0 gz0Var = (gz0) this.b;
                ml mlVar = (ml) this.c;
                gz0 gz0Var2 = mlVar.a;
                if (gz0Var == gz0Var2) {
                    int i = gz0Var2.a;
                    km0.g("CaptureNode");
                    mt0 mt0Var = mlVar.f;
                    if (mt0Var != null) {
                        mt0Var.b = null;
                    }
                    mlVar.a = null;
                    return;
                }
                return;
            case 12:
                int i2 = ((SurfaceEdge) this.b).f;
                if (i2 == 2 && (th instanceof CancellationException)) {
                    km0.a("DualSurfaceProcessorNode");
                    return;
                } else {
                    "Downstream node failed to provide Surface. Target: ".concat(xg0.i(i2));
                    km0.h("DualSurfaceProcessorNode");
                    return;
                }
            case 15:
                EncoderImpl encoderImpl = ((f) this.c).k;
                encoderImpl.n.remove((b20) this.b);
                if (!(th instanceof MediaCodec.CodecException)) {
                    encoderImpl.b(0, th.getMessage(), th);
                    return;
                } else {
                    MediaCodec.CodecException codecException = (MediaCodec.CodecException) th;
                    encoderImpl.b(1, codecException.getMessage(), codecException);
                    return;
                }
            case 23:
                throw new IllegalStateException("Future should never fail. Did it get completed by GC?", th);
            case ErrorCodes.SSH_FX_FILE_CORRUPT /* 28 */:
                th.getClass();
                ((b) this.b).d(th);
                return;
            default:
                Objects.toString(th);
                km0.a("Recorder");
                return;
        }
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
    /* JADX INFO: renamed from: onSuccess */
    public void mo18onSuccess(Object obj) {
        Encoder encoder;
        switch (this.a) {
            case 7:
                break;
            case 12:
                SurfaceOutput surfaceOutput = (SurfaceOutput) obj;
                surfaceOutput.getClass();
                try {
                    ((DualSurfaceProcessorNode) this.c).a.onOutputSurface(surfaceOutput);
                } catch (ProcessingException unused) {
                    km0.c("DualSurfaceProcessorNode");
                    return;
                }
                break;
            case 15:
                ((f) this.c).k.n.remove((b20) this.b);
                break;
            case 23:
                ((Surface) this.b).release();
                ((SurfaceTexture) this.c).release();
                break;
            case ErrorCodes.SSH_FX_FILE_CORRUPT /* 28 */:
                ((b) this.b).b((CameraX) this.c);
                break;
            default:
                Encoder encoder2 = (Encoder) obj;
                d dVar = (d) this.c;
                Objects.toString(encoder2);
                km0.a("Recorder");
                if (encoder2 != null) {
                    ScheduledFuture scheduledFuture = dVar.A;
                    if (scheduledFuture != null && scheduledFuture.cancel(false) && (encoder = dVar.t) != null && encoder == encoder2) {
                        d.d(encoder);
                    }
                    dVar.C = (j) this.b;
                    dVar.i(null);
                    dVar.f();
                    break;
                }
                break;
        }
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompat$CameraManagerCompatImpl
    public void openCamera(String str, Executor executor, CameraDevice.StateCallback stateCallback) throws CameraAccessExceptionCompat {
        executor.getClass();
        stateCallback.getClass();
        try {
            ((CameraManager) this.b).openCamera(str, new fi(executor, stateCallback), ((mk) this.c).b);
        } catch (CameraAccessException e2) {
            throw CameraAccessExceptionCompat.toCameraAccessExceptionCompat(e2);
        }
    }

    public y6 p(int i) {
        int[] iArr = (int[]) this.c;
        cr0 cr0Var = (cr0) this.b;
        if (i == 0) {
            return cr0Var.c;
        }
        if (i == 1) {
            return this;
        }
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr2[i2] = cr0Var.c(iArr[i2], i);
        }
        return new y6(cr0Var, iArr2);
    }

    public y6 q(y6 y6Var) {
        cr0 cr0Var = (cr0) this.b;
        if (!cr0Var.equals((cr0) y6Var.b)) {
            u7.r("ModulusPolys do not have same ModulusGF field");
            return null;
        }
        if (n() || y6Var.n()) {
            return cr0Var.c;
        }
        int[] iArr = (int[]) this.c;
        int length = iArr.length;
        int[] iArr2 = (int[]) y6Var.c;
        int length2 = iArr2.length;
        int[] iArr3 = new int[(length + length2) - 1];
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            for (int i3 = 0; i3 < length2; i3++) {
                int i4 = i + i3;
                iArr3[i4] = cr0Var.a(iArr3[i4], cr0Var.c(i2, iArr2[i3]));
            }
        }
        return new y6(cr0Var, iArr3);
    }

    public vp0 r() {
        synchronized (this.c) {
            try {
                vp0 vp0Var = (vp0) this.b;
                if (vp0Var == null) {
                    return null;
                }
                this.b = vp0Var.a;
                return vp0Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompat$CameraManagerCompatImpl
    public void registerAvailabilityCallback(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        hk hkVar;
        if (executor == null) {
            u7.r("executor was null");
            return;
        }
        mk mkVar = (mk) this.c;
        if (availabilityCallback != null) {
            synchronized (mkVar.a) {
                try {
                    hkVar = (hk) mkVar.a.get(availabilityCallback);
                    if (hkVar == null) {
                        hkVar = new hk(executor, availabilityCallback);
                        mkVar.a.put(availabilityCallback, hkVar);
                    }
                } finally {
                }
            }
        } else {
            hkVar = null;
        }
        ((CameraManager) this.b).registerAvailabilityCallback(hkVar, mkVar.b);
    }

    public j10 s(InputConnection inputConnection, EditorInfo editorInfo) {
        InputConnection inputConnection2;
        EmojiEditTextHelper emojiEditTextHelper = (EmojiEditTextHelper) this.c;
        if (inputConnection == null) {
            inputConnection2 = null;
        } else {
            y6 y6Var = emojiEditTextHelper.a;
            y6Var.getClass();
            if (!(inputConnection instanceof j10)) {
                inputConnection = new j10(editorInfo, inputConnection, (EditText) y6Var.b);
            }
            inputConnection2 = inputConnection;
        }
        return (j10) inputConnection2;
    }

    public void t(n80 n80Var) {
        t30 t30Var = (t30) this.c;
        TypefaceCompat$ResourcesCallbackAdapter typefaceCompat$ResourcesCallbackAdapter = (TypefaceCompat$ResourcesCallbackAdapter) this.b;
        int i = n80Var.b;
        if (i != 0) {
            t30Var.execute(new ph(typefaceCompat$ResourcesCallbackAdapter, i, 0));
        } else {
            t30Var.execute(new s33(3, typefaceCompat$ResourcesCallbackAdapter, n80Var.a));
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        Boolean bool = (Boolean) obj;
        e eVar = (e) this.c;
        if (bool.booleanValue()) {
            Logger.b.a(3);
            boolean zBooleanValue = bool.booleanValue();
            DataCollectionArbiter dataCollectionArbiter = eVar.b;
            if (zBooleanValue) {
                dataCollectionArbiter.e.d(null);
                return ((Task) this.b).n(eVar.e.a, new nx2(this, 5));
            }
            dataCollectionArbiter.getClass();
            u7.p("An invalid data collection token was used.");
            return null;
        }
        Logger.b.a(2);
        FileStore fileStore = eVar.g;
        Iterator it = FileStore.e(fileStore.c.listFiles(e.r)).iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
        FileStore fileStore2 = eVar.m.b.b;
        CrashlyticsReportPersistence.a(FileStore.e(fileStore2.e.listFiles()));
        CrashlyticsReportPersistence.a(FileStore.e(fileStore2.f.listFiles()));
        CrashlyticsReportPersistence.a(FileStore.e(fileStore2.g.listFiles()));
        eVar.q.d(null);
        return com.google.android.gms.tasks.b.e(null);
    }

    public String toString() {
        int i = 0;
        switch (this.a) {
            case 11:
                Formatter formatter = new Formatter();
                try {
                    int i2 = 0;
                    for (qd qdVar : (qd[]) this.c) {
                        if (qdVar == null) {
                            formatter.format("%3d:    |   %n", Integer.valueOf(i2));
                            i2++;
                        } else {
                            formatter.format("%3d: %3d|%3d%n", Integer.valueOf(i2), Integer.valueOf(qdVar.f), Integer.valueOf(qdVar.e));
                            i2++;
                        }
                    }
                    String string = formatter.toString();
                    formatter.close();
                    return string;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        try {
                            formatter.close();
                            break;
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
            case ErrorCodes.SSH_FX_FILE_IS_A_DIRECTORY /* 24 */:
                StringBuilder sb = new StringBuilder(k() * 8);
                for (int iK = k(); iK >= 0; iK--) {
                    int iJ = j(iK);
                    if (iJ != 0) {
                        if (iJ < 0) {
                            sb.append(" - ");
                            iJ = -iJ;
                        } else if (sb.length() > 0) {
                            sb.append(" + ");
                        }
                        if (iK == 0 || iJ != 1) {
                            sb.append(iJ);
                        }
                        if (iK != 0) {
                            if (iK == 1) {
                                sb.append('x');
                            } else {
                                sb.append("x^");
                                sb.append(iK);
                            }
                        }
                    }
                }
                return sb.toString();
            case ErrorCodes.SSH_FX_BYTE_RANGE_LOCK_REFUSED /* 26 */:
                StringBuilder sb2 = new StringBuilder(100);
                sb2.append(this.c.getClass().getSimpleName());
                sb2.append('{');
                ArrayList arrayList = (ArrayList) this.b;
                int size = arrayList.size();
                while (i < size) {
                    sb2.append((String) arrayList.get(i));
                    if (i < size - 1) {
                        sb2.append(", ");
                    }
                    i++;
                }
                sb2.append('}');
                return sb2.toString();
            case 27:
                String str = "[ ";
                if (((SolverVariable) this.b) != null) {
                    while (i < 9) {
                        str = str + ((SolverVariable) this.b).i[i] + " ";
                        i++;
                    }
                }
                StringBuilder sbZ = hz.z(str, "] ");
                sbZ.append((SolverVariable) this.b);
                return sbZ.toString();
            default:
                return super.toString();
        }
    }

    public void u() {
        try {
            ((FileLock) this.c).release();
            ((FileChannel) this.b).close();
        } catch (IOException unused) {
        }
    }

    @Override // com.google.firebase.installations.internal.FidListenerHandle
    public void unregister() {
        synchronized (((com.google.firebase.installations.c) this.c)) {
            ((com.google.firebase.installations.c) this.c).j.remove((FidListener) this.b);
        }
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompat$CameraManagerCompatImpl
    public void unregisterAvailabilityCallback(CameraManager.AvailabilityCallback availabilityCallback) {
        hk hkVar;
        if (availabilityCallback != null) {
            mk mkVar = (mk) this.c;
            synchronized (mkVar.a) {
                hkVar = (hk) mkVar.a.remove(availabilityCallback);
            }
        } else {
            hkVar = null;
        }
        if (hkVar != null) {
            hkVar.a();
        }
        ((CameraManager) this.b).unregisterAvailabilityCallback(hkVar);
    }

    public void v(int i) {
        vp0 vp0Var;
        synchronized (this.c) {
            while (true) {
                try {
                    vp0Var = (vp0) this.b;
                    if (vp0Var == null || vp0Var.b != i) {
                        break;
                    }
                    this.b = vp0Var.a;
                    vp0Var.b();
                } finally {
                }
            }
            if (vp0Var != null) {
                vp0 vp0Var2 = vp0Var.a;
                while (vp0Var2 != null) {
                    vp0 vp0Var3 = vp0Var2.a;
                    if (vp0Var2.b == i) {
                        vp0Var.a = vp0Var3;
                        vp0Var2.b();
                    } else {
                        vp0Var = vp0Var2;
                    }
                    vp0Var2 = vp0Var3;
                }
            }
        }
    }

    public void w(vp0 vp0Var) {
        synchronized (this.c) {
            try {
                vp0 vp0Var2 = (vp0) this.b;
                if (vp0Var2 == null) {
                    this.b = vp0Var;
                    return;
                }
                while (true) {
                    vp0 vp0Var3 = vp0Var2.a;
                    if (vp0Var3 == null) {
                        vp0Var2.a = vp0Var;
                        return;
                    }
                    vp0Var2 = vp0Var3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void x(boolean z) {
        s10 s10Var = (s10) ((EmojiEditTextHelper) this.c).a.c;
        if (s10Var.d != z) {
            if (s10Var.c != null) {
                b10 b10VarA = b10.a();
                r10 r10Var = s10Var.c;
                b10VarA.getClass();
                jx0.f(r10Var, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = b10VarA.a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    b10VarA.b.remove(r10Var);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            s10Var.d = z;
            if (z) {
                s10.a(s10Var.a, b10.a().b());
            }
        }
    }

    public y6 y(y6 y6Var) {
        if (!((cr0) this.b).equals((cr0) y6Var.b)) {
            u7.r("ModulusPolys do not have same ModulusGF field");
            return null;
        }
        if (y6Var.n()) {
            return this;
        }
        int[] iArr = (int[]) y6Var.c;
        int length = iArr.length;
        int[] iArr2 = new int[length];
        int i = 0;
        while (true) {
            cr0 cr0Var = (cr0) y6Var.b;
            if (i >= length) {
                return b(new y6(cr0Var, iArr2));
            }
            int i2 = iArr[i];
            cr0Var.getClass();
            iArr2[i] = (929 - i2) % 929;
            i++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable z(Drawable drawable, boolean z) {
        if (drawable instanceof WrappedDrawable) {
            WrappedDrawable wrappedDrawable = (WrappedDrawable) drawable;
            Drawable wrappedDrawable2 = wrappedDrawable.getWrappedDrawable();
            if (wrappedDrawable2 != null) {
                wrappedDrawable.setWrappedDrawable(z(wrappedDrawable2, z));
                return drawable;
            }
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i = 0; i < numberOfLayers; i++) {
                    int id = layerDrawable.getId(i);
                    drawableArr[i] = z(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i2 = 0; i2 < numberOfLayers; i2++) {
                    layerDrawable2.setId(i2, layerDrawable.getId(i2));
                    layerDrawable2.setLayerGravity(i2, layerDrawable.getLayerGravity(i2));
                    layerDrawable2.setLayerWidth(i2, layerDrawable.getLayerWidth(i2));
                    layerDrawable2.setLayerHeight(i2, layerDrawable.getLayerHeight(i2));
                    layerDrawable2.setLayerInsetLeft(i2, layerDrawable.getLayerInsetLeft(i2));
                    layerDrawable2.setLayerInsetRight(i2, layerDrawable.getLayerInsetRight(i2));
                    layerDrawable2.setLayerInsetTop(i2, layerDrawable.getLayerInsetTop(i2));
                    layerDrawable2.setLayerInsetBottom(i2, layerDrawable.getLayerInsetBottom(i2));
                    layerDrawable2.setLayerInsetStart(i2, layerDrawable.getLayerInsetStart(i2));
                    layerDrawable2.setLayerInsetEnd(i2, layerDrawable.getLayerInsetEnd(i2));
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (((Bitmap) this.c) == null) {
                    this.c = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }

    public /* synthetic */ y6(int i, Object obj, boolean z) {
        this.a = i;
        this.b = obj;
        this.c = null;
    }

    public /* synthetic */ y6(int i, boolean z) {
        this.a = i;
    }

    public /* synthetic */ y6(Object obj, int i) {
        this.a = i;
        this.c = obj;
        this.b = null;
    }

    public /* synthetic */ y6(Object obj, int i, Object obj2, boolean z) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public /* synthetic */ y6(Object obj) {
        this.a = 26;
        this.c = obj;
        this.b = new ArrayList();
    }

    public y6(int i) {
        this.a = i;
        switch (i) {
            case 13:
                this.b = new ArrayList();
                this.c = new ArrayList();
                break;
            case 21:
                this.c = new Object();
                break;
            default:
                this.b = new fk1(1);
                this.c = new fk1(0);
                break;
        }
    }

    public y6(cr0 cr0Var, int[] iArr) {
        this.a = 24;
        if (iArr.length != 0) {
            this.b = cr0Var;
            int length = iArr.length;
            int i = 1;
            if (length > 1 && iArr[0] == 0) {
                while (i < length && iArr[i] == 0) {
                    i++;
                }
                if (i == length) {
                    this.c = new int[]{0};
                    return;
                }
                int i2 = length - i;
                int[] iArr2 = new int[i2];
                this.c = iArr2;
                System.arraycopy(iArr, i, iArr2, 0, i2);
                return;
            }
            this.c = iArr;
            return;
        }
        s31.c();
        throw null;
    }

    public y6(pf pfVar) {
        this.a = 11;
        this.b = new pf(pfVar);
        this.c = new qd[(pfVar.i - pfVar.h) + 1];
    }

    public y6(PriorityGoalRow priorityGoalRow) {
        this.a = 27;
        this.c = priorityGoalRow;
    }

    public y6(Context context, mk mkVar) {
        this.a = 6;
        this.b = (CameraManager) context.getSystemService("camera");
        this.c = mkVar;
    }

    public y6(AbsSeekBar absSeekBar) {
        this.a = 0;
        this.b = absSeekBar;
    }

    public y6(EditText editText) {
        this.a = 2;
        this.b = editText;
        this.c = new EmojiEditTextHelper(editText, false);
    }

    public y6(ArrayList arrayList, ArrayList arrayList2) {
        this.a = 19;
        int size = arrayList.size();
        this.b = new int[size];
        this.c = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.b)[i] = ((Integer) arrayList.get(i)).intValue();
            ((float[]) this.c)[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public y6(int i, int i2) {
        this.a = 19;
        this.b = new int[]{i, i2};
        this.c = new float[]{0.0f, 1.0f};
    }

    public y6(int i, int i2, int i3) {
        this.a = 19;
        this.b = new int[]{i, i2, i3};
        this.c = new float[]{0.0f, 0.5f, 1.0f};
    }

    public /* synthetic */ y6(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public y6(nj0 nj0Var, nj0 nj0Var2) {
        this.a = 8;
        jx0.a(nj0Var.a <= nj0Var2.a);
        this.b = nj0Var;
        this.c = nj0Var2;
    }
}
