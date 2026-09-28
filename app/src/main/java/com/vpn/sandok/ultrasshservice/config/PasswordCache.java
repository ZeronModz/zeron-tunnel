package com.vpn.sandok.ultrasshservice.config;

import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class PasswordCache {
    public static final int AUTHPASSWORD = 3;
    private static UUID mDefaultUuid = UUID.randomUUID();
    private static PasswordCache mInstance;
    private String mAuthPassword;
    private final UUID mUuid;

    private PasswordCache(UUID uuid) {
        this.mUuid = uuid;
    }

    public static String getAuthPassword(UUID uuid, boolean z) {
        if (uuid == null) {
            uuid = mDefaultUuid;
        }
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

    public static void setCachedPassword(String str, int i, String str2) {
        if (str == null) {
            str = mDefaultUuid.toString();
        }
        PasswordCache passwordCache = getInstance(UUID.fromString(str));
        if (i != 3) {
            return;
        }
        passwordCache.mAuthPassword = str2;
    }
}
