package defpackage;

import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class c40 {
    public static final o40[] b;
    public static final o40[][] c;
    public static final HashSet d;
    public final ArrayList a;

    static {
        o40[] o40VarArr = {new o40("ImageWidth", 256, 3, 4), new o40("ImageLength", 257, 3, 4), new o40("Make", 271, 2), new o40("Model", 272, 2), new o40("Orientation", 274, 3), new o40("XResolution", 282, 5), new o40("YResolution", 283, 5), new o40("ResolutionUnit", 296, 3), new o40("Software", 305, 2), new o40("DateTime", 306, 2), new o40("YCbCrPositioning", 531, 3), new o40("SubIFDPointer", 330, 4), new o40("ExifIFDPointer", 34665, 4), new o40("GPSInfoIFDPointer", 34853, 4)};
        o40[] o40VarArr2 = {new o40("ExposureTime", 33434, 5), new o40("FNumber", 33437, 5), new o40("ExposureProgram", 34850, 3), new o40("PhotographicSensitivity", 34855, 3), new o40("SensitivityType", 34864, 3), new o40("ExifVersion", 36864, 2), new o40("DateTimeOriginal", 36867, 2), new o40("DateTimeDigitized", 36868, 2), new o40("ComponentsConfiguration", 37121, 7), new o40("ShutterSpeedValue", 37377, 10), new o40("ApertureValue", 37378, 5), new o40("BrightnessValue", 37379, 10), new o40("ExposureBiasValue", 37380, 10), new o40("MaxApertureValue", 37381, 5), new o40("MeteringMode", 37383, 3), new o40("LightSource", 37384, 3), new o40("Flash", 37385, 3), new o40("FocalLength", 37386, 5), new o40("SubSecTime", 37520, 2), new o40("SubSecTimeOriginal", 37521, 2), new o40("SubSecTimeDigitized", 37522, 2), new o40("FlashpixVersion", 40960, 7), new o40("ColorSpace", 40961, 3), new o40("PixelXDimension", 40962, 3, 4), new o40("PixelYDimension", 40963, 3, 4), new o40("InteroperabilityIFDPointer", 40965, 4), new o40("FocalPlaneResolutionUnit", 41488, 3), new o40("SensingMethod", 41495, 3), new o40("FileSource", 41728, 7), new o40("SceneType", 41729, 7), new o40("CustomRendered", 41985, 3), new o40("ExposureMode", 41986, 3), new o40("WhiteBalance", 41987, 3), new o40("SceneCaptureType", 41990, 3), new o40("Contrast", 41992, 3), new o40("Saturation", 41993, 3), new o40("Sharpness", 41994, 3)};
        o40[] o40VarArr3 = {new o40("GPSVersionID", 0, 1), new o40("GPSLatitudeRef", 1, 2), new o40("GPSLatitude", 2, 5, 10), new o40("GPSLongitudeRef", 3, 2), new o40("GPSLongitude", 4, 5, 10), new o40("GPSAltitudeRef", 5, 1), new o40("GPSAltitude", 6, 5), new o40("GPSTimeStamp", 7, 5), new o40("GPSSpeedRef", 12, 2), new o40("GPSTrackRef", 14, 2), new o40("GPSImgDirectionRef", 16, 2), new o40("GPSDestBearingRef", 23, 2), new o40("GPSDestDistanceRef", 25, 2)};
        b = new o40[]{new o40("SubIFDPointer", 330, 4), new o40("ExifIFDPointer", 34665, 4), new o40("GPSInfoIFDPointer", 34853, 4), new o40("InteroperabilityIFDPointer", 40965, 4)};
        c = new o40[][]{o40VarArr, o40VarArr2, o40VarArr3, new o40[]{new o40("InteroperabilityIndex", 1, 2)}};
        d = new HashSet(Arrays.asList("FNumber", "ExposureTime", "GPSTimeStamp"));
    }

    public c40(ArrayList arrayList) {
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        jx0.g("Malformed attributes list. Number of IFDs mismatch.", arrayList.size() == 4);
        this.a = arrayList;
    }

    public final Map a(int i) {
        jx0.d(i, 0, hz.p(i, "Invalid IFD index: ", ". Index should be between [0, EXIF_TAGS.length] "), 4);
        return (Map) this.a.get(i);
    }
}
