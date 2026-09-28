package com.v2ray.ang.util;

import android.app.ActivityManager;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.c;
import androidx.appcompat.app.AppCompatActivity;
import dev.zeron.tunnel.R;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.n8;
import defpackage.ym0;
import defpackage.zm0;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class MainActivityWifi extends AppCompatActivity {
    public static final /* synthetic */ int k = 0;
    public EditText b;
    public Button c;
    public Button d;
    public Button e;
    public Button f;
    public ImageView g;
    public TextView h;
    public TextView i;
    public SharedPreferences j;

    public static String g() {
        try {
            Iterator it = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
            while (it.hasNext()) {
                for (InetAddress inetAddress : Collections.list(((NetworkInterface) it.next()).getInetAddresses())) {
                    if (!inetAddress.isLoopbackAddress()) {
                        String hostAddress = inetAddress.getHostAddress();
                        if (hostAddress.indexOf(58) < 0) {
                            return hostAddress;
                        }
                    }
                }
            }
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        } catch (Exception unused) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
    }

    public final boolean h() {
        Iterator<ActivityManager.RunningServiceInfo> it = ((ActivityManager) getSystemService("activity")).getRunningServices(Integer.MAX_VALUE).iterator();
        while (it.hasNext()) {
            if (ProxyService.class.getName().equals(it.next().service.getClassName())) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        c.a(this);
        super.onCreate(bundle);
        setContentView(R.layout.activity_wifi);
        n8.c(this);
        int i = 0;
        this.j = getSharedPreferences("Wifi_Tethering", 0);
        this.b = (EditText) findViewById(R.id.portEditText);
        this.c = (Button) findViewById(R.id.start);
        this.d = (Button) findViewById(R.id.stop);
        this.g = (ImageView) findViewById(R.id.WiFiTetherButton);
        this.h = (TextView) findViewById(R.id.proxyStatus);
        this.i = (TextView) findViewById(R.id.proxyURL);
        this.f = (Button) findViewById(R.id.hdwifi);
        this.e = (Button) findViewById(R.id.restart);
        if (h()) {
            this.h.setText("Proxy is running on:");
            this.i.setText(g().toString() + " : " + this.j.getString("port", "8080"));
            this.c.setVisibility(8);
            this.d.setVisibility(0);
            this.b.setEnabled(false);
        } else {
            this.c.setVisibility(0);
            this.d.setVisibility(8);
        }
        this.b.setText(this.j.getString("port", "8080"));
        this.g.setOnClickListener(new ym0(this, i));
        this.e.setOnClickListener(new ym0(this, 1));
        this.f.setOnClickListener(new zm0(this));
        this.c.setOnClickListener(new ym0(this, 2));
        this.d.setOnClickListener(new ym0(this, 3));
    }
}
