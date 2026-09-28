package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.ExposureState;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.impl.EncoderProfilesProvider;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.processing.Operation;
import androidx.camera.core.processing.Packet;
import androidx.camera.video.d;
import androidx.camera.video.internal.encoder.EncodeException;
import androidx.camera.video.internal.encoder.EncodedData;
import androidx.camera.video.internal.encoder.EncoderCallback;
import androidx.camera.video.internal.encoder.OutputConfig;
import androidx.collection.SparseArrayCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.widget.FocusStrategy$BoundsAdapter;
import androidx.customview.widget.FocusStrategy$CollectionAdapter;
import androidx.datastore.preferences.protobuf.DescriptorProtos$FieldDescriptorProto$Label;
import androidx.datastore.preferences.protobuf.DescriptorProtos$FieldDescriptorProto$Type;
import androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptions$CType;
import androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptions$JSType;
import androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptions$OptionRetention;
import androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptions$OptionTargetType;
import androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptions$OptimizeMode;
import androidx.datastore.preferences.protobuf.DescriptorProtos$GeneratedCodeInfo$Annotation$Semantic;
import androidx.datastore.preferences.protobuf.DescriptorProtos$MethodOptions$IdempotencyLevel;
import androidx.datastore.preferences.protobuf.Field$Cardinality;
import androidx.datastore.preferences.protobuf.Field$Kind;
import androidx.datastore.preferences.protobuf.Internal$EnumLite;
import androidx.datastore.preferences.protobuf.Internal$EnumLiteMap;
import androidx.datastore.preferences.protobuf.JavaFeaturesProto$JavaFeatures$Utf8Validation;
import androidx.datastore.preferences.protobuf.NullValue;
import androidx.profileinstaller.ProfileInstaller$DiagnosticsCallback;
import com.google.firebase.heartbeatinfo.HeartBeatConsumer;
import com.trilead.ssh2.sftp.ErrorCodes;
import java.util.Objects;
import java.io.IOException;
import kotlin.time.Clock;
import kotlin.time.Instant;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class ww implements Internal$EnumLiteMap, EncoderCallback, EncoderProfilesProvider, FocusStrategy$BoundsAdapter, FocusStrategy$CollectionAdapter, HeartBeatConsumer, Clock, Operation, ProfileInstaller$DiagnosticsCallback, FutureCallback, ExposureState {
    public final /* synthetic */ int a;

    public ww(d dVar) {
        this.a = 27;
    }

    public float a(float f, float f2) {
        return 1.0f;
    }

    @Override // androidx.camera.core.processing.Operation
    public Object apply(Object obj) throws ImageCaptureException {
        switch (this.a) {
            case 18:
                Packet packet = (Packet) obj;
                Rect rectB = packet.b();
                byte[] bArr = (byte[]) packet.c();
                try {
                    Bitmap bitmapDecodeRegion = BitmapRegionDecoder.newInstance(bArr, 0, bArr.length, false).decodeRegion(rectB, new BitmapFactory.Options());
                    w30 w30VarD = packet.d();
                    Objects.requireNonNull(w30VarD);
                    Rect rect = new Rect(0, 0, bitmapDecodeRegion.getWidth(), bitmapDecodeRegion.getHeight());
                    int iF = packet.f();
                    Matrix matrixG = packet.g();
                    RectF rectF = cg1.a;
                    Matrix matrix = new Matrix(matrixG);
                    matrix.postTranslate(-rectB.left, -rectB.top);
                    return new cc(bitmapDecodeRegion, w30VarD, 42, new Size(bitmapDecodeRegion.getWidth(), bitmapDecodeRegion.getHeight()), rect, iF, matrix, packet.a());
                } catch (IOException e) {
                    throw new ImageCaptureException(1, "Failed to decode JPEG.", e);
                }
            default:
                throw null;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Internal$EnumLiteMap
    public Internal$EnumLite findValueByNumber(int i) {
        switch (this.a) {
            case 0:
                return DescriptorProtos$FieldDescriptorProto$Label.forNumber(i);
            case 1:
                return DescriptorProtos$FieldDescriptorProto$Type.forNumber(i);
            case 2:
                return DescriptorProtos$FieldOptions$CType.forNumber(i);
            case 3:
                return DescriptorProtos$FieldOptions$JSType.forNumber(i);
            case 4:
                return DescriptorProtos$FieldOptions$OptionRetention.forNumber(i);
            case 5:
                return DescriptorProtos$FieldOptions$OptionTargetType.forNumber(i);
            case 6:
                return DescriptorProtos$FileOptions$OptimizeMode.forNumber(i);
            case 7:
                return DescriptorProtos$GeneratedCodeInfo$Annotation$Semantic.forNumber(i);
            case 8:
                return DescriptorProtos$MethodOptions$IdempotencyLevel.forNumber(i);
            case 9:
            case 10:
            case 11:
            case 12:
            case 15:
            case 16:
            default:
                return NullValue.forNumber(i);
            case 13:
                return Field$Cardinality.forNumber(i);
            case 14:
                return Field$Kind.forNumber(i);
            case 17:
                return JavaFeaturesProto$JavaFeatures$Utf8Validation.forNumber(i);
        }
    }

    @Override // androidx.customview.widget.FocusStrategy$CollectionAdapter
    public Object get(Object obj, int i) {
        return (AccessibilityNodeInfoCompat) ((SparseArrayCompat) obj).e(i);
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public EncoderProfilesProxy getAll(int i) {
        return null;
    }

    @Override // androidx.camera.core.ExposureState
    public int getExposureCompensationIndex() {
        return 0;
    }

    @Override // androidx.camera.core.ExposureState
    public Range getExposureCompensationRange() {
        return new Range(0, 0);
    }

    @Override // androidx.camera.core.ExposureState
    public Rational getExposureCompensationStep() {
        return Rational.ZERO;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public boolean hasProfile(int i) {
        return false;
    }

    @Override // androidx.camera.core.ExposureState
    public boolean isExposureCompensationSupported() {
        return false;
    }

    @Override // kotlin.time.Clock
    public Instant now() {
        java.time.Instant instantNow = java.time.Instant.now();
        instantNow.getClass();
        Instant.Companion companion = Instant.INSTANCE;
        long epochSecond = instantNow.getEpochSecond();
        int nano = instantNow.getNano();
        companion.getClass();
        return Instant.Companion.a(nano, epochSecond);
    }

    @Override // androidx.customview.widget.FocusStrategy$BoundsAdapter
    public void obtainBounds(Object obj, Rect rect) {
        ((AccessibilityNodeInfoCompat) obj).f(rect);
    }

    @Override // androidx.profileinstaller.ProfileInstaller$DiagnosticsCallback
    public void onDiagnosticReceived(int i, Object obj) {
        int i2 = this.a;
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
    public void onFailure(Throwable th) {
        jx0.g("In-progress recording shouldn't be null", false);
        throw null;
    }

    @Override // androidx.profileinstaller.ProfileInstaller$DiagnosticsCallback
    public void onResultReceived(int i, Object obj) {
        switch (this.a) {
            case ErrorCodes.SSH_FX_FILE_IS_A_DIRECTORY /* 24 */:
                break;
            default:
                if (i == 6 || i == 7 || i == 8) {
                }
                break;
        }
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
    /* JADX INFO: renamed from: onSuccess */
    public void mo18onSuccess(Object obj) {
        km0.a("Recorder");
        throw new AssertionError("Attempted to finalize in-progress recording, but no recording is in progress.");
    }

    @Override // androidx.customview.widget.FocusStrategy$CollectionAdapter
    public int size(Object obj) {
        return ((SparseArrayCompat) obj).d();
    }

    public /* synthetic */ ww(int i) {
        this.a = i;
    }

    @Override // androidx.camera.video.internal.encoder.EncoderCallback
    public void onEncodePaused() {
    }

    @Override // androidx.camera.video.internal.encoder.EncoderCallback
    public void onEncodeStart() {
    }

    @Override // androidx.camera.video.internal.encoder.EncoderCallback
    public void onEncodeStop() {
    }

    @Override // androidx.camera.video.internal.encoder.EncoderCallback
    public void onEncodeError(EncodeException encodeException) {
    }

    @Override // androidx.camera.video.internal.encoder.EncoderCallback
    public void onEncodedData(EncodedData encodedData) {
    }

    @Override // androidx.camera.video.internal.encoder.EncoderCallback
    public void onOutputConfigUpdate(OutputConfig outputConfig) {
    }

    private final void b(int i, Object obj) {
    }

    private final void c(int i, Object obj) {
    }

    private final void d(int i, Object obj) {
    }
}
