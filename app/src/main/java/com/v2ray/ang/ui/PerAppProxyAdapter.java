package com.v2ray.ang.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import dev.zeron.tunnel.R;
import com.google.android.gms.ads.RequestConfiguration;
import com.v2ray.ang.dto.AppInfo;
import defpackage.ch0;
import defpackage.io0;
import defpackage.l02;
import defpackage.xu;
import defpackage.yg0;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\r\u000e\u000fB-\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/v2ray/ang/ui/PerAppProxyAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/v2ray/ang/ui/PerAppProxyAdapter$BaseViewHolder;", "Lcom/v2ray/ang/ui/BaseActivity;", "activity", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lcom/v2ray/ang/dto/AppInfo;", "apps", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "blacklist", "<init>", "(Lcom/v2ray/ang/ui/BaseActivity;Ljava/util/List;Ljava/util/Set;)V", "Companion", "BaseViewHolder", "AppViewHolder", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PerAppProxyAdapter extends RecyclerView.Adapter<BaseViewHolder> {
    public final List d;
    public final HashSet e;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/v2ray/ang/ui/PerAppProxyAdapter$AppViewHolder;", "Lcom/v2ray/ang/ui/PerAppProxyAdapter$BaseViewHolder;", "Landroid/view/View$OnClickListener;", "Lch0;", "itemBypassBinding", "<init>", "(Lcom/v2ray/ang/ui/PerAppProxyAdapter;Lch0;)V", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class AppViewHolder extends BaseViewHolder implements View.OnClickListener {
        public final ch0 u;
        public AppInfo v;
        public final /* synthetic */ PerAppProxyAdapter w;

        /* JADX WARN: Illegal instructions before constructor call */
        public AppViewHolder(PerAppProxyAdapter perAppProxyAdapter, ch0 ch0Var) {
            ch0Var.getClass();
            this.w = perAppProxyAdapter;
            LinearLayout linearLayout = ch0Var.a;
            linearLayout.getClass();
            super(linearLayout);
            this.u = ch0Var;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            PerAppProxyAdapter perAppProxyAdapter = this.w;
            HashSet hashSet = perAppProxyAdapter.e;
            AppInfo appInfo = this.v;
            if (appInfo == null) {
                yg0.N("appInfo");
                throw null;
            }
            boolean zContains = hashSet.contains(appInfo.getPackageName());
            ch0 ch0Var = this.u;
            if (zContains) {
                HashSet hashSet2 = perAppProxyAdapter.e;
                AppInfo appInfo2 = this.v;
                if (appInfo2 == null) {
                    yg0.N("appInfo");
                    throw null;
                }
                hashSet2.remove(appInfo2.getPackageName());
                ch0Var.b.setChecked(false);
                return;
            }
            HashSet hashSet3 = perAppProxyAdapter.e;
            AppInfo appInfo3 = this.v;
            if (appInfo3 == null) {
                yg0.N("appInfo");
                throw null;
            }
            hashSet3.add(appInfo3.getPackageName());
            ch0Var.b.setChecked(true);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/v2ray/ang/ui/PerAppProxyAdapter$BaseViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static class BaseViewHolder extends RecyclerView.ViewHolder {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BaseViewHolder(View view) {
            super(view);
            view.getClass();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/v2ray/ang/ui/PerAppProxyAdapter$Companion;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "VIEW_TYPE_HEADER", "I", "VIEW_TYPE_ITEM", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public Companion(xu xuVar) {
        }
    }

    static {
        new Companion(null);
    }

    public PerAppProxyAdapter(BaseActivity baseActivity, List<AppInfo> list, Set<String> set) {
        baseActivity.getClass();
        list.getClass();
        this.d = list;
        this.e = set == null ? new HashSet() : new HashSet(set);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int c() {
        return this.d.size() + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int e(int i) {
        return i == 0 ? 0 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void k(RecyclerView.ViewHolder viewHolder, int i) {
        BaseViewHolder baseViewHolder = (BaseViewHolder) viewHolder;
        if (baseViewHolder instanceof AppViewHolder) {
            AppInfo appInfo = (AppInfo) this.d.get(i - 1);
            AppViewHolder appViewHolder = (AppViewHolder) baseViewHolder;
            appInfo.getClass();
            appViewHolder.v = appInfo;
            ch0 ch0Var = appViewHolder.u;
            ch0Var.c.setImageDrawable(appInfo.getAppIcon());
            ch0Var.d.setText(appInfo.isSystemApp() ? String.format("** %s", Arrays.copyOf(new Object[]{appInfo.getAppName()}, 1)) : appInfo.getAppName());
            ch0Var.e.setText(appInfo.getPackageName());
            AppCompatCheckBox appCompatCheckBox = ch0Var.b;
            HashSet hashSet = appViewHolder.w.e;
            AppInfo appInfo2 = appViewHolder.v;
            if (appInfo2 == null) {
                yg0.N("appInfo");
                throw null;
            }
            appCompatCheckBox.setChecked(hashSet.contains(appInfo2.getPackageName()));
            appViewHolder.a.setOnClickListener(appViewHolder);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder m(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        Context context = viewGroup.getContext();
        if (i == 0) {
            View view = new View(context);
            view.setLayoutParams(new ViewGroup.LayoutParams(-1, 0));
            return new BaseViewHolder(view);
        }
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.item_recycler_bypass_list, viewGroup, false);
        int i2 = R.id.check_box;
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) l02.n(R.id.check_box, viewInflate);
        if (appCompatCheckBox != null) {
            i2 = R.id.icon;
            AppCompatImageView appCompatImageView = (AppCompatImageView) l02.n(R.id.icon, viewInflate);
            if (appCompatImageView != null) {
                i2 = R.id.name;
                AppCompatTextView appCompatTextView = (AppCompatTextView) l02.n(R.id.name, viewInflate);
                if (appCompatTextView != null) {
                    i2 = R.id.package_name;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) l02.n(R.id.package_name, viewInflate);
                    if (appCompatTextView2 != null) {
                        return new AppViewHolder(this, new ch0((LinearLayout) viewInflate, appCompatCheckBox, appCompatImageView, appCompatTextView, appCompatTextView2));
                    }
                }
            }
        }
        io0.e("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        return null;
    }
}
