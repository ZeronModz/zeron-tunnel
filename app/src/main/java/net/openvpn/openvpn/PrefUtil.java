package net.openvpn.openvpn;

import android.content.SharedPreferences;
import defpackage.vh;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class PrefUtil {
    public final SharedPreferences a;

    public PrefUtil(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }

    public static String d(String str) {
        return vh.l("epki_alias.", str);
    }

    public final void a(String str) {
        SharedPreferences.Editor editorEdit = this.a.edit();
        editorEdit.remove(d(str));
        editorEdit.apply();
    }

    public final boolean b(String str) {
        try {
            return this.a.getBoolean(str, false);
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final String c(String str) {
        try {
            return this.a.getString(str, null);
        } catch (ClassCastException unused) {
            return null;
        }
    }
}
