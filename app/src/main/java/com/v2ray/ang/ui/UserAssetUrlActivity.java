package com.v2ray.ang.ui;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ScrollView;
import dev.zeron.tunnel.R;
import com.google.android.gms.ads.RequestConfiguration;
import com.v2ray.ang.dto.AssetUrlItem;
import com.v2ray.ang.ui.UserAssetUrlActivity;
import defpackage.aj0;
import defpackage.m3;
import defpackage.ul1;
import defpackage.xu;
import defpackage.zq0;
import java.io.File;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.text.Regex;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/v2ray/ang/ui/UserAssetUrlActivity;", "Lcom/v2ray/ang/ui/BaseActivity;", "<init>", "()V", "Companion", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class UserAssetUrlActivity extends BaseActivity {
    public static final /* synthetic */ int h = 0;
    public final Lazy c;
    public MenuItem d;
    public MenuItem e;
    public final Lazy f;
    public final Lazy g;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/v2ray/ang/ui/UserAssetUrlActivity$Companion;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "ASSET_URL_QRCODE", "Ljava/lang/String;", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public Companion(xu xuVar) {
        }
    }

    static {
        new Companion(null);
    }

    public UserAssetUrlActivity() {
        final int i = 0;
        this.c = kotlin.c.b(new Function0(this) { // from class: nl1
            public final /* synthetic */ UserAssetUrlActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                UserAssetUrlActivity userAssetUrlActivity = this.b;
                switch (i2) {
                    case 0:
                        int i3 = UserAssetUrlActivity.h;
                        View viewInflate = userAssetUrlActivity.getLayoutInflater().inflate(R.layout.activity_user_asset_url, (ViewGroup) null, false);
                        int i4 = R.id.et_remarks;
                        EditText editText = (EditText) l02.n(R.id.et_remarks, viewInflate);
                        if (editText != null) {
                            i4 = R.id.et_url;
                            EditText editText2 = (EditText) l02.n(R.id.et_url, viewInflate);
                            if (editText2 != null) {
                                return new m3((ScrollView) viewInflate, editText, editText2);
                            }
                        }
                        io0.e("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i4)));
                        return null;
                    case 1:
                        int i5 = UserAssetUrlActivity.h;
                        Regex regex = ul1.a;
                        return new File(ul1.E(userAssetUrlActivity));
                    default:
                        int i6 = UserAssetUrlActivity.h;
                        String stringExtra = userAssetUrlActivity.getIntent().getStringExtra("assetId");
                        return stringExtra == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : stringExtra;
                }
            }
        });
        final int i2 = 1;
        this.f = kotlin.c.b(new Function0(this) { // from class: nl1
            public final /* synthetic */ UserAssetUrlActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                UserAssetUrlActivity userAssetUrlActivity = this.b;
                switch (i22) {
                    case 0:
                        int i3 = UserAssetUrlActivity.h;
                        View viewInflate = userAssetUrlActivity.getLayoutInflater().inflate(R.layout.activity_user_asset_url, (ViewGroup) null, false);
                        int i4 = R.id.et_remarks;
                        EditText editText = (EditText) l02.n(R.id.et_remarks, viewInflate);
                        if (editText != null) {
                            i4 = R.id.et_url;
                            EditText editText2 = (EditText) l02.n(R.id.et_url, viewInflate);
                            if (editText2 != null) {
                                return new m3((ScrollView) viewInflate, editText, editText2);
                            }
                        }
                        io0.e("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i4)));
                        return null;
                    case 1:
                        int i5 = UserAssetUrlActivity.h;
                        Regex regex = ul1.a;
                        return new File(ul1.E(userAssetUrlActivity));
                    default:
                        int i6 = UserAssetUrlActivity.h;
                        String stringExtra = userAssetUrlActivity.getIntent().getStringExtra("assetId");
                        return stringExtra == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : stringExtra;
                }
            }
        });
        final int i3 = 2;
        this.g = kotlin.c.b(new Function0(this) { // from class: nl1
            public final /* synthetic */ UserAssetUrlActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                UserAssetUrlActivity userAssetUrlActivity = this.b;
                switch (i22) {
                    case 0:
                        int i32 = UserAssetUrlActivity.h;
                        View viewInflate = userAssetUrlActivity.getLayoutInflater().inflate(R.layout.activity_user_asset_url, (ViewGroup) null, false);
                        int i4 = R.id.et_remarks;
                        EditText editText = (EditText) l02.n(R.id.et_remarks, viewInflate);
                        if (editText != null) {
                            i4 = R.id.et_url;
                            EditText editText2 = (EditText) l02.n(R.id.et_url, viewInflate);
                            if (editText2 != null) {
                                return new m3((ScrollView) viewInflate, editText, editText2);
                            }
                        }
                        io0.e("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i4)));
                        return null;
                    case 1:
                        int i5 = UserAssetUrlActivity.h;
                        Regex regex = ul1.a;
                        return new File(ul1.E(userAssetUrlActivity));
                    default:
                        int i6 = UserAssetUrlActivity.h;
                        String stringExtra = userAssetUrlActivity.getIntent().getStringExtra("assetId");
                        return stringExtra == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : stringExtra;
                }
            }
        });
    }

    public final m3 h() {
        return (m3) this.c.getValue();
    }

    public final String i() {
        return (String) this.g.getValue();
    }

    @Override // com.v2ray.ang.ui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(h().a);
        setTitle(getString(R.string.title_user_asset_add_url));
        Lazy lazy = zq0.a;
        String strI = i();
        strI.getClass();
        String strD = zq0.r().d(strI);
        AssetUrlItem assetUrlItem = strD == null ? null : (AssetUrlItem) aj0.a(AssetUrlItem.class, strD);
        String stringExtra = getIntent().getStringExtra("ASSET_URL_QRCODE");
        String name = new File(String.valueOf(stringExtra)).getName();
        if (assetUrlItem != null) {
            EditText editText = h().b;
            Regex regex = ul1.a;
            editText.setText(ul1.j(assetUrlItem.getRemarks()));
            h().c.setText(ul1.j(assetUrlItem.getUrl()));
            return;
        }
        if (stringExtra != null) {
            h().b.setText(name);
            h().c.setText(stringExtra);
        } else {
            h().b.setText((CharSequence) null);
            h().c.setText((CharSequence) null);
        }
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        MenuItem menuItem;
        menu.getClass();
        getMenuInflater().inflate(R.menu.action_server, menu);
        this.d = menu.findItem(R.id.del_config);
        this.e = menu.findItem(R.id.save_config);
        if (i().length() == 0 && (menuItem = this.d) != null) {
            menuItem.setVisible(false);
        }
        return super.onCreateOptionsMenu(menu);
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x017c  */
    @Override // com.v2ray.ang.ui.BaseActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onOptionsItemSelected(android.view.MenuItem r15) {
        /*
            Method dump skipped, instruction units count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.v2ray.ang.ui.UserAssetUrlActivity.onOptionsItemSelected(android.view.MenuItem):boolean");
    }
}
