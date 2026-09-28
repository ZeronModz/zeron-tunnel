package defpackage;

import android.widget.CompoundButton;
import android.widget.LinearLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.v2ray.ang.dto.SubscriptionItem;
import com.v2ray.ang.ui.HomeFragment;
import kotlin.Lazy;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ed0 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ed0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                TextInputLayout textInputLayout = (TextInputLayout) obj2;
                LinearLayout linearLayout = (LinearLayout) obj;
                int i2 = HomeFragment.f2;
                compoundButton.getClass();
                if (!z) {
                    if (textInputLayout != null) {
                        textInputLayout.setVisibility(8);
                    }
                    linearLayout.setVisibility(0);
                } else {
                    if (textInputLayout != null) {
                        textInputLayout.setVisibility(0);
                    }
                    linearLayout.setVisibility(8);
                }
                break;
            default:
                SubscriptionItem subscriptionItem = (SubscriptionItem) obj2;
                String str = (String) obj;
                compoundButton.getClass();
                if (compoundButton.isPressed()) {
                    subscriptionItem.setEnabled(z);
                    Lazy lazy = zq0.a;
                    zq0.q(str, subscriptionItem);
                    break;
                }
                break;
        }
    }
}
