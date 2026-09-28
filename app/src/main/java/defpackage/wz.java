package defpackage;

import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.ListPopupWindow;
import androidx.appcompat.widget.SearchView;
import androidx.preference.DropDownPreference;
import com.v2ray.ang.ui.ServerActivity;
import kotlin.Lazy;
import kotlin.collections.c;
import kotlin.text.g;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class wz implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wz(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        vz vzVar;
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                DropDownPreference dropDownPreference = (DropDownPreference) obj;
                if (i >= 0) {
                    String string = dropDownPreference.U[i].toString();
                    if (!string.equals(dropDownPreference.V) && dropDownPreference.a(string)) {
                        dropDownPreference.B(string);
                        break;
                    }
                }
                break;
            case 1:
                if (i != -1 && (vzVar = ((ListPopupWindow) obj).c) != null) {
                    vzVar.setListSelectionHidden(false);
                    break;
                }
                break;
            case 2:
                ((SearchView) obj).l(i);
                break;
            default:
                ServerActivity serverActivity = (ServerActivity) obj;
                Lazy lazy = serverActivity.D;
                Lazy lazy2 = serverActivity.O;
                Lazy lazy3 = serverActivity.F;
                int i3 = ServerActivity.h0;
                boolean zB = g.B(serverActivity.o()[i]);
                boolean zA = yg0.a(serverActivity.o()[i], "tls");
                if (zB) {
                    for (LinearLayout linearLayout : c.A((LinearLayout) lazy.getValue(), (LinearLayout) lazy3.getValue(), (LinearLayout) lazy2.getValue(), serverActivity.h(), serverActivity.i(), serverActivity.j(), serverActivity.k())) {
                        if (linearLayout != null) {
                            linearLayout.setVisibility(8);
                        }
                    }
                } else if (zA) {
                    for (LinearLayout linearLayout2 : c.A((LinearLayout) lazy.getValue(), (LinearLayout) lazy3.getValue(), (LinearLayout) lazy2.getValue())) {
                        if (linearLayout2 != null) {
                            linearLayout2.setVisibility(0);
                        }
                    }
                    LinearLayout linearLayoutH = serverActivity.h();
                    if (linearLayoutH != null) {
                        linearLayoutH.setVisibility(0);
                    }
                    for (LinearLayout linearLayout3 : c.A(serverActivity.i(), serverActivity.j(), serverActivity.k())) {
                        if (linearLayout3 != null) {
                            linearLayout3.setVisibility(8);
                        }
                    }
                } else {
                    for (LinearLayout linearLayout4 : c.A((LinearLayout) lazy.getValue(), (LinearLayout) lazy3.getValue())) {
                        if (linearLayout4 != null) {
                            linearLayout4.setVisibility(0);
                        }
                    }
                    LinearLayout linearLayout5 = (LinearLayout) lazy2.getValue();
                    if (linearLayout5 != null) {
                        linearLayout5.setVisibility(8);
                    }
                    LinearLayout linearLayoutH2 = serverActivity.h();
                    if (linearLayoutH2 != null) {
                        linearLayoutH2.setVisibility(8);
                    }
                    for (LinearLayout linearLayout6 : c.A(serverActivity.i(), serverActivity.j(), serverActivity.k())) {
                        if (linearLayout6 != null) {
                            linearLayout6.setVisibility(0);
                        }
                    }
                }
                break;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        int i = this.a;
    }

    private final void a(AdapterView adapterView) {
    }

    private final void b(AdapterView adapterView) {
    }

    private final void c(AdapterView adapterView) {
    }

    private final void d(AdapterView adapterView) {
    }
}
