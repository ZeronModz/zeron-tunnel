package com.v2ray.ang.ui;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ScrollView;
import androidx.appcompat.widget.SwitchCompat;
import dev.zeron.tunnel.R;
import com.google.android.gms.ads.RequestConfiguration;
import com.v2ray.ang.dto.SubscriptionItem;
import com.v2ray.ang.ui.SubEditActivity;
import defpackage.i3;
import defpackage.ul1;
import defpackage.zq0;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.text.Regex;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/v2ray/ang/ui/SubEditActivity;", "Lcom/v2ray/ang/ui/BaseActivity;", "<init>", "()V", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SubEditActivity extends BaseActivity {
    public static final /* synthetic */ int g = 0;
    public final Lazy c;
    public MenuItem d;
    public MenuItem e;
    public final Lazy f;

    public SubEditActivity() {
        final int i = 0;
        this.c = kotlin.c.b(new Function0(this) { // from class: pb1
            public final /* synthetic */ SubEditActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SubEditActivity subEditActivity = this.b;
                switch (i2) {
                    case 0:
                        int i3 = SubEditActivity.g;
                        View viewInflate = subEditActivity.getLayoutInflater().inflate(R.layout.activity_sub_edit, (ViewGroup) null, false);
                        int i4 = R.id.allow_insecure_url;
                        SwitchCompat switchCompat = (SwitchCompat) l02.n(R.id.allow_insecure_url, viewInflate);
                        if (switchCompat != null) {
                            i4 = R.id.auto_update_check;
                            SwitchCompat switchCompat2 = (SwitchCompat) l02.n(R.id.auto_update_check, viewInflate);
                            if (switchCompat2 != null) {
                                i4 = R.id.chk_enable;
                                SwitchCompat switchCompat3 = (SwitchCompat) l02.n(R.id.chk_enable, viewInflate);
                                if (switchCompat3 != null) {
                                    i4 = R.id.et_filter;
                                    EditText editText = (EditText) l02.n(R.id.et_filter, viewInflate);
                                    if (editText != null) {
                                        i4 = R.id.et_next_profile;
                                        EditText editText2 = (EditText) l02.n(R.id.et_next_profile, viewInflate);
                                        if (editText2 != null) {
                                            i4 = R.id.et_pre_profile;
                                            EditText editText3 = (EditText) l02.n(R.id.et_pre_profile, viewInflate);
                                            if (editText3 != null) {
                                                i4 = R.id.et_remarks;
                                                EditText editText4 = (EditText) l02.n(R.id.et_remarks, viewInflate);
                                                if (editText4 != null) {
                                                    i4 = R.id.et_url;
                                                    EditText editText5 = (EditText) l02.n(R.id.et_url, viewInflate);
                                                    if (editText5 != null) {
                                                        return new i3((ScrollView) viewInflate, switchCompat, switchCompat2, switchCompat3, editText, editText2, editText3, editText4, editText5);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        io0.e("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i4)));
                        return null;
                    default:
                        int i5 = SubEditActivity.g;
                        String stringExtra = subEditActivity.getIntent().getStringExtra("subId");
                        return stringExtra == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : stringExtra;
                }
            }
        });
        final int i2 = 1;
        this.f = kotlin.c.b(new Function0(this) { // from class: pb1
            public final /* synthetic */ SubEditActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SubEditActivity subEditActivity = this.b;
                switch (i22) {
                    case 0:
                        int i3 = SubEditActivity.g;
                        View viewInflate = subEditActivity.getLayoutInflater().inflate(R.layout.activity_sub_edit, (ViewGroup) null, false);
                        int i4 = R.id.allow_insecure_url;
                        SwitchCompat switchCompat = (SwitchCompat) l02.n(R.id.allow_insecure_url, viewInflate);
                        if (switchCompat != null) {
                            i4 = R.id.auto_update_check;
                            SwitchCompat switchCompat2 = (SwitchCompat) l02.n(R.id.auto_update_check, viewInflate);
                            if (switchCompat2 != null) {
                                i4 = R.id.chk_enable;
                                SwitchCompat switchCompat3 = (SwitchCompat) l02.n(R.id.chk_enable, viewInflate);
                                if (switchCompat3 != null) {
                                    i4 = R.id.et_filter;
                                    EditText editText = (EditText) l02.n(R.id.et_filter, viewInflate);
                                    if (editText != null) {
                                        i4 = R.id.et_next_profile;
                                        EditText editText2 = (EditText) l02.n(R.id.et_next_profile, viewInflate);
                                        if (editText2 != null) {
                                            i4 = R.id.et_pre_profile;
                                            EditText editText3 = (EditText) l02.n(R.id.et_pre_profile, viewInflate);
                                            if (editText3 != null) {
                                                i4 = R.id.et_remarks;
                                                EditText editText4 = (EditText) l02.n(R.id.et_remarks, viewInflate);
                                                if (editText4 != null) {
                                                    i4 = R.id.et_url;
                                                    EditText editText5 = (EditText) l02.n(R.id.et_url, viewInflate);
                                                    if (editText5 != null) {
                                                        return new i3((ScrollView) viewInflate, switchCompat, switchCompat2, switchCompat3, editText, editText2, editText3, editText4, editText5);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        io0.e("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i4)));
                        return null;
                    default:
                        int i5 = SubEditActivity.g;
                        String stringExtra = subEditActivity.getIntent().getStringExtra("subId");
                        return stringExtra == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : stringExtra;
                }
            }
        });
    }

    public final i3 h() {
        return (i3) this.c.getValue();
    }

    public final String i() {
        return (String) this.f.getValue();
    }

    @Override // com.v2ray.ang.ui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(h().a);
        setTitle(getString(R.string.title_sub_setting));
        Lazy lazy = zq0.a;
        SubscriptionItem subscriptionItemH = zq0.h(i());
        if (subscriptionItemH == null) {
            h().h.setText((CharSequence) null);
            h().i.setText((CharSequence) null);
            h().e.setText((CharSequence) null);
            h().d.setChecked(true);
            h().g.setText((CharSequence) null);
            h().f.setText((CharSequence) null);
            return;
        }
        EditText editText = h().h;
        Regex regex = ul1.a;
        editText.setText(ul1.j(subscriptionItemH.getRemarks()));
        h().i.setText(ul1.j(subscriptionItemH.getUrl()));
        h().e.setText(ul1.j(subscriptionItemH.getFilter()));
        h().d.setChecked(subscriptionItemH.getEnabled());
        h().c.setChecked(subscriptionItemH.getAutoUpdate());
        h().b.setChecked(subscriptionItemH.getAllowInsecureUrl());
        h().g.setText(ul1.j(subscriptionItemH.getPrevProfile()));
        h().f.setText(ul1.j(subscriptionItemH.getNextProfile()));
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

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00fc, code lost:
    
        if (r1.getAllowInsecureUrl() == false) goto L31;
     */
    @Override // com.v2ray.ang.ui.BaseActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onOptionsItemSelected(android.view.MenuItem r21) {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.v2ray.ang.ui.SubEditActivity.onOptionsItemSelected(android.view.MenuItem):boolean");
    }
}
