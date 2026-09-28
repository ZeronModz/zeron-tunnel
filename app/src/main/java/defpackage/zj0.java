package defpackage;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleFragment;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zj0 {
    public final LifecycleFragment a;

    public zj0(LifecycleFragment lifecycleFragment) {
        this.a = lifecycleFragment;
    }

    public final Activity a() {
        Activity lifecycleActivity = this.a.getLifecycleActivity();
        yg0.m(lifecycleActivity);
        return lifecycleActivity;
    }

    public abstract void b(Bundle bundle);

    public abstract void c();
}
