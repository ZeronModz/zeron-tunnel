package defpackage;

import android.content.ComponentName;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.view.View;
import android.widget.AdapterView;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActivityChooserModel$ActivityResolveInfo;
import androidx.appcompat.widget.ActivityChooserModel$HistoricalRecord;
import androidx.appcompat.widget.ActivityChooserView;
import androidx.core.view.ActionProvider;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class v2 implements AdapterView.OnItemClickListener, View.OnClickListener, View.OnLongClickListener, PopupWindow.OnDismissListener {
    public final /* synthetic */ ActivityChooserView a;

    public v2(ActivityChooserView activityChooserView) {
        this.a = activityChooserView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ActivityChooserView activityChooserView = this.a;
        int i = 0;
        if (view != activityChooserView.g) {
            if (view != activityChooserView.e) {
                s31.c();
                return;
            } else {
                activityChooserView.o = false;
                activityChooserView.c(activityChooserView.p);
                return;
            }
        }
        activityChooserView.a();
        ResolveInfo resolveInfoG = this.a.a.a.g();
        p2 p2Var = this.a.a.a;
        synchronized (p2Var.a) {
            try {
                p2Var.c();
                ArrayList arrayList = p2Var.b;
                int size = arrayList.size();
                while (true) {
                    if (i >= size) {
                        break;
                    } else if (((ActivityChooserModel$ActivityResolveInfo) arrayList.get(i)).a != resolveInfoG) {
                        i++;
                    }
                }
            } finally {
            }
        }
        this.a.a.a.b();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ActionProvider.SubUiVisibilityListener subUiVisibilityListener;
        ActivityChooserView activityChooserView = this.a;
        PopupWindow.OnDismissListener onDismissListener = activityChooserView.n;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
        ActionProvider actionProvider = activityChooserView.j;
        if (actionProvider == null || (subUiVisibilityListener = actionProvider.a) == null) {
            return;
        }
        subUiVisibilityListener.onSubUiVisibilityChanged(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        int itemViewType = ((u2) adapterView.getAdapter()).getItemViewType(i);
        if (itemViewType != 0) {
            if (itemViewType == 1) {
                this.a.c(Integer.MAX_VALUE);
                return;
            } else {
                s31.c();
                return;
            }
        }
        this.a.a();
        ActivityChooserView activityChooserView = this.a;
        if (!activityChooserView.o) {
            u2 u2Var = activityChooserView.a;
            boolean z = u2Var.c;
            u2Var.a.b();
        } else if (i > 0) {
            p2 p2Var = activityChooserView.a.a;
            synchronized (p2Var.a) {
                try {
                    p2Var.c();
                    ActivityChooserModel$ActivityResolveInfo activityChooserModel$ActivityResolveInfo = (ActivityChooserModel$ActivityResolveInfo) p2Var.b.get(i);
                    ActivityChooserModel$ActivityResolveInfo activityChooserModel$ActivityResolveInfo2 = (ActivityChooserModel$ActivityResolveInfo) p2Var.b.get(0);
                    float f = activityChooserModel$ActivityResolveInfo2 != null ? (activityChooserModel$ActivityResolveInfo2.b - activityChooserModel$ActivityResolveInfo.b) + 5.0f : 1.0f;
                    ActivityInfo activityInfo = activityChooserModel$ActivityResolveInfo.a.activityInfo;
                    p2Var.a(new ActivityChooserModel$HistoricalRecord(new ComponentName(activityInfo.packageName, activityInfo.name), System.currentTimeMillis(), f));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        ActivityChooserView activityChooserView = this.a;
        if (view != activityChooserView.g) {
            s31.c();
            return false;
        }
        if (activityChooserView.a.getCount() > 0) {
            activityChooserView.o = true;
            activityChooserView.c(activityChooserView.p);
        }
        return true;
    }
}
