package net.openvpn.openvpn;

import com.google.android.gms.ads.RequestConfiguration;
import com.sandok.tunnel.service.OpenVPNService;
import java.util.Iterator;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class ProxyList {
    public String a = null;
    public OpenVPNService b = null;
    public boolean c = false;
    public String d = null;
    public TreeMap e = new TreeMap(String.CASE_INSENSITIVE_ORDER);
    public final String f;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public static class InternalError extends RuntimeException {
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public static class Item {
        public boolean a = false;
        public String b = null;
        public String c = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        public String d = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        public String e = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        public boolean f = false;
        public String g = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

        public static Item c(JSONObject jSONObject) {
            try {
                Item item = new Item();
                if (jSONObject.isNull("friendly_name")) {
                    item.b = null;
                } else {
                    item.b = jSONObject.getString("friendly_name");
                }
                item.c = jSONObject.getString("host");
                item.e = jSONObject.getString("port");
                item.f = jSONObject.getBoolean("remember_creds");
                item.a = jSONObject.getBoolean("allow_cleartext_auth");
                if (!jSONObject.isNull("username")) {
                    item.g = jSONObject.getString("username");
                }
                if (jSONObject.isNull("password")) {
                    return item;
                }
                item.d = jSONObject.getString("password");
                return item;
            } catch (JSONException unused) {
                return null;
            }
        }

        public final String a() {
            String str = this.b;
            if (str != null) {
                return str;
            }
            return this.c + ":" + this.e;
        }

        public final JSONObject b() {
            try {
                JSONObject jSONObject = new JSONObject();
                String str = this.b;
                if (str != null) {
                    jSONObject.put("friendly_name", str);
                }
                jSONObject.put("host", this.c);
                jSONObject.put("port", this.e);
                jSONObject.put("remember_creds", this.f);
                jSONObject.put("allow_cleartext_auth", this.a);
                if (!this.f) {
                    return jSONObject;
                }
                jSONObject.put("username", this.g);
                jSONObject.put("password", this.d);
                return jSONObject;
            } catch (JSONException unused) {
                return null;
            }
        }
    }

    public ProxyList(String str) {
        this.f = null;
        if (str == null) {
            throw new InternalError();
        }
        this.f = str;
        e();
    }

    public static ProxyList f(String str, JSONObject jSONObject) {
        try {
            ProxyList proxyList = new ProxyList(str);
            if (!jSONObject.isNull("enabled_name")) {
                proxyList.d = jSONObject.getString("enabled_name");
            }
            JSONArray jSONArray = jSONObject.getJSONArray("list");
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                proxyList.c(Item.c(jSONArray.getJSONObject(i)));
            }
            proxyList.e();
            return proxyList;
        } catch (JSONException unused) {
            return null;
        }
    }

    public final boolean a(String str) {
        return str == null || str.equals(this.f);
    }

    public final JSONObject b() {
        try {
            JSONObject jSONObject = new JSONObject();
            String str = !a(this.d) ? this.d : null;
            if (str != null) {
                jSONObject.put("enabled_name", str);
            }
            JSONArray jSONArray = new JSONArray();
            Iterator it = this.e.values().iterator();
            while (it.hasNext()) {
                JSONObject jSONObjectB = ((Item) it.next()).b();
                if (jSONObjectB != null) {
                    jSONArray.put(jSONObjectB);
                }
            }
            jSONObject.put("list", jSONArray);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public final void c(Item item) {
        if (item != null) {
            String strA = item.a();
            if (a(strA)) {
                return;
            }
            this.e.put(strA, item);
            this.c = true;
        }
    }

    public final void d() {
        String str;
        try {
            if (!this.c || (str = this.a) == null) {
                return;
            }
            FileUtil.b(this.b, str, b().toString(4));
            this.c = false;
        } catch (Exception unused) {
        }
    }

    public final void e() {
        String str = this.d;
        boolean zA = a(str);
        String str2 = this.f;
        if (zA) {
            this.d = str2;
        } else {
            if ((a(str) ? null : (Item) this.e.get(str)) != null) {
                this.d = str;
                str2 = str;
            } else {
                this.d = str2;
            }
        }
        if (str == null || !str.equals(str2)) {
            this.c = true;
        }
    }
}
