package net.openvpn.openvpn;

import android.content.SharedPreferences;
import android.util.Base64;
import defpackage.hz;
import java.security.SecureRandom;
import java.util.Set;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class PasswordUtil {
    public final SharedPreferences a;
    public final String b;
    public final byte[] c;

    public PasswordUtil(SharedPreferences sharedPreferences) {
        String string;
        String string2;
        this.b = "pwdv1";
        this.a = sharedPreferences;
        byte[] bArr = {-42, -31, -117, 101, 25, 119, 127, 37, 121, -54, 46, 49, -35, -48, -72, 97};
        this.c = null;
        try {
            string2 = sharedPreferences.getString(a("settings", "entropy"), null);
        } catch (Exception unused) {
        }
        byte[] bArrDecode = string2 != null ? Base64.decode(string2, 0) : null;
        this.c = bArrDecode;
        if (bArrDecode == null) {
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            Set<String> setKeySet = sharedPreferences.getAll().keySet();
            String strT = hz.t(this.b, ".");
            for (String str : setKeySet) {
                if (str.startsWith(strT)) {
                    editorEdit.remove(str);
                }
            }
            editorEdit.apply();
            byte[] bArr2 = new byte[16];
            new SecureRandom().nextBytes(bArr2);
            SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
            editorEdit2.putString(a("settings", "entropy"), Base64.encodeToString(bArr2, 2));
            editorEdit2.apply();
            try {
                string = this.a.getString(a("settings", "entropy"), null);
            } catch (Exception unused2) {
            }
            bArrDecode = string != null ? Base64.decode(string, 0) : null;
            this.c = bArrDecode;
        }
        if (bArrDecode != null) {
            try {
                new SecretKeySpec(SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1").generateSecret(new PBEKeySpec(new char[]{'I', 't', ' ', 'w', 'a', 's', ' ', 'a', ' ', 'b', 'r', 'i', 'g', 'h', 't', ' ', 'c', 'o', 'l', 'd', ' ', 'd', 'a', 'y', ' ', 'i', 'n', ' ', 'A', 'p', 'r', 'i', 'l', ',', ' ', 'a', 'n', 'd', ' ', 't', 'h', 'e', ' ', 'c', 'l', 'o', 'c', 'k', 's', ' ', 'w', 'e', 'r', 'e', ' ', 's', 't', 'r', 'i', 'k', 'i', 'n', 'g', ' ', 't', 'h', 'i', 'r', 't', 'e', 'e', 'n', '.', ' ', 'W', 'i', 'n', 's', 't', 'o', 'n', ' ', 'S', 'm', 'i', 't', 'h', ',', ' ', 'h', 'i', 's', ' ', 'c', 'h', 'i', 'n', ' ', 'n', 'u', 'z', 'z', 'l', 'e', 'd', ' ', 'i', 'n', 't', 'o', ' ', 'h', 'i', 's', ' ', 'b', 'r', 'e', 'a', 's', 't', ' ', 'i', 'n', ' ', 'a', 'n', ' ', 'e', 'f', 'f', 'o', 'r', 't', ' ', 't', 'o', ' ', 'e', 's', 'c', 'a', 'p', 'e', ' ', 't', 'h', 'e', ' ', 'v', 'i', 'l', 'e', ' ', 'w', 'i', 'n', 'd', ',', ' ', 's', 'l', 'i', 'p', 'p', 'e', 'd', ' ', 'q', 'u', 'i', 'c', 'k', 'l', 'y', ' ', 't', 'h', 'r', 'o', 'u', 'g', 'h', ' ', 't', 'h', 'e', ' ', 'g', 'l', 'a', 's', 's', ' ', 'd', 'o', 'o', 'r', 's', ' ', 'o', 'f', ' ', 'V', 'i', 'c', 't', 'o', 'r', 'y', ' ', 'M', 'a', 'n', 's', 'i', 'o', 'n', 's', ',', ' ', 't', 'h', 'o', 'u', 'g', 'h', ' ', 'n', 'o', 't', ' ', 'q', 'u', 'i', 'c', 'k', 'l', 'y', ' ', 'e', 'n', 'o', 'u', 'g', 'h', ' ', 't', 'o', ' ', 'p', 'r', 'e', 'v', 'e', 'n', 't', ' ', 'a', ' ', 's', 'w', 'i', 'r', 'l', ' ', 'o', 'f', ' ', 'g', 'r', 'i', 't', 't', 'y', ' ', 'd', 'u', 's', 't', ' ', 'f', 'r', 'o', 'm', ' ', 'e', 'n', 't', 'e', 'r', 'i', 'n', 'g', ' ', 'a', 'l', 'o', 'n', 'g', ' ', 'w', 'i', 't', 'h', ' ', 'h', 'i', 'm', '.'}, this.c, 16, 128)).getEncoded(), "AES/CBC/PKCS5Padding");
                new IvParameterSpec(bArr);
                return;
            } catch (Exception unused3) {
            }
        }
        this.b = null;
    }

    public final String a(String str, String str2) {
        return this.b + "." + str + "." + str2;
    }

    public final void b(String str, String str2) {
        SharedPreferences.Editor editorEdit = this.a.edit();
        editorEdit.remove(a(str, str2));
        editorEdit.apply();
    }
}
