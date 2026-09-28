package defpackage;

import android.widget.RadioGroup;
import dev.zeron.tunnel.R;
import com.iphunt.sandoki.ui.AirplaneModeActivity;
import com.v2ray.ang.ui.HomeFragment;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f4 implements RadioGroup.OnCheckedChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f4(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                AirplaneModeActivity airplaneModeActivity = (AirplaneModeActivity) obj;
                int i3 = AirplaneModeActivity.A;
                airplaneModeActivity.b.b.edit().putBoolean("control_mode_secure", i == R.id.rb_mode_secure).apply();
                break;
            default:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj;
                int i4 = HomeFragment.f2;
                radioGroup.getClass();
                ref$ObjectRef.element = i != R.id.radioOption2 ? "OVPN" : "SSH";
                break;
        }
    }
}
