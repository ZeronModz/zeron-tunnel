package defpackage;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.AlertDialog$Builder;
import com.v2ray.ang.dto.SubscriptionItem;
import com.v2ray.ang.ui.SubEditActivity;
import com.v2ray.ang.ui.SubSettingActivity;
import com.v2ray.ang.ui.SubSettingRecyclerAdapter;
import com.v2ray.ang.ui.UserAssetActivity;
import com.v2ray.ang.ui.UserAssetUrlActivity;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class tb1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tb1(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                SubSettingActivity subSettingActivity = ((SubSettingRecyclerAdapter) obj2).d;
                subSettingActivity.startActivity(new Intent(subSettingActivity, (Class<?>) SubEditActivity.class).putExtra("subId", (String) obj));
                break;
            case 1:
                SubSettingRecyclerAdapter subSettingRecyclerAdapter = (SubSettingRecyclerAdapter) obj2;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(subSettingRecyclerAdapter.d);
                Object value = subSettingRecyclerAdapter.e.getValue();
                value.getClass();
                List listAsList = Arrays.asList((String[]) value);
                listAsList.getClass();
                CharSequence[] charSequenceArr = (CharSequence[]) listAsList.toArray(new String[0]);
                j jVar = new j(1, subSettingRecyclerAdapter, (SubscriptionItem) obj);
                AlertController.AlertParams alertParams = alertDialog$Builder.a;
                alertParams.o = charSequenceArr;
                alertParams.q = jVar;
                alertDialog$Builder.f();
                break;
            default:
                UserAssetActivity userAssetActivity = (UserAssetActivity) obj2;
                Intent intent = new Intent(userAssetActivity, (Class<?>) UserAssetUrlActivity.class);
                intent.putExtra("assetId", (String) ((Pair) obj).getFirst());
                userAssetActivity.startActivity(intent);
                break;
        }
    }
}
