package defpackage;

import android.util.Size;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.EncoderProfilesProvider;
import androidx.camera.core.impl.Quirks;
import androidx.camera.video.CapabilitiesByQuality;
import androidx.camera.video.VideoCapabilities;
import androidx.camera.video.internal.BackupHdrProfileEncoderProfilesProvider;
import androidx.camera.video.internal.DynamicRangeMatchedEncoderProfilesProvider;
import androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy;
import androidx.camera.video.internal.workaround.QualityAddedEncoderProfilesProvider;
import androidx.camera.video.internal.workaround.QualityResolutionModifiedEncoderProfilesProvider;
import androidx.camera.video.internal.workaround.QualityValidatedEncoderProfilesProvider;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class w11 implements VideoCapabilities {
    public final QualityValidatedEncoderProfilesProvider a;
    public final boolean b;
    public final HashMap c;
    public final HashMap d;

    public w11(CameraInfoInternal cameraInfoInternal) {
        oi oiVar = rm1.d;
        this.c = new HashMap();
        this.d = new HashMap();
        EncoderProfilesProvider encoderProfilesProvider = cameraInfoInternal.getEncoderProfilesProvider();
        Quirks quirks = nx.a;
        EncoderProfilesProvider qualityResolutionModifiedEncoderProfilesProvider = new QualityResolutionModifiedEncoderProfilesProvider(new QualityAddedEncoderProfilesProvider(encoderProfilesProvider, quirks, cameraInfoInternal, oiVar), quirks);
        Iterator<DynamicRange> it = cameraInfoInternal.getSupportedDynamicRanges().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            DynamicRange next = it.next();
            Integer numValueOf = Integer.valueOf(next.a);
            int i = next.b;
            if (numValueOf.equals(3) && i == 10) {
                qualityResolutionModifiedEncoderProfilesProvider = new BackupHdrProfileEncoderProfilesProvider(qualityResolutionModifiedEncoderProfilesProvider, oiVar);
                break;
            }
        }
        this.a = new QualityValidatedEncoderProfilesProvider(qualityResolutionModifiedEncoderProfilesProvider, cameraInfoInternal, quirks);
        for (DynamicRange dynamicRange : cameraInfoInternal.getSupportedDynamicRanges()) {
            CapabilitiesByQuality capabilitiesByQuality = new CapabilitiesByQuality(new DynamicRangeMatchedEncoderProfilesProvider(this.a, dynamicRange));
            if (!new ArrayList(capabilitiesByQuality.a.keySet()).isEmpty()) {
                this.c.put(dynamicRange, capabilitiesByQuality);
            }
        }
        this.b = cameraInfoInternal.isVideoStabilizationSupported();
    }

    public final CapabilitiesByQuality a(DynamicRange dynamicRange) {
        Object next;
        boolean zContains;
        boolean zB = dynamicRange.b();
        HashMap map = this.c;
        if (zB) {
            return (CapabilitiesByQuality) map.get(dynamicRange);
        }
        HashMap map2 = this.d;
        if (map2.containsKey(dynamicRange)) {
            return (CapabilitiesByQuality) map2.get(dynamicRange);
        }
        Set setKeySet = map.keySet();
        setKeySet.getClass();
        if (dynamicRange.b()) {
            zContains = setKeySet.contains(dynamicRange);
        } else {
            Iterator it = setKeySet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                DynamicRange dynamicRange2 = (DynamicRange) next;
                jx0.g("Fully specified range is not actually fully specified.", dynamicRange2.b());
                int i = dynamicRange.b;
                if (i == 0 || i == dynamicRange2.b) {
                    jx0.g("Fully specified range is not actually fully specified.", dynamicRange2.b());
                    int i2 = dynamicRange.a;
                    if (i2 != 0) {
                        int i3 = dynamicRange2.a;
                        if ((i2 == 2 && i3 != 1) || i2 == i3) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            zContains = next != null;
        }
        CapabilitiesByQuality capabilitiesByQuality = zContains ? new CapabilitiesByQuality(new DynamicRangeMatchedEncoderProfilesProvider(this.a, dynamicRange)) : null;
        map2.put(dynamicRange, capabilitiesByQuality);
        return capabilitiesByQuality;
    }

    @Override // androidx.camera.video.VideoCapabilities
    public final VideoValidatedEncoderProfilesProxy findNearestHigherSupportedEncoderProfilesFor(Size size, DynamicRange dynamicRange) {
        CapabilitiesByQuality capabilitiesByQualityA = a(dynamicRange);
        if (capabilitiesByQualityA == null) {
            return null;
        }
        return capabilitiesByQualityA.a(size);
    }

    @Override // androidx.camera.video.VideoCapabilities
    public final b01 findNearestHigherSupportedQualityFor(Size size, DynamicRange dynamicRange) {
        Object value;
        CapabilitiesByQuality capabilitiesByQualityA = a(dynamicRange);
        if (capabilitiesByQualityA == null) {
            return b01.g;
        }
        TreeMap treeMap = capabilitiesByQualityA.b;
        Size size2 = p81.a;
        Map.Entry entryCeilingEntry = treeMap.ceilingEntry(size);
        if (entryCeilingEntry != null) {
            value = entryCeilingEntry.getValue();
        } else {
            Map.Entry entryFloorEntry = treeMap.floorEntry(size);
            value = entryFloorEntry != null ? entryFloorEntry.getValue() : null;
        }
        b01 b01Var = (b01) value;
        return b01Var != null ? b01Var : b01.g;
    }

    @Override // androidx.camera.video.VideoCapabilities
    public final VideoValidatedEncoderProfilesProxy getProfiles(b01 b01Var, DynamicRange dynamicRange) {
        CapabilitiesByQuality capabilitiesByQualityA = a(dynamicRange);
        if (capabilitiesByQualityA == null) {
            return null;
        }
        return capabilitiesByQualityA.b(b01Var);
    }

    @Override // androidx.camera.video.VideoCapabilities
    public final Set getSupportedDynamicRanges() {
        return this.c.keySet();
    }

    @Override // androidx.camera.video.VideoCapabilities
    public final List getSupportedQualities(DynamicRange dynamicRange) {
        CapabilitiesByQuality capabilitiesByQualityA = a(dynamicRange);
        return capabilitiesByQualityA == null ? new ArrayList() : new ArrayList(capabilitiesByQualityA.a.keySet());
    }

    @Override // androidx.camera.video.VideoCapabilities
    public final boolean isQualitySupported(b01 b01Var, DynamicRange dynamicRange) {
        CapabilitiesByQuality capabilitiesByQualityA = a(dynamicRange);
        if (capabilitiesByQualityA == null) {
            return false;
        }
        jx0.b(b01.h.contains(b01Var), "Unknown quality: " + b01Var);
        return capabilitiesByQualityA.b(b01Var) != null;
    }

    @Override // androidx.camera.video.VideoCapabilities
    public final boolean isStabilizationSupported() {
        return this.b;
    }
}
