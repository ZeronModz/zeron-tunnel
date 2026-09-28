package defpackage;

import android.content.Context;
import android.os.SystemClock;
import com.google.gson.Gson;
import com.v2ray.ang.dto.Hysteria2Bean;
import com.v2ray.ang.dto.ProfileItem;
import java.io.File;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.c;
import kotlin.io.b;
import kotlin.text.Regex;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class bx0 {
    public static final Lazy a = c.b(new yq0(11));

    public static ArrayList a(Context context, File file) {
        String absolutePath = new File(context.getApplicationInfo().nativeLibraryDir, "libhysteria2.so").getAbsolutePath();
        absolutePath.getClass();
        String absolutePath2 = file.getAbsolutePath();
        absolutePath2.getClass();
        return kotlin.collections.c.B(absolutePath, "--disable-update-check", "--config", absolutePath2, "--log-level", "warn", "client");
    }

    public static File b(Context context, ProfileItem profileItem, int i) {
        Hysteria2Bean.TransportBean transportBean;
        String serverAddressAndPort;
        String bandwidthUp;
        re0.a.getClass();
        String obfsPassword = profileItem.getObfsPassword();
        String pinSHA256 = null;
        Hysteria2Bean.ObfsBean obfsBean = (obfsPassword == null || obfsPassword.length() == 0) ? null : new Hysteria2Bean.ObfsBean("salamander", new Hysteria2Bean.ObfsBean.SalamanderBean(profileItem.getObfsPassword()));
        String portHopping = profileItem.getPortHopping();
        if (portHopping == null || portHopping.length() == 0) {
            transportBean = null;
        } else {
            String portHoppingInterval = profileItem.getPortHoppingInterval();
            if (portHoppingInterval == null) {
                portHoppingInterval = "30";
            }
            transportBean = new Hysteria2Bean.TransportBean("udp", new Hysteria2Bean.TransportBean.TransportUdpBean(portHoppingInterval.concat("s")));
        }
        String bandwidthDown = profileItem.getBandwidthDown();
        Hysteria2Bean.BandwidthBean bandwidthBean = (bandwidthDown == null || bandwidthDown.length() == 0 || (bandwidthUp = profileItem.getBandwidthUp()) == null || bandwidthUp.length() == 0) ? null : new Hysteria2Bean.BandwidthBean(profileItem.getBandwidthDown(), profileItem.getBandwidthUp());
        String portHopping2 = profileItem.getPortHopping();
        if (portHopping2 == null || portHopping2.length() == 0) {
            serverAddressAndPort = profileItem.getServerAddressAndPort();
        } else {
            Regex regex = ul1.a;
            serverAddressAndPort = vh.m(ul1.l(profileItem.getServer()), ":", profileItem.getPortHopping());
        }
        String str = serverAddressAndPort;
        String password = profileItem.getPassword();
        Hysteria2Bean.Socks5Bean socks5Bean = new Hysteria2Bean.Socks5Bean(hz.o(i, "127.0.0.1:"));
        Hysteria2Bean.Socks5Bean socks5Bean2 = new Hysteria2Bean.Socks5Bean(hz.o(i, "127.0.0.1:"));
        String sni = profileItem.getSni();
        if (sni == null) {
            sni = profileItem.getServer();
        }
        Boolean insecure = profileItem.getInsecure();
        String pinSHA2562 = profileItem.getPinSHA256();
        if (pinSHA2562 != null && pinSHA2562.length() != 0) {
            pinSHA256 = profileItem.getPinSHA256();
        }
        Hysteria2Bean hysteria2Bean = new Hysteria2Bean(str, password, null, obfsBean, socks5Bean, socks5Bean2, new Hysteria2Bean.TlsBean(sni, insecure, pinSHA256), transportBean, bandwidthBean, 4, null);
        File file = new File(context.getNoBackupFilesDir(), vh.j(SystemClock.elapsedRealtime(), "hy2_", ".json"));
        file.getAbsolutePath();
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        Gson gson = aj0.a;
        b.b(file, gson.g(hysteria2Bean));
        gson.g(hysteria2Bean);
        return file;
    }
}
