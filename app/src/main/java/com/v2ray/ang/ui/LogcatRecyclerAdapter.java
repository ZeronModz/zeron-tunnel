package com.v2ray.ang.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import dev.zeron.tunnel.R;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.dh0;
import defpackage.io0;
import defpackage.l02;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/v2ray/ang/ui/LogcatRecyclerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/v2ray/ang/ui/LogcatRecyclerAdapter$MainViewHolder;", "Lcom/v2ray/ang/ui/LogcatActivity;", "activity", "<init>", "(Lcom/v2ray/ang/ui/LogcatActivity;)V", "MainViewHolder", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LogcatRecyclerAdapter extends RecyclerView.Adapter<MainViewHolder> {
    public final LogcatActivity d;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/v2ray/ang/ui/LogcatRecyclerAdapter$MainViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Ldh0;", "itemSubSettingBinding", "<init>", "(Ldh0;)V", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MainViewHolder extends RecyclerView.ViewHolder {
        public final dh0 u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MainViewHolder(dh0 dh0Var) {
            super(dh0Var.a);
            dh0Var.getClass();
            this.u = dh0Var;
        }
    }

    public LogcatRecyclerAdapter(LogcatActivity logcatActivity) {
        logcatActivity.getClass();
        this.d = logcatActivity;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int c() {
        return this.d.e.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void k(RecyclerView.ViewHolder viewHolder, int i) {
        dh0 dh0Var = ((MainViewHolder) viewHolder).u;
        try {
            String str = (String) this.d.e.get(i);
            int length = str.length();
            String string = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            if (length == 0) {
                dh0Var.c.setText(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                dh0Var.b.setText(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                return;
            }
            List listO = kotlin.text.g.O(str, new String[]{"):"}, 2);
            dh0Var.c.setText(kotlin.text.g.c0((String) kotlin.collections.c.r(kotlin.text.g.O((CharSequence) kotlin.collections.c.r(listO), new String[]{"("}, 2))).toString());
            AppCompatTextView appCompatTextView = dh0Var.b;
            if (listO.size() > 1) {
                string = kotlin.text.g.c0((String) kotlin.collections.c.x(listO)).toString();
            }
            appCompatTextView.setText(string);
        } catch (Exception unused) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder m(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_recycler_logcat, viewGroup, false);
        int i2 = R.id.log_content;
        AppCompatTextView appCompatTextView = (AppCompatTextView) l02.n(R.id.log_content, viewInflate);
        if (appCompatTextView != null) {
            i2 = R.id.log_tag;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) l02.n(R.id.log_tag, viewInflate);
            if (appCompatTextView2 != null) {
                return new MainViewHolder(new dh0((LinearLayout) viewInflate, appCompatTextView, appCompatTextView2));
            }
        }
        io0.e("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        return null;
    }
}
