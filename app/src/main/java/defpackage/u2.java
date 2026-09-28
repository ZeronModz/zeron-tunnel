package defpackage;

import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.ActivityChooserView;
import dev.zeron.tunnel.R;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class u2 extends BaseAdapter {
    public p2 a;
    public int b = 4;
    public boolean c;
    public boolean d;
    public boolean e;
    public final /* synthetic */ ActivityChooserView f;

    public u2(ActivityChooserView activityChooserView) {
        this.f = activityChooserView;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        int iF = this.a.f();
        if (!this.c && this.a.g() != null) {
            iF--;
        }
        int iMin = Math.min(iF, this.b);
        return this.e ? iMin + 1 : iMin;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        int itemViewType = getItemViewType(i);
        if (itemViewType != 0) {
            if (itemViewType == 1) {
                return null;
            }
            s31.c();
            return null;
        }
        if (!this.c && this.a.g() != null) {
            i++;
        }
        return this.a.e(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getItemViewType(int i) {
        return (this.e && i == getCount() - 1) ? 1 : 0;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        int itemViewType = getItemViewType(i);
        ActivityChooserView activityChooserView = this.f;
        if (itemViewType != 0) {
            if (itemViewType != 1) {
                s31.c();
                return null;
            }
            if (view != null && view.getId() == 1) {
                return view;
            }
            View viewInflate = LayoutInflater.from(activityChooserView.getContext()).inflate(R.layout.abc_activity_chooser_view_list_item, viewGroup, false);
            viewInflate.setId(1);
            ((TextView) viewInflate.findViewById(R.id.title)).setText(activityChooserView.getContext().getString(R.string.abc_activity_chooser_view_see_all));
            return viewInflate;
        }
        if (view == null || view.getId() != R.id.list_item) {
            view = LayoutInflater.from(activityChooserView.getContext()).inflate(R.layout.abc_activity_chooser_view_list_item, viewGroup, false);
        }
        PackageManager packageManager = activityChooserView.getContext().getPackageManager();
        ImageView imageView = (ImageView) view.findViewById(R.id.icon);
        ResolveInfo resolveInfo = (ResolveInfo) getItem(i);
        imageView.setImageDrawable(resolveInfo.loadIcon(packageManager));
        ((TextView) view.findViewById(R.id.title)).setText(resolveInfo.loadLabel(packageManager));
        if (this.c && i == 0 && this.d) {
            view.setActivated(true);
            return view;
        }
        view.setActivated(false);
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getViewTypeCount() {
        return 3;
    }
}
