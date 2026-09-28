package defpackage;

import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.gms.internal.consent_sdk.zzdo;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class x1 implements zzdo {
    public final Object a;

    public /* synthetic */ x1(Object obj) {
        this.a = obj;
    }

    public static x1 a(int i, int i2, int i3) {
        return new x1(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, false, i3));
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdt, com.google.android.gms.internal.consent_sdk.zzds
    public Object zza() {
        return this.a;
    }
}
