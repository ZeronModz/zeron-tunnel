package com.v2ray.ang.ui;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import dev.zeron.tunnel.R;
import defpackage.mn;
import defpackage.n8;
import defpackage.ul1;
import java.io.File;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.text.Regex;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/v2ray/ang/ui/CrashActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CrashActivity extends AppCompatActivity {
    public static final /* synthetic */ int b = 0;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        androidx.activity.c.a(this);
        super.onCreate(bundle);
        setContentView(R.layout.activity_crash);
        n8.c(this);
        TextView textView = (TextView) findViewById(R.id.textError);
        Button button = (Button) findViewById(R.id.buttonRestart);
        String stringExtra = getIntent().getStringExtra("error");
        if (stringExtra == null) {
            stringExtra = "Unknown error";
        }
        Regex regex = ul1.a;
        textView.setText("Error Code: " + Double.parseDouble(String.format(Locale.US, "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(new File(getPackageManager().getApplicationInfo(getPackageName(), 0).sourceDir).length() / 1048576.0d)}, 1))) + "\n\n" + stringExtra);
        button.setOnClickListener(new mn(this, 1));
    }
}
