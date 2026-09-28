package defpackage;

import androidx.webkit.internal.ConditionallySupportedFeature;
import java.util.HashSet;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class q5 implements ConditionallySupportedFeature {
    public static final HashSet c = new HashSet();
    public final String a;
    public final String b;

    public q5(String str, String str2) {
        this.a = str;
        this.b = str2;
        c.add(this);
    }

    public abstract boolean a();

    public boolean b() {
        return BoundaryInterfaceReflectionUtil.containsFeature(o5.a, this.b);
    }

    @Override // androidx.webkit.internal.ConditionallySupportedFeature
    public final String getPublicFeatureName() {
        return this.a;
    }

    @Override // androidx.webkit.internal.ConditionallySupportedFeature
    public final boolean isSupported() {
        return a() || b();
    }
}
