package com.v2ray.ang.ui;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.recyclerview.widget.RecyclerView;
import dev.zeron.tunnel.R;
import com.v2ray.ang.dto.SubscriptionItem;
import com.v2ray.ang.helper.ItemTouchHelperAdapter;
import com.v2ray.ang.helper.ItemTouchHelperViewHolder;
import defpackage.ed0;
import defpackage.fh0;
import defpackage.io0;
import defpackage.l02;
import defpackage.l8;
import defpackage.tb1;
import defpackage.zq0;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002\b\tB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/v2ray/ang/ui/SubSettingRecyclerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/v2ray/ang/ui/SubSettingRecyclerAdapter$MainViewHolder;", "Lcom/v2ray/ang/helper/ItemTouchHelperAdapter;", "Lcom/v2ray/ang/ui/SubSettingActivity;", "activity", "<init>", "(Lcom/v2ray/ang/ui/SubSettingActivity;)V", "MainViewHolder", "BaseViewHolder", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SubSettingRecyclerAdapter extends RecyclerView.Adapter<MainViewHolder> implements ItemTouchHelperAdapter {
    public final SubSettingActivity d;
    public final Lazy e;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/v2ray/ang/ui/SubSettingRecyclerAdapter$BaseViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static class BaseViewHolder extends RecyclerView.ViewHolder {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BaseViewHolder(View view) {
            super(view);
            view.getClass();
        }

        public final void onItemClear() {
            this.a.setBackgroundColor(0);
        }

        public final void onItemSelected() {
            this.a.setBackgroundColor(-3355444);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/v2ray/ang/ui/SubSettingRecyclerAdapter$MainViewHolder;", "Lcom/v2ray/ang/ui/SubSettingRecyclerAdapter$BaseViewHolder;", "Lcom/v2ray/ang/helper/ItemTouchHelperViewHolder;", "Lfh0;", "itemSubSettingBinding", "<init>", "(Lfh0;)V", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MainViewHolder extends BaseViewHolder implements ItemTouchHelperViewHolder {
        public final fh0 u;

        /* JADX WARN: Illegal instructions before constructor call */
        public MainViewHolder(fh0 fh0Var) {
            fh0Var.getClass();
            LinearLayout linearLayout = fh0Var.a;
            linearLayout.getClass();
            super(linearLayout);
            this.u = fh0Var;
        }
    }

    public SubSettingRecyclerAdapter(SubSettingActivity subSettingActivity) {
        subSettingActivity.getClass();
        this.d = subSettingActivity;
        this.e = kotlin.c.b(new l8(this, 21));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int c() {
        return this.d.d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void k(RecyclerView.ViewHolder viewHolder, int i) {
        MainViewHolder mainViewHolder = (MainViewHolder) viewHolder;
        SubSettingActivity subSettingActivity = this.d;
        String str = (String) ((Pair) subSettingActivity.d.get(i)).getFirst();
        SubscriptionItem subscriptionItem = (SubscriptionItem) ((Pair) subSettingActivity.d.get(i)).getSecond();
        fh0 fh0Var = mainViewHolder.u;
        fh0Var.e.setText(subscriptionItem.getRemarks());
        fh0Var.f.setText(subscriptionItem.getUrl());
        SwitchCompat switchCompat = fh0Var.b;
        switchCompat.setChecked(subscriptionItem.getEnabled());
        mainViewHolder.a.setBackgroundColor(0);
        fh0Var.c.setOnClickListener(new tb1(0, this, str));
        int i2 = 1;
        switchCompat.setOnCheckedChangeListener(new ed0(1, subscriptionItem, str));
        boolean zIsEmpty = TextUtils.isEmpty(subscriptionItem.getUrl());
        LinearLayout linearLayout = fh0Var.d;
        if (zIsEmpty) {
            linearLayout.setVisibility(4);
            switchCompat.setVisibility(4);
        } else {
            linearLayout.setVisibility(0);
            switchCompat.setVisibility(0);
            linearLayout.setOnClickListener(new tb1(i2, this, subscriptionItem));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder m(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_recycler_sub_setting, viewGroup, false);
        int i2 = R.id.chk_enable;
        SwitchCompat switchCompat = (SwitchCompat) l02.n(R.id.chk_enable, viewInflate);
        if (switchCompat != null) {
            i2 = R.id.info_container;
            if (((LinearLayout) l02.n(R.id.info_container, viewInflate)) != null) {
                LinearLayout linearLayout = (LinearLayout) viewInflate;
                i2 = R.id.layout_edit;
                LinearLayout linearLayout2 = (LinearLayout) l02.n(R.id.layout_edit, viewInflate);
                if (linearLayout2 != null) {
                    i2 = R.id.layout_share;
                    LinearLayout linearLayout3 = (LinearLayout) l02.n(R.id.layout_share, viewInflate);
                    if (linearLayout3 != null) {
                        i2 = R.id.tv_name;
                        TextView textView = (TextView) l02.n(R.id.tv_name, viewInflate);
                        if (textView != null) {
                            i2 = R.id.tv_url;
                            TextView textView2 = (TextView) l02.n(R.id.tv_url, viewInflate);
                            if (textView2 != null) {
                                return new MainViewHolder(new fh0(linearLayout, switchCompat, linearLayout2, linearLayout3, textView, textView2));
                            }
                        }
                    }
                }
            }
        }
        io0.e("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        return null;
    }

    @Override // com.v2ray.ang.helper.ItemTouchHelperAdapter
    public final boolean onItemMove(int i, int i2) {
        Lazy lazy = zq0.a;
        ArrayList arrayListG = zq0.g();
        if (!arrayListG.isEmpty()) {
            Collections.swap(arrayListG, i, i2);
            zq0.p(arrayListG);
        }
        g(i, i2);
        return true;
    }

    @Override // com.v2ray.ang.helper.ItemTouchHelperAdapter
    public final void onItemMoveCompleted() {
        SubSettingActivity subSettingActivity = this.d;
        subSettingActivity.getClass();
        subSettingActivity.d = zq0.i();
        ((SubSettingRecyclerAdapter) subSettingActivity.e.getValue()).f();
    }

    @Override // com.v2ray.ang.helper.ItemTouchHelperAdapter
    public final void onItemDismiss(int i) {
    }
}
