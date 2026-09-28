package defpackage;

import android.os.Handler;
import com.iphunt.sandoki.ui.AirplaneModeActivity;
import java.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d4 implements Consumer {
    public final /* synthetic */ AirplaneModeActivity a;

    public /* synthetic */ d4(AirplaneModeActivity airplaneModeActivity) {
        this.a = airplaneModeActivity;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        String str = (String) obj;
        int i = AirplaneModeActivity.A;
        AirplaneModeActivity airplaneModeActivity = this.a;
        Handler handler = airplaneModeActivity.w;
        ArrayList arrayList = airplaneModeActivity.z;
        if (str == null) {
            airplaneModeActivity.k("Failed to get IP");
            return;
        }
        airplaneModeActivity.p.setText(airplaneModeActivity.s + " IP: " + str);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder();
        boolean zStartsWith = false;
        int i2 = 0;
        while (i2 < arrayList.size()) {
            sb.append("Attempt: ");
            int i3 = i2 + 1;
            sb.append(i3);
            sb.append(" -> ");
            sb.append((String) arrayList.get(i2));
            sb.append("\n");
            i2 = i3;
        }
        String string = airplaneModeActivity.o.getText().toString();
        if (string != null) {
            zStartsWith = str.trim().startsWith(string.trim());
        }
        if (zStartsWith) {
            handler.removeCallbacksAndMessages(null);
            airplaneModeActivity.k("IP matched: ".concat(str));
            sb.append("\nIP matched: ");
            sb.append(str);
        } else {
            handler.removeCallbacksAndMessages(null);
            handler.postDelayed(new b4(airplaneModeActivity, 2), 1000L);
        }
        airplaneModeActivity.q.setText(sb.toString());
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
