package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Process;
import android.view.View;
import android.widget.Button;
import com.google.android.gms.ads.RequestConfiguration;
import com.v2ray.ang.util.MainActivityWifi;
import com.v2ray.ang.util.ProxyService;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ym0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ MainActivityWifi b;

    public /* synthetic */ ym0(MainActivityWifi mainActivityWifi, int i) {
        this.a = i;
        this.b = mainActivityWifi;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        MainActivityWifi mainActivityWifi = this.b;
        switch (i) {
            case 0:
                int i2 = MainActivityWifi.k;
                Intent intent = new Intent();
                intent.setClassName("com.android.settings", "com.android.settings.TetherSettings");
                mainActivityWifi.startActivity(intent);
                break;
            case 1:
                ((AlarmManager) mainActivityWifi.getSystemService("alarm")).set(1, System.currentTimeMillis() + 2000, PendingIntent.getActivity(mainActivityWifi, 123456, new Intent(mainActivityWifi, (Class<?>) MainActivityWifi.class), 335544320));
                System.runFinalizersOnExit(true);
                System.exit(0);
                Process.killProcess(Process.myPid());
                break;
            case 2:
                int i3 = MainActivityWifi.k;
                if (!mainActivityWifi.b.getText().toString().matches("\\d+")) {
                    mainActivityWifi.h.setText("Enter port (eg: 8080)");
                    mainActivityWifi.i.setText(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                } else {
                    int i4 = Integer.parseInt(mainActivityWifi.b.getText().toString());
                    MainActivityWifi.g();
                    try {
                        if (!((Boolean) new an0().execute(Integer.valueOf(i4)).get()).booleanValue()) {
                            mainActivityWifi.e.setVisibility(8);
                        }
                        Intent intent2 = new Intent(mainActivityWifi, (Class<?>) ProxyService.class);
                        intent2.putExtra("port", i4);
                        mainActivityWifi.j.edit().putString("port", mainActivityWifi.b.getText().toString()).apply();
                        mainActivityWifi.startService(intent2);
                        mainActivityWifi.h.setText("Proxy is running on:");
                        mainActivityWifi.i.setText(String.format("%s:%d", MainActivityWifi.g(), Integer.valueOf(i4)));
                        mainActivityWifi.c.setVisibility(8);
                        mainActivityWifi.d.setVisibility(0);
                        mainActivityWifi.b.setEnabled(false);
                    } catch (InterruptedException | ExecutionException e) {
                        e.printStackTrace();
                        mainActivityWifi.h.setText("There are a few bugs");
                        mainActivityWifi.i.setText(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                        return;
                    }
                }
                break;
            default:
                int i5 = MainActivityWifi.k;
                mainActivityWifi.stopService(new Intent(mainActivityWifi, (Class<?>) ProxyService.class));
                mainActivityWifi.h.setText("Stopped");
                mainActivityWifi.i.setText(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                boolean zH = mainActivityWifi.h();
                Button button = mainActivityWifi.c;
                if (zH) {
                    button.setVisibility(0);
                    mainActivityWifi.d.setVisibility(8);
                    mainActivityWifi.b.setEnabled(false);
                } else {
                    button.setVisibility(0);
                    mainActivityWifi.d.setVisibility(8);
                }
                mainActivityWifi.b.setEnabled(true);
                break;
        }
    }
}
