package com.iphunt.sandoki.ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.c;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.datastore.preferences.protobuf.DescriptorProtos$Edition;
import androidx.lifecycle.ViewModelProvider;
import dev.zeron.tunnel.R;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.iphunt.sandoki.services.AutoTaskService;
import com.iphunt.sandoki.ui.AirplaneModeActivity;
import com.iphunt.sandoki.ui.AirplaneModeViewModel;
import defpackage.a4;
import defpackage.b4;
import defpackage.e4;
import defpackage.f4;
import defpackage.k5;
import defpackage.n8;
import defpackage.ul1;
import defpackage.x2;
import java.util.ArrayList;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class AirplaneModeActivity extends AppCompatActivity {
    public static final /* synthetic */ int A = 0;
    public AirplaneModeViewModel b;
    public TextView c;
    public TextView d;
    public TextView e;
    public SwitchMaterial f;
    public Button g;
    public Button h;
    public EditText i;
    public RadioGroup j;
    public RadioButton k;
    public RadioButton l;
    public boolean m;
    public ProgressBar n;
    public EditText o;
    public TextView p;
    public TextView q;
    public String r;
    public String s;
    public boolean t;
    public boolean u;
    public boolean v;
    public final Handler w;
    public boolean x;
    public int y;
    public final ArrayList z;

    public AirplaneModeActivity() {
        new Handler(Looper.getMainLooper());
        this.m = false;
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = new Handler(Looper.getMainLooper());
        this.x = true;
        this.y = 0;
        this.z = new ArrayList();
    }

    public final void g() {
        Bundle bundle = new Bundle();
        bundle.putString("command", "smart_toggle");
        showAssist(bundle);
        new Handler(Looper.getMainLooper()).postDelayed(new b4(this, 0), 1000L);
    }

    public final void h() {
        if (this.x) {
            return;
        }
        this.o.setEnabled(false);
        int i = this.y;
        if (i >= 20) {
            k("Reached max retries");
            return;
        }
        this.y = i + 1;
        g();
        this.p.setText(this.s + " IP: ........");
        this.w.postDelayed(new b4(this, 1), 3000L);
    }

    public final void i() {
        MaterialAlertDialogBuilder materialAlertDialogBuilder = new MaterialAlertDialogBuilder(this);
        AlertController.AlertParams alertParams = materialAlertDialogBuilder.a;
        alertParams.e = "Permission Required";
        alertParams.g = "Digital Assistant permission is required to continue.";
        final int i = 0;
        alertParams.l = false;
        materialAlertDialogBuilder.h("Grant Permission", new DialogInterface.OnClickListener(this) { // from class: c4
            public final /* synthetic */ AirplaneModeActivity b;

            {
                this.b = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                int i3 = i;
                AirplaneModeActivity airplaneModeActivity = this.b;
                switch (i3) {
                    case 0:
                        int i4 = AirplaneModeActivity.A;
                        try {
                            try {
                                try {
                                    airplaneModeActivity.startActivity(new Intent("android.settings.VOICE_INPUT_SETTINGS"));
                                } catch (Exception unused) {
                                    airplaneModeActivity.startActivity(new Intent("android.settings.MANAGE_DEFAULT_APPS_SETTINGS"));
                                }
                            } catch (Exception unused2) {
                                airplaneModeActivity.startActivity(new Intent("android.settings.APPLICATION_SETTINGS"));
                            }
                        } catch (Exception unused3) {
                            Toast.makeText(airplaneModeActivity, "无法打开设置页面，请手动前往：系统设置 → 应用 → 默认应用 → 数字助理应用", 1).show();
                        }
                        dialogInterface.dismiss();
                        airplaneModeActivity.finish();
                        break;
                    default:
                        int i5 = AirplaneModeActivity.A;
                        dialogInterface.dismiss();
                        airplaneModeActivity.finish();
                        break;
                }
            }
        });
        final int i2 = 1;
        materialAlertDialogBuilder.g("Cancel", new DialogInterface.OnClickListener(this) { // from class: c4
            public final /* synthetic */ AirplaneModeActivity b;

            {
                this.b = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i22) {
                int i3 = i2;
                AirplaneModeActivity airplaneModeActivity = this.b;
                switch (i3) {
                    case 0:
                        int i4 = AirplaneModeActivity.A;
                        try {
                            try {
                                try {
                                    airplaneModeActivity.startActivity(new Intent("android.settings.VOICE_INPUT_SETTINGS"));
                                } catch (Exception unused) {
                                    airplaneModeActivity.startActivity(new Intent("android.settings.MANAGE_DEFAULT_APPS_SETTINGS"));
                                }
                            } catch (Exception unused2) {
                                airplaneModeActivity.startActivity(new Intent("android.settings.APPLICATION_SETTINGS"));
                            }
                        } catch (Exception unused3) {
                            Toast.makeText(airplaneModeActivity, "无法打开设置页面，请手动前往：系统设置 → 应用 → 默认应用 → 数字助理应用", 1).show();
                        }
                        dialogInterface.dismiss();
                        airplaneModeActivity.finish();
                        break;
                    default:
                        int i5 = AirplaneModeActivity.A;
                        dialogInterface.dismiss();
                        airplaneModeActivity.finish();
                        break;
                }
            }
        });
        materialAlertDialogBuilder.f();
    }

    public final void j() {
        boolean z = this.b.b.getBoolean("control_mode_secure", false);
        boolean zEquals = Boolean.TRUE.equals(this.b.f.d());
        boolean z2 = k5.a(this, "android.permission.WRITE_SECURE_SETTINGS") == 0;
        if (z && !z2) {
            Toast.makeText(this, "WSS not authorized, cannot start background task", 0).show();
            this.m = true;
            this.f.setChecked(false);
            this.m = false;
            return;
        }
        if (!z && !zEquals) {
            Toast.makeText(this, "Digital assistant permission not configured, cannot start background task", 0).show();
            this.m = true;
            this.f.setChecked(false);
            this.m = false;
            return;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 33 && k5.a(this, "android.permission.POST_NOTIFICATIONS") != 0) {
            x2.N(this, new String[]{"android.permission.POST_NOTIFICATIONS"}, DescriptorProtos$Edition.EDITION_2024_VALUE);
            Toast.makeText(this, "Please allow notification permission first, then try again", 0).show();
            this.m = true;
            this.f.setChecked(false);
            this.m = false;
            return;
        }
        Intent intent = new Intent(this, (Class<?>) AutoTaskService.class);
        Integer num = (Integer) this.b.e.d();
        intent.putExtra("interval_minutes", num != null ? num.intValue() : 15);
        if (i >= 26) {
            startForegroundService(intent);
        } else {
            startService(intent);
        }
        Toast.makeText(this, "Background auto task started", 0).show();
    }

    public final void k(String str) {
        if (this.v) {
            g();
        }
        this.x = true;
        this.w.removeCallbacksAndMessages(null);
        Toast.makeText(this, str, 0).show();
        this.g.setText("Start");
        this.o.setEnabled(true);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        c.a(this);
        super.onCreate(bundle);
        setContentView(R.layout.activity_iphunter);
        n8.c(this);
        this.r = ul1.m();
        this.s = ul1.f(this);
        this.p = (TextView) findViewById(R.id.mobileip);
        this.q = (TextView) findViewById(R.id.attempts);
        this.p.setText(this.s + " Ip: " + this.r);
        this.o = (EditText) findViewById(R.id.etIP);
        this.c = (TextView) findViewById(R.id.tv_current_status);
        this.d = (TextView) findViewById(R.id.tv_interval_status);
        try {
            this.e = (TextView) findViewById(R.id.tv_secure_perm_status);
        } catch (Throwable unused) {
        }
        this.f = (SwitchMaterial) findViewById(R.id.switch_auto_toggle);
        this.g = (Button) findViewById(R.id.btn_test_toggle);
        this.h = (Button) findViewById(R.id.btn_set_interval);
        this.n = (ProgressBar) findViewById(R.id.progress_bar);
        this.i = (EditText) findViewById(R.id.et_interval);
        this.j = (RadioGroup) findViewById(R.id.rg_control_mode);
        this.k = (RadioButton) findViewById(R.id.rb_mode_assistant);
        this.l = (RadioButton) findViewById(R.id.rb_mode_secure);
        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
        if (getSupportActionBar() != null) {
            getSupportActionBar().s();
            getSupportActionBar().m(true);
            getSupportActionBar().n();
        }
        AirplaneModeViewModel airplaneModeViewModel = (AirplaneModeViewModel) new ViewModelProvider(this).a(Reflection.a(AirplaneModeViewModel.class));
        this.b = airplaneModeViewModel;
        final int i = 0;
        airplaneModeViewModel.c.e(this, new a4(this, i));
        this.b.d.e(this, new a4(this, i));
        this.b.e.e(this, new a4(this, 2));
        this.b.f.e(this, new a4(this, 3));
        this.b.g.e(this, new a4(this, 4));
        this.b.h.e(this, new a4(this, 5));
        this.f.setOnCheckedChangeListener(new e4(this, i));
        this.j.setOnCheckedChangeListener(new f4(this, i));
        this.h.setOnClickListener(new View.OnClickListener(this) { // from class: g4
            public final /* synthetic */ AirplaneModeActivity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = i;
                boolean z = true;
                AirplaneModeActivity airplaneModeActivity = this.b;
                switch (i2) {
                    case 0:
                        int i3 = AirplaneModeActivity.A;
                        String strTrim = airplaneModeActivity.i.getText() != null ? airplaneModeActivity.i.getText().toString().trim() : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                        if (strTrim.isEmpty()) {
                            Toast.makeText(airplaneModeActivity, "Please enter interval (1-60)", 0).show();
                        } else {
                            try {
                                int i4 = Integer.parseInt(strTrim);
                                airplaneModeActivity.b.getClass();
                                if (!(i4 >= 1 && i4 <= 60)) {
                                    Toast.makeText(airplaneModeActivity, "Interval range 1-60", 0).show();
                                } else {
                                    AirplaneModeViewModel airplaneModeViewModel2 = airplaneModeActivity.b;
                                    airplaneModeViewModel2.getClass();
                                    if (i4 < 1 || i4 > 60) {
                                        z = false;
                                    }
                                    if (z) {
                                        airplaneModeViewModel2.b.edit().putInt("toggle_interval", i4).apply();
                                        airplaneModeViewModel2.e.k(Integer.valueOf(i4));
                                    }
                                    Toast.makeText(airplaneModeActivity, "Interval set to " + i4 + " minutes", 0).show();
                                    airplaneModeActivity.j();
                                }
                            } catch (NumberFormatException unused2) {
                                Toast.makeText(airplaneModeActivity, "Please enter a valid number", 0).show();
                                return;
                            }
                        }
                        break;
                    default:
                        int i5 = AirplaneModeActivity.A;
                        if (!airplaneModeActivity.u) {
                            airplaneModeActivity.i();
                        } else if (!String.valueOf(airplaneModeActivity.o.getText()).isEmpty()) {
                            if (airplaneModeActivity.x) {
                                airplaneModeActivity.x = false;
                                airplaneModeActivity.y = 0;
                                airplaneModeActivity.z.clear();
                                airplaneModeActivity.h();
                            } else {
                                airplaneModeActivity.k("IP hunt stopped");
                            }
                            airplaneModeActivity.g.setText(airplaneModeActivity.x ? "Start" : "Stop");
                        } else {
                            airplaneModeActivity.x = true;
                            Toast.makeText(airplaneModeActivity, "Invalid IP Range", 0).show();
                        }
                        break;
                }
            }
        });
        this.g.setOnClickListener(new View.OnClickListener(this) { // from class: g4
            public final /* synthetic */ AirplaneModeActivity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = i;
                boolean z = true;
                AirplaneModeActivity airplaneModeActivity = this.b;
                switch (i2) {
                    case 0:
                        int i3 = AirplaneModeActivity.A;
                        String strTrim = airplaneModeActivity.i.getText() != null ? airplaneModeActivity.i.getText().toString().trim() : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                        if (strTrim.isEmpty()) {
                            Toast.makeText(airplaneModeActivity, "Please enter interval (1-60)", 0).show();
                        } else {
                            try {
                                int i4 = Integer.parseInt(strTrim);
                                airplaneModeActivity.b.getClass();
                                if (!(i4 >= 1 && i4 <= 60)) {
                                    Toast.makeText(airplaneModeActivity, "Interval range 1-60", 0).show();
                                } else {
                                    AirplaneModeViewModel airplaneModeViewModel2 = airplaneModeActivity.b;
                                    airplaneModeViewModel2.getClass();
                                    if (i4 < 1 || i4 > 60) {
                                        z = false;
                                    }
                                    if (z) {
                                        airplaneModeViewModel2.b.edit().putInt("toggle_interval", i4).apply();
                                        airplaneModeViewModel2.e.k(Integer.valueOf(i4));
                                    }
                                    Toast.makeText(airplaneModeActivity, "Interval set to " + i4 + " minutes", 0).show();
                                    airplaneModeActivity.j();
                                }
                            } catch (NumberFormatException unused2) {
                                Toast.makeText(airplaneModeActivity, "Please enter a valid number", 0).show();
                                return;
                            }
                        }
                        break;
                    default:
                        int i5 = AirplaneModeActivity.A;
                        if (!airplaneModeActivity.u) {
                            airplaneModeActivity.i();
                        } else if (!String.valueOf(airplaneModeActivity.o.getText()).isEmpty()) {
                            if (airplaneModeActivity.x) {
                                airplaneModeActivity.x = false;
                                airplaneModeActivity.y = 0;
                                airplaneModeActivity.z.clear();
                                airplaneModeActivity.h();
                            } else {
                                airplaneModeActivity.k("IP hunt stopped");
                            }
                            airplaneModeActivity.g.setText(airplaneModeActivity.x ? "Start" : "Stop");
                        } else {
                            airplaneModeActivity.x = true;
                            Toast.makeText(airplaneModeActivity, "Invalid IP Range", 0).show();
                        }
                        break;
                }
            }
        });
        this.b.a();
        if (this.b.b.getBoolean("control_mode_secure", false)) {
            this.l.setChecked(true);
        } else {
            this.k.setChecked(true);
        }
        Integer num = (Integer) this.b.e.d();
        if (num != null) {
            this.i.setText(String.valueOf(num));
        }
        i = k5.a(this, "android.permission.WRITE_SECURE_SETTINGS") != 0 ? 0 : 1;
        TextView textView = this.e;
        if (textView != null) {
            textView.setText("WRITE_SECURE_SETTINGS: ".concat(i != 0 ? "已授权" : "未授权"));
        }
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        k(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            finish();
            return true;
        }
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        this.b.a();
        super.onResume();
    }
}
