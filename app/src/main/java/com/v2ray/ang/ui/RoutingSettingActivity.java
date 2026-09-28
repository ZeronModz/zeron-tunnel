package com.v2ray.ang.ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts$RequestPermission;
import androidx.activity.result.contract.ActivityResultContracts$StartActivityForResult;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.AlertDialog$Builder;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.m;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import dev.zeron.tunnel.R;
import com.v2ray.ang.helper.SimpleItemTouchHelperCallback;
import com.v2ray.ang.ui.RoutingSettingActivity;
import com.v2ray.ang.ui.RoutingSettingRecyclerAdapter;
import com.v2ray.ang.ui.ScannerActivity;
import defpackage.aj0;
import defpackage.f3;
import defpackage.g41;
import defpackage.hv;
import defpackage.k;
import defpackage.lv;
import defpackage.mn;
import defpackage.oy;
import defpackage.qf3;
import defpackage.s31;
import defpackage.ul1;
import defpackage.zq0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.text.Regex;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/v2ray/ang/ui/RoutingSettingActivity;", "Lcom/v2ray/ang/ui/BaseActivity;", "<init>", "()V", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RoutingSettingActivity extends BaseActivity {
    public static final /* synthetic */ int j = 0;
    public final Lazy c;
    public final ArrayList d = new ArrayList();
    public final Lazy e;
    public final Lazy f;
    public final Lazy g;
    public final ActivityResultLauncher h;
    public final ActivityResultLauncher i;

    public RoutingSettingActivity() {
        final int i = 0;
        this.c = kotlin.c.b(new Function0(this) { // from class: h41
            public final /* synthetic */ RoutingSettingActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                RoutingSettingActivity routingSettingActivity = this.b;
                switch (i2) {
                    case 0:
                        int i3 = RoutingSettingActivity.j;
                        View viewInflate = routingSettingActivity.getLayoutInflater().inflate(R.layout.activity_routing_setting, (ViewGroup) null, false);
                        int i4 = R.id.layout_domain_strategy;
                        LinearLayout linearLayout = (LinearLayout) l02.n(R.id.layout_domain_strategy, viewInflate);
                        if (linearLayout != null) {
                            i4 = R.id.main_content;
                            if (((NestedScrollView) l02.n(R.id.main_content, viewInflate)) != null) {
                                i4 = R.id.recycler_view;
                                RecyclerView recyclerView = (RecyclerView) l02.n(R.id.recycler_view, viewInflate);
                                if (recyclerView != null) {
                                    i4 = R.id.tv_domain_strategy_summary;
                                    TextView textView = (TextView) l02.n(R.id.tv_domain_strategy_summary, viewInflate);
                                    if (textView != null) {
                                        return new f3((RelativeLayout) viewInflate, linearLayout, recyclerView, textView);
                                    }
                                }
                            }
                        }
                        io0.e("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i4)));
                        return null;
                    case 1:
                        int i5 = RoutingSettingActivity.j;
                        return new RoutingSettingRecyclerAdapter(routingSettingActivity);
                    case 2:
                        int i6 = RoutingSettingActivity.j;
                        return routingSettingActivity.getResources().getStringArray(R.array.routing_domain_strategy);
                    default:
                        int i7 = RoutingSettingActivity.j;
                        return routingSettingActivity.getResources().getStringArray(R.array.preset_rulesets);
                }
            }
        });
        final int i2 = 1;
        this.e = kotlin.c.b(new Function0(this) { // from class: h41
            public final /* synthetic */ RoutingSettingActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                RoutingSettingActivity routingSettingActivity = this.b;
                switch (i22) {
                    case 0:
                        int i3 = RoutingSettingActivity.j;
                        View viewInflate = routingSettingActivity.getLayoutInflater().inflate(R.layout.activity_routing_setting, (ViewGroup) null, false);
                        int i4 = R.id.layout_domain_strategy;
                        LinearLayout linearLayout = (LinearLayout) l02.n(R.id.layout_domain_strategy, viewInflate);
                        if (linearLayout != null) {
                            i4 = R.id.main_content;
                            if (((NestedScrollView) l02.n(R.id.main_content, viewInflate)) != null) {
                                i4 = R.id.recycler_view;
                                RecyclerView recyclerView = (RecyclerView) l02.n(R.id.recycler_view, viewInflate);
                                if (recyclerView != null) {
                                    i4 = R.id.tv_domain_strategy_summary;
                                    TextView textView = (TextView) l02.n(R.id.tv_domain_strategy_summary, viewInflate);
                                    if (textView != null) {
                                        return new f3((RelativeLayout) viewInflate, linearLayout, recyclerView, textView);
                                    }
                                }
                            }
                        }
                        io0.e("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i4)));
                        return null;
                    case 1:
                        int i5 = RoutingSettingActivity.j;
                        return new RoutingSettingRecyclerAdapter(routingSettingActivity);
                    case 2:
                        int i6 = RoutingSettingActivity.j;
                        return routingSettingActivity.getResources().getStringArray(R.array.routing_domain_strategy);
                    default:
                        int i7 = RoutingSettingActivity.j;
                        return routingSettingActivity.getResources().getStringArray(R.array.preset_rulesets);
                }
            }
        });
        final int i3 = 2;
        this.f = kotlin.c.b(new Function0(this) { // from class: h41
            public final /* synthetic */ RoutingSettingActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                RoutingSettingActivity routingSettingActivity = this.b;
                switch (i22) {
                    case 0:
                        int i32 = RoutingSettingActivity.j;
                        View viewInflate = routingSettingActivity.getLayoutInflater().inflate(R.layout.activity_routing_setting, (ViewGroup) null, false);
                        int i4 = R.id.layout_domain_strategy;
                        LinearLayout linearLayout = (LinearLayout) l02.n(R.id.layout_domain_strategy, viewInflate);
                        if (linearLayout != null) {
                            i4 = R.id.main_content;
                            if (((NestedScrollView) l02.n(R.id.main_content, viewInflate)) != null) {
                                i4 = R.id.recycler_view;
                                RecyclerView recyclerView = (RecyclerView) l02.n(R.id.recycler_view, viewInflate);
                                if (recyclerView != null) {
                                    i4 = R.id.tv_domain_strategy_summary;
                                    TextView textView = (TextView) l02.n(R.id.tv_domain_strategy_summary, viewInflate);
                                    if (textView != null) {
                                        return new f3((RelativeLayout) viewInflate, linearLayout, recyclerView, textView);
                                    }
                                }
                            }
                        }
                        io0.e("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i4)));
                        return null;
                    case 1:
                        int i5 = RoutingSettingActivity.j;
                        return new RoutingSettingRecyclerAdapter(routingSettingActivity);
                    case 2:
                        int i6 = RoutingSettingActivity.j;
                        return routingSettingActivity.getResources().getStringArray(R.array.routing_domain_strategy);
                    default:
                        int i7 = RoutingSettingActivity.j;
                        return routingSettingActivity.getResources().getStringArray(R.array.preset_rulesets);
                }
            }
        });
        final int i4 = 3;
        this.g = kotlin.c.b(new Function0(this) { // from class: h41
            public final /* synthetic */ RoutingSettingActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i4;
                RoutingSettingActivity routingSettingActivity = this.b;
                switch (i22) {
                    case 0:
                        int i32 = RoutingSettingActivity.j;
                        View viewInflate = routingSettingActivity.getLayoutInflater().inflate(R.layout.activity_routing_setting, (ViewGroup) null, false);
                        int i42 = R.id.layout_domain_strategy;
                        LinearLayout linearLayout = (LinearLayout) l02.n(R.id.layout_domain_strategy, viewInflate);
                        if (linearLayout != null) {
                            i42 = R.id.main_content;
                            if (((NestedScrollView) l02.n(R.id.main_content, viewInflate)) != null) {
                                i42 = R.id.recycler_view;
                                RecyclerView recyclerView = (RecyclerView) l02.n(R.id.recycler_view, viewInflate);
                                if (recyclerView != null) {
                                    i42 = R.id.tv_domain_strategy_summary;
                                    TextView textView = (TextView) l02.n(R.id.tv_domain_strategy_summary, viewInflate);
                                    if (textView != null) {
                                        return new f3((RelativeLayout) viewInflate, linearLayout, recyclerView, textView);
                                    }
                                }
                            }
                        }
                        io0.e("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i42)));
                        return null;
                    case 1:
                        int i5 = RoutingSettingActivity.j;
                        return new RoutingSettingRecyclerAdapter(routingSettingActivity);
                    case 2:
                        int i6 = RoutingSettingActivity.j;
                        return routingSettingActivity.getResources().getStringArray(R.array.routing_domain_strategy);
                    default:
                        int i7 = RoutingSettingActivity.j;
                        return routingSettingActivity.getResources().getStringArray(R.array.preset_rulesets);
                }
            }
        });
        this.h = registerForActivityResult(new ActivityResultContracts$RequestPermission(), new ActivityResultCallback(this) { // from class: i41
            public final /* synthetic */ RoutingSettingActivity b;

            {
                this.b = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                int i5 = i;
                final RoutingSettingActivity routingSettingActivity = this.b;
                switch (i5) {
                    case 0:
                        if (!((Boolean) obj).booleanValue()) {
                            int i6 = RoutingSettingActivity.j;
                            qf3.K(routingSettingActivity, R.string.toast_permission_denied);
                        } else {
                            routingSettingActivity.i.a(new Intent(routingSettingActivity, (Class<?>) ScannerActivity.class));
                        }
                        break;
                    default:
                        ActivityResult activityResult = (ActivityResult) obj;
                        int i7 = RoutingSettingActivity.j;
                        activityResult.getClass();
                        if (activityResult.a == -1) {
                            Intent intent = activityResult.b;
                            final String stringExtra = intent != null ? intent.getStringExtra("SCAN_RESULT") : null;
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(routingSettingActivity);
                            alertDialog$Builder.b(R.string.routing_settings_import_rulesets_tip);
                            alertDialog$Builder.d(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: com.v2ray.ang.ui.i
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i8) {
                                    int i9 = RoutingSettingActivity.j;
                                    RoutingSettingActivity routingSettingActivity2 = routingSettingActivity;
                                    LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImplA = m.a(routingSettingActivity2);
                                    lv lvVar = oy.a;
                                    kotlinx.coroutines.c.d(lifecycleCoroutineScopeImplA, hv.c, null, new RoutingSettingActivity$importRulesetsFromQRcode$1$1(stringExtra, routingSettingActivity2, null), 2);
                                }
                            });
                            alertDialog$Builder.c(android.R.string.cancel, new k(5));
                            alertDialog$Builder.f();
                        }
                        break;
                }
            }
        });
        this.i = registerForActivityResult(new ActivityResultContracts$StartActivityForResult(), new ActivityResultCallback(this) { // from class: i41
            public final /* synthetic */ RoutingSettingActivity b;

            {
                this.b = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                int i5 = i2;
                final RoutingSettingActivity routingSettingActivity = this.b;
                switch (i5) {
                    case 0:
                        if (!((Boolean) obj).booleanValue()) {
                            int i6 = RoutingSettingActivity.j;
                            qf3.K(routingSettingActivity, R.string.toast_permission_denied);
                        } else {
                            routingSettingActivity.i.a(new Intent(routingSettingActivity, (Class<?>) ScannerActivity.class));
                        }
                        break;
                    default:
                        ActivityResult activityResult = (ActivityResult) obj;
                        int i7 = RoutingSettingActivity.j;
                        activityResult.getClass();
                        if (activityResult.a == -1) {
                            Intent intent = activityResult.b;
                            final String stringExtra = intent != null ? intent.getStringExtra("SCAN_RESULT") : null;
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(routingSettingActivity);
                            alertDialog$Builder.b(R.string.routing_settings_import_rulesets_tip);
                            alertDialog$Builder.d(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: com.v2ray.ang.ui.i
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i8) {
                                    int i9 = RoutingSettingActivity.j;
                                    RoutingSettingActivity routingSettingActivity2 = routingSettingActivity;
                                    LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImplA = m.a(routingSettingActivity2);
                                    lv lvVar = oy.a;
                                    kotlinx.coroutines.c.d(lifecycleCoroutineScopeImplA, hv.c, null, new RoutingSettingActivity$importRulesetsFromQRcode$1$1(stringExtra, routingSettingActivity2, null), 2);
                                }
                            });
                            alertDialog$Builder.c(android.R.string.cancel, new k(5));
                            alertDialog$Builder.f();
                        }
                        break;
                }
            }
        });
    }

    public final f3 h() {
        return (f3) this.c.getValue();
    }

    public final void i() {
        ArrayList arrayList = this.d;
        arrayList.clear();
        Lazy lazy = zq0.a;
        ArrayList arrayListC = zq0.c();
        if (arrayListC == null) {
            arrayListC = new ArrayList();
        }
        arrayList.addAll(arrayListC);
        ((RoutingSettingRecyclerAdapter) this.e.getValue()).f();
    }

    @Override // com.v2ray.ang.ui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(h().a);
        setTitle(getString(R.string.routing_settings_title));
        h().c.setHasFixedSize(true);
        h().c.setLayoutManager(new LinearLayoutManager(this));
        BaseActivity.g(this, h().c, this);
        RecyclerView recyclerView = h().c;
        Lazy lazy = this.e;
        recyclerView.setAdapter((RoutingSettingRecyclerAdapter) lazy.getValue());
        new ItemTouchHelper(new SimpleItemTouchHelperCallback((RoutingSettingRecyclerAdapter) lazy.getValue())).d(h().c);
        TextView textView = h().d;
        Lazy lazy2 = zq0.a;
        String strD = zq0.z().d("pref_routing_domain_strategy");
        if (strD == null) {
            Object value = this.f.getValue();
            value.getClass();
            String[] strArr = (String[]) value;
            if (strArr.length == 0) {
                s31.k("Array is empty.");
                return;
            }
            strD = strArr[0];
        }
        textView.setText(strD);
        h().b.setOnClickListener(new mn(this, 10));
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.getClass();
        getMenuInflater().inflate(R.menu.menu_routing_setting, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // com.v2ray.ang.ui.BaseActivity, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        int i = 1;
        switch (menuItem.getItemId()) {
            case R.id.add_rule /* 2131296343 */:
                startActivity(new Intent(this, (Class<?>) RoutingEditActivity.class));
                return true;
            case R.id.export_rulesets_to_clipboard /* 2131296610 */:
                Lazy lazy = zq0.a;
                ArrayList arrayListC = zq0.c();
                if (arrayListC == null || arrayListC.isEmpty()) {
                    qf3.M(this, R.string.toast_failure);
                    return true;
                }
                Regex regex = ul1.a;
                ul1.A(this, aj0.a.g(arrayListC));
                qf3.O(this);
                return true;
            case R.id.import_predefined_rulesets /* 2131296694 */:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
                Object value = this.g.getValue();
                value.getClass();
                List listAsList = Arrays.asList((String[]) value);
                listAsList.getClass();
                CharSequence[] charSequenceArr = (CharSequence[]) listAsList.toArray(new String[0]);
                g41 g41Var = new g41(this, 1);
                AlertController.AlertParams alertParams = alertDialog$Builder.a;
                alertParams.o = charSequenceArr;
                alertParams.q = g41Var;
                alertDialog$Builder.f();
                return true;
            case R.id.import_rulesets_from_clipboard /* 2131296697 */:
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(this);
                alertDialog$Builder2.b(R.string.routing_settings_import_rulesets_tip);
                alertDialog$Builder2.d(android.R.string.ok, new g(this, i));
                alertDialog$Builder2.c(android.R.string.cancel, new k(5));
                alertDialog$Builder2.f();
                return true;
            case R.id.import_rulesets_from_qrcode /* 2131296698 */:
                this.h.a("android.permission.CAMERA");
                return true;
            default:
                return super.onOptionsItemSelected(menuItem);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        i();
    }
}
