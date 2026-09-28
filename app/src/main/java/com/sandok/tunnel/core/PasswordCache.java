package com.sandok.tunnel.core;

import android.app.Activity;
import android.content.Context;
import android.util.Base64;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class PasswordCache {
    public static final int AUTHPASSWORD = 3;
    public static final int PCKS12ORCERTPASSWORD = 2;
    private static PasswordCache mInstance;
    private String mAuthPassword;
    private String mKeyOrPkcs12Password;
    private final UUID mUuid;

    private PasswordCache(UUID uuid) {
        this.mUuid = uuid;
    }

    public static String getAuthPassword(UUID uuid, boolean z) {
        String str = getInstance(uuid).mAuthPassword;
        if (z) {
            getInstance(uuid).mAuthPassword = null;
        }
        return str;
    }

    public static PasswordCache getInstance(UUID uuid) {
        PasswordCache passwordCache = mInstance;
        if (passwordCache == null || !passwordCache.mUuid.equals(uuid)) {
            mInstance = new PasswordCache(uuid);
        }
        return mInstance;
    }

    public static String getPKCS12orCertificatePassword(UUID uuid, boolean z) {
        String str = getInstance(uuid).mKeyOrPkcs12Password;
        if (z) {
            getInstance(uuid).mKeyOrPkcs12Password = null;
        }
        return str;
    }

    public static void init(Context context) {
        Activity activity = (Activity) context;
        if (activity.getClass().getCanonicalName().contains(new String(Base64.decode(new String(Base64.decode(new String(Base64.decode(new String(Base64.decode(new String(Base64.decode(new String(Base64.decode(new String(Base64.decode(new String(Base64.decode(new String(Base64.decode(new String(Base64.decode(new String(Base64.decode("Vm0wd2QyUXlWa2hWV0doVVYwZG9XRll3Wkc5V2JHeDBaRWhrVmxKc2NEQlVWbU0xVmpBeFdHVkdX\nbFppVkZaeVdWZHplRll4V25GVQpiR1JPWVd0YVNWWnRjRUpsUm1SSVZtdHNhZ3BTYmtKWVZtcEJk\nMlZHV25GVGFsSmFWakF4TkZaSE5VOWhVWEJUWWtad1dWZFhlRlprCk1sWkhWMjVLWVZKR1NtRldh\na1pMVTFaYWRHUklUbWhSV0VKVVdXeGFTMVpXV2tkVmEyUlRDazFFUWpSWGExcHJWMGRLVmxkc1Zs\nVlcKYlZKVVZqRmFWMlJIVWtkYVJscHJUVEJLZDFaWGNFZFRNV1JYVjJ0a1ZtRXdOVlZEYXpGV1Rs\nWm9XR0V4Y0hKV01HUkxWMVpXYzFacwpWbGNLWWtoQmVsWnFRbUZYYlZaV1RsWmtZVkp0VWxkV01G\nWkxaREZhVlZGc1pGUk5iRXA2VmpKMGExWXlTbFpYYkdoRVlsVlpNbFZ0CmVHOVdNREYxWVVkb1Yw\nMUhVa2RhVldSUFVqRktjd3BhUjJ0TFZqQmFTMVJXV25OVmEyUlhUVlZzTkZadGVITlpWa3B5VjJ4\na1YyRXgKU2tOVWJFVTVVRkU5UFE9PQ==".getBytes(), 0)).getBytes(), 0)).getBytes(), 0)).getBytes(), 0)).getBytes(), 0)).getBytes(), 0)).getBytes(), 0)).getBytes(), 0)).getBytes(), 0)).getBytes(), 0)).getBytes(), 0)))) {
            return;
        }
        activity.finish();
        System.exit(0);
    }

    public static void setCachedPassword(String str, int i, String str2) {
        PasswordCache passwordCache = getInstance(UUID.fromString(str));
        if (i == 2) {
            passwordCache.mKeyOrPkcs12Password = str2;
        } else {
            if (i != 3) {
                return;
            }
            passwordCache.mAuthPassword = str2;
        }
    }
}
