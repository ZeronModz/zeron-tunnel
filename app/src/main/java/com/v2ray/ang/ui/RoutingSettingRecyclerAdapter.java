package com.v2ray.ang.ui;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.recyclerview.widget.RecyclerView;
import dev.zeron.tunnel.R;
import com.v2ray.ang.dto.RulesetItem;
import com.v2ray.ang.helper.ItemTouchHelperAdapter;
import com.v2ray.ang.helper.ItemTouchHelperViewHolder;
import com.v2ray.ang.ui.RoutingEditActivity;
import com.v2ray.ang.ui.RoutingSettingActivity;
import defpackage.eh0;
import defpackage.io0;
import defpackage.l02;
import defpackage.yg0;
import defpackage.zq0;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.Lazy;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002\b\tB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/v2ray/ang/ui/RoutingSettingRecyclerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/v2ray/ang/ui/RoutingSettingRecyclerAdapter$MainViewHolder;", "Lcom/v2ray/ang/helper/ItemTouchHelperAdapter;", "Lcom/v2ray/ang/ui/RoutingSettingActivity;", "activity", "<init>", "(Lcom/v2ray/ang/ui/RoutingSettingActivity;)V", "MainViewHolder", "BaseViewHolder", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RoutingSettingRecyclerAdapter extends RecyclerView.Adapter<MainViewHolder> implements ItemTouchHelperAdapter {
    public final RoutingSettingActivity d;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/v2ray/ang/ui/RoutingSettingRecyclerAdapter$BaseViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/v2ray/ang/ui/RoutingSettingRecyclerAdapter$MainViewHolder;", "Lcom/v2ray/ang/ui/RoutingSettingRecyclerAdapter$BaseViewHolder;", "Lcom/v2ray/ang/helper/ItemTouchHelperViewHolder;", "Leh0;", "itemRoutingSettingBinding", "<init>", "(Leh0;)V", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MainViewHolder extends BaseViewHolder implements ItemTouchHelperViewHolder {
        public final eh0 u;

        /* JADX WARN: Illegal instructions before constructor call */
        public MainViewHolder(eh0 eh0Var) {
            eh0Var.getClass();
            LinearLayout linearLayout = eh0Var.a;
            linearLayout.getClass();
            super(linearLayout);
            this.u = eh0Var;
        }
    }

    public RoutingSettingRecyclerAdapter(RoutingSettingActivity routingSettingActivity) {
        routingSettingActivity.getClass();
        this.d = routingSettingActivity;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int c() {
        return this.d.d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void k(RecyclerView.ViewHolder viewHolder, final int i) {
        MainViewHolder mainViewHolder = (MainViewHolder) viewHolder;
        final RulesetItem rulesetItem = (RulesetItem) this.d.d.get(i);
        eh0 eh0Var = mainViewHolder.u;
        TextView textView = eh0Var.g;
        SwitchCompat switchCompat = eh0Var.b;
        textView.setText(rulesetItem.getRemarks());
        TextView textView2 = eh0Var.c;
        Object domain = rulesetItem.getDomain();
        if (domain == null && (domain = rulesetItem.getIp()) == null) {
            domain = rulesetItem.getPort();
        }
        textView2.setText(domain != null ? domain.toString() : null);
        eh0Var.f.setText(rulesetItem.getOutboundTag());
        switchCompat.setChecked(rulesetItem.getEnabled());
        eh0Var.d.setVisibility(yg0.a(rulesetItem.getLocked(), Boolean.TRUE) ? 0 : 8);
        mainViewHolder.a.setBackgroundColor(0);
        eh0Var.e.setOnClickListener(new View.OnClickListener() { // from class: j41
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RoutingSettingActivity routingSettingActivity = this.a.d;
                routingSettingActivity.startActivity(new Intent(routingSettingActivity, (Class<?>) RoutingEditActivity.class).putExtra("position", i));
            }
        });
        switchCompat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: k41
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                compoundButton.getClass();
                if (compoundButton.isPressed()) {
                    RulesetItem rulesetItem2 = rulesetItem;
                    rulesetItem2.setEnabled(z);
                    Lazy lazy = zq0.a;
                    ArrayList arrayListC = zq0.c();
                    if (arrayListC == null || arrayListC.isEmpty()) {
                        arrayListC = new ArrayList();
                    }
                    int i2 = i;
                    if (i2 < 0 || i2 >= arrayListC.size()) {
                        arrayListC.add(0, rulesetItem2);
                    } else {
                        arrayListC.set(i2, rulesetItem2);
                    }
                    zq0.k(arrayListC);
                }
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder m(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_recycler_routing_setting, viewGroup, false);
        int i2 = R.id.chk_enable;
        SwitchCompat switchCompat = (SwitchCompat) l02.n(R.id.chk_enable, viewInflate);
        if (switchCompat != null) {
            i2 = R.id.domainIp;
            TextView textView = (TextView) l02.n(R.id.domainIp, viewInflate);
            if (textView != null) {
                i2 = R.id.img_locked;
                ImageView imageView = (ImageView) l02.n(R.id.img_locked, viewInflate);
                if (imageView != null) {
                    i2 = R.id.info_container;
                    if (((LinearLayout) l02.n(R.id.info_container, viewInflate)) != null) {
                        LinearLayout linearLayout = (LinearLayout) viewInflate;
                        i2 = R.id.layout_edit;
                        LinearLayout linearLayout2 = (LinearLayout) l02.n(R.id.layout_edit, viewInflate);
                        if (linearLayout2 != null) {
                            i2 = R.id.outboundTag;
                            TextView textView2 = (TextView) l02.n(R.id.outboundTag, viewInflate);
                            if (textView2 != null) {
                                i2 = R.id.remarks;
                                TextView textView3 = (TextView) l02.n(R.id.remarks, viewInflate);
                                if (textView3 != null) {
                                    return new MainViewHolder(new eh0(linearLayout, switchCompat, textView, imageView, linearLayout2, textView2, textView3));
                                }
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
        ArrayList arrayListC = zq0.c();
        if (arrayListC != null && !arrayListC.isEmpty()) {
            Collections.swap(arrayListC, i, i2);
            zq0.k(arrayListC);
        }
        g(i, i2);
        return true;
    }

    @Override // com.v2ray.ang.helper.ItemTouchHelperAdapter
    public final void onItemMoveCompleted() {
        this.d.i();
    }

    @Override // com.v2ray.ang.helper.ItemTouchHelperAdapter
    public final void onItemDismiss(int i) {
    }
}
