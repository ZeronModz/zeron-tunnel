package com.v2ray.ang.ui;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ScrollView;
import androidx.appcompat.app.AlertDialog$Builder;
import dev.zeron.tunnel.R;
import com.blacksquircle.ui.editorkit.widget.TextProcessor;
import com.blacksquircle.ui.language.json.JsonLanguage;
import com.google.android.gms.ads.RequestConfiguration;
import com.tencent.mmkv.MMKV;
import com.v2ray.ang.dto.EConfigType;
import com.v2ray.ang.dto.ProfileItem;
import com.v2ray.ang.ui.ServerCustomConfigActivity;
import defpackage.g3;
import defpackage.gl;
import defpackage.k;
import defpackage.qf3;
import defpackage.t00;
import defpackage.ul1;
import defpackage.vs;
import defpackage.zq0;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.text.Regex;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/v2ray/ang/ui/ServerCustomConfigActivity;", "Lcom/v2ray/ang/ui/BaseActivity;", "<init>", "()V", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ServerCustomConfigActivity extends BaseActivity {
    public static final /* synthetic */ int f = 0;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;

    public ServerCustomConfigActivity() {
        final int i = 0;
        this.c = kotlin.c.b(new Function0(this) { // from class: n61
            public final /* synthetic */ ServerCustomConfigActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                boolean z = false;
                ServerCustomConfigActivity serverCustomConfigActivity = this.b;
                switch (i2) {
                    case 0:
                        int i3 = ServerCustomConfigActivity.f;
                        View viewInflate = serverCustomConfigActivity.getLayoutInflater().inflate(R.layout.activity_server_custom_config, (ViewGroup) null, false);
                        int i4 = R.id.editor;
                        TextProcessor textProcessor = (TextProcessor) l02.n(R.id.editor, viewInflate);
                        if (textProcessor != null) {
                            i4 = R.id.et_remarks;
                            EditText editText = (EditText) l02.n(R.id.et_remarks, viewInflate);
                            if (editText != null) {
                                return new g3((ScrollView) viewInflate, textProcessor, editText);
                            }
                        }
                        io0.e("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i4)));
                        return null;
                    case 1:
                        int i5 = ServerCustomConfigActivity.f;
                        String stringExtra = serverCustomConfigActivity.getIntent().getStringExtra("guid");
                        return stringExtra == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : stringExtra;
                    default:
                        int i6 = ServerCustomConfigActivity.f;
                        if (serverCustomConfigActivity.getIntent().getBooleanExtra("isRunning", false) && serverCustomConfigActivity.i().length() > 0) {
                            String strI = serverCustomConfigActivity.i();
                            Lazy lazy = zq0.a;
                            if (yg0.a(strI, zq0.x())) {
                                z = true;
                            }
                        }
                        return Boolean.valueOf(z);
                }
            }
        });
        final int i2 = 1;
        this.d = kotlin.c.b(new Function0(this) { // from class: n61
            public final /* synthetic */ ServerCustomConfigActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                boolean z = false;
                ServerCustomConfigActivity serverCustomConfigActivity = this.b;
                switch (i22) {
                    case 0:
                        int i3 = ServerCustomConfigActivity.f;
                        View viewInflate = serverCustomConfigActivity.getLayoutInflater().inflate(R.layout.activity_server_custom_config, (ViewGroup) null, false);
                        int i4 = R.id.editor;
                        TextProcessor textProcessor = (TextProcessor) l02.n(R.id.editor, viewInflate);
                        if (textProcessor != null) {
                            i4 = R.id.et_remarks;
                            EditText editText = (EditText) l02.n(R.id.et_remarks, viewInflate);
                            if (editText != null) {
                                return new g3((ScrollView) viewInflate, textProcessor, editText);
                            }
                        }
                        io0.e("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i4)));
                        return null;
                    case 1:
                        int i5 = ServerCustomConfigActivity.f;
                        String stringExtra = serverCustomConfigActivity.getIntent().getStringExtra("guid");
                        return stringExtra == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : stringExtra;
                    default:
                        int i6 = ServerCustomConfigActivity.f;
                        if (serverCustomConfigActivity.getIntent().getBooleanExtra("isRunning", false) && serverCustomConfigActivity.i().length() > 0) {
                            String strI = serverCustomConfigActivity.i();
                            Lazy lazy = zq0.a;
                            if (yg0.a(strI, zq0.x())) {
                                z = true;
                            }
                        }
                        return Boolean.valueOf(z);
                }
            }
        });
        final int i3 = 2;
        this.e = kotlin.c.b(new Function0(this) { // from class: n61
            public final /* synthetic */ ServerCustomConfigActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                boolean z = false;
                ServerCustomConfigActivity serverCustomConfigActivity = this.b;
                switch (i22) {
                    case 0:
                        int i32 = ServerCustomConfigActivity.f;
                        View viewInflate = serverCustomConfigActivity.getLayoutInflater().inflate(R.layout.activity_server_custom_config, (ViewGroup) null, false);
                        int i4 = R.id.editor;
                        TextProcessor textProcessor = (TextProcessor) l02.n(R.id.editor, viewInflate);
                        if (textProcessor != null) {
                            i4 = R.id.et_remarks;
                            EditText editText = (EditText) l02.n(R.id.et_remarks, viewInflate);
                            if (editText != null) {
                                return new g3((ScrollView) viewInflate, textProcessor, editText);
                            }
                        }
                        io0.e("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i4)));
                        return null;
                    case 1:
                        int i5 = ServerCustomConfigActivity.f;
                        String stringExtra = serverCustomConfigActivity.getIntent().getStringExtra("guid");
                        return stringExtra == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : stringExtra;
                    default:
                        int i6 = ServerCustomConfigActivity.f;
                        if (serverCustomConfigActivity.getIntent().getBooleanExtra("isRunning", false) && serverCustomConfigActivity.i().length() > 0) {
                            String strI = serverCustomConfigActivity.i();
                            Lazy lazy = zq0.a;
                            if (yg0.a(strI, zq0.x())) {
                                z = true;
                            }
                        }
                        return Boolean.valueOf(z);
                }
            }
        });
    }

    public final g3 h() {
        return (g3) this.c.getValue();
    }

    public final String i() {
        return (String) this.d.getValue();
    }

    @Override // com.v2ray.ang.ui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(h().a);
        setTitle(getString(R.string.title_server));
        Regex regex = ul1.a;
        if ((getResources().getConfiguration().uiMode & 48) == 16) {
            h().b.setColorScheme(t00.b);
        }
        h().b.setLanguage(new JsonLanguage());
        Lazy lazy = zq0.a;
        ProfileItem profileItemE = zq0.e(i());
        if (profileItemE == null) {
            h().c.setText((CharSequence) null);
            return;
        }
        h().c.setText(ul1.j(profileItemE.getRemarks()));
        String strI = i();
        strI.getClass();
        String strD = ((MMKV) zq0.c.getValue()).d(strI);
        if (strD == null) {
            strD = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        h().b.setTextContent(ul1.j(strD));
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.getClass();
        getMenuInflater().inflate(R.menu.action_server, menu);
        MenuItem menuItemFindItem = menu.findItem(R.id.del_config);
        MenuItem menuItemFindItem2 = menu.findItem(R.id.save_config);
        if (i().length() > 0) {
            if (((Boolean) this.e.getValue()).booleanValue()) {
                if (menuItemFindItem != null) {
                    menuItemFindItem.setVisible(false);
                }
                if (menuItemFindItem2 != null) {
                    menuItemFindItem2.setVisible(false);
                }
            }
        } else if (menuItemFindItem != null) {
            menuItemFindItem.setVisible(false);
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override // com.v2ray.ang.ui.BaseActivity, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        String remarks;
        menuItem.getClass();
        int itemId = menuItem.getItemId();
        if (itemId == R.id.del_config) {
            if (i().length() > 0) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
                alertDialog$Builder.b(R.string.del_config_comfirm);
                alertDialog$Builder.d(android.R.string.ok, new gl(this, 2));
                alertDialog$Builder.c(android.R.string.cancel, new k(7));
                alertDialog$Builder.f();
            }
            return true;
        }
        if (itemId != R.id.save_config) {
            return super.onOptionsItemSelected(menuItem);
        }
        if (TextUtils.isEmpty(h().c.getText().toString())) {
            qf3.K(this, R.string.server_lab_remarks);
            return true;
        }
        try {
            ProfileItem profileItemE = vs.a.e(h().b.getText().toString());
            Lazy lazy = zq0.a;
            ProfileItem profileItemE2 = zq0.e(i());
            if (profileItemE2 == null) {
                profileItemE2 = ProfileItem.INSTANCE.create(EConfigType.CUSTOM);
            }
            Editable text = h().c.getText();
            if (text == null || text.length() == 0) {
                remarks = profileItemE.getRemarks();
                if (remarks == null) {
                    remarks = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                }
            } else {
                remarks = text.toString();
            }
            profileItemE2.setRemarks(remarks);
            profileItemE2.setServer(profileItemE.getServer());
            profileItemE2.setServerPort(profileItemE.getServerPort());
            zq0.l(i(), profileItemE2);
            zq0.n(i(), h().b.getText().toString());
            qf3.O(this);
            finish();
            return true;
        } catch (Exception e) {
            String string = getString(R.string.toast_malformed_josn);
            Throwable cause = e.getCause();
            qf3.L(this, string + " " + (cause != null ? cause.getMessage() : null));
            return true;
        }
    }
}
