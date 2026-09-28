package defpackage;

import androidx.appcompat.app.g;
import com.v2ray.ang.adapter.NetworkAdapter;
import com.v2ray.ang.ui.HomeFragment;
import kotlin.Lazy;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class sd0 implements NetworkAdapter.NetworkItemClickListener {
    public final /* synthetic */ HomeFragment a;

    public sd0(HomeFragment homeFragment) {
        this.a = homeFragment;
    }

    @Override // com.v2ray.ang.adapter.NetworkAdapter.NetworkItemClickListener
    public final void onNetworkClick(int i, String str) {
        str.getClass();
        HomeFragment homeFragment = this.a;
        g gVar = homeFragment.I0;
        if (gVar != null) {
            gVar.dismiss();
        }
        Lazy lazy = zq0.a;
        zq0.H(str);
        homeFragment.z0();
    }
}
