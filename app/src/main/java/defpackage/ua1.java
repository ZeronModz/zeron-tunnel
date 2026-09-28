package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.util.Range;
import android.util.Size;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ImageCaptureConfig;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.a;
import androidx.camera.core.impl.b;
import androidx.camera.core.impl.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ua1 {
    public static final xa a = new xa("camera2.streamSpec.streamUseCase", Long.TYPE, null);
    public static final HashMap b;
    public static final HashMap c;

    static {
        HashMap map = new HashMap();
        b = map;
        HashMap map2 = new HashMap();
        c = map2;
        if (Build.VERSION.SDK_INT >= 33) {
            HashSet hashSet = new HashSet();
            UseCaseConfigFactory.CaptureType captureType = UseCaseConfigFactory.CaptureType.PREVIEW;
            hashSet.add(captureType);
            UseCaseConfigFactory.CaptureType captureType2 = UseCaseConfigFactory.CaptureType.METERING_REPEATING;
            hashSet.add(captureType2);
            map.put(4L, hashSet);
            HashSet hashSet2 = new HashSet();
            hashSet2.add(captureType);
            hashSet2.add(captureType2);
            hashSet2.add(UseCaseConfigFactory.CaptureType.IMAGE_ANALYSIS);
            map.put(1L, hashSet2);
            HashSet hashSet3 = new HashSet();
            UseCaseConfigFactory.CaptureType captureType3 = UseCaseConfigFactory.CaptureType.IMAGE_CAPTURE;
            hashSet3.add(captureType3);
            map.put(2L, hashSet3);
            HashSet hashSet4 = new HashSet();
            UseCaseConfigFactory.CaptureType captureType4 = UseCaseConfigFactory.CaptureType.VIDEO_CAPTURE;
            hashSet4.add(captureType4);
            map.put(3L, hashSet4);
            HashSet hashSet5 = new HashSet();
            hashSet5.add(captureType);
            hashSet5.add(captureType3);
            hashSet5.add(captureType4);
            map2.put(4L, hashSet5);
            HashSet hashSet6 = new HashSet();
            hashSet6.add(captureType);
            hashSet6.add(captureType4);
            map2.put(3L, hashSet6);
        }
    }

    public static boolean a(rj rjVar, List list) {
        long[] jArr;
        if (Build.VERSION.SDK_INT >= 33 && (jArr = (long[]) rjVar.a(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES)) != null && jArr.length != 0) {
            HashSet hashSet = new HashSet();
            for (long j : jArr) {
                hashSet.add(Long.valueOf(j));
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!hashSet.contains(Long.valueOf(((uc) ((fc1) it.next())).c))) {
                }
            }
            return true;
        }
        return false;
    }

    public static Camera2ImplConfig b(Config config, long j) {
        xa xaVar = a;
        if (config.containsOption(xaVar) && ((Long) config.retrieveOption(xaVar)).longValue() == j) {
            return null;
        }
        k kVarC = k.c(config);
        kVarC.insertOption(xaVar, Long.valueOf(j));
        return new Camera2ImplConfig(kVarC);
    }

    public static boolean c(UseCaseConfigFactory.CaptureType captureType, long j, List list) {
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        if (captureType != UseCaseConfigFactory.CaptureType.STREAM_SHARING) {
            Long lValueOf = Long.valueOf(j);
            HashMap map = b;
            return map.containsKey(lValueOf) && ((Set) map.get(Long.valueOf(j))).contains(captureType);
        }
        Long lValueOf2 = Long.valueOf(j);
        HashMap map2 = c;
        if (!map2.containsKey(lValueOf2)) {
            return false;
        }
        Set set = (Set) map2.get(Long.valueOf(j));
        if (list.size() != set.size()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!set.contains((UseCaseConfigFactory.CaptureType) it.next())) {
                return false;
            }
        }
        return true;
    }

    public static boolean d(rj rjVar) {
        long[] jArr;
        return (Build.VERSION.SDK_INT < 33 || (jArr = (long[]) rjVar.a(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES)) == null || jArr.length == 0) ? false : true;
    }

    public static boolean e(Config config, UseCaseConfigFactory.CaptureType captureType) {
        if (((Boolean) config.retrieveOption(UseCaseConfig.OPTION_ZSL_DISABLED, Boolean.FALSE)).booleanValue()) {
            return false;
        }
        xa xaVar = ImageCaptureConfig.b;
        if (config.containsOption(xaVar)) {
            return zd1.a[captureType.ordinal()] == 1 && ((Integer) config.retrieveOption(xaVar)).intValue() == 2;
        }
        return false;
    }

    public static boolean f(rj rjVar, List list, HashMap map, HashMap map2) {
        boolean z;
        boolean z2;
        if (Build.VERSION.SDK_INT >= 33) {
            ArrayList<UseCaseConfig> arrayList = new ArrayList(map.keySet());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((b) ((a) it.next())).f.getClass();
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                StreamSpec streamSpec = (StreamSpec) map.get((UseCaseConfig) it2.next());
                streamSpec.getClass();
                streamSpec.c().getClass();
            }
            long[] jArr = (long[]) rjVar.a(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES);
            if (jArr != null && jArr.length != 0) {
                HashSet hashSet = new HashSet();
                for (long j : jArr) {
                    hashSet.add(Long.valueOf(j));
                }
                HashSet hashSet2 = new HashSet();
                Iterator it3 = list.iterator();
                if (it3.hasNext()) {
                    a aVar = (a) it3.next();
                    Config config = ((b) aVar).f;
                    xa xaVar = Camera2ImplConfig.c;
                    if (config.containsOption(xaVar) && ((Long) ((b) aVar).f.retrieveOption(xaVar)).longValue() != 0) {
                        z2 = false;
                        z = true;
                    } else {
                        z = false;
                        z2 = true;
                    }
                } else {
                    z = false;
                    z2 = false;
                }
                for (UseCaseConfig useCaseConfig : arrayList) {
                    xa xaVar2 = Camera2ImplConfig.c;
                    if (useCaseConfig.containsOption(xaVar2)) {
                        Long l = (Long) useCaseConfig.retrieveOption(xaVar2);
                        if (l.longValue() != 0) {
                            if (z2) {
                                u7.r("Either all use cases must have non-default stream use case assigned or none should have it");
                                return false;
                            }
                            hashSet2.add(l);
                            z = true;
                        } else if (z) {
                            u7.r("Either all use cases must have non-default stream use case assigned or none should have it");
                            return false;
                        }
                    } else if (z) {
                        u7.r("Either all use cases must have non-default stream use case assigned or none should have it");
                        return false;
                    }
                    z2 = true;
                }
                if (!z2) {
                    Iterator it4 = hashSet2.iterator();
                    while (it4.hasNext()) {
                        if (!hashSet.contains((Long) it4.next())) {
                        }
                    }
                    Iterator it5 = list.iterator();
                    while (it5.hasNext()) {
                        a aVar2 = (a) it5.next();
                        Config config2 = ((b) aVar2).f;
                        Camera2ImplConfig camera2ImplConfigB = b(config2, ((Long) config2.retrieveOption(Camera2ImplConfig.c)).longValue());
                        if (camera2ImplConfigB != null) {
                            b bVar = (b) aVar2;
                            Size size = bVar.c;
                            Range range = StreamSpec.a;
                            if (size == null) {
                                io0.e("Null resolution");
                                return false;
                            }
                            Range range2 = StreamSpec.a;
                            if (range2 == null) {
                                io0.e("Null expectedFrameRateRange");
                                return false;
                            }
                            if (DynamicRange.d == null) {
                                io0.e("Null dynamicRange");
                                return false;
                            }
                            DynamicRange dynamicRange = bVar.d;
                            if (dynamicRange == null) {
                                io0.e("Null dynamicRange");
                                return false;
                            }
                            Range range3 = bVar.g;
                            map2.put(aVar2, new sc(size, dynamicRange, range3 != null ? range3 : range2, camera2ImplConfigB, false));
                        }
                    }
                    for (UseCaseConfig useCaseConfig2 : arrayList) {
                        StreamSpec streamSpec2 = (StreamSpec) map.get(useCaseConfig2);
                        Config configC = streamSpec2.c();
                        Camera2ImplConfig camera2ImplConfigB2 = b(configC, ((Long) configC.retrieveOption(Camera2ImplConfig.c)).longValue());
                        if (camera2ImplConfigB2 != null) {
                            rc rcVarF = streamSpec2.f();
                            rcVarF.d = camera2ImplConfigB2;
                            map.put(useCaseConfig2, rcVarF.a());
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }
}
