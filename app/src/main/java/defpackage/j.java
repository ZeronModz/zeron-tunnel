package defpackage;

import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.app.AlertDialog$Builder;
import dev.zeron.tunnel.R;
import com.v2ray.ang.dto.CheckUpdateResult;
import com.v2ray.ang.dto.SubscriptionItem;
import com.v2ray.ang.ui.AboutActivity;
import com.v2ray.ang.ui.SubSettingActivity;
import com.v2ray.ang.ui.SubSettingRecyclerAdapter;
import kotlin.text.Regex;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i2) {
            case 0:
                AboutActivity aboutActivity = (AboutActivity) obj;
                int i3 = AboutActivity.g;
                String downloadUrl = ((CheckUpdateResult) obj2).getDownloadUrl();
                if (downloadUrl != null) {
                    Regex regex = ul1.a;
                    ul1.x(aboutActivity, downloadUrl);
                    return;
                }
                return;
            default:
                SubSettingActivity subSettingActivity = ((SubSettingRecyclerAdapter) obj2).d;
                SubscriptionItem subscriptionItem = (SubscriptionItem) obj;
                try {
                    if (i != 0) {
                        if (i != 1) {
                            qf3.L(subSettingActivity, "else");
                            return;
                        } else {
                            Regex regex2 = ul1.a;
                            ul1.A(subSettingActivity, subscriptionItem.getUrl());
                            return;
                        }
                    }
                    View viewInflate = LayoutInflater.from(subSettingActivity).inflate(R.layout.item_qrcode, (ViewGroup) null, false);
                    ImageView imageView = (ImageView) l02.n(R.id.iv_qcode, viewInflate);
                    if (imageView == null) {
                        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.iv_qcode)));
                    }
                    int i4 = uz0.a;
                    imageView.setImageBitmap(uz0.a(subscriptionItem.getUrl()));
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(subSettingActivity);
                    alertDialog$Builder.a.r = (LinearLayout) viewInflate;
                    alertDialog$Builder.f();
                    return;
                } catch (Exception unused) {
                    return;
                }
        }
    }
}
