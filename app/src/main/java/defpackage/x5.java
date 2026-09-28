package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import androidx.activity.contextaware.OnContextAvailableListener;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.h;
import androidx.appcompat.app.k;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class x5 implements OnContextAvailableListener {
    public final /* synthetic */ AppCompatActivity a;

    public x5(AppCompatActivity appCompatActivity) {
        this.a = appCompatActivity;
    }

    @Override // androidx.activity.contextaware.OnContextAvailableListener
    public final void onContextAvailable(Context context) {
        AppCompatActivity appCompatActivity = this.a;
        h delegate = appCompatActivity.getDelegate();
        k kVar = (k) delegate;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(kVar.k);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(kVar);
        } else {
            layoutInflaterFrom.getFactory2();
        }
        appCompatActivity.getSavedStateRegistry().a("androidx:appcompat");
        delegate.c();
    }
}
