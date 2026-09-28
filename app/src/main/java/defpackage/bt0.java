package defpackage;

import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.motion.MaterialBackOrchestrator;
import com.google.android.material.navigation.NavigationView;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class bt0 extends DrawerLayout.SimpleDrawerListener {
    public final /* synthetic */ NavigationView a;

    public bt0(NavigationView navigationView) {
        this.a = navigationView;
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.SimpleDrawerListener, androidx.drawerlayout.widget.DrawerLayout.DrawerListener
    public final void onDrawerClosed(View view) {
        NavigationView navigationView = this.a;
        if (view == navigationView) {
            navigationView.v.b();
            if (!navigationView.r || navigationView.q == 0) {
                return;
            }
            navigationView.q = 0;
            navigationView.d(navigationView.getWidth(), navigationView.getHeight());
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.SimpleDrawerListener, androidx.drawerlayout.widget.DrawerLayout.DrawerListener
    public final void onDrawerOpened(View view) {
        NavigationView navigationView = this.a;
        if (view == navigationView) {
            MaterialBackOrchestrator materialBackOrchestrator = navigationView.v;
            Objects.requireNonNull(materialBackOrchestrator);
            view.post(new j60(materialBackOrchestrator, 10));
        }
    }
}
