package defpackage;

import android.widget.Toast;
import androidx.lifecycle.Observer;
import com.iphunt.sandoki.ui.AirplaneModeActivity;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a4 implements Observer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a4(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                AirplaneModeActivity airplaneModeActivity = (AirplaneModeActivity) obj2;
                Boolean bool = (Boolean) obj;
                int i2 = AirplaneModeActivity.A;
                airplaneModeActivity.c.setText("当前状态: ".concat(bool.booleanValue() ? "飞行模式开启" : "飞行模式关闭"));
                airplaneModeActivity.v = bool.booleanValue();
                break;
            case 1:
                AirplaneModeActivity airplaneModeActivity2 = (AirplaneModeActivity) obj2;
                Boolean bool2 = (Boolean) obj;
                int i3 = AirplaneModeActivity.A;
                boolean z = bool2 != null && bool2.booleanValue();
                if (airplaneModeActivity2.f.isChecked() != z) {
                    airplaneModeActivity2.m = true;
                    airplaneModeActivity2.f.setChecked(z);
                    airplaneModeActivity2.m = false;
                }
                break;
            case 2:
                int i4 = AirplaneModeActivity.A;
                ((AirplaneModeActivity) obj2).d.setText("Toggle Interval: Every " + ((Integer) obj) + " minutes");
                break;
            case 3:
                AirplaneModeActivity airplaneModeActivity3 = (AirplaneModeActivity) obj2;
                Boolean bool3 = (Boolean) obj;
                int i5 = AirplaneModeActivity.A;
                if (bool3 == null || bool3.booleanValue() || airplaneModeActivity3.t) {
                    airplaneModeActivity3.u = true;
                } else {
                    airplaneModeActivity3.t = true;
                    airplaneModeActivity3.i();
                }
                break;
            case 4:
                int i6 = AirplaneModeActivity.A;
                ((AirplaneModeActivity) obj2).n.setVisibility(((Boolean) obj).booleanValue() ? 0 : 8);
                break;
            case 5:
                AirplaneModeActivity airplaneModeActivity4 = (AirplaneModeActivity) obj2;
                String str = (String) obj;
                int i7 = AirplaneModeActivity.A;
                if (str != null && !str.isEmpty()) {
                    Toast.makeText(airplaneModeActivity4, str, 1).show();
                    break;
                }
                break;
            default:
                ((ki) obj2).k(obj);
                break;
        }
    }
}
