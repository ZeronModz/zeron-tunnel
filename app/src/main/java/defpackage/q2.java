package defpackage;

import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.DataSetObserver;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActivityChooserView;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class q2 extends DataSetObserver {
    public final /* synthetic */ int a;
    public final /* synthetic */ ActivityChooserView b;

    public /* synthetic */ q2(ActivityChooserView activityChooserView, int i) {
        this.a = i;
        this.b = activityChooserView;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        int size;
        switch (this.a) {
            case 0:
                super.onChanged();
                this.b.a.notifyDataSetChanged();
                return;
            default:
                super.onChanged();
                ActivityChooserView activityChooserView = this.b;
                int count = activityChooserView.a.getCount();
                FrameLayout frameLayout = activityChooserView.e;
                if (count > 0) {
                    frameLayout.setEnabled(true);
                } else {
                    frameLayout.setEnabled(false);
                }
                int iF = activityChooserView.a.a.f();
                p2 p2Var = activityChooserView.a.a;
                synchronized (p2Var.a) {
                    p2Var.c();
                    size = p2Var.c.size();
                    break;
                }
                if (iF == 1 || (iF > 1 && size > 0)) {
                    activityChooserView.g.setVisibility(0);
                    ResolveInfo resolveInfoG = activityChooserView.a.a.g();
                    PackageManager packageManager = activityChooserView.getContext().getPackageManager();
                    activityChooserView.h.setImageDrawable(resolveInfoG.loadIcon(packageManager));
                    if (activityChooserView.r != 0) {
                        activityChooserView.g.setContentDescription(activityChooserView.getContext().getString(activityChooserView.r, resolveInfoG.loadLabel(packageManager)));
                    }
                } else {
                    activityChooserView.g.setVisibility(8);
                }
                int visibility = activityChooserView.g.getVisibility();
                View view = activityChooserView.c;
                if (visibility == 0) {
                    view.setBackgroundDrawable(activityChooserView.d);
                    return;
                } else {
                    view.setBackgroundDrawable(null);
                    return;
                }
        }
    }

    @Override // android.database.DataSetObserver
    public void onInvalidated() {
        switch (this.a) {
            case 0:
                super.onInvalidated();
                this.b.a.notifyDataSetInvalidated();
                break;
            default:
                super.onInvalidated();
                break;
        }
    }
}
