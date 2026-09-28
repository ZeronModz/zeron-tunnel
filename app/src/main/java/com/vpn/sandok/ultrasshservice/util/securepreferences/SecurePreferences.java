package com.vpn.sandok.ultrasshservice.util.securepreferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import com.vpn.sandok.ultrasshservice.util.securepreferences.crypto.Cryptor;
import com.vpn.sandok.ultrasshservice.util.securepreferences.crypto.HashSHA;
import com.vpn.sandok.ultrasshservice.util.securepreferences.model.SecurityConfig;
import defpackage.u7;
import java.io.UnsupportedEncodingException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class SecurePreferences implements SharedPreferences {
    private static final String CHARSET = "UTF-8";
    private final Cryptor mCryptor;
    private SharedPreferences mProxyPreferences;

    private SecurePreferences(Context context, String str, SecurityConfig securityConfig) {
        this.mCryptor = Cryptor.initWithSecurityConfig(securityConfig);
        this.mProxyPreferences = context.getSharedPreferences(str, 0);
    }

    private String decryptFromBase64(String str) {
        try {
            return new String(this.mCryptor.decryptFromBase64(str), CHARSET);
        } catch (UnsupportedEncodingException e) {
            u7.p(e.getMessage());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String encryptToBase64(String str) {
        try {
            return this.mCryptor.encryptToBase64(str.getBytes(CHARSET));
        } catch (UnsupportedEncodingException e) {
            u7.p(e.getMessage());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String generateKeyHash(String str) {
        try {
            return Base64.encodeToString(HashSHA.hashUsingSHA256(str.getBytes(CHARSET)), 2);
        } catch (UnsupportedEncodingException e) {
            u7.p(e.getMessage());
            return null;
        }
    }

    public static SecurePreferences getInstance(Context context, String str, SecurityConfig securityConfig) {
        if (context != null && str != null && securityConfig != null) {
            return new SecurePreferences(context.getApplicationContext(), str, securityConfig);
        }
        u7.r("Params cannot be null!");
        return null;
    }

    @Override // android.content.SharedPreferences
    public boolean contains(String str) {
        return this.mProxyPreferences.contains(generateKeyHash(str));
    }

    @Override // android.content.SharedPreferences
    public Editor edit() {
        return new Editor();
    }

    @Override // android.content.SharedPreferences
    public Map<String, ?> getAll() {
        throw new UnsupportedOperationException("Operation Not Supported!");
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(String str, boolean z) {
        String string = getString(str, null);
        return string != null ? Boolean.parseBoolean(string) : z;
    }

    @Override // android.content.SharedPreferences
    public float getFloat(String str, float f) {
        String string = getString(str, null);
        return string != null ? Float.parseFloat(string) : f;
    }

    @Override // android.content.SharedPreferences
    public int getInt(String str, int i) {
        String string = getString(str, null);
        return string != null ? Integer.parseInt(string) : i;
    }

    @Override // android.content.SharedPreferences
    public long getLong(String str, long j) {
        String string = getString(str, null);
        return string != null ? Long.parseLong(string) : j;
    }

    @Override // android.content.SharedPreferences
    public String getString(String str, String str2) {
        String string = this.mProxyPreferences.getString(generateKeyHash(str), null);
        return string != null ? decryptFromBase64(string) : str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Set<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.Set<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.HashSet] */
    @Override // android.content.SharedPreferences
    public Set<String> getStringSet(String str, Set<String> set) {
        Set<String> stringSet = this.mProxyPreferences.getStringSet(generateKeyHash(str), null);
        if (stringSet != null) {
            set = new HashSet<>();
            Iterator<String> it = stringSet.iterator();
            while (it.hasNext()) {
                set.add(decryptFromBase64(it.next()));
            }
        }
        return set;
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.mProxyPreferences.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.mProxyPreferences.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public final class Editor implements SharedPreferences.Editor {
        protected SharedPreferences.Editor mProxyEditor;

        public Editor() {
            this.mProxyEditor = SecurePreferences.this.mProxyPreferences.edit();
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
            this.mProxyEditor.apply();
        }

        @Override // android.content.SharedPreferences.Editor
        public Editor clear() {
            this.mProxyEditor.clear();
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public boolean commit() {
            return this.mProxyEditor.commit();
        }

        @Override // android.content.SharedPreferences.Editor
        public Editor putBoolean(String str, boolean z) {
            this.mProxyEditor.putString(SecurePreferences.this.generateKeyHash(str), SecurePreferences.this.encryptToBase64(Boolean.toString(z)));
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public Editor putFloat(String str, float f) {
            this.mProxyEditor.putString(SecurePreferences.this.generateKeyHash(str), SecurePreferences.this.encryptToBase64(Float.toString(f)));
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public Editor putInt(String str, int i) {
            this.mProxyEditor.putString(SecurePreferences.this.generateKeyHash(str), SecurePreferences.this.encryptToBase64(Integer.toString(i)));
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public Editor putLong(String str, long j) {
            this.mProxyEditor.putString(SecurePreferences.this.generateKeyHash(str), SecurePreferences.this.encryptToBase64(Long.toString(j)));
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public Editor putString(String str, String str2) {
            this.mProxyEditor.putString(SecurePreferences.this.generateKeyHash(str), SecurePreferences.this.encryptToBase64(str2));
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public Editor putStringSet(String str, Set<String> set) {
            String strGenerateKeyHash = SecurePreferences.this.generateKeyHash(str);
            HashSet hashSet = new HashSet();
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                hashSet.add(SecurePreferences.this.encryptToBase64(it.next()));
            }
            this.mProxyEditor.putStringSet(strGenerateKeyHash, hashSet);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public Editor remove(String str) {
            this.mProxyEditor.remove(SecurePreferences.this.generateKeyHash(str));
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public /* bridge */ /* synthetic */ SharedPreferences.Editor putStringSet(String str, Set set) {
            return putStringSet(str, (Set<String>) set);
        }
    }
}
