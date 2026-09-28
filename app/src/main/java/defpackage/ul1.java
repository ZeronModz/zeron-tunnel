package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.os.Build;
import android.os.LocaleList;
import android.text.Editable;
import android.util.Base64;
import android.util.Patterns;
import android.webkit.URLUtil;
import com.google.android.gms.ads.RequestConfiguration;
import com.trilead.ssh2.sftp.AttribFlags;
import com.v2ray.ang.AppConfig;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.ServerSocket;
import java.net.URI;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import kotlin.collections.c;
import kotlin.io.d;
import kotlin.text.Regex;
import kotlin.text.g;
import org.slf4j.Marker;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ul1 {
    public static final Regex a = new Regex("^([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])\\.([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])\\.([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])\\.([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])$");
    public static final Regex b = new Regex("^((?:[0-9A-Fa-f]{1,4}))?((?::[0-9A-Fa-f]{1,4}))*::((?:[0-9A-Fa-f]{1,4}))?((?::[0-9A-Fa-f]{1,4}))*|((?:[0-9A-Fa-f]{1,4}))((?::[0-9A-Fa-f]{1,4})){7}$");

    public static void A(Context context, String str) {
        context.getClass();
        str.getClass();
        try {
            Object systemService = context.getSystemService("clipboard");
            systemService.getClass();
            ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(null, str));
        } catch (Exception unused) {
        }
    }

    public static String B(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            byte[] bArrDecode = Base64.decode(str, 2);
            bArrDecode.getClass();
            return new String(bArrDecode, xm.a);
        } catch (Exception unused) {
            try {
                byte[] bArrDecode2 = Base64.decode(str, 10);
                bArrDecode2.getClass();
                return new String(bArrDecode2, xm.a);
            } catch (Exception unused2) {
                return null;
            }
        }
    }

    public static String C(String str) {
        str.getClass();
        try {
            String strDecode = URLDecoder.decode(str, xm.a.toString());
            strDecode.getClass();
            return strDecode;
        } catch (Exception unused) {
            return str;
        }
    }

    public static String D(String str) {
        str.getClass();
        try {
            String strEncode = URLEncoder.encode(str, xm.a.toString());
            strEncode.getClass();
            return g.M(strEncode, Marker.ANY_NON_NULL_MARKER, "%20");
        } catch (Exception unused) {
            return str;
        }
    }

    public static String E(Context context) {
        String absolutePath;
        if (context == null) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        try {
            File externalFilesDir = context.getExternalFilesDir("assets");
            if (externalFilesDir == null || (absolutePath = externalFilesDir.getAbsolutePath()) == null) {
                absolutePath = context.getDir("assets", 0).getAbsolutePath();
            }
            absolutePath.getClass();
            return absolutePath;
        } catch (Exception unused) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
    }

    public static int a(Context context) {
        ArrayList arrayList = new ArrayList();
        String str = context.getApplicationInfo().sourceDir;
        str.getClass();
        arrayList.add(str);
        String[] strArr = context.getApplicationInfo().splitSourceDirs;
        if (strArr != null) {
            c.h(arrayList, strArr);
        }
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            try {
                ZipFile zipFile = new ZipFile((String) it.next());
                Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
                while (enumerationEntries.hasMoreElements()) {
                    ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                    if (!zipEntryNextElement.isDirectory()) {
                        String name = zipEntryNextElement.getName();
                        name.getClass();
                        if (g.R(name, "lib/", false)) {
                            String name2 = zipEntryNextElement.getName();
                            name2.getClass();
                            if (g.u(name2, ".so", false)) {
                                i++;
                            }
                        }
                    }
                }
                zipFile.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return i;
    }

    public static String b(String str) {
        String strE0;
        String strB = B(str);
        if (strB != null) {
            return strB;
        }
        String strB2 = (str == null || (strE0 = g.e0(new char[]{'='}, str)) == null) ? null : B(strE0);
        return strB2 == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : strB2;
    }

    public static String c(String str) {
        try {
            byte[] bytes = str.getBytes(xm.a);
            bytes.getClass();
            String strEncodeToString = Base64.encodeToString(bytes, 2);
            strEncodeToString.getClass();
            return strEncodeToString;
        } catch (Exception unused) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
    }

    public static int d(List list) throws IOException {
        list.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                ServerSocket serverSocket = new ServerSocket(((Number) it.next()).intValue());
                try {
                    continue;
                    int localPort = serverSocket.getLocalPort();
                    serverSocket.close();
                    return localPort;
                } finally {
                    try {
                        continue;
                    } catch (Throwable th) {
                    }
                }
            } catch (IOException unused) {
            }
        }
        p60.f("no free port found");
        return 0;
    }

    public static String e(String str) {
        str.getClass();
        return g.M(g.M(str, " ", "%20"), "|", "%7C");
    }

    public static final String f(Context context) {
        Object systemService = context.getSystemService("connectivity");
        systemService.getClass();
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null) {
            return "No connection";
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
        return networkCapabilities == null ? "Unknown" : networkCapabilities.hasTransport(1) ? "Wi-Fi" : networkCapabilities.hasTransport(0) ? "Mobile" : networkCapabilities.hasTransport(3) ? "Ethernet" : networkCapabilities.hasTransport(4) ? "VPN" : "Unknown";
    }

    public static String g(Context context) {
        ClipData.Item itemAt;
        try {
            Object systemService = context.getSystemService("clipboard");
            systemService.getClass();
            ClipData primaryClip = ((ClipboardManager) systemService).getPrimaryClip();
            return String.valueOf((primaryClip == null || (itemAt = primaryClip.getItemAt(0)) == null) ? null : itemAt.getText());
        } catch (Exception unused) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static kotlin.Pair h(android.content.Context r5) {
        /*
            java.lang.String r0 = "phone"
            java.lang.Object r0 = r5.getSystemService(r0)
            r0.getClass()
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
            java.lang.String r1 = r0.getNetworkOperatorName()
            r2 = 0
            if (r1 == 0) goto L1c
            boolean r3 = kotlin.text.g.B(r1)
            if (r3 != 0) goto L19
            goto L1a
        L19:
            r1 = r2
        L1a:
            if (r1 != 0) goto L2e
        L1c:
            java.lang.String r1 = r0.getSimOperatorName()
            if (r1 == 0) goto L29
            boolean r3 = kotlin.text.g.B(r1)
            if (r3 != 0) goto L29
            goto L2a
        L29:
            r1 = r2
        L2a:
            if (r1 != 0) goto L2e
            java.lang.String r1 = "Unknown"
        L2e:
            java.lang.String r3 = r0.getSimCountryIso()
            if (r3 == 0) goto L3e
            boolean r4 = kotlin.text.g.B(r3)
            if (r4 != 0) goto L3b
            goto L3c
        L3b:
            r3 = r2
        L3c:
            if (r3 != 0) goto L79
        L3e:
            java.lang.String r0 = r0.getNetworkCountryIso()
            if (r0 == 0) goto L4b
            boolean r3 = kotlin.text.g.B(r0)
            if (r3 != 0) goto L4b
            r2 = r0
        L4b:
            if (r2 != 0) goto L78
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 24
            if (r0 < r2) goto L69
            android.content.res.Resources r5 = r5.getResources()
            android.content.res.Configuration r5 = r5.getConfiguration()
            android.os.LocaleList r5 = r5.getLocales()
            r0 = 0
            java.util.Locale r5 = r5.get(r0)
            java.lang.String r3 = r5.getCountry()
            goto L79
        L69:
            android.content.res.Resources r5 = r5.getResources()
            android.content.res.Configuration r5 = r5.getConfiguration()
            java.util.Locale r5 = r5.locale
            java.lang.String r3 = r5.getCountry()
            goto L79
        L78:
            r3 = r2
        L79:
            kotlin.Pair r5 = new kotlin.Pair
            r3.getClass()
            java.util.Locale r0 = java.util.Locale.getDefault()
            r0.getClass()
            java.lang.String r0 = r3.toUpperCase(r0)
            r0.getClass()
            r5.<init>(r0, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ul1.h(android.content.Context):kotlin.Pair");
    }

    public static String i() {
        try {
            byte[] bytes = "android_id".getBytes(xm.a);
            bytes.getClass();
            String strEncodeToString = Base64.encodeToString(Arrays.copyOf(bytes, 32), 9);
            strEncodeToString.getClass();
            return strEncodeToString;
        } catch (Exception unused) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
    }

    public static Editable j(String str) {
        Editable.Factory factory = Editable.Factory.getInstance();
        if (str == null) {
            str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        Editable editableNewEditable = factory.newEditable(str);
        editableNewEditable.getClass();
        return editableNewEditable;
    }

    public static String k(String str) {
        str.getClass();
        if (str.length() != 2) {
            return str;
        }
        int iCodePointAt = Character.codePointAt(str, 0) - (-127397);
        int iCodePointAt2 = Character.codePointAt(str, 1) - (-127397);
        char[] chars = Character.toChars(iCodePointAt);
        chars.getClass();
        String str2 = new String(chars);
        char[] chars2 = Character.toChars(iCodePointAt2);
        chars2.getClass();
        return str2.concat(new String(chars2));
    }

    public static String l(String str) {
        return (str == null || str.length() == 0) ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : (!t(str) || g.p(str, '[') || g.p(str, ']')) ? str : vh.m("[", str, "]");
    }

    public static final String m() {
        Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
        networkInterfaces.getClass();
        while (networkInterfaces.hasMoreElements()) {
            Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
            inetAddresses.getClass();
            while (inetAddresses.hasMoreElements()) {
                InetAddress inetAddressNextElement = inetAddresses.nextElement();
                if (!inetAddressNextElement.isLoopbackAddress() && (inetAddressNextElement instanceof Inet4Address)) {
                    return ((Inet4Address) inetAddressNextElement).getHostAddress();
                }
            }
        }
        return null;
    }

    public static Locale n() {
        if (Build.VERSION.SDK_INT >= 24) {
            Locale locale = LocaleList.getDefault().get(0);
            locale.getClass();
            return locale;
        }
        Locale locale2 = Locale.getDefault();
        locale2.getClass();
        return locale2;
    }

    public static String o() {
        try {
            String string = UUID.randomUUID().toString();
            string.getClass();
            return g.M(string, "-", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        } catch (Exception unused) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
    }

    public static long p(InetAddress inetAddress) {
        long j = 0;
        for (byte b2 : inetAddress.getAddress()) {
            j = (j << 8) | ((long) (b2 & 255));
        }
        return j;
    }

    public static boolean q(String str) {
        return g.R(str, "https", false) || g.R(str, "tcp", false) || g.R(str, "quic", false) || str.equals("localhost");
    }

    public static boolean r(String str) {
        if (str != null && str.length() != 0) {
            try {
                String string = g.c0(str).toString();
                if (string.length() != 0) {
                    if (g.o(string, "/", false)) {
                        List listO = g.O(string, new String[]{"/"}, 6);
                        if (listO.size() == 2 && g.a0((String) listO.get(1)) != null && Integer.parseInt((String) listO.get(1)) > -1) {
                            string = (String) listO.get(0);
                        }
                    }
                    if (g.R(string, "::ffff:", false) && g.p(string, '.')) {
                        string = g.s(7, string);
                    } else if (g.R(string, "[::ffff:", false) && g.p(string, '.')) {
                        string = g.M(g.s(8, string), "]", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                    }
                    List listP = g.P(new char[]{'.'}, string);
                    if (listP.size() != 4) {
                        return t(string);
                    }
                    if (g.o((CharSequence) listP.get(3), ":", false)) {
                        string = string.substring(0, g.z(string, ":", 0, false, 6));
                    }
                    return a.matches(string);
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static boolean s(String str, String str2) {
        str2.getClass();
        try {
            if (r(str)) {
                List listO = g.O(str2, new String[]{"/"}, 6);
                String str3 = (String) listO.get(0);
                int i = Integer.parseInt((String) listO.get(1));
                InetAddress byName = InetAddress.getByName(str);
                byName.getClass();
                long jP = p(byName);
                InetAddress byName2 = InetAddress.getByName(str3);
                byName2.getClass();
                long jP2 = p(byName2);
                long j = i == 0 ? 0L : (-1) << (32 - i);
                if ((jP & j) == (j & jP2)) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static boolean t(String str) {
        if (g.R(str, "[", false) && g.u(str, "]", false)) {
            str = g.t(1, g.s(1, str));
        }
        return b.matches(str);
    }

    public static boolean u(String str) {
        str.getClass();
        return a.matches(str) || t(str);
    }

    public static boolean v(String str) {
        if (str != null && str.length() != 0) {
            try {
                if (URLUtil.isHttpsUrl(str)) {
                    return true;
                }
                if (URLUtil.isHttpUrl(str)) {
                    if (g.o(str, "127.0.0.1", false)) {
                        return true;
                    }
                    URI uri = new URI(e(str));
                    if (r(uri.getHost())) {
                        AppConfig.a.getClass();
                        for (String str2 : AppConfig.i) {
                            String host = uri.getHost();
                            host.getClass();
                            if (s(host, str2)) {
                                return true;
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static boolean w(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        try {
            if (Patterns.WEB_URL.matcher(str).matches() || Patterns.DOMAIN_NAME.matcher(str).matches()) {
                return true;
            }
            return URLUtil.isValidUrl(str);
        } catch (Exception unused) {
            return false;
        }
    }

    public static void x(Context context, String str) {
        context.getClass();
        try {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (Exception unused) {
        }
    }

    public static int y(int i, String str) {
        Integer numA0;
        return (str == null || (numA0 = g.a0(str)) == null) ? i : numA0.intValue();
    }

    public static String z(Context context, String str) {
        str.getClass();
        if (context == null) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        try {
            InputStream inputStreamOpen = context.getAssets().open(str);
            try {
                inputStreamOpen.getClass();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen, xm.a), AttribFlags.SSH_FILEXFER_ATTR_LINK_COUNT);
                try {
                    String strB = d.b(bufferedReader);
                    bufferedReader.close();
                    inputStreamOpen.close();
                    return strB;
                } finally {
                }
            } finally {
            }
        } catch (Exception unused) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
    }
}
