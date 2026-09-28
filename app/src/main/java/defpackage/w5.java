package defpackage;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.savedstate.SavedStateRegistry;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class w5 implements SavedStateRegistry.SavedStateProvider {
    public final /* synthetic */ AppCompatActivity a;

    public w5(AppCompatActivity appCompatActivity) {
        this.a = appCompatActivity;
    }

    @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
    public final Bundle saveState() {
        Bundle bundle = new Bundle();
        this.a.getDelegate().getClass();
        return bundle;
    }
}
