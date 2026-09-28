package com.v2ray.ang.ui;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.Spinner;
import androidx.appcompat.widget.SwitchCompat;
import dev.zeron.tunnel.R;
import com.v2ray.ang.ui.RoutingEditActivity;
import defpackage.e3;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/v2ray/ang/ui/RoutingEditActivity;", "Lcom/v2ray/ang/ui/BaseActivity;", "<init>", "()V", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RoutingEditActivity extends BaseActivity {
    public static final /* synthetic */ int f = 0;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;

    public RoutingEditActivity() {
        final int i = 0;
        this.c = kotlin.c.b(new Function0(this) { // from class: f41
            public final /* synthetic */ RoutingEditActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                RoutingEditActivity routingEditActivity = this.b;
                switch (i2) {
                    case 0:
                        int i3 = RoutingEditActivity.f;
                        View viewInflate = routingEditActivity.getLayoutInflater().inflate(R.layout.activity_routing_edit, (ViewGroup) null, false);
                        int i4 = R.id.chk_locked;
                        SwitchCompat switchCompat = (SwitchCompat) l02.n(R.id.chk_locked, viewInflate);
                        if (switchCompat != null) {
                            i4 = R.id.et_domain;
                            EditText editText = (EditText) l02.n(R.id.et_domain, viewInflate);
                            if (editText != null) {
                                i4 = R.id.et_ip;
                                EditText editText2 = (EditText) l02.n(R.id.et_ip, viewInflate);
                                if (editText2 != null) {
                                    i4 = R.id.et_network;
                                    EditText editText3 = (EditText) l02.n(R.id.et_network, viewInflate);
                                    if (editText3 != null) {
                                        i4 = R.id.et_port;
                                        EditText editText4 = (EditText) l02.n(R.id.et_port, viewInflate);
                                        if (editText4 != null) {
                                            i4 = R.id.et_protocol;
                                            EditText editText5 = (EditText) l02.n(R.id.et_protocol, viewInflate);
                                            if (editText5 != null) {
                                                i4 = R.id.et_remarks;
                                                EditText editText6 = (EditText) l02.n(R.id.et_remarks, viewInflate);
                                                if (editText6 != null) {
                                                    i4 = R.id.sp_outbound_tag;
                                                    Spinner spinner = (Spinner) l02.n(R.id.sp_outbound_tag, viewInflate);
                                                    if (spinner != null) {
                                                        return new e3((ScrollView) viewInflate, switchCompat, editText, editText2, editText3, editText4, editText5, editText6, spinner);
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
                    case 1:
                        int i5 = RoutingEditActivity.f;
                        return Integer.valueOf(routingEditActivity.getIntent().getIntExtra("position", -1));
                    default:
                        int i6 = RoutingEditActivity.f;
                        return routingEditActivity.getResources().getStringArray(R.array.outbound_tag);
                }
            }
        });
        final int i2 = 1;
        this.d = kotlin.c.b(new Function0(this) { // from class: f41
            public final /* synthetic */ RoutingEditActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                RoutingEditActivity routingEditActivity = this.b;
                switch (i22) {
                    case 0:
                        int i3 = RoutingEditActivity.f;
                        View viewInflate = routingEditActivity.getLayoutInflater().inflate(R.layout.activity_routing_edit, (ViewGroup) null, false);
                        int i4 = R.id.chk_locked;
                        SwitchCompat switchCompat = (SwitchCompat) l02.n(R.id.chk_locked, viewInflate);
                        if (switchCompat != null) {
                            i4 = R.id.et_domain;
                            EditText editText = (EditText) l02.n(R.id.et_domain, viewInflate);
                            if (editText != null) {
                                i4 = R.id.et_ip;
                                EditText editText2 = (EditText) l02.n(R.id.et_ip, viewInflate);
                                if (editText2 != null) {
                                    i4 = R.id.et_network;
                                    EditText editText3 = (EditText) l02.n(R.id.et_network, viewInflate);
                                    if (editText3 != null) {
                                        i4 = R.id.et_port;
                                        EditText editText4 = (EditText) l02.n(R.id.et_port, viewInflate);
                                        if (editText4 != null) {
                                            i4 = R.id.et_protocol;
                                            EditText editText5 = (EditText) l02.n(R.id.et_protocol, viewInflate);
                                            if (editText5 != null) {
                                                i4 = R.id.et_remarks;
                                                EditText editText6 = (EditText) l02.n(R.id.et_remarks, viewInflate);
                                                if (editText6 != null) {
                                                    i4 = R.id.sp_outbound_tag;
                                                    Spinner spinner = (Spinner) l02.n(R.id.sp_outbound_tag, viewInflate);
                                                    if (spinner != null) {
                                                        return new e3((ScrollView) viewInflate, switchCompat, editText, editText2, editText3, editText4, editText5, editText6, spinner);
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
                    case 1:
                        int i5 = RoutingEditActivity.f;
                        return Integer.valueOf(routingEditActivity.getIntent().getIntExtra("position", -1));
                    default:
                        int i6 = RoutingEditActivity.f;
                        return routingEditActivity.getResources().getStringArray(R.array.outbound_tag);
                }
            }
        });
        final int i3 = 2;
        this.e = kotlin.c.b(new Function0(this) { // from class: f41
            public final /* synthetic */ RoutingEditActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                RoutingEditActivity routingEditActivity = this.b;
                switch (i22) {
                    case 0:
                        int i32 = RoutingEditActivity.f;
                        View viewInflate = routingEditActivity.getLayoutInflater().inflate(R.layout.activity_routing_edit, (ViewGroup) null, false);
                        int i4 = R.id.chk_locked;
                        SwitchCompat switchCompat = (SwitchCompat) l02.n(R.id.chk_locked, viewInflate);
                        if (switchCompat != null) {
                            i4 = R.id.et_domain;
                            EditText editText = (EditText) l02.n(R.id.et_domain, viewInflate);
                            if (editText != null) {
                                i4 = R.id.et_ip;
                                EditText editText2 = (EditText) l02.n(R.id.et_ip, viewInflate);
                                if (editText2 != null) {
                                    i4 = R.id.et_network;
                                    EditText editText3 = (EditText) l02.n(R.id.et_network, viewInflate);
                                    if (editText3 != null) {
                                        i4 = R.id.et_port;
                                        EditText editText4 = (EditText) l02.n(R.id.et_port, viewInflate);
                                        if (editText4 != null) {
                                            i4 = R.id.et_protocol;
                                            EditText editText5 = (EditText) l02.n(R.id.et_protocol, viewInflate);
                                            if (editText5 != null) {
                                                i4 = R.id.et_remarks;
                                                EditText editText6 = (EditText) l02.n(R.id.et_remarks, viewInflate);
                                                if (editText6 != null) {
                                                    i4 = R.id.sp_outbound_tag;
                                                    Spinner spinner = (Spinner) l02.n(R.id.sp_outbound_tag, viewInflate);
                                                    if (spinner != null) {
                                                        return new e3((ScrollView) viewInflate, switchCompat, editText, editText2, editText3, editText4, editText5, editText6, spinner);
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
                    case 1:
                        int i5 = RoutingEditActivity.f;
                        return Integer.valueOf(routingEditActivity.getIntent().getIntExtra("position", -1));
                    default:
                        int i6 = RoutingEditActivity.f;
                        return routingEditActivity.getResources().getStringArray(R.array.outbound_tag);
                }
            }
        });
    }

    public final e3 h() {
        return (e3) this.c.getValue();
    }

    public final int i() {
        return ((Number) this.d.getValue()).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x001d  */
    @Override // com.v2ray.ang.ui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r9) {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.v2ray.ang.ui.RoutingEditActivity.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.getClass();
        getMenuInflater().inflate(R.menu.action_server, menu);
        MenuItem menuItemFindItem = menu.findItem(R.id.del_config);
        if (i() < 0 && menuItemFindItem != null) {
            menuItemFindItem.setVisible(false);
        }
        return super.onCreateOptionsMenu(menu);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    @Override // com.v2ray.ang.ui.BaseActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onOptionsItemSelected(android.view.MenuItem r18) {
        /*
            Method dump skipped, instruction units count: 618
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.v2ray.ang.ui.RoutingEditActivity.onOptionsItemSelected(android.view.MenuItem):boolean");
    }
}
