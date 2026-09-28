package defpackage;

import android.app.AlertDialog;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ProgressBar;
import androidx.appcompat.app.g;
import androidx.cardview.widget.CardView;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.m;
import dev.zeron.tunnel.R;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.sidesheet.a;
import com.google.android.material.textfield.TextInputEditText;
import com.v2ray.ang.AppConfig;
import com.v2ray.ang.Hometab;
import com.v2ray.ang.ui.CrashActivity;
import com.v2ray.ang.ui.HomeFragment;
import com.v2ray.ang.ui.PerAppProxyActivity;
import com.v2ray.ang.ui.RoutingSettingActivity;
import com.v2ray.ang.ui.ServerStatusVIew;
import com.v2ray.ang.ui.UserAssetActivity;
import defpackage.id0;
import defpackage.qf3;
import io.github.g00fy2.quickie.QROverlayView;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$BooleanRef;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mn implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mn(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws IOException {
        int i = this.a;
        int i2 = 3;
        int i3 = 0;
        Object obj = this.b;
        switch (i) {
            case 0:
                qn qnVar = (qn) obj;
                EditText editText = qnVar.i;
                if (editText == null) {
                    return;
                }
                Editable text = editText.getText();
                if (text != null) {
                    text.clear();
                }
                qnVar.p();
                return;
            case 1:
                CrashActivity crashActivity = (CrashActivity) obj;
                int i4 = CrashActivity.b;
                Intent intent = new Intent(crashActivity, (Class<?>) Hometab.class);
                intent.addFlags(268468224);
                crashActivity.startActivity(intent);
                crashActivity.finish();
                return;
            case 2:
                ((b00) obj).t();
                return;
            case 3:
                Hometab hometab = (Hometab) obj;
                DrawerLayout drawerLayout = hometab.d;
                if (drawerLayout == null) {
                    yg0.N("drawerLayout");
                    throw null;
                }
                drawerLayout.d();
                Fragment fragmentC = hometab.getSupportFragmentManager().C("f0");
                final HomeFragment homeFragment = fragmentC instanceof HomeFragment ? (HomeFragment) fragmentC : null;
                if (homeFragment != null) {
                    View viewInflate = homeFragment.g().inflate(R.layout.dialog_voucher, (ViewGroup) null);
                    g gVar = homeFragment.I0;
                    if (gVar != null) {
                        gVar.dismiss();
                    }
                    MaterialAlertDialogBuilder materialAlertDialogBuilder = new MaterialAlertDialogBuilder(homeFragment.L());
                    materialAlertDialogBuilder.a.r = viewInflate;
                    homeFragment.I0 = materialAlertDialogBuilder.a();
                    final MaterialButton materialButton = (MaterialButton) viewInflate.findViewById(R.id.btnRedeemVoucher);
                    final ProgressBar progressBar = (ProgressBar) viewInflate.findViewById(R.id.redeemVoucherLoader);
                    final TextInputEditText textInputEditText = (TextInputEditText) viewInflate.findViewById(R.id.etVoucherCode);
                    ((CardView) viewInflate.findViewById(R.id.cardGetVoucher)).setOnClickListener(new yc0(homeFragment, i2));
                    materialButton.setOnClickListener(new View.OnClickListener() { // from class: com.v2ray.ang.ui.c
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            String string;
                            int i5 = HomeFragment.f2;
                            Editable text2 = textInputEditText.getText();
                            String string2 = (text2 == null || (string = text2.toString()) == null) ? null : kotlin.text.g.c0(string).toString();
                            if (string2 == null) {
                                string2 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                            }
                            HomeFragment homeFragment2 = homeFragment;
                            homeFragment2.I1 = string2;
                            if (string2.length() == 0) {
                                qf3.N(homeFragment2.M(), "Enter voucher code");
                                return;
                            }
                            MaterialButton materialButton2 = materialButton;
                            materialButton2.setVisibility(8);
                            ProgressBar progressBar2 = progressBar;
                            progressBar2.setVisibility(0);
                            kotlinx.coroutines.c.d(m.a(homeFragment2.l()), null, null, new HomeFragment$voucherAuth$1(new Ref$BooleanRef(), homeFragment2, true, new id0(homeFragment2, 0, progressBar2, materialButton2), null), 3);
                        }
                    });
                    Lazy lazy = zq0.a;
                    String strE = zq0.u().e("CurrentVoucher", null);
                    if (strE != null) {
                        textInputEditText.setText(strE);
                    }
                    g gVar2 = homeFragment.I0;
                    if (gVar2 != null) {
                        gVar2.show();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                MaterialDatePicker materialDatePicker = (MaterialDatePicker) obj;
                materialDatePicker.O0.setEnabled(materialDatePicker.c0().isSelectionComplete());
                materialDatePicker.M0.toggle();
                materialDatePicker.B0 = materialDatePicker.B0 == 1 ? 0 : 1;
                materialDatePicker.g0(materialDatePicker.M0);
                materialDatePicker.f0();
                return;
            case 5:
                gw0 gw0Var = (gw0) obj;
                EditText editText2 = gw0Var.f;
                if (editText2 == null) {
                    return;
                }
                int selectionEnd = editText2.getSelectionEnd();
                EditText editText3 = gw0Var.f;
                int i5 = (editText3 == null || !(editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) ? 0 : 1;
                EditText editText4 = gw0Var.f;
                if (i5 != 0) {
                    editText4.setTransformationMethod(null);
                } else {
                    editText4.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
                if (selectionEnd >= 0) {
                    gw0Var.f.setSelection(selectionEnd);
                }
                gw0Var.p();
                return;
            case 6:
                PerAppProxyActivity perAppProxyActivity = (PerAppProxyActivity) obj;
                int i6 = PerAppProxyActivity.f;
                Typeface typeface = cf1.a;
                cf1.a(perAppProxyActivity, perAppProxyActivity.getString(R.string.summary_pref_per_app_proxy), n8.p(perAppProxyActivity, 2131230936), perAppProxyActivity.getColor(R.color.infoColor), perAppProxyActivity.getColor(R.color.defaultTextColor), 1, true).show();
                return;
            case 7:
                int i7 = QROverlayView.r;
                ((Function1) obj).invoke(Boolean.valueOf(!view.isSelected()));
                return;
            case 8:
                int i8 = QROverlayView.r;
                ((l8) obj).invoke();
                return;
            case 9:
                int i9 = QROverlayView.r;
                ((zz0) obj).invoke(Boolean.valueOf(!view.isSelected()));
                return;
            case 10:
                RoutingSettingActivity routingSettingActivity = (RoutingSettingActivity) obj;
                int i10 = RoutingSettingActivity.j;
                AlertDialog.Builder builder = new AlertDialog.Builder(routingSettingActivity);
                Object value = routingSettingActivity.f.getValue();
                value.getClass();
                List listAsList = Arrays.asList((String[]) value);
                listAsList.getClass();
                builder.setItems((CharSequence[]) listAsList.toArray(new String[0]), new g41(routingSettingActivity, i3)).show();
                return;
            case 11:
                ServerStatusVIew serverStatusVIew = (ServerStatusVIew) obj;
                int i11 = ServerStatusVIew.c;
                Intent intent2 = new Intent(serverStatusVIew, (Class<?>) Hometab.class);
                intent2.setFlags(603979776);
                serverStatusVIew.startActivity(intent2);
                serverStatusVIew.finish();
                return;
            case 12:
                a aVar = (a) obj;
                if (aVar.i && aVar.isShowing()) {
                    if (!aVar.k) {
                        TypedArray typedArrayObtainStyledAttributes = aVar.getContext().obtainStyledAttributes(new int[]{android.R.attr.windowCloseOnTouchOutside});
                        aVar.j = typedArrayObtainStyledAttributes.getBoolean(0, true);
                        typedArrayObtainStyledAttributes.recycle();
                        aVar.k = true;
                    }
                    if (aVar.j) {
                        aVar.cancel();
                        return;
                    }
                    return;
                }
                return;
            default:
                UserAssetActivity userAssetActivity = (UserAssetActivity) obj;
                int i12 = UserAssetActivity.j;
                AlertDialog.Builder builder2 = new AlertDialog.Builder(userAssetActivity);
                AppConfig.a.getClass();
                builder2.setItems((CharSequence[]) AppConfig.j.toArray(new String[0]), new gl(userAssetActivity, i2)).show();
                return;
        }
    }
}
